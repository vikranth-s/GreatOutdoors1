package com.capgemini.greatoutdoors.dto;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class RetailerInventoryTrackDTO {
	private String retailorId ;
	private byte productCategory;
	private String productId;
	private String productUniqueId;
	private String productDispatchTimestamp;
	private String productReceiveTimestamp;
	private String productSaleTimestamp;
	{
	/*SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	String dateInString = "27-04-2016 10:22:56";
	Date date = sdf.parse(dateInString);
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);*/
	/*try{
		SimpleDateFormat formatter1=new SimpleDateFormat("22/02/2020");
	 Date date1=(Date) formatter1.parse(productDispatchTimestamp);
	 SimpleDateFormat formatter2=new SimpleDateFormat("21/03/2020");
	 Date date2=(Date) formatter2.parse(productReceiveTimestamp);
	 SimpleDateFormat formatter3=new SimpleDateFormat("06/01/2019");
	 Date date3=(Date) formatter3.parse(productSaleTimestamp);
	 Calendar cal=Calendar.getInstance();
	 cal.setTime(date1);
	 Calendar cal1=Calendar.getInstance();
	 cal1.setTime(date2);
	 Calendar cal2=Calendar.getInstance();
	 cal2.setTime(date3);
	 SimpleDateFormat formatter4=new SimpleDateFormat("05/06/2000");
	 Date date4=(Date) formatter4.parse(productDispatchTimestamp);
	 SimpleDateFormat formatter5=new SimpleDateFormat("06/06/2001");
	 Date date5=(Date) formatter5.parse(productReceiveTimestamp);
	 SimpleDateFormat formatter6=new SimpleDateFormat("18/07/1999");
	 Date date6=(Date) formatter6.parse(productSaleTimestamp);
	 Calendar cal4=Calendar.getInstance();
	 cal4.setTime(date4);
	 Calendar cal5=Calendar.getInstance();
	 cal5.setTime(date5);
	 Calendar cal6=Calendar.getInstance();
	 cal6.setTime(date6);
	 }catch(ParseException e)
	{
		 System.out.println(e);
	}*/

}
	public RetailerInventoryTrackDTO(String retailorId, byte productCategory, String productId, String productUniqueId,
			String productDispatchTimestamp, String productReceiveTimestamp,String productSaleTimestamp) {
		super();
		this.retailorId = retailorId;
		this.productCategory = productCategory;
		this.productId = productId;
		this.productUniqueId = productUniqueId;
		this.productDispatchTimestamp = productDispatchTimestamp;
		this.productReceiveTimestamp = productReceiveTimestamp;
		this.productSaleTimestamp = productSaleTimestamp;
	}
	public RetailerInventoryTrackDTO(String string, byte b, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}
	public RetailerInventoryTrackDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getRetailorId() {
		return retailorId;
	}
	public void setRetailorId(String retailorId) {
		this.retailorId = retailorId;
	}
	public byte getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(byte productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductUniqueId() {
		return productUniqueId;
	}
	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}
	public String getProductDispatchTimestamp() {
		return productDispatchTimestamp;
	}
	public void setProductDispatchTimestamp(String productDispatchTimestamp) {
		this.productDispatchTimestamp = productDispatchTimestamp;
	}
	public String getProductReceiveTimestamp() {
		return productReceiveTimestamp;
	}
	public void setProductReceiveTimestamp(String productReceiveTimestamp) {
		this.productReceiveTimestamp = productReceiveTimestamp;
	}
	public String getProductSaleTimestamp() {
		return productSaleTimestamp;
	}
	public void setProductSaleTimestamp(String productSaleTimestamp) {
		this.productSaleTimestamp = productSaleTimestamp;
	}
	public void setDeliveryTimePeriod(int updatedeliveryTimePeriod) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "RetailerInventoryTrackDTO [retailorId=" + retailorId + ", productCategory=" + productCategory
				+ ", productId=" + productId + ", productUniqueId=" + productUniqueId + ", productDispatchTimestamp="
				+ productDispatchTimestamp + ", productReceiveTimestamp=" + productReceiveTimestamp
				+ ", productSaleTimestamp=" + productSaleTimestamp + "]";
	}
	

}
