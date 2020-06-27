package com.example.DataLookup.Entities;

public class TPADetailEntity {
	
//	@JsonProperty("tpnd")
	private String tpnd;
//	@JsonProperty("tpnb")
	private String tpnb;
//	@JsonProperty("unitQuantity")
	private String unitQuantity;
//	@JsonProperty("shipQuantity")
	private String ShipQuantity;
//	@JsonProperty("tpnbDescription")
	private String tpnbDescription;
//	@JsonProperty("tpndDescription")
	private String tpndDescription;
	
	public String getTpnd() {
		return tpnd;
	}
	public void setTpnd(String tpnd) {
		this.tpnd = tpnd;
	}
	public String getTpnb() {
		return tpnb;
	}
	public void setTpnb(String tpnb) {
		this.tpnb = tpnb;
	}
	public String getUnitQuantity() {
		return unitQuantity;
	}
	public void setUnitQuantity(String unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	public String getShipQuantity() {
		return ShipQuantity;
	}
	public void setShipQuantity(String ShipQuantity) {
		this.ShipQuantity = ShipQuantity;
	}
	public String getTpnbDescription() {
		return tpnbDescription;
	}
	public void setTpnbDescription(String tpnbDescription) {
		this.tpnbDescription = tpnbDescription;
	}
	public String getTpndDescription() {
		return tpndDescription;
	}
	public void setTpndDescription(String tpndDescription) {
		this.tpndDescription = tpndDescription;
	}
}
