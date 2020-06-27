package com.example.DataLookup.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetailEntity {
	@JsonProperty("bolDetail")
	private List<BOLDetailEntity> bolDetailEntity ;
	@JsonProperty("tpaDetail")
	private List<TPADetailEntity> tpaDetailEntity ;

	public List<BOLDetailEntity> getBolDetailEntity() {
		return bolDetailEntity;
	}

	public void setBolDetailEntity(List<BOLDetailEntity> bolDetailEntity) {
		this.bolDetailEntity = bolDetailEntity;
	}

	public List<TPADetailEntity> getTpaDetailEntity() {
		return tpaDetailEntity;
	}

	public void setTpaDetailEntity(List<TPADetailEntity> tpaDetailEntity) {
		this.tpaDetailEntity = tpaDetailEntity;
	}
}
