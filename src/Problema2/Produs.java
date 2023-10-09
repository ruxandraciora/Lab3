package Problema2;

import java.time.LocalDate;
public class Produs {
    private String denumire;
    private float pret;
    private int cantitate;
    private LocalDate data_expirarii;

    public Produs(String denumire, float pret, int cantitate, LocalDate data_expirarii) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.data_expirarii = data_expirarii;
    }

    public String toString() {
        return denumire + ", " + cantitate + ", " + pret + ", " + data_expirarii;
    }

    public LocalDate getData_expirarii()
    {
        return data_expirarii;
    }

}
