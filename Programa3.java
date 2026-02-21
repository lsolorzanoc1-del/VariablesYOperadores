import java.util.Scanner;

public class Programa3 {
	    public static void main(String[] args) {
	        
	        Scanner leer = new Scanner(System.in);
	        
	        System.out.print("Ingresa el primer numero: ");
	        int a = leer.nextInt();
	        System.out.print("Ingresa el segundo numero: ");
	        int b = leer.nextInt();
	        
	        // Comparaciones
	        System.out.println("\n=== Comparaciones ===");
	        System.out.println(a + " > " + b + ": " + (a > b));
	        System.out.println(a + " < " + b + ": " + (a < b));
	        System.out.println(a + " == " + b + ": " + (a == b));
	        
	        // Operadores lógicos
	        System.out.println("\n=== Operadores Logicos ===");
	        System.out.println("¿El primero es mayor que 0 AND menor que 100? " + (a > 0 && a < 100));
	        System.out.println("¿Alguno de los dos es igual a 0? " + (a == 0 || b == 0));
	        System.out.println("¿El primero es mayor que el segundo AND ambos son positivos? " + (a > b && a > 0 && b > 0));
	        System.out.println("¿El primero es negativo OR el segundo es negativo? " + (a < 0 || b < 0));
	        
	        leer.close();
	    }
	}
	
