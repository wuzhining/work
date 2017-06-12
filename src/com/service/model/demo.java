package com.service.model;

import java.lang.reflect.Field;

public class demo {
		public Object getService(String usrName,String usrPwd){
			jsonObject jo=new jsonObject();
			jo.setUsrName(usrName);
			jo.setPwdWord(usrPwd);
			
			return  jo;
		}
		public static void main(String[] args) {
			demo dm=new demo();
			Object ob= dm.getService("大宝", "二宝");
			System.out.println(ob.toString());
			
			try {
				Field receiName=ob.getClass().getField("usrName");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
