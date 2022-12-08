package com.colecciones.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestingHashSet {

	public static void main(String[] args) {
		
		Set<String> conjuntoHash = new HashSet<>(); //"Hash" hace referencia a un valor único y "set" es un conjunto, lo que podría querer decir que es un conjunto que no admite valores repetidos
	
		conjuntoHash.add("España");
		conjuntoHash.add("Portugal");
		conjuntoHash.add("Marruecos");
		conjuntoHash.add("Francia");
		conjuntoHash.add("Francia");
		
		for(String pais : conjuntoHash) {
			System.out.println("Valor: " + pais);
		}
	}

}
