package esercizio1;

import java.util.Objects;

public class Dipendente
{
    static double Stipendiobase=1000;
    private int matricola;
    private double stipendio;
    private int importostraordinari;
    private String livello;
    private String dipartimento;


    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public int getImportostraordinari() {
        return importostraordinari;
    }

    public String getLivello() {
        return livello;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setImportostraordinari(int importostraordinari) {
        this.importostraordinari = importostraordinari;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    public  Dipendente(int matricola, double stipendio, int importostraordinari, String livello, String dipartimento)
    {
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.importostraordinari=importostraordinari;
        this.livello=livello;
        this.dipartimento=dipartimento;
    }
    public Dipendente(int matricola, String dipartimento)
    {
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        this.stipendio=Stipendiobase;
        this.importostraordinari=30;
        this.livello="operario";
    }
    public void stampadati()
    {
        System.out.println("i dati del dipendente sono:");
        System.out.println(this.matricola+this.livello+this.stipendio+this.importostraordinari+this.dipartimento);
    }
    public void promosso()
    {
        if(this.livello.equals("operaio"))
        {
            this.livello="impiegato";
            this.stipendio=stipendio+Stipendiobase*1.2;
        }
        else  if(this.livello.equals("impiegato"))
        {
            this.livello="quadro";
            this.stipendio=stipendio+Stipendiobase*1.2;
        }
        else  if(this.livello.equals("quadro"))
        {
            this.livello="dirigente";
            this.stipendio=stipendio+Stipendiobase*1.2;
        }
        else
        {
            System.out.println("già sei un dirigente, che altro vuoi?");
        }
     }
    static public double pagabase(Dipendente a)
    {
        return a.stipendio;
    }
    static public double pagabase(Dipendente a, int importostraordinari)
    {
        int calcolostraordinario=importostraordinari*15/100;
        double pagamento=a.stipendio*calcolostraordinario;
        return pagamento;
    }
}
