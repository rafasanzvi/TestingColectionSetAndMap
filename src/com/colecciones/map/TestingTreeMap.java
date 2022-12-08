package com.colecciones.map;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestingTreeMap {

	public static void main(String[] args) {
		
		Map<String, Integer> testTree = new TreeMap<>();
		
		//TreeMap si muestra las keys ordenadas
		
		testTree.put("25", 45);
		testTree.put("52", 54);
		testTree.put("34", 67);
		testTree.put("67", 78);
		testTree.put("67", 78);
		
		for(Entry<String,Integer> elemento : testTree.entrySet()) {
			System.out.println("Key: " + elemento.getKey() + " value: " + elemento.getValue());
		}

	}

}
