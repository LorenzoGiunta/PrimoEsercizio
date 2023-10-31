




/*
Implementate la funzionalità di accesso come "Amministratore".
Dopo l'accesso come amministratore, visualizzate un menu con tutte le opzioni, comprese quelle per la gestione dei prodotti.
Consentite la creazione di nuovi prodotti, includendo i seguenti dettagli per ciascun prodotto: Nome del prodotto (una stringa che rappresenta il nome del prodotto), Prezzo del prodotto (un valore numerico che rappresenta il prezzo del prodotto) Quantità disponibile (un valore numerico che rappresenta la quantità di prodotti disponibili)
Implementate la funzionalità per l'aggiunta di nuovi prodotti con questi dettagli.
Consentite la rimozione di prodotti esistenti, consentendo all'utente di specificare un criterio (ad esempio, nome del prodotto).
Aggiornate il catalogo dopo la rimozione del prodotto.
Mostrate un messaggio di conferma dopo l'aggiunta o la rimozione dei prodotti.
*/




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CatalogoProdotti {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Prodotto> p= new ArrayList<>();
        List<Utenti> u= new ArrayList<>();
        u.add(new Utenti("Lorenzo", "1111", true));
        u.add(new Utenti("Gioele", "0000", false));
        boolean ok=false;

        int scelta=0, controllo =0, indice=0;
        String nome, password="";
        String nomeP;
        int prezzoP, qP;
        String fine="no";

        p.add(new Prodotto("Matebook D", 700, 10));
        p.add(new Prodotto("MacBook air", 1200, 15));
        p.add(new Prodotto("MacBook pro", 1500, 20));

        do {
            u.get(0).visualizzaMenu1();
            System.out.println("Inserisci cosa vuoi fare: ");
            scelta=in.nextInt();

            switch (scelta) {
                case 1:
                    do {
                        System.out.println("Inserisci il nome dell'account: ");
                        nome = in.next();

                        System.out.println("Inserisci la password dell'account: ");
                        password = in.next();

                        for (int i = 0; i < u.size(); i++) {
                            if (!(u.get(i).accedi(nome, password))) {
                                ok = false;
                            } else {
                                ok = true;
                                indice = i;
                            }
                        }
                        controllo++;
                    } while (ok && controllo < 3);

                    if (u.get(indice).accedi(nome, password) && !(u.get(indice).admin)) {
                        u.get(indice).visualizzaMenu2();
                        System.out.println("Inserisci cosa vuoi fare: ");
                        scelta = in.nextInt();
                        switch (scelta) {
                            case 1:
                                System.out.println("I prodotti sono: ");
                                for (int i = 0; i < p.size(); i++) {
                                    System.out.println(p.get(i).getNome() + " , prezzo : " + p.get(i).getPrezzo() + " , quantita disponibile : " + p.get(i).getQuantitaDisponibile());
                                }
                                break;
                            default:
                                System.out.println("...USCITA...");
                                break;
                        }
                    } else {
                        System.out.println("---HAI UN UTENTE ADMIN---");
                        u.get(indice).visualizzaMenu2Administrator();
                        System.out.println("Inserisci cosa vuoi fare: ");
                        scelta = in.nextInt();
                        switch (scelta) {
                            case 1:
                                System.out.println("I prodotti sono: ");
                                for (int i = 0; i < p.size(); i++) {
                                    System.out.println(p.get(i).getNome() + " , prezzo : " + p.get(i).getPrezzo());
                                }
                                break;
                            case 2:
                                System.out.println("Inserisci il nome del prodotto: ");
                                nomeP = in.next();

                                System.out.println("Inserisci il prezzo del prodotto");
                                prezzoP = in.nextInt();

                                System.out.println("Inserisci la quantita di prodotto disponibile: ");
                                qP = in.nextInt();

                                p.add(new Prodotto(nomeP, prezzoP, qP));
                                break;
                            case 3:
                                System.out.println("Inserisci il nome del prodotto da rimuovere: ");
                                nomeP = in.next();
                                for (int i = 0; i < p.size(); i++) {
                                    if (nomeP.equals(p.get(i).getNome())) {
                                        p.remove(p.get(i));
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("...USCITA...");
                                break;
                        }
                    }

                    break;

                default:
                    System.out.println("...USCITA...");
                    break;
            }
            System.out.println("Vuoi terminare il programma? (si || no) ");
            fine=in.next();
        }while(fine.equals("no"));
    }
}
