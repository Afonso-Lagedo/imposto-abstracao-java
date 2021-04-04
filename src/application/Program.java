package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.Contribuinte;
import entities.Fisico;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<Contribuinte>();
		
		System.out.print("Entre com o número de contrinuintes:");
		int n = sc.nextInt();
		
		for (int i=1;i<=n ;i++) {
			System.out.println("Contribuinte# "+i+" informações:");
			System.out.print("Fisico ou Juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'f') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Renda Anual: ");
				double rendaAnual= sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				double gastoSaude= sc.nextDouble();
				Fisico x = new Fisico(nome, rendaAnual, gastoSaude);
				list.add(x);
			}
			else {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Renda Anual: ");
				double rendaAnual= sc.nextDouble();
				System.out.print("Número de funcionários: ");
				int numFuncionario= sc.nextInt();
				Juridica x = new Juridica(nome, rendaAnual, numFuncionario);
				list.add(x);
			}
			
		}
		
		System.out.println();
		System.out.println("Impostos:");
		
		for (Contribuinte contribuinte : list) {
			
			System.out.println(contribuinte.getNome()+" R$ "+String.format("%.2f",contribuinte.imposto()));
		}
		
		Double Soma=0.0;
		
		for (Contribuinte contribuinte : list) {
			Soma=Soma+contribuinte.imposto();
		}
		
		System.out.println();
		System.out.println("Total R$ "+String.format("%.2f",Soma));
		
		sc.close();
	}

}
