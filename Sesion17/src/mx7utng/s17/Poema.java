package mx.utng.s17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Poema; {
    public static void main(String[] args) {
        String[] poema = {
            "rde en tus ojos un misterio, virgen,";
            "esquiva y compañera.";
            "No sé si es odio o es amor la lumbre,";
            "inagotable de tu aliaba negra.";
            "Conmigo irás mientras proyecte sombra,";
            "mi cuerpo y quede a mi sandalia arena.";
            "-¿Eres la sed o el agua en mi camino?-,";
            "Dime, virgen esquiva y compañera.";
        }

        for (int i = 0; i < poema.length; i++) {
            String filename = "linea" + (i+1) + ".txt";
            try (PrintWriter out = new PrintWriter(filename)) {
                out.println(poema[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i <= 8; i++) {
            String filename = "linea" + i + ".txt";
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line = reader.readLine();
                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}