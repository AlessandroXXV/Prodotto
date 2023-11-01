package Prodotto;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {



    static ArrayList<User> listaUtenti = new ArrayList<>();

    public static void main(String[] args) {
        Potere potere1 = new Potere("Amministratore");
        Potere potere2 = new Potere("User");
        Admin admin = new Admin("Alessandro", "D'Angelo", "AlessandroXXV", "1234", potere1);

        User user = new User("Riccardo", "D'Angelo", "Rick", "abc1234", potere2);
        listaUtenti.add(user);
        accessoAlSito();



    }



    static void accessoAlSito()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao utente, se hai già un account inserisci UserName e Password, \n se sei nuovo registrati ");
        System.out.println("Effettua login --> 1");
        System.out.println("Effettua registrazione --> 2");
        System.out.println("Esci --> 3");
        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                logIn();

                break;
            case 2:
                registrati();
                logIn();
                break;
            case 3:
                System.out.println("Arrivederci");
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


        boolean accessoRiuscito = false;

        if (username.equals("AlessandroXXV") && password.equals("1234")) {
            System.out.println("Accesso ADMIN effettuato");
            operazioniAdmin();
            accessoRiuscito = true;
        } else {
            for (User user : listaUtenti) {
                if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                    System.out.println("Accesso effettuato");
                    operazioniUtente();
                    accessoRiuscito = true;
                    break; // Esci dal ciclo una volta trovata una corrispondenza
                }
            }
        }

        if (!accessoRiuscito) {
            System.out.println("Username o password errati, Ritornerai al menu principale");
            accessoAlSito();
        }
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
                operazioniUtente();
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
                operazioniAdmin();
                break;
            case 2:
                Prodotto.AggiungiProdotti();
                operazioniAdmin();
                break;
            case 3:
                Prodotto.RimuoviProdotti();
                operazioniAdmin();
                break;
            case 62:
                logout();
                break;
        }
        //scanner.close();
    }

    static void logout()
    {
        System.out.println("Logout effettuato");
        accessoAlSito();
    }




}
