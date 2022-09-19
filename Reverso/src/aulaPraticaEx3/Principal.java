package aulaPraticaEx3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome;
		// Leia uma sequência de N Strings e as imprimas em ordem reversa. Utilize um método
		
	Scanner leia = new Scanner(System.in);	
	
	ArrayList<String> listaNomes = new ArrayList<String>();
	System.out.print("Digite a quantidade de nomes: ");
	int qtd = leia.nextInt();
	
	
	for(int i =0, cont = 0; i<qtd ; i++, cont++) {
		
		System.out.printf("Digite o %dº nome: ", cont+1);
		nome = leia.next();
		listaNomes.add(nome);
	}
	
	/*for(int i=listaNomes.size()-1; i >= 0; i--) {
		System.out.println(listaNomes.get(i));
	}*/
	
	System.out.println("Ordem normal");
	System.out.println(listaNomes);
	
	Collections.reverse(listaNomes);
	
	System.out.println("Ordem Reversa");
	System.out.println(listaNomes);
}
}
