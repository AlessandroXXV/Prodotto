package Prodotto;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    //Potere potere1 = new Potere("Amministratore"); 
    //Potere potere2 = new Potere("User"); 
    //User user1 = new User("Alessandro", "D'Angelo", "AlessandroXXV", potere1); 
    
    static List<User> listaUtenti = new ArrayList<User>();
    public static void main(String[] args) {
        //Potere potere1 = new Potere("Amministratore"); 
        //Potere potere2 = new Potere("User"); 
        //Admin admin = new Admin("Alessandro", "D'ANgelo", "AlessandroXXV", "1234", potere1); 
        
        //static List<User> listaUtenti = new ArrayList<User>();
        


    }

    

    static void AccessoAlSito()
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ciao utente, se hai già un account inserisci UserName e Password, \n se sei nuovo registrati ");
        System.out.println("Effettua login --> 1");
        System.out.println("Effettua registrazione --> 2");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                LogIn(scanner);
                break;
            case 2:
                registrati(scanner); 
                break;
        }
        scanner.close();
    }

    static void LogIn(Scanner scanner)
    {
        System.out.println("Inserisci username e password");
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        for(int i = 0; i < listaUtenti.size(); i++)
        {
            if(listaUtenti.get(i).getUsername().equals(username) && listaUtenti.get(i).getPassword().equals(password))
            {
                System.out.println("Accesso effettuato");
                return; 
            }
        }
        System.out.println("Username o password errati");
    }

    static void registrati(Scanner scanner)
    {
        System.out.println("Inserisci nome, cognome, username e password");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Cognome: ");
        String cognome = scanner.nextLine();
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        Potere potere1 = new Potere("User");

        User user = new User(nome, cognome, username, password, potere1); 
        listaUtenti.add(user); 
    }
    
    static void registrati()
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Inserisci nome, cognome, username e password");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Cognome: ");
        String cognome = scanner.nextLine();
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        Potere potere1 = new Potere("User");
        //System.out.println("Potere: ");
        //String potere = scanner.nextLine();

        User user = new User(nome, cognome, username, password, potere1); 
        listaUtenti.add(user); 
    }
}
