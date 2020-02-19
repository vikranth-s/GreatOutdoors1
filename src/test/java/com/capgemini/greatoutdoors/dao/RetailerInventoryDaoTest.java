package com.capgemini.greatoutdoors.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoimpl;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;

	public class RetailerInventoryDaoTest {
		RetailerInventoryDaoimpl impl=new RetailerInventoryDaoimpl();
		@Test
		public void addItemToInventoryTest()
		{
			RetailerInventoryTrackDTO Expected = new RetailerInventoryTrackDTO("somy",(byte) 45,"outdoors","asdvg","41d","42d","43d");
			boolean actual = impl.addItemToInventory(Expected);
			assertEquals(true,actual);
		}

	}
