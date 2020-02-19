package com.capgemini.greatoutdoors.dto;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

public class RetailerInventoryShelfTimeDTO {
	private String retailorId ;
	private String retailerName;
	private byte productCategoryNumber;
	private String productCategoryName;
	private String productName;
	private String productUniqueId;
	private int deliveryTimePeriod;
	private int shelfTimePeriod;
	public RetailerInventoryShelfTimeDTO(String retailorId, String retailerName, byte productCategoryNumber,
			String productCategoryName, String productName, String productUniqueId, int deliveryTimePeriod,
			int shelfTimePeriod) {
		super();
		this.retailorId = retailorId;
		this.retailerName = retailerName;
		this.productCategoryNumber = productCategoryNumber;
		this.productCategoryName = productCategoryName;
		this.productName = productName;
		this.productUniqueId = productUniqueId;
		this.deliveryTimePeriod = deliveryTimePeriod;
		this.shelfTimePeriod = shelfTimePeriod;
	}
	/*LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
    LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);
    Period period = Period.between(oldDate, newDate);*/
	public RetailerInventoryShelfTimeDTO(String productName2) {
		// TODO Auto-generated constructor stub
	}
	public void RetailerInventoryShelfTimeDTO1(String retailerId, String retailerName, byte productCategoryNumber, String productCategoryName, String productName, String productUniqueId,  int deliveryTimePeriod, int shelfTimePeiod) {
		// TODO Auto-generated constructor stub
	}
	public String getRetailorId() {
		return retailorId;
	}
	public void setRetailorId(String retailorId) {
		this.retailorId = retailorId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public byte getProductCategoryNumber() {
		return productCategoryNumber;
	}
	public void setProductCategoryNumber(byte productCategoryNumber) {
		this.productCategoryNumber = productCategoryNumber;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductUniqueId() {
		return productUniqueId;
	}
	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}
	public int getDeliveryTimePeriod() {
		return deliveryTimePeriod;
	}
	public void setDeliveryTimePeriod(int deliveryTimePeriod) {
		this.deliveryTimePeriod = deliveryTimePeriod;
	}
	public int getShelfTimePeriod() {
		return shelfTimePeriod;
	}
	public void setShelfTimePeriod(int shelfTimePeriod) {
		this.shelfTimePeriod = shelfTimePeriod;
	}
	@Override
	public String toString() {
		return "RetailerInventoryShelfTimeDTO [retailorId=" + retailorId + ", retailerName=" + retailerName
				+ ", productCategoryNumber=" + productCategoryNumber + ", productCategoryName=" + productCategoryName
				+ ", productName=" + productName + ", productUniqueId=" + productUniqueId + ", deliveryTimePeriod="
				+ deliveryTimePeriod + ", shelfTimePeriod=" + shelfTimePeriod + "]";
	}

}
