package com.colecciones.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestingLinkedHashSet {

	public static void main(String[] args) {
		
		Set<Character> conjuntoLinkedHashSet = new LinkedHashSet<>();
		
		//Se muestran los elementos en el orden en que se agregan y tampoco admite elementos duplicados
		
		conjuntoLinkedHashSet.add('c');
		conjuntoLinkedHashSet.add('b');
		conjuntoLinkedHashSet.add('z');
		conjuntoLinkedHashSet.add('d');
		conjuntoLinkedHashSet.add('g');
		conjuntoLinkedHashSet.add('a');
		conjuntoLinkedHashSet.add('a');
		
		for(Character letra : conjuntoLinkedHashSet) {
			System.out.println("Valor: " + letra);
		}

	}

}
