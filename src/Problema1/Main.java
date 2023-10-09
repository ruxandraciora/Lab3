package Problema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("in.txt"));
        List<Parabola> lista = new ArrayList<Parabola>();
        int a, b, c;
        while (readFile.hasNext()) {
            a = readFile.nextInt();
            b = readFile.nextInt();
            c = readFile.nextInt();

            lista.add(new Parabola(a, b, c));
        }
        readFile.close();
        for(Parabola p:lista)
        {
            System.out.println(p);
        }

        for(int i=0;i<lista.size();i++)
        {
            if(i>0) {
                System.out.println("Coordonatele mijlocui segmentului de dreapta care uneste "+lista.get(i)+ " si "+
                        lista.get(i-1)+" sunt: "+lista.get(i).mijloc_segment1(lista.get(i - 1)));
                System.out.println("Lungimea segmentului de dreapta care uneste varfurile "+lista.get(i)+ " si "+
                        lista.get(i-1)+" este: "+lista.get(i).lungime_segment1(lista.get(i - 1)));
            }
        }




    }
}
