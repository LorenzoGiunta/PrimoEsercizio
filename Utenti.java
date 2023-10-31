public class Utenti {
    public String nome;
    public String password;
    public boolean admin=false;


    public Utenti(String n, String p, boolean b){
        this.nome=n;
        this.password=p;
        this.admin=b;
    }


    public boolean accedi(String n, String p){
        boolean ok=false;
        if (this.nome.equals(n) && (this.password.equals(p)))
            ok=true;
        return ok;
    }

    public void visualizzaMenu1(){
        System.out.println("----------------------");
        System.out.println("-1- Accedi come utente");
        System.out.println("-2-      ESCI         ");
        System.out.println("----------------------");
    }

    public void visualizzaMenu2(){
        System.out.println("-----------------------");
        System.out.println("-1- Visualizza Prodotti");
        System.out.println("-2-      ESCI          ");
        System.out.println("-----------------------");
    }

    public void visualizzaMenu2Administrator(){
        System.out.println("-----------------------");
        System.out.println("-1-Visualizza Prodotti ");
        System.out.println("-2- Aggiunti Prodotto  ");
        System.out.println("-3- Rimuovi prodotto   ");
        System.out.println("-4-      ESCI          ");
        System.out.println("-----------------------");
    }
}
