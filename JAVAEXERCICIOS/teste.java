import java.util.Scanner;
public class teste {
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Escolha uma palavra: ");
  String palavra1 = entrada.nextLine();
  System.out.println("Escolha uma palavra: ");
  String palavra2 = entrada.nextLine();
  System.out.println("Escolha uma palavra: ");
  String palavra3 = entrada.nextLine();
   switch (palavra1) {
     case "vertebrado" :
        switch (palavra2) {
            case "ave" :
            switch (palavra3) {
                case "carnívoro" :
                    System.out.println("águia");
                    break;
    
    
     default:
       System.out.println("invalido");
   }
 }
   }
}
}
