package Cliente;

import java.util.Scanner;

public class Accesso 
{
    


    static void AccessoAlSito()
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ciao utente, se hai già un account inserisci UserName e Password, \n se sei nuovo registrati ");
        int logIn = 1; 
        int registrati = 2; 
        System.out.println("Effettua login --> 1");
        System.out.println("Effettua registrazione --> 2");
        int scelta = scanner.nextInt(); 


        switch (scelta) {
            case 1:
                
                break;
            case 2:
                
                break;
        
        }


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
                break; 
            }
            else
            {
                System.out.println("Username o password errati");
                break; 
            }
        }


    }
}
