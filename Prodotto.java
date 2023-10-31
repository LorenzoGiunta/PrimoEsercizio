class Prodotto {
    private String nome;
    private int prezzo;
    private int quantitaDisponibile;

    public Prodotto(String n, int p, int qP){
        this.nome=n;
        this.prezzo=p;
        this.quantitaDisponibile=qP;
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

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }
    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }
}
