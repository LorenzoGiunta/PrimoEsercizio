public class Utenti {
    
    public String nome;
    public String password;
    
    
    public Utenti(String n, String p){
        this.nome=n;
        this.password=p;
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
}
