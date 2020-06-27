package com.example.DataLookup.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.DataLookup.Entities.BOLDetailEntity;
import com.example.DataLookup.Entities.BillOfLadingMessageEntity;
import com.example.DataLookup.Entities.PackItemEntity;
import com.example.DataLookup.Finder.BOLFileFinder;
import com.example.DataLookup.Transfer.GlobalTransfer;

@Controller
public class BillOfLadingDataController {

	@Autowired
	private BOLFileFinder bolFileFinder;

	@GetMapping("/BillOfLadingData")
	public String getBOLData(Model model) {
		System.out.println("Data controller called");

		String BOL = GlobalTransfer.BOL;
		String depotId = GlobalTransfer.depotId;

		BillOfLadingMessageEntity billOfLadingMessageEntity = new BillOfLadingMessageEntity();
		if (BOL.length() == 13)
			billOfLadingMessageEntity = bolFileFinder.findData("0000" + BOL,depotId);
		else if (BOL.length() == 14)
			billOfLadingMessageEntity = bolFileFinder.findData("000" + BOL,depotId);
		else if (BOL.length() == 15)
			billOfLadingMessageEntity = bolFileFinder.findData("00" + BOL,depotId);
		else if (BOL.length() == 16)
			billOfLadingMessageEntity = bolFileFinder.findData("0" + BOL,depotId);
		else if (BOL.length() == 17)
			billOfLadingMessageEntity = bolFileFinder.findData(BOL,depotId);

		if (billOfLadingMessageEntity != null) {
			List<BOLDetailEntity> bolDetailEntities = billOfLadingMessageEntity.getBillOfLadingEntity().getDetailEntity().getBolDetailEntity();
			List<List<PackItemEntity>> packList = new ArrayList<>();
			
			for(BOLDetailEntity bolDetail : bolDetailEntities) {
				packList.add(bolDetail.getPackItemEntity());
			}
			System.out.println(packList.get(0).get(0).getTpnb());
			model.addAttribute("billofLadingNumber", billOfLadingMessageEntity.getBillOfLadingEntity().getHeaderEntity().getBolNumber());
			model.addAttribute("storeId", billOfLadingMessageEntity.getBillOfLadingEntity().getHeaderEntity().getToLocation());
			model.addAttribute("bolDetailEntities", bolDetailEntities);
			model.addAttribute("packList", packList);
		}

		return "boldata";
	}

}
