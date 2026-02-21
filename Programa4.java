import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = leer.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto Mayor");
        }
        
        leer.close();
    }
}