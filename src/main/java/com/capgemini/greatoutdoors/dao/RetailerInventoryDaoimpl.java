package com.capgemini.greatoutdoors.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.greatoutdoors.dto.RetailerInventoryShelfTimeDTO;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exceptions.RetailerException;
import com.capgemini.greatoutdoors.util.RetailerInventoryShelfTimeRepository;
import com.capgemini.greatoutdoors.util.RetailerInventoryTrackRepository;

public class RetailerInventoryDaoimpl implements RetailerInventoryDao{

	RetailerInventoryTrackRepository object1;
	RetailerInventoryShelfTimeRepository object2;
	public RetailerInventoryDaoimpl()
	{
		object1=new RetailerInventoryTrackRepository();
		object2=new RetailerInventoryShelfTimeRepository();
	}
	
	public List<RetailerInventoryTrackDTO> getSoldItemsDetails() {
		List<RetailerInventoryTrackDTO>op1=object1.getList();
		System.out.println("Sold items");
		System.out.println();
		for(int i=0;i<6;i++)
		{
			System.out.println(op1.get(i).getProductId());
		}
		return op1;
	}

	public List<RetailerInventoryTrackDTO>getDeliveredItemsDetails() {
		List< RetailerInventoryTrackDTO>op2=object1.getList();
		System.out.println("Delivered Items");
		System.out.println();
		for(int i=3;i<8;i++)
		{
			System.out.println(op2.get(i).getProductId());
		}
		return op2;
	}

	public List<RetailerInventoryTrackDTO> getItemListByRetailer() {
		List< RetailerInventoryTrackDTO>op3=object1.getList();
		System.out.println("Item list by retailer");
		System.out.println();
		for(int i=0;i<9;i++)
		{
			System.out.println(op3.get(i).getRetailorId()+":"+op3.get(i).getProductId());
		}
		return op3;
	}

	public List<RetailerInventoryTrackDTO> getListOfRetailers() {
		List< RetailerInventoryTrackDTO>op4=object1.getList();
		System.out.println("list of retailers");
		System.out.println();
		for(int i=0;i<9;i++)
		{
			System.out.println(op4.get(i).getRetailorId());
		}
		return op4;
	}

	public boolean updateProductReceiveTimeStamp(List<RetailerInventoryTrackDTO>list) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateProductSaleTimeStamp(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean insertItemInRetailerInventory(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteItemInRetailerInventory(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<RetailerInventoryShelfTimeDTO> getMonthlyShelfTimeReport() {
		List< RetailerInventoryShelfTimeDTO>op5=object2.getList();
		System.out.println("Monthly shelf time report");
		System.out.println(" ");
		for(int i=0;i<3;i++)
		{
			System.out.println(op5.get(i).getRetailorId()+":"+op5.get(i).getProductName()+":"+op5.get(i).getShelfTimePeriod()+"-days");
		}
		return op5;
	}

	public List<RetailerInventoryShelfTimeDTO> getQuarterlyShelfTimeReport() {
		List< RetailerInventoryShelfTimeDTO>op6=object2.getList();
		System.out.println("quarterly shelf time report");
		System.out.println(" ");
		for(int i=0;i<5;i++)
		{
			System.out.println(op6.get(i).getRetailorId()+":"+op6.get(i).getProductName()+":"+op6.get(i).getShelfTimePeriod()+"-days");
		}
		return op6;
	}


	public List<RetailerInventoryShelfTimeDTO> getYearlyShelfTimeReport() {
		List< RetailerInventoryShelfTimeDTO>op7=object2.getList();
		System.out.println("yearly shelf time report");
		System.out.println(" ");
		for(int i=0;i<9;i++)
		{
			System.out.println(op7.get(i).getRetailorId()+":"+op7.get(i).getProductName()+":"+op7.get(i).getShelfTimePeriod()+"-days");
		}
		return op7;
	}

	
	public List<RetailerInventoryShelfTimeDTO> getItemWiseDeliveryTimeReport() {
		List< RetailerInventoryShelfTimeDTO>op8=object2.getList();
		System.out.println("Item wise delivery time report");
		System.out.println(" ");
		for(int i=0;i<9;i++)
		{
			System.out.println(op8.get(i).getRetailorId()+":"+op8.get(i).getProductName()+":"+op8.get(i).getShelfTimePeriod()+"-days");
		}
		return op8;
	}

	public List<RetailerInventoryShelfTimeDTO> getCategoryWiseDeliveryTimeReport() {
		List< RetailerInventoryShelfTimeDTO>op9=object2.getList();
		System.out.println("category wise delivery time report");
		System.out.println(" ");
		for(int i=0;i<9;i++)
		{
			System.out.println(op9.get(i).getProductCategoryName()+":"+op9.get(i).getProductName()+":"+op9.get(i).getShelfTimePeriod()+"-days");
		}
		return op9;
	}

	public List<RetailerInventoryShelfTimeDTO> getOutlierCategoryWiseDeliveryTimeReport() {
		List< RetailerInventoryShelfTimeDTO>op10=object2.getList();
		System.out.println("outlier category wise delivery time report");
		System.out.println(" ");
		for(int i=0;i<3;i++)
		{
			System.out.println(op10.get(i).getShelfTimePeriod()+"-days");
		}
		return op10;
	}

	public boolean addItemToInventory(RetailerInventoryTrackDTO obj6){
		List<RetailerInventoryTrackDTO> addlist=RetailerInventoryTrackRepository.getList();
		boolean result=addlist.add(obj6);
		return result;
	}

	@Override
	public boolean deleteItemFromInventory(String retailerId, String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItemReceiveTimeStamp(String retailerId, String productName) {
		
		return false;
		
	}

	@Override
	public boolean updateItemSaleTimeStamp(String retailerId, String productCategoryName) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<RetailerInventoryShelfTimeDTO> getInventoryById() {
		List< RetailerInventoryShelfTimeDTO>op10=object2.getList();
		System.out.println("inventory by id");
		System.out.println(" ");
		for(int i=0;i<9;i++) {
			System.out.println(op10.get(i).getRetailorId());
		}
		return op10;
	}

	@Override
	public boolean updateProductReceiveTimeStamp(String RetailerInventoryDTO) {
		// TODO Auto-generated method stub
		return false;
	}
	}
