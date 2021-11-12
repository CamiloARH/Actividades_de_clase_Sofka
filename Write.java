package Actividades;

import javax.swing.*;
import java.io.*;
import java.util.Locale;

public class Write extends Dictionary{

    public void Write() {

        File file = new File(getRuta());
        if (!file.exists()) {
            Dictionary a = new Dictionary();
            a.creatorText();
        }
        

        String data;
        String data2;
        data = JOptionPane.showInputDialog(" Ingrese la palabra en Espanol: ");
        data2 = JOptionPane.showInputDialog(" Ingrese la traduccion de la palabra anterior: ");
        System.out.println("");
        System.out.println("Los datos ingresados fueron: " + data+" "+data2);
        System.out.println("");


        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            setPalabras(data.toUpperCase(Locale.ROOT));
            setTraducciones(data2.toUpperCase(Locale.ROOT));
            // flag true, indica adjuntar información al archivo.
            bw.newLine();
            bw.write(getPalabras()+" es "+getTraducciones());

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
