package com.capgemini.greatoutdoors.util;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoimpl;
import com.capgemini.greatoutdoors.dto.RetailerInventoryShelfTimeDTO;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;

public class RetailerInventoryShelfTimeRepository {
	public static List<RetailerInventoryShelfTimeDTO> list=new ArrayList();
	public RetailerInventoryShelfTimeRepository()
	{
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj1 = new RetailerInventoryShelfTimeDTO("naveen12","naveen",(byte)1,"camping","camping1","poiuy",5,5);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj2 = new RetailerInventoryShelfTimeDTO("navin22","navin",(byte)2,"camping","camping2","poiyy",5,6);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj3 = new RetailerInventoryShelfTimeDTO("ramesh21","ramesh",(byte)3,"mountaineering","mountaineering1","asdfg",6,9);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj4 = new RetailerInventoryShelfTimeDTO("ramu12","ramu",(byte)4,"mountaineering","mountaineering2","gfdsa",9,5);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj5 = new RetailerInventoryShelfTimeDTO("ravi12","ravi",(byte)5,"outdoors","outdoors1","dfvcd",8,5);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj6 = new RetailerInventoryShelfTimeDTO("sonu12","sonu",(byte)6,"outdoors","outdoors2","srvcd",5,1);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj7 = new RetailerInventoryShelfTimeDTO("shami12","shami",(byte)7,"golf","golf1","tijdl",3,4);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj8 = new RetailerInventoryShelfTimeDTO("kumar12","kumar",(byte)8,"golf","golf1","poikj",8,5);
		RetailerInventoryShelfTimeDTO RetailerInventoryShelfTimeDTOObj9 = new RetailerInventoryShelfTimeDTO("raju12","raju",(byte)9,"personal","personal1","erfgb",1,2);
	    list.add(RetailerInventoryShelfTimeDTOObj1);
	    list.add(RetailerInventoryShelfTimeDTOObj2);
	    list.add(RetailerInventoryShelfTimeDTOObj3);
	    list.add(RetailerInventoryShelfTimeDTOObj4);
	    list.add(RetailerInventoryShelfTimeDTOObj5);
	    list.add(RetailerInventoryShelfTimeDTOObj6);
	    list.add(RetailerInventoryShelfTimeDTOObj7);
	    list.add(RetailerInventoryShelfTimeDTOObj8);
	    list.add(RetailerInventoryShelfTimeDTOObj9);
	}
	public static List<RetailerInventoryShelfTimeDTO> getList()
	{
		return list;
	}
}
		