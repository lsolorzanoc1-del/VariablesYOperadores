import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Pedir datos al usuario
        System.out.print("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = leer.nextInt();
        
        System.out.print("Ingresa tu peso: ");
        double peso = leer.nextDouble();
        
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = leer.nextBoolean();
        
        // Mostrar los valores
        System.out.println("--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("¿Es estudiante? " + estudiante);
        
        leer.close();
    }
}