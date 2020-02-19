package com.capgemini.greatoutdoors.dao;

import java.util.Calendar;
import java.util.List;

import com.capgemini.greatoutdoors.dto.RetailerInventoryShelfTimeDTO;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exceptions.RetailerException;
public interface RetailerInventoryDao {
	public List<RetailerInventoryTrackDTO> getSoldItemsDetails()throws RetailerException;
	public List<RetailerInventoryTrackDTO> getDeliveredItemsDetails()throws RetailerException;
	public List<RetailerInventoryTrackDTO> getItemListByRetailer()throws RetailerException;
	public List<RetailerInventoryTrackDTO> getListOfRetailers()throws RetailerException;
	boolean updateProductReceiveTimeStamp(String RetailerInventoryDTO);
	boolean updateProductSaleTimeStamp(String RetailerInventoryDTO);
	boolean insertItemInRetailerInventory(String RetailerInventoryDTO);
	boolean deleteItemInRetailerInventory(String RetailerInventoryDTO);
	public List<RetailerInventoryShelfTimeDTO> getMonthlyShelfTimeReport()throws RetailerException;
	public List<RetailerInventoryShelfTimeDTO> getQuarterlyShelfTimeReport()throws RetailerException;
	public List<RetailerInventoryShelfTimeDTO> getYearlyShelfTimeReport()throws RetailerException;
	public List<RetailerInventoryShelfTimeDTO> getItemWiseDeliveryTimeReport()throws RetailerException;
	public List<RetailerInventoryShelfTimeDTO> getCategoryWiseDeliveryTimeReport()throws RetailerException;
	public List<RetailerInventoryShelfTimeDTO> getOutlierCategoryWiseDeliveryTimeReport()throws RetailerException;
    boolean addItemToInventory(RetailerInventoryTrackDTO obj)throws RetailerException;
    boolean deleteItemFromInventory(String retailerId,String productName);
	boolean updateItemReceiveTimeStamp(String retailerId,String productName);
	boolean updateItemSaleTimeStamp(String retailerId,String productCategoryName);
	public List<RetailerInventoryShelfTimeDTO> getInventoryById()throws RetailerException;
	//List<RetailerInventoryShelfTimeDTO> getMonthlyShelfTimeReport(List<RetailerInventoryShelfTimeDTO> list);
	

}
