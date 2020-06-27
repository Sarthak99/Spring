package com.example.DataLookup.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BOLDetailEntity {

	private String containerId;
	private String distributionNumber;
	private String distributionType;
	private String pickNotBeforeDate;
	private String pickNotAfterDate;
	private String inStoreDate;
	private String poNumber;
	private String requestedQuantity;
	private String itemId;
	private String itemDescription;
	private String uomCode;
	private String shipQuantity;
	private String shipWeight;
	private String bestBeforeDate;
	private String packIndicator;
	private String simplePackIndicator;
	private String depositItemType;
	private String itemOrderType;
	private String uda4;
	private String uda5;
	@JsonProperty("MnPRef")
	private String MnPRef;
	@JsonProperty("packItem")
	private List<PackItemEntity> packItemEntity;

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public String getDistributionNumber() {
		return distributionNumber;
	}

	public void setDistributionNumber(String distributionNumber) {
		this.distributionNumber = distributionNumber;
	}

	public String getDistributionType() {
		return distributionType;
	}

	public void setDistributionType(String distributionType) {
		this.distributionType = distributionType;
	}

	public String getPickNotBeforeDate() {
		return pickNotBeforeDate;
	}

	public void setPickNotBeforeDate(String pickNotBeforeDate) {
		this.pickNotBeforeDate = pickNotBeforeDate;
	}

	public String getPickNotAfterDate() {
		return pickNotAfterDate;
	}

	public void setPickNotAfterDate(String pickNotAfterDate) {
		this.pickNotAfterDate = pickNotAfterDate;
	}

	public String getInStoreDate() {
		return inStoreDate;
	}

	public void setInStoreDate(String inStoreDate) {
		this.inStoreDate = inStoreDate;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(String requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getUomCode() {
		return uomCode;
	}

	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}

	public String getShipQuantity() {
		return shipQuantity;
	}

	public void setShipQuantity(String shipQuantity) {
		this.shipQuantity = shipQuantity;
	}

	public String getShipWeight() {
		return shipWeight;
	}

	public void setShipWeight(String shipWeight) {
		this.shipWeight = shipWeight;
	}

	public String getBestBeforeDate() {
		return bestBeforeDate;
	}

	public void setBestBeforeDate(String bestBeforeDate) {
		this.bestBeforeDate = bestBeforeDate;
	}

	public String getPackIndicator() {
		return packIndicator;
	}

	public void setPackIndicator(String packIndicator) {
		this.packIndicator = packIndicator;
	}

	public String getSimplePackIndicator() {
		return simplePackIndicator;
	}

	public void setSimplePackIndicator(String simplePackIndicator) {
		this.simplePackIndicator = simplePackIndicator;
	}

	public String getDepositItemType() {
		return depositItemType;
	}

	public void setDepositItemType(String depositItemType) {
		this.depositItemType = depositItemType;
	}

	public String getItemOrderType() {
		return itemOrderType;
	}

	public void setItemOrderType(String itemOrderType) {
		this.itemOrderType = itemOrderType;
	}

	public String getUda4() {
		return uda4;
	}

	public void setUda4(String uda4) {
		this.uda4 = uda4;
	}

	public String getUda5() {
		return uda5;
	}

	public void setUda5(String uda5) {
		this.uda5 = uda5;
	}

	public String getMnPRef() {
		return MnPRef;
	}

	public void setMnPRef(String mnPRef) {
		MnPRef = mnPRef;
	}

	public List<PackItemEntity> getPackItemEntity() {
		return packItemEntity;
	}

	public void setPackItemEntity(List<PackItemEntity> packItemEntity) {
		this.packItemEntity = packItemEntity;
	}

}
