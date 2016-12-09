package cn.com.webxml.main;

import java.text.DecimalFormat;

public class Testmain {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("####.00");
		System.out.println(df1.format(100000.11));
	}

}
