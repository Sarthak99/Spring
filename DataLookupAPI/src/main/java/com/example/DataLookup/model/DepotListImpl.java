package com.example.DataLookup.model;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.DataLookup.Entities.DepotEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DepotListImpl implements DepotList {
	
	@Override
	public DepotEntity getDepots(){
		
		File depotFile = new File("depotlist.json");
		ObjectMapper depotMapper = new ObjectMapper();
		DepotEntity depotEntity = null;
		
		try {
			depotEntity = depotMapper.readValue(depotFile, DepotEntity.class);
			
		} catch(IOException i) {
			i.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return depotEntity;
	}
}
