package esercizio2;
import esercizio1.Dipendente;

import java.util.Random;
import java.util.Scanner;

public class GestioneDipendenti
{
    public static void main(String[] args)
    {
        Dipendente [] utenti=new Dipendente[5];
        Random  rndm=new Random();
        for(int i=0;i< utenti.length;i++)
        {
            int matricola=rndm.nextInt(1,10000);
            double stipendio=rndm.nextDouble(1.0,10000.0);
            int importostraordinari=rndm.nextInt(1,50);
            String livello="";
            String dipartimento="";
            int selettore=rndm.nextInt(1,4);
            switch (selettore)
            {
                case 1:
                {
                    livello="operaio";
                    break;
                }
                case 2:
                {
                    livello="impiegato";
                    break;
                }
                case 3:
                {
                    livello="quadro";
                    break;
                }
                case 4:
                {
                     livello="dirigente";
                    break;
                }
            }
            int selezionadipartimento=rndm.nextInt(1,3);
            switch (selezionadipartimento)
            {
                case 1:
                {
                     dipartimento="produzione";
                    break;
                }
                case 2:
                {
                     dipartimento="amministrazione";
                    break;
                }
                case 3:
                {
                     dipartimento="vendite";
                    break;
                }
            }
            utenti[i]=new Dipendente(matricola,stipendio,importostraordinari,livello,dipartimento );
        }
       for(int i=0;i< utenti.length;i++)
       {
           utenti[i].stampadati();
       }
       for(int i=0;i< utenti.length;i++)
       {
           utenti[i].promosso();
           System.out.println(utenti[i].getLivello());
       }
    }
}
