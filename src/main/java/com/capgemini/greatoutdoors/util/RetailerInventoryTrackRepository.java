package com.capgemini.greatoutdoors.util;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.greatoutdoors.dao.RetailerInventoryDaoimpl;
import com.capgemini.greatoutdoors.dto.RetailerInventoryTrackDTO;
public class RetailerInventoryTrackRepository {
	public static List<RetailerInventoryTrackDTO> list=new ArrayList();
	private java.util.Date date;
	static
	{
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj1 = new RetailerInventoryTrackDTO("naveen",(byte)1,"xyzxyz","qwert","2020/02/20","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj2= new RetailerInventoryTrackDTO("javeen",(byte)2,"poiuyt","qwtre","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj3= new RetailerInventoryTrackDTO("praveen",(byte)3,"asdfgh","qwetr","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj4= new RetailerInventoryTrackDTO("ramesh",(byte)4,"ujnbhy","qwuyt","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj5= new RetailerInventoryTrackDTO("rajesh",(byte)5,"ploikj","qwpoi","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj6= new RetailerInventoryTrackDTO("somu",(byte)6,"qwsedr","qwiop","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj7= new RetailerInventoryTrackDTO("somesh",(byte)7,"iujhyt","qwopi","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj8= new RetailerInventoryTrackDTO("diljit",(byte)8,"mnbhjo","qwplo","2020/02/21","2020/02/22","2020/02/23");
		RetailerInventoryTrackDTO RetailerInventoryTrackDTOObj9=new RetailerInventoryTrackDTO("vivek",(byte)9,"xxpoyb","qwijk","2020/02/21","2020/02/22","2020/02/23");
		list.add(RetailerInventoryTrackDTOObj1);
		list.add(RetailerInventoryTrackDTOObj2);
		list.add(RetailerInventoryTrackDTOObj3);
		list.add(RetailerInventoryTrackDTOObj4);
		list.add(RetailerInventoryTrackDTOObj5);
		list.add(RetailerInventoryTrackDTOObj6);
		list.add(RetailerInventoryTrackDTOObj7);
		list.add(RetailerInventoryTrackDTOObj8);
		list.add(RetailerInventoryTrackDTOObj9);
	
	}
	public static List<RetailerInventoryTrackDTO> getList() {
		// TODO Auto-generated method stub
		return list;
	}
	
}