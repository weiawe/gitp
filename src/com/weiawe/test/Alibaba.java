package com.weiawe.test;

import java.util.Arrays;
import java.util.List;

public class Alibaba {

	public static void main(String[] args) {
		String[] str = new String[]{"abc","123"};
		List list = Arrays.asList( str);
		
		String a = null;
		switch (a) {
		case "null":
			System.out.println("null push");
			break;

		default:
			System.out.println("default");
			break;
		}
	}
}
