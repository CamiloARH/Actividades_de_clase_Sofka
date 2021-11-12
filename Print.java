package Actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Print extends Dictionary{
    public void Print(){

        File file = new File(getRuta());
        if (!file.exists()) {
            Dictionary a = new Dictionary();
            a.creatorText();
        }

        try {
            FileReader r = new FileReader(getRuta());
            BufferedReader buffer = new BufferedReader(r);

            String temp="";
            while (temp!=null){
                temp = buffer.readLine();
                if(temp==null)
                    break;
                System.out.println(temp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
