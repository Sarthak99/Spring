package com.example.DataLookup.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepotEntity {
	@JsonProperty("depots")
	private List<DepotDetailEntity> depotDetailEntity;
	
	public List<DepotDetailEntity> getDepotDetail() {
		return depotDetailEntity;
	}
	public void setDepotDetail(List<DepotDetailEntity> depotDetailEntity) {
		this.depotDetailEntity = depotDetailEntity;
	}
}