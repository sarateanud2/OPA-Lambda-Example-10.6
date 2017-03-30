package com.oca.lambda.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MembersOnly {

	
	private StringBuilder banner;
	private static List<String> strList;
	
	
	
	public MembersOnly(String str) {
		this.banner = new StringBuilder(str);
	}



	public static void main(String[] args) {
		strList = new ArrayList<>();
		strList.addAll(Arrays.asList(new String[]{"OLO", "Otto", "ADA", "Bob", "Java"}));
		
		MembersOnly obj = new MembersOnly("money ");
		
		Predicate<String> pred = obj.getPredicate();
		System.out.println(pred.test(" loves me!!!") + " "+ obj.banner);
		
		

	}
	
	public Predicate<String> getPredicate(){
		
		return (str) -> {System.out.println("List " + strList);

						banner.append(str);
						return str.length()>5;
		};
	}

}
