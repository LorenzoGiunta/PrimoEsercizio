/*
 *Crea una classe principale chiamata CatalogoProdotti che fungerà da punto di ingresso dell'applicazione.
Crea una struttura dati (ad esempio, un ArrayList) per memorizzare i prodotti.
Implementate un menu di accesso con le seguenti opzioni: Accedi come Utente, Esci.
Consentite all'utente di inserire un nome utente e una password (la registrazione può essere fatta solo da "Utente").
Verificate le credenziali e permettete l'accesso se sono corrette.
Dopo l'accesso come utente, visualizzate un menu con le seguenti opzioni: Visualizza Prodotti, Esci.
 

    GIUNTA
    LORENZO
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class CatalogoProdotti{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Prodotti> p= new ArrayList<>();
        Utenti a= new Utenti("Lorenzo", "1111");
        int scelta=0, controllo =0;
        String nome, password="";

        p.add(new Prodotti("Matebook D", 700));
        p.add(new Prodotti("MacBook air", 1200));
        p.add(new Prodotti("MacBook pro", 1500));

        a.visualizzaMenu1();
        System.out.println("Inserisci cosa vuoi fare: ");
        scelta=in.nextInt();

        switch (scelta) {
            case 1:
                do{
                    System.out.println("Inserisci il nome del tuo account: ");
                    nome=in.nextLine();
                    System.out.println("Inserisci la password del tuo account: ");
                    password=in.nextLine();
                    if(!(a.accedi(nome, password))){
                        System.out.println("Hai inserito i dati sbagliati...\nRiprova");
                    }
                    controllo++;
                }while(!(a.accedi(nome, password)) && controllo<3); 

                if(a.accedi(nome, password)){
                    a.visualizzaMenu2();
                    System.out.println("Inserisci cosa vuoi fare: ");
                    scelta=in.nextInt();
                    switch (scelta) {
                        case 1:
                            System.out.println("I prodotti sono: ");    
                            for(int i=0; i<p.size(); i++){
                                System.out.println(p.get(i).getNome()+" , prezzo : "+p.get(i).getPrezzo());
                            }
                            break;
                        default:
                            System.out.println("...USCITA...");
                            break;
                    }
                }
                break;

            default:
                System.out.println("...USCITA...");
                break;
        }
    }
}