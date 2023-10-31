package Prodotto;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    //Potere potere1 = new Potere("Amministratore"); 
    //Potere potere2 = new Potere("User"); 
    //User user1 = new User("Alessandro", "D'Angelo", "AlessandroXXV", potere1); 
    
    static List<User> listaUtenti = new ArrayList<>();

    public static void main(String[] args) {
        Potere potere1 = new Potere("Amministratore");
        Potere potere2 = new Potere("User");
        Admin admin = new Admin("Alessandro", "D'Angelo", "AlessandroXXV", "1234", potere1);
        
        User user = new User("Riccardo", "D'Angelo", "Rick", "1234", potere2);
        listaUtenti.add(user);
        accessoAlSito();
        


    }

    

    static void accessoAlSito()
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ciao utente, se hai già un account inserisci UserName e Password, \n se sei nuovo registrati ");
        System.out.println("Effettua login --> 1");
        System.out.println("Effettua registrazione --> 2");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                logIn();

                break;
            case 2:
                registrati();
                logIn();
                break;
        }
        scanner.close();
    }

    static void logIn()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOGIN");
        System.out.println("Inserisci username e password");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if(.getNome().equals(username) && password.equals("1234"))
        {
            System.out.println("Accesso ADMIN effettuato");
            operazioniAdmin();
        }
        else
        {
            for (User user : listaUtenti) {
                if(user.getUsername().equals(username) && user.getPassword().equals(password))
                {
                    System.out.println("Accesso effettuato");
                    operazioniUtente();
                }
            }
        }
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

        User user = new User(nome, cognome, username, password, potere1); 
        listaUtenti.add(user);
        System.out.println("Registrazione completata");
    }


    static void operazioniUtente()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosa vuoi fare?");
        System.out.println("Visualizza prodotti --> 1");
        System.out.println("Logout --> 62");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                Prodotto.VisualizzaProdotti();

            case 2:
                logout();
                break;
        }
        scanner.close();
    }

    static void operazioniAdmin ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosa vuoi fare?");
        System.out.println("Visualizza prodotti --> 1");
        System.out.println("Aggiungi prodotti --> 2");
        System.out.println("Rimuovi prodotti --> 3");
        System.out.println("Logout --> 62");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                Prodotto.VisualizzaProdotti();
                break;
            case 2:
                Prodotto.AggiungiProdotti();
                break;
            case 3:
                Prodotto.RimuoviProdotti();
                break;
            case 62:
                //Logout();
                break;
        }
        scanner.close();
    }

    static void logout()
    {
        System.out.println("Logout effettuato");
        accessoAlSito();
    }




}
