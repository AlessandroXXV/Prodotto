package Prodotto;

public class Admin {
    
    private String nome; 
    private String cognome;
    private String username; 
    private Potere potere;



    public Admin(String nome, String cognome, String username, Potere potere) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.potere = potere;
    }














    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Potere getPotere() {
        return potere;
    }
    public void setPotere(Potere potere) {
        this.potere = potere;
    }
}
