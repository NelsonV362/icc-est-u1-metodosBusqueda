package Views;
import java.util.Scanner;

public class showConsole {
    private Scanner scanner;
    public showConsole(){
        this.scanner= new Scanner(System.in);
    }    
    public int showBanner(){
        System.out.println("Metodos de Busqueda ***");
        int code = scanner.nextInt();
        return code;
    }
    public void showMessage(String message){
        System.out.println(message);
    }
}
