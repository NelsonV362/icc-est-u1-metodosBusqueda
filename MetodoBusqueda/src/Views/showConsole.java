package Views;

import java.util.Scanner;

public class showConsole {
    private Scanner scanner;

    public showConsole() {
        this.scanner = new Scanner(System.in);
    }

    public int showBanner() {
        System.out.println("Métodos de Búsqueda ***");
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String inputName() {
        System.out.print("Ingrese el nombre: ");
        scanner.nextLine(); // Limpiar buffer después de nextInt()
        return scanner.nextLine();
    }

    // Implementación del método inputCode() para obtener un código de la persona
    public int inputCode() {
        System.out.print("Ingrese el código de la persona a buscar: ");
        return scanner.nextInt(); // Lee un número entero desde la entrada del usuario
    }
}
