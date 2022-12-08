package com.colecciones.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestingTreeLinkedHashMap {

	public static void main(String[] args) {
		
		
		Map<String, Integer> testLinked = new LinkedHashMap<>();
		
		//LinkedHashMap muestra los valores en el orden en que se van añadiendo, tampoco devuelve las llaves repetidas
		
		testLinked.put("25", 45);
		testLinked.put("52", 54);
		testLinked.put("34", 67);
		testLinked.put("67", 78);
		testLinked.put("67", 78);
		
		for(Entry<String,Integer> elemento : testLinked.entrySet()) {
			System.out.println("Key: " + elemento.getKey() + " value: " + elemento.getValue());
		}

	}

}
