package br.com.abc.vm_biomas;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Card c = new Card();
		
		System.out.println("Digite o id:");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		c.setIdCard(Integer.parseInt(str));
		
		System.out.println("Digite o nome:");
		Thread.currentThread().sleep(10000);
		c.setNomeAnimal(str);
		  
		System.out.println("Digite o nome cientifico:\n");
		
		c.setNomeCientifico(str);
		
		System.out.println("Digite a descrição:\n");
		c.setDescricao(str);
		
		System.out.println("Digite o habitat:\n");
		c.setHabitat(str);
		
		System.out.println("Digite o caminho da imagem:\n");
		c.setImagem(str);
		
		System.out.println("Digite o Status:\n");
		c.setStatus(Byte.parseByte(str));
		
		System.out.println(str);
		
		sc.close();
		

	}


}
