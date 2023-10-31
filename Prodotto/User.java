package Prodotto; 

public class User 
{
    private String nome; 
    private String cognome;
    private String username; 
    private String password;
    private String potere;
    
    
   






    public User(String string, String string2, String username, String password, String potere) {
        this.nome = string; 
        this.cognome = string2; 
        this.username = username;  
        this.password = password;
        this.potere = potere;
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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Object getPassword() {
        return null;
    }
    public void setPassword(String password) {
        this.password = password;
    }
     public String getPotere() {
        return potere;
    }
    public void setPotere(String potere) {
        this.potere = potere;
    }
}