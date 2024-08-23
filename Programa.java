package entidade2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aulao6.BaseForma;
import aulao6.Conta;
import aulao6.Retangulo;
import aulao6.Triangulo;

public class Programa {

	public static void main(String[] args) {

Scanner scn = new Scanner (System.in);
		
		System.out.println("Digite a Base: ");
		double b = scn.nextDouble();
		
		System.out.println("Digite a Altura: ");
		double a = scn.nextDouble();
		
		System.out.println("Digite a Largura: ");
		double l = scn.nextDouble();
		
		entidade2.Retangulo x = new Retangulo(l, a, b);
		entidade2.Triangulo y = new Triangulo();
		
		System.out.println("Opções:");
		System.out.println("1. Triangulo");
		System.out.println("2. Retangulo");
    	System.out.println("3. Sair");
    	System.out.print("Digite a opção desejada: ");
    	int opcao = scn.nextInt();
    	scn.nextLine();
    	
    	switch (opcao) {
        case 1:
            System.out.println();
            
         
            break;
        case 2:
           System.out.println();
            break;
                case 4:
            System.out.println("Saindo...");
            return;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            

	}
    	if(opcao == 1 ) {
    		System.out.println("Informaçoes Triangulo: " +x. mostrarinfo() + "Area: " +x.calcularArea());
        	
        

    	}else if (opcao == 2) {
    		System.out.println("Informaçoes do Retangulo: " +y. mostrarinfo()+ "Area: " + y.calcularArea2());
    		
		

	}
	}

}
