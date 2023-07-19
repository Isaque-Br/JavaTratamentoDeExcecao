package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();

        System.out.println("Programa encerrado");
    }

    public static void method1() {
        System.out.println("** METHOD1 START **");
        method2();
        System.out.println("** METHOD1 END **");


    }

    public static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("** METHOD2 START **");

        try { // COLOCANDO TRY/TENTAR NO BLOCO QUE PODE GERAR UMA EXCEÇÃO
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } // CAPTURANDO EXCEPTION, COLOCANDO MENSAGEM DE AVISO E CONTINUAR A EXECUÇÃO DO PROGRAMA
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
            e.printStackTrace(); // IMPRIMI NA TELA O RASTREAMENTO DO STACK
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida!");
        }
        sc.close();
        System.out.println("** METHOD2 END **");

    }
}