package com.example.DataLookup.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DataLookup.Entities.DepotDetailEntity;
import com.example.DataLookup.Transfer.GlobalTransfer;
import com.example.DataLookup.form.BOLForm;
import com.example.DataLookup.model.DepotList;

@Controller
public class BillOfLadingController {

	@Autowired
	private DepotList depotList;

	@GetMapping("/BillOfLading")
	public String getBOLForm(Model model) {
		List<DepotDetailEntity> depotDropDown = depotList.getDepots().getDepotDetail();
		try {
			if (depotDropDown.size() == 0) {
				model.addAttribute("noDepots", depotDropDown);
				return "bolsearch";
			}
			model.addAttribute("BOLForm", new BOLForm());
			model.addAttribute("depots", depotDropDown);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "bolsearch";
	}

	@PostMapping("/BillOfLading")
	public String getBOLForm(@ModelAttribute(name = "BOLForm") BOLForm bolForm, Model model) {

		List<DepotDetailEntity> depotDropDown = depotList.getDepots().getDepotDetail();

		DepotDetailEntity depot = depotDropDown.stream()
				.filter(depots -> bolForm.getDepotId().equals(depots.getDepotId())).findFirst().orElse(null);
		
		System.out.println("BOL:" + bolForm.getBOL());
		System.out.println("DC:" + bolForm.getDepotId());
		
		GlobalTransfer.BOL = bolForm.getBOL();
		GlobalTransfer.depotId = bolForm.getDepotId();

		if (depot == null) {
			System.out.println("null depot");
			model.addAttribute("InvalidDepot", true);
			return "bolsearch";
		}

		if (bolForm.getBOL().length() == 0) {
			System.out.println("BlankBOLField");
			model.addAttribute("BlankBOLField", true);
			return "bolsearch";
		}

		if (bolForm.getBOL().length() < 13 || bolForm.getBOL().length() > 17) {
			System.out.println("InvalidBOLSize");
			model.addAttribute("InvalidBOLSize", true);
			return "bolsearch";
		}
		
		return "bolredirect";
	}
}