package Problema2;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.time.Period;
import java.util.Locale;
import javax.swing.*;

import Problema2.Produs;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Produs> lista = new ArrayList<Produs>();
        Scanner readFile = new Scanner(new File("produse.csv"));
        readFile.useDelimiter(",|\\n");
        String denumire;
        float pret;
        int cantitate;
        LocalDate data_expirarii;
        while(readFile.hasNext())
        {
            denumire=readFile.next();
            pret=readFile.nextFloat();
            cantitate=readFile.nextInt();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-mm-dd");
            data_expirarii=LocalDate.parse(readFile.next(),format);
            Produs p = new Produs(denumire,pret,cantitate,data_expirarii);
            lista.add(p);
        }
        readFile.close();
        System.out.println("Afisare produse: ");
        for(Produs p: lista)
        {
            System.out.println(p);
        }

        System.out.println("Produse expirate: ");
        for (Produs p:lista)
        {
            if(p.getData_expirarii() > LocalDate.now())
                System.out.println(p);
        }
    }
}
