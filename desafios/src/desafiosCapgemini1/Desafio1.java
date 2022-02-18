package desafiosCapgemini1;

import java.util.Locale;
import java.util.Scanner;
///Primeiro desafio é para escrever um algoritmo onde mostra na tela uma escada de tamanho 6 utilizando o * e espaços.
///O código fonte foi desenvolvido em java e para excutar o programa é necessário abrir em alguma IDE e apertar o botão "Run""

public class Desafio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //Ler e processa as inforções inseridas pelo usuário
        System.out.println("Digite o número 6:");
        int n = sc.nextInt(); // armazena o dado informado em uma varável, caso digite o número "6".


        for (int i = 1; i <= n; i++) { //laço de repetição que itera os elementos
            if (i == 1) {
                System.out.println("     *");//renderiza o caracter na tela.
            }else if(i == 2){
                System.out.println("    **");
            }else if(i == 3){
                System.out.println("   ***");
            }else if(i == 4){
                System.out.println("  ****");
            }else if(i == 5){
                System.out.println(" *****");
            }else{
                System.out.println("******");
            }
            sc.close();// fecha o Scanner.
        }
    }



}
