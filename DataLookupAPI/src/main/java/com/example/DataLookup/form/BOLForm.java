package com.example.DataLookup.form;

import org.springframework.stereotype.Component;

@Component
public class BOLForm {
	private String BOL;
	private String depotId;
	
	public BOLForm() {
		super();
	}
	public String getBOL() {
		return BOL;
	}	
	public void setBOL(String BOL) {
		this.BOL = BOL;
	}
	public String getDepotId() {
		return depotId;
	}
	public void setDepotId(String depotId) {
		this.depotId = depotId;
	}
}
