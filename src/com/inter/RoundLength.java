package com.inter;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class RoundLength {

	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat("#.##");
		List<Double> list= new ArrayList<>();
		list.add(12.235d);
		list.add(41.49524d);
		list.add(78.2354d);
		for(Double d1:list) {
			System.out.println(df.format(d1));
		}
		

	}

}
