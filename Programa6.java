import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Usuario y contraseña correctos definidos
        String usuarioCorrecto = "admin";
        String contraseniaCorrecta = "1234";
        
        System.out.print("Ingresa tu usuario: ");
        String usuario = leer.nextLine();
        
        System.out.print("Ingresa tu contraseña: ");
        String contrasenia = leer.nextLine();
        
        if (!usuario.equals(usuarioCorrecto)) {
            System.out.println("Usuario no registrado");
        } else if (!contrasenia.equals(contraseniaCorrecta)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Acceso concedido");
        }
        
        leer.close();
    }
}