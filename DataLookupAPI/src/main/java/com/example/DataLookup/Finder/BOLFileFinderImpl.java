package com.example.DataLookup.Finder;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.DataLookup.Entities.BillOfLadingMessageEntity;
import com.example.DataLookup.Entities.DepotDetailEntity;
import com.example.DataLookup.model.DepotList;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class BOLFileFinderImpl implements BOLFileFinder {

	@Value("${base_dir}")
	private String baseDirName;
	@Value("${file_suffix}")
	private String suffix;

	@Autowired
	private DepotList depotList;

	@Override
	public BillOfLadingMessageEntity findData(String fileName,String depotId) {

		String depotDir  = null;
		List<DepotDetailEntity> depotsList = depotList.getDepots().getDepotDetail();

		for (DepotDetailEntity depot : depotsList) {
			if(depot.getDepotId().equals(depotId))
			{
				depotDir = depot.getDepotName();
				break;
			}
		}

		String actualFile = null;
		File baseDir = new File(baseDirName + File.separator + depotDir + File.separator + "backup");
		BillOfLadingMessageEntity billOfLadingMessageEntity = new BillOfLadingMessageEntity();

		try {
			FilenameFilter filter = new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.startsWith(fileName) && name.endsWith(suffix);
				}
			};

			String[] files = baseDir.list(filter);

			if (files == null) { 
				System.out.println("BOL Not Found.");
				billOfLadingMessageEntity = null;
			} else {
				actualFile = files[0]; 
			}

			billOfLadingMessageEntity = new ObjectMapper().readValue(new File(baseDir + File.separator + actualFile), BillOfLadingMessageEntity.class);
		} catch (IOException i) {
			billOfLadingMessageEntity = null;
			i.printStackTrace();
		} catch (Exception e) {
			billOfLadingMessageEntity = null;
			e.printStackTrace();
		}
		return billOfLadingMessageEntity;
	}
}