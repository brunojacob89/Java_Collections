package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a Classe Aula";
		String aula2 = "Conhecendo mais de Listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		String primeiraAula=aulas.get(0);
		System.out.println(primeiraAula);
		
		for(int i = 0; i<aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		
		aulas.forEach(aula ->{
			System.out.println("Pecorrendo");
			System.out.println("Aula: "+ aula);
		});
		
		aulas.add("Aumentando o Nosso Conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
		
	}

}
