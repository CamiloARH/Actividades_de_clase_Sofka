package Actividades;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Locale;


public class Translate extends Dictionary{

    public void Translate() {

        File file = new File(getRuta());
        if (!file.exists()) {
            Dictionary a = new Dictionary();
            a.creatorText();
        }

        try {
            FileReader r = new FileReader(getRuta());
            BufferedReader buffer = new BufferedReader(r);
            String data;
            data = JOptionPane.showInputDialog(" Ingrese la palabra que quiere traducir: ").toUpperCase(Locale.ROOT);

            String temp = "";
            boolean word_existe = false;
            while (temp!=null){
                temp = buffer.readLine();
                if(temp==null) {
                    System.out.println("//////////////////////////////////////////////////////////////");
                    System.out.println("No se encontro la palabra en la base de datos \n Por favor Escribala" +
                            "junto con su traducción");
                    System.out.println("//////////////////////////////////////////////////////////////");
                    System.out.println("");
                    break;
                }
                String temp2[] = temp.split(" es ");
                for(String word : temp2) {
                    word_existe = word.equals(data);
                    if (word_existe) {
                        System.out.println("//////////////////////////////////////////////////////////////");
                        System.out.println("La traduccion de la palabra "+temp);
                        System.out.println("//////////////////////////////////////////////////////////////");
                        System.out.println("");
                        temp = null;
                        break;
                    }
                }
            }
        } catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
