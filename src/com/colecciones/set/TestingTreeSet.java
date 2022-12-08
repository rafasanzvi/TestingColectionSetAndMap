package com.colecciones.set;

import java.util.Set;
import java.util.TreeSet;

public class TestingTreeSet {

	public static void main(String[] args) {
		
		Set<String> conjuntoTreeSet = new TreeSet<>();
		
		conjuntoTreeSet.add("Oso");
		conjuntoTreeSet.add("Perro");
		conjuntoTreeSet.add("Zorro");
		conjuntoTreeSet.add("Lobo");
		conjuntoTreeSet.add("Rata");
		conjuntoTreeSet.add("Rata");
		
		for(String animal : conjuntoTreeSet) {
			System.out.println("Valor: " + animal);
		}

	}

}
