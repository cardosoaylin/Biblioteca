package lista;

import java.util.ArrayList;
import java.util.Scanner;

	public class Bibliotecas {
		public static void main(String[] args) {
			Livro obj= new Livro(null, null, 0);
			Scanner ler= new Scanner(System.in);
		

			
			ArrayList<Livro> lista= new ArrayList<Livro>();
			
				System.out.println("MENU:");
				System.out.println("1 - Adicionar livro");
				System.out.println("2 - Consultar livro");
				System.out.println("3 - Apagar livro");
				System.out.println("4 - Visualizar lista");
				System.out.println("5 - Sair");
				System.out.println("Escolha uma opção:");
				int x;
				x=ler.nextInt();
				
			
				
				while (x==1) {
					
					System.out.println("Nome do Livro:");
					//Dá problemas ao inserir nomes compostos, não sei o porquê
					String titulo= ler.next();
					System.out.println("Nome do autor:");
					String autor= ler.next();
					System.out.println("Ano de publicação:");
					int anoPublicaçao= ler.nextInt();
					
					Livro livro = new Livro(titulo, autor ,anoPublicaçao);
					
					lista.add(livro);
					System.out.println("Adicionado com sucesso!");
					
					
					System.out.println("Escolha uma opção do menu:");
					x=ler.nextInt();
					
				if(x==2) {
						System.out.println("Digite o nome do livro que deseja consultar:");
						titulo=ler.next();
						System.out.println(livro);
						
						System.out.println("Escolha uma opção do menu:");
						x=ler.nextInt();
							
				}else if (x==3) {
						System.out.println("Digite o nome do livro que deseja remover da lista:");
						titulo=ler.next();
						lista.remove(livro);
						 System.out.println("Livro removido com sucesso!");
						
						System.out.println("Escolha uma opção do menu:");
						x=ler.nextInt();
							
				}else if(x==4) {
					
					System.out.println("Lista:" +lista);
					System.out.println("Escolha uma opção do menu:");
					x=ler.nextInt();
					
					
				}else if(x==5) {
					System.out.println("Programa encerrado");
					
				}else if(x>5){
					System.out.println("Esse número não corresponde a nenhuma opção do Menu");
					System.out.println("MENU:");
					System.out.println("1 - Adicionar livro");
					System.out.println("2 - Consultar livro");
					System.out.println("3 - Apagar livro");
					System.out.println("4 - Visualizar lista");
					System.out.println("Escolha uma opção:");
			
					x=ler.nextInt();
					//Obs: acho que ele tem um número limitado de vezes para rodar, pois quando tento escolher todas as opções(uma de cada vez), o programa para de funcionar, mas todas as opções estão funcionando.
				}	
		
		}
				
	}

}
