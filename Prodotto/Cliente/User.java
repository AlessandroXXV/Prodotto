package Prodotto.Cliente; 

public class User 
{
    private String nome; 
    private String cognome;
    private String username; 
    private Potere potere;

    public User(String string, String string2, String username, Potere potere1) {
        this.nome = string; 
        this.cognome = string2; 
        this.username = username; 
        this.potere = potere1; 
    }
    
    
    
    
    
    
    // GETTER E SETTER
    
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
    public Potere getPotere() {
        return potere;
    }
    public void setPotere(Potere potere) {
        this.potere = potere;
    }  
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}