package Atividade2;
import java.util.Scanner;


public class mainPet {
    public static void main(String[] args) {
      
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pet:");
    String nome = scanner.nextLine();

    System.out.println("Diga a idade do pet:");
int idade = scanner.nextInt();


System.out.println("qual a raça do seu pet?");
String raca = scanner.next();


System.out.println("qual o porte do teu animal??");
String porte = scanner.next();

System.out.println("Você alimenta seu pet com o que ? ");
String alimentacao = scanner.next();

Pets pet = new Pets(nome, idade, raca, porte, alimentacao);



}

}
