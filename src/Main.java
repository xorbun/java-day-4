import esercizio1.Dipendente;
import esercizio2.GestioneDipendenti;

public class Main {
    public static void main(String[] args)
    {
        Dipendente prov1=new Dipendente(324,28.4,23,"operaio","informatica");
        prov1.stampadati();
        prov1.promosso();
        double a =Dipendente.pagabase(prov1);
        System.out.println(a);
        double b=Dipendente.pagabase(prov1,prov1.getImportostraordinari());
        System.out.println(b);
    }
}