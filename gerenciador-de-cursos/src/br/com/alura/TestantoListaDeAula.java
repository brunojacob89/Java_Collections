package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestantoListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisando as Arrays List", 21);
		Aula a2 = new Aula("Listas de Objetos", 18);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//A frase aqui é semelhante a "ordene estas aulas utilizando
		//como comparação o retorno do método getTempo de cada Aula".
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTitulo));;
		System.out.println(aulas);
	}

}
