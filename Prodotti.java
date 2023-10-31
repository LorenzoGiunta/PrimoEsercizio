public class Prodotti {
    private String nome;
    private int prezzo;

    public Prodotti(String n, int p){
        this.nome=n;
        this.prezzo=p;
    }

    public String getNome() {
        return nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
