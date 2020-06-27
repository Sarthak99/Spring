package com.example.DataLookup.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderEntity {
	
	private String bolNumber;
	private String fromLocation;
	private String fromLocationType;
	private String toLocation;
	private String toLocationType;
	private String shipmentDate;
	private String estimatedArrivalDate;
	private String trailerId;
	private String carrierCode;
	private String shipCountry;
	private String sealNumber;
//	@JsonProperty("trunkedDc")
	private String trunkedDC;
	private String asnType;
	private String remarks;
	private String targetSystem;
	private String tripId;
	private String uda1;
	private String uda2;
	private String uda3;
	
	public String getBolNumber() {
		return bolNumber;
	}
	public void setBolNumber(String bolNumber) {
		this.bolNumber = bolNumber;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getFromLocationType() {
		return fromLocationType;
	}
	public void setFromLocationType(String fromLocationType) {
		this.fromLocationType = fromLocationType;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getToLocationType() {
		return toLocationType;
	}
	public void setToLocationType(String toLocationType) {
		this.toLocationType = toLocationType;
	}
	public String getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	public String getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}
	public void setEstimatedArrivalDate(String estimatedArrivalDate) {
		this.estimatedArrivalDate = estimatedArrivalDate;
	}
	public String getTrailerId() {
		return trailerId;
	}
	public void setTrailerId(String trailerId) {
		this.trailerId = trailerId;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getShipCountry() {
		return shipCountry;
	}
	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}
	public String getSealNumber() {
		return sealNumber;
	}
	public void setSealNumber(String sealNumber) {
		this.sealNumber = sealNumber;
	}
	public String getTrunkedDC() {
		return trunkedDC;
	}
	public void setTrunkedDC(String trunkedDC) {
		this.trunkedDC = trunkedDC;
	}
	public String getAsnType() {
		return asnType;
	}
	public void setAsnType(String asnType) {
		this.asnType = asnType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTargetSystem() {
		return targetSystem;
	}
	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}
	public String getTripId() {
		return tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getUda1() {
		return uda1;
	}
	public void setUda1(String uda1) {
		this.uda1 = uda1;
	}
	public String getUda2() {
		return uda2;
	}
	public void setUda2(String uda2) {
		this.uda2 = uda2;
	}
	public String getUda3() {
		return uda3;
	}
	public void setUda3(String uda3) {
		this.uda3 = uda3;
	}	
}
