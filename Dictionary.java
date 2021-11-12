package Actividades;

import java.io.*;
import java.util.LinkedList;


public class Dictionary {
    private String palabras;
    private String traducciones;
    private String ruta;

    public Dictionary(){
        this.palabras = "";
        this.traducciones = "";
        this.ruta="D:\\Sofka U\\Java\\ProjectExample1\\src\\main\\java\\Actividades\\Traductor.txt";
     }
    public void creatorText(){

        try {
            File file = new File(this.ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("--------------------------------------------------------------");
            System.out.println("Este es un traductor de Spanish to ingles");
            System.out.println("--------------------------------------------------------------");
            System.out.println("");

            palabras = " Palabras en Espanol";
            traducciones ="Words in English";

            bw.write(palabras +" es "+traducciones);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public String getTraducciones() {
        return traducciones;
    }

    public void setTraducciones(String traducciones) {
        this.traducciones = traducciones;
    }
}
