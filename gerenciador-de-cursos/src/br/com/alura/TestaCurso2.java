package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as Cole��es do Java","Bruno Jacob");
					
		javaColecoes.Adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.Adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.Adiciona(new Aula("Modelando com cole��es", 24));
		
		List<Aula> aulasImutaveis =  javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		

		List<Aula> aulas = new ArrayList(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}

}
