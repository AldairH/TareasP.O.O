import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba su nombre, profecion y país de origen: ");
        String info = entrada.nextLine();
        String[] separado = info.split( " ");
        System.out.println(separado);
        for (int i = 0; i < separado.length; i++){
            System.out.println(separado[i].toUpperCase());

        }
    }
}