import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
    
    String palavra1;
    String palavra2;
    String palavra3;


    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a primeira palavra: ");
    palavra1 =entrada.nextLine();

    System.out.println("\nDigite a segunda palavra: ");
    palavra2 =entrada.nextLine();

    System.out.println("\nDigite a terceira palavra: ");
    palavra3 =entrada.nextLine();

    boolean equals1 = palavra1.equalsIgnoreCase("vertebrado");
    System.out.println();
    boolean equals2 = palavra1.equalsIgnoreCase("invertebrado");
    boolean equals3 = palavra2.equalsIgnoreCase("ave");
    boolean equals4 = palavra2.equalsIgnoreCase("mamífero");
    boolean equals5 = palavra2.equalsIgnoreCase("inseto");
    boolean equals6 = palavra2.equalsIgnoreCase("anelídeo");
    boolean equals7 = palavra3.equalsIgnoreCase("onívoro");
    boolean equals8 = palavra3.equalsIgnoreCase("herbívoro");
    boolean equals9 = palavra3.equalsIgnoreCase("hematofogo");
    boolean equals10 = palavra3.equalsIgnoreCase("carnívoro");
 

    if ((equals1 = true) && (equals3 = true) && (equals10 = true)) {
        System.out.println("águia");
    }
    else if ((equals1 = true) && (equals3 = true) && (equals7 = true)) {
        System.out.println("pomba");
    }
    else if ((equals1 = true) && (equals4 = true) && (equals7 = true)) {
        System.out.println("homem");
    }
    else if ((equals1 = true) && (equals4 = true) && (equals8 = true)) {
        System.out.println("vaca");
    }
    else if ((equals2 = true) && (equals5 = true) && (equals9 = true)) {
        System.out.println("pulga");
    }
    else if ((equals2 = true) && (equals5 = true) && (equals8 = true)) {
        System.out.println("lagarta");
    }
    else if ((equals2 = true) && (equals6 = true) && (equals9 = true)) {
        System.out.println("sanguessuga");
    }
    else if ((equals2 = true) && (equals6 = true) && (equals7 = true)) {
        System.out.println("minhoca");
    }
    else{
        System.out.println("inválido");
    }


    }
}