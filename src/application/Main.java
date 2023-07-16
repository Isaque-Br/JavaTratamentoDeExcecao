package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try { // COLOCANDO TRY/TENTAR NO BLOCO QUE PODE GERAR UMA EXCEÇÃO
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } // CAPTURANDO EXCEPTION, COLOCANDO MENSAGEM DE AVISO E CONTINUAR A EXECUÇÃO DO PROGRAMA
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada invalida!");
        }
        System.out.println("Programa encerrado");

        sc.close();
    }
}