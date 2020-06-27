package com.example.DataLookup.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillOfLadingEntity {

	@JsonProperty("header")
	private HeaderEntity headerEntity;
	@JsonProperty("detail")
	private DetailEntity detailEntity;
	
	public HeaderEntity getHeaderEntity() {
		return headerEntity;
	}
	public void setHeaderEntity(HeaderEntity headerEntity) {
		this.headerEntity = headerEntity;
	}
	public DetailEntity getDetailEntity() {
		return detailEntity;
	}
	public void setDetailEntity(DetailEntity detailEntity) {
		this.detailEntity = detailEntity;
	}	
}
