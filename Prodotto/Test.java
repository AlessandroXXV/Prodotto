package Prodotto;

import java.util.ArrayList;
import java.util.List;

import Prodotto.Cliente.Admin;
import Prodotto.Cliente.Potere;
import Prodotto.Cliente.User;

public class Test {
    private static Object listaUtenti;

    public static void main(String[] args) {
        Potere potere1 = new Potere("Amministratore"); 
        Potere potere2 = new Potere("User"); 
        User user1 = new User("Alessandro", "D'Angelo", "AlessandroXXV", potere1); 

        List<User> listaUtenti = new ArrayList<User>();


    }
}
