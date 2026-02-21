import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // --- Con int ---
        System.out.println("Operaciones con int");
        System.out.print("Ingresa el primer numero: ");
        int a = leer.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int b = leer.nextInt();
        
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division entera: " + (a / b));
        
        // --- Con double ---
        System.out.println("\n Operaciones con double");
        double c = a, d = b;
        System.out.println("Suma: " + (c + d));
        System.out.println("Resta: " + (c - d));
        System.out.println("Multiplicacion: " + (c * d));
        System.out.println("Division: " + (c / d));
        
        // --- Con float ---
        System.out.println("\n Operaciones con float");
        float e = a, f = b;
        System.out.println("Suma: " + (e + f));
        System.out.println("Resta: " + (e - f));
        System.out.println("Multiplicacion: " + (e * f));
        System.out.println("Division: " + (e / f));
        
        // --- Con short ---
        System.out.println("\n Operaciones con short");
        short g = (short) a, h = (short) b;
        System.out.println("Suma: " + (g + h));
        System.out.println("Resta: " + (g - h));
        System.out.println("Multiplicacion: " + (g * h));
        System.out.println("Division: " + (g / h));
        
        // --- Con byte ---
        System.out.println("\n Operaciones con byte");
        byte i = (byte) a, j = (byte) b;
        System.out.println("Suma: " + (i + j));
        System.out.println("Resta: " + (i - j));
        System.out.println("Multiplicacion: " + (i * j));
        System.out.println("Division: " + (i / j));
        
        leer.close();
    }
}