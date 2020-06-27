package com.example.DataLookup.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillOfLadingMessageEntity {
	
	@JsonProperty("billOfLading")
	private BillOfLadingEntity billOfLadingEntity;

	public BillOfLadingEntity getBillOfLadingEntity() {
		return billOfLadingEntity;
	}

	public void setBillOfLadingEntity(BillOfLadingEntity billOfLadingEntity) {
		this.billOfLadingEntity = billOfLadingEntity;
	}
}
