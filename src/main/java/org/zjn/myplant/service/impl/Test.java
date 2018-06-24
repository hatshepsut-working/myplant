package org.zjn.myplant.service.impl;

import net.sf.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "{'name':'tom','score':{'Math':98,'English':90}}";
		JSONObject json = JSONObject.fromObject(string);
		System.out.println(json.get("name"));
		System.out.println(json.get("name").toString());

	}

}
