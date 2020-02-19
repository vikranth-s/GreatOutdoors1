package com.capgemini.greatoutdoors.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.greatoutdoors.dto.RetailerInventoryShelfTimeDTO;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
import com.capgemini.greatoutdoors.exceptions.RetailerException;
import com.capgemini.greatoutdoors.util.RetailerInventoryShelfTimeRepository;
import com.capgemini.greatoutdoors.util.RetailerInventoryTrackRepository;

public class RetailerInventoryServiceTest {
	
	RetailerInventoryServiceImpl a1=new RetailerInventoryServiceImpl();
	@Test
	public void testgetListOfRetailers() throws RetailerException {
		List<RetailerInventoryTrackDTO> list=RetailerInventoryTrackRepository.getList();
		
		assertEquals(list,a1.getListOfRetailers());
	}
	RetailerInventoryServiceImpl a2=new RetailerInventoryServiceImpl();
	@Test
	public void testItemListByRetailer() throws RetailerException {
		List<RetailerInventoryTrackDTO> list=RetailerInventoryTrackRepository.getList();
		
		assertEquals(list,a2.getItemListByRetailer());
	}
	RetailerInventoryServiceImpl a3=new RetailerInventoryServiceImpl();
	@Test
	public void testgetDeliveredItemsDetails() throws RetailerException {
		List<RetailerInventoryTrackDTO> list=RetailerInventoryTrackRepository.getList();
		
		assertEquals(list,a3.getDeliveredItemsDetails());
	}
	RetailerInventoryServiceImpl a4=new RetailerInventoryServiceImpl();
	@Test
	public void testgetSoldItemsDetails() throws RetailerException {
		List<RetailerInventoryTrackDTO> list=RetailerInventoryTrackRepository.getList();
		
		assertEquals(list,a4.getSoldItemsDetails());
	}
	RetailerInventoryServiceImpl a5=new RetailerInventoryServiceImpl();
	@Test
	public void testgetInventoryById() throws RetailerException {
		List<RetailerInventoryShelfTimeDTO> list=RetailerInventoryShelfTimeRepository.getList();
		
		assertEquals(list,a5.getInventoryById());
	}
	RetailerInventoryServiceImpl a6=new RetailerInventoryServiceImpl();
	@Test
	public void addItemToInventoryTest() throws RetailerException {
		
		RetailerInventoryTrackDTO expected = new RetailerInventoryTrackDTO("somy",(byte) 45,"outdoors","asdvg","41d","42d","43d");
		boolean actual = a6.addItemToInventory(expected);
		assertEquals(true,actual);
	}
}
