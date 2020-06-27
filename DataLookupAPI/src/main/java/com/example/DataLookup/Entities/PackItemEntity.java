package com.example.DataLookup.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackItemEntity {
	
	private String tpnb;
	private String tpnbDescription;
	private String unitQuantity;
	private String saleType;
//	@JsonProperty("despositItemType")
	private String depositItemType;
	
	public String getTpnb() {
		return tpnb;
	}
	public void setTpnb(String tpnb) {
		this.tpnb = tpnb;
	}
	public String getTpnbDescription() {
		return tpnbDescription;
	}
	public void setTpnbDescription(String tpnbDescription) {
		this.tpnbDescription = tpnbDescription;
	}
	public String getUnitQuantity() {
		return unitQuantity;
	}
	public void setUnitQuantity(String unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	public String getSaleType() {
		return saleType;
	}
	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}
	public String getDepositItemType() {
		return depositItemType;
	}
	public void setDepositItemType(String depositItemType) {
		this.depositItemType = depositItemType;
	}
	
}
