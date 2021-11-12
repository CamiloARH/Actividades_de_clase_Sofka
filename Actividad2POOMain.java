package Actividades;


import java.util.Locale;
import java.util.Scanner;

public class Actividad2POOMain {
    public static void main(String[] args) {
        Translate buscar = new Translate();
        Write escribir = new Write();
        Print imprimir = new Print();
        Scanner capture = new Scanner(System.in);

        System.out.println("Hola bienbenido");
        System.out.println("");
        System.out.println("Este programa es un pequeño traductor, el cual se va construyendo amedida que tu\n" +
                "nos ayudes a llenarlo");
        imprimir.Print();
//        escribir.Write();
        buscar.Translate();


        System.out.println("¿Deseas agragar una nueva palabra al diccionario?: Y/N");
        String data = capture.nextLine().toUpperCase(Locale.ROOT);

        if(data.equals("Y")){
            System.out.println(data.equals("Y"));
            escribir.Write();
        }

    }
}
