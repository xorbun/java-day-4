package esercizio2;
import esercizio1.Dipendente;
public class GestioneDipendenti
{
    public static void main(String[] args)
    {
            Dipendente utente1 = new Dipendente(233432, 24.4, 23, "operaio", "produzione");
            Dipendente utente2 = new Dipendente(213212, 12.4, 21, "operaio", "produzione");
            Dipendente utente3 = new Dipendente(432465, 43.2, 12, "dirigente", "vendite");
            Dipendente utente4 = new Dipendente(4654465, 32.2, 8, "impiegato", "amministrazione");
            utente1.promosso();
            utente2.promosso();
            utente3.promosso();
            utente4.promosso();
            System.out.println(utente1.getLivello());
            System.out.println(utente2.getLivello());
            System.out.println(utente3.getLivello());
            System.out.println(utente4.getLivello());
    }
}
