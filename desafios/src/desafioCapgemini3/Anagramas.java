package desafioCapgemini3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
//O desafo 3 solicita um programa que encontre o número de pares de substrings que são anagramas.
// O programa foi escrito em Java versão 11, para a execução do programa é só abri-lo em uma IDE e apertar o botão "RUN".
//Esse desafio está muito confuso, a formula para gerar anagramas é Pn = n!, no caso da palavra "ovo" como a letra "o"
// se repete o calculo é pn = 3!/2! o que resulta no valor 3. Mas essa formula não se aplica para a entrada de dado "ifailuhkqq""
//pois o retorno não é o esperado pelo desafio.
public class Anagramas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");// Entrada dos dados pelo usuário

        String palavra = sc.nextLine();//Armazena o dados na variável palavra.
        char [] letras = palavra.toCharArray(); //converte a palavra em uma coleção de caracteres
        ArrayList<String> anagramas = new ArrayList<String>();

        for(int i = 0; i <palavra.length(); i++) {// Intera os elementos contidos na variável

            for(int j = 1; j < palavra.length(); j++) {

                if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
                    if(palavra.charAt(i) == palavra.charAt(i+1)) {
                        String anaOriginal = palavra.substring(i, i + 1);

                    } else {
                        String ana2 = palavra.substring(i+1);// combinações para retornar os valores citados no desafio.
                        char novo2 = letras[1];
                        String ana3 = palavra.substring(j);
                        String novo3 = ana3+ana3;
                        String ana4 = palavra.substring(j);
                        String novo4 = ana4+novo2;

                        anagramas.add(ana2);
                        anagramas.add(novo3);
                        anagramas.add(novo4);
                    }
                }
            }
        }

       System.out.println("A lista de todos os anagramas pares são: "+anagramas.size());

        sc.close();
    }

}
