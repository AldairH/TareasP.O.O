import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba su nombre, profecion y país de origen: ");
        String info = entrada.nextLine();
        String[] separado = info.split( " ");
        System.out.println("Nombre: " + separado[0].toUpperCase());
        System.out.println("Profesión: " + separado[1].toUpperCase());
        System.out.println("País: " + separado[2].toUpperCase());


    }
}