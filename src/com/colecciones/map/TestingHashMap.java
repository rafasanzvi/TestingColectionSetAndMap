package com.colecciones.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestingHashMap {

	public static void main(String[] args) {
		
		//Map es muy similar a Set, lo único es que hay que pasarle una relación clave valor
		//Map<Key, Value>
		//HashMap no permite coger claves repetidas, si valores, si hay dos elementos con la misma key mostrará el último
		
		Map<Integer,String> testHash = new HashMap<>();
		
		testHash.put(25, "Rafael");
		testHash.put(52, "Amaro");
		testHash.put(34, "Jose");
		testHash.put(67, "Manuel");
		
		for(Entry<Integer,String> elemento : testHash.entrySet()) {
			System.out.println("Key: " + elemento.getKey() + " value: " + elemento.getValue());
		}
	
		}

}
