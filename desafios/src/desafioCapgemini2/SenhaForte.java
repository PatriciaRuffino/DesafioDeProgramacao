package desafioCapgemini2;

import java.util.Locale;
import java.util.Scanner;
//O desafio 02 é um algoritmo que informa qual o número minimo de caracteres de quevem ser adicionados para que uma string qualquer seja considerada segura.
//O programa foi escrito em java e para executar-lo basta abri-lo numa IDE compatível com a linguagem java e clicar no botão "Run".
public class SenhaForte {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha:");//Digite "Ya3"
        String senha = sc.nextLine();// Armazena o dado digitado pelo usuário.
        if (senha.length() < 6)//checa o dado informado pelo usuário é menor que 6 caracteres
        System.out.println(6 - senha.length());//caso sim, será impresso no console a quantidade faltante para a senha ter 6 ou mais caracteres.

            boolean achouNumero = false;
            boolean achouMaiuscula = false;
            boolean achouMinuscula = false;
            boolean achouSimbolo = false;
            for (char caracter : senha.toCharArray()) { //itera cara caracter da senha digitada

                if (caracter >= '0' && caracter <= '9') { //faz as verificações sobre os requisitos.
                    achouNumero = true;
                } else if (caracter >= 'A' && caracter <= 'Z') {
                    achouMaiuscula = true;
                } else if (caracter >= 'a' && caracter <= 'z') {
                    achouMinuscula = true;
                } else if (caracter == '!' & caracter == '@' & caracter == '#' & caracter == '$' & caracter == '%' & caracter == '^' & caracter == '&' & caracter == '*' & caracter == '('
                        & caracter == ')' & caracter == '-' & caracter == '+') {
                    achouSimbolo = true;
                } else {
                    boolean senhaCadastrada = achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;//verifica se o dado informado é válido
                    senhaCadastrada=false;
                            if(senhaCadastrada= true)
                    System.out.println("Senha Cadastrada");//retorna na tela que a senha foi cadastrada com sucesso.

                }


            }

            sc.close();//Fecha a leitura de dado
        }
}





