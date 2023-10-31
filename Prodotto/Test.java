package Prodotto;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    //Potere potere1 = new Potere("Amministratore"); 
    //Potere potere2 = new Potere("User"); 
    //User user1 = new User("Alessandro", "D'Angelo", "AlessandroXXV", potere1); 

    static List<User> listaUtenti = new ArrayList<>();

    static List<Prodotto> listaProdotti = new ArrayList<>();
    public static void main(String[] args) {
        Potere potere1 = new Potere("Amministratore");
        Potere potere2 = new Potere("User");
        Admin admin = new Admin("Alessandro", "D'ANgelo", "AlessandroXXV", "1234", potere1);
        listaProdotti.add(admin);
        //static List

        Test.accessoAlSito();
        


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
                LogIn();
                break;
            case 2:
                registrati();
                break;
        }
        scanner.close();
    }

    static void LogIn()
    {
        Scanner scanner = new Scanner(System.in);
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

    static void registrati()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci nome, cognome, username e password");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        Potere potere1 = new Potere("User");

        if(listaUtenti.contains(username))
        {
            System.out.println("Username già esistente");
            return;
        } else
        {
            System.out.println("Nuovo utente aggiunto!!!");
            User user = new User(nome, cognome, username, password, potere1);
            listaUtenti.add(user);
        }

    }


}
