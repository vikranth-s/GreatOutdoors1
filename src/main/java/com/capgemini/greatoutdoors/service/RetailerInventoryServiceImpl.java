package com.capgemini.greatoutdoors.service;

import java.util.Calendar;
import java.util.List;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoimpl;
import com.capgemini.greatoutdoors.dto.RetailerInventoryShelfTimeDTO;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exceptions.RetailerException;

public class RetailerInventoryServiceImpl implements RetailerInventoryService {
	RetailerInventoryDaoimpl obj; 
	public RetailerInventoryServiceImpl()
   {
    obj=new RetailerInventoryDaoimpl();
		
   }

	@Override
	public List<RetailerInventoryTrackDTO> getSoldItemsDetails()throws RetailerException {	
		   return obj.getSoldItemsDetails();
	}

	@Override
	public List<RetailerInventoryTrackDTO> getDeliveredItemsDetails()throws RetailerException {
			return obj.getDeliveredItemsDetails();
	}

	@Override
	public List<RetailerInventoryTrackDTO> getItemListByRetailer()throws RetailerException {
			return obj.getItemListByRetailer();
	}

	@Override
	public List<RetailerInventoryTrackDTO> getListOfRetailers()throws RetailerException {
		return obj.getListOfRetailers();
	}

	@Override
	public boolean updateProductReceiveTimeStamp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductSaleTimeStamp(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertItemInRetailerInventory(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemInRetailerInventory(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RetailerInventoryShelfTimeDTO> getMonthlyShelfTimeReport()throws RetailerException {
			return obj.getMonthlyShelfTimeReport();
	}

	@Override
	public List<RetailerInventoryShelfTimeDTO> getQuarterlyShelfTimeReport()throws RetailerException {
			return obj.getQuarterlyShelfTimeReport();
	}

	@Override
	public List<RetailerInventoryShelfTimeDTO> getYearlyShelfTimeReport()throws RetailerException {
			return obj.getYearlyShelfTimeReport();
	}

	@Override
	public List<RetailerInventoryShelfTimeDTO> getItemWiseDeliveryTimeReport()throws RetailerException{
			return obj.getItemWiseDeliveryTimeReport();
	}

	@Override
	public List<RetailerInventoryShelfTimeDTO> getCategoryWiseDeliveryTimeReport()throws RetailerException {
			return obj.getCategoryWiseDeliveryTimeReport();
	}

	@Override
	public List<RetailerInventoryShelfTimeDTO> getOutlierCategoryWiseDeliveryTimeReport()throws RetailerException{
			return obj.getOutlierCategoryWiseDeliveryTimeReport();
	}

	public boolean addItemToInventory(RetailerInventoryTrackDTO obj6)throws RetailerException {
		boolean result=false;
		if(!obj6.getRetailorId().isEmpty()) {
			if(!obj6.getProductId().isEmpty()) {
				result=obj.addItemToInventory(obj6);
				if(!result)
				{
					throw new RetailerException("Id not added");
				}
				else
					return result;
			}
			throw new RetailerException("product id should not be empty");
		}
		else
		{
		throw new RetailerException("retailer id should not be empty");
		}
	}

	@Override
	public boolean deleteItemFromInventory(String retailerId, String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItemReceiveTimeStamp(String retailerId, String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	
	/*public boolean updateItemSaleTimeStamp(String RetailerInventoryDTO1)throws RetailerException {
		if(RetailerInventoryDTO1.isEmpty())
			throw new RetailerException("RetailerInventory Id Cannot be empty!!");
		else
			return obj.getOutlierCategoryWiseDeliveryTimeReport(RetailerInventoryDTO1);
	}*/

	@Override
	public List<RetailerInventoryShelfTimeDTO>getInventoryById()throws RetailerException {
			return obj.getInventoryById();
	}

	@Override
	public boolean updateItemSaleTimeStamp(String retailerId, String productCategoryName) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<RetailerInventoryTrackDTO> getItemByRetailer() {
		// TODO Auto-generated method stub
		return null;
	}

}
