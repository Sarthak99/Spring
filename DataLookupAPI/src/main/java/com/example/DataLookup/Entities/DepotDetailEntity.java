package com.example.DataLookup.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepotDetailEntity {
	@JsonProperty("id")
	private String depotId;
	@JsonProperty("name")
	private String depotName;
	public DepotDetailEntity() {
		super();
	}
	public String getDepotId() {
		return depotId;
	}
	public void setDepotId(String depotId) {
		this.depotId = depotId;
	}
	public String getDepotName() {
		return depotName;
	}
	public void setDepotName(String depotName) {
		this.depotName = depotName;
	}
}
