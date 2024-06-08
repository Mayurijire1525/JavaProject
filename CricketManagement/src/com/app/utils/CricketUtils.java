package com.app.utils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.app.customexception.CustomException;
import com.app.customordering.CricketerComparatorByRating;
import com.app.entity.Cricketer;

public class CricketUtils {

	public static String updateRating(String email, int newrating, Map<String, Cricketer> cmap) throws CustomException {
		Cricketer c=cmap.get(email);
		if(c!=null) {
			c.setRating(newrating);
			return "Rating updated succesfully!";
		}
		throw new CustomException("Cricketer not found");
	}

	public static Cricketer searchByName(String name, Map<String, Cricketer> cmap)throws CustomException {
		
		for(Cricketer c:cmap.values()) {
			if(c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		throw new CustomException("No such cricketer");
		
	}

	public static List<Cricketer> sortByRating(Map<String, Cricketer> cmap) {
		List<Cricketer> clist=new LinkedList<>(cmap.values());
		Collections.sort(clist, new CricketerComparatorByRating());
		return clist;
		
	}

}
