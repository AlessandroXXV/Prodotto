package Prodotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prodotto {
    String nome;
    double prezzo;
    int disponibilita;

    public Prodotto(String nome, double prezzo, int disponibilita)
    {
        this.nome = nome;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }
    static  List<Prodotto> listaProdotti = new ArrayList<>();

    public static void VisualizzaProdotti ()
    {
        System.out.println("Prodotti disponibili: ");
        for (Prodotto prodotto : listaProdotti)
        {
            System.out.println(prodotto.nome + " " + prodotto.prezzo + " " + prodotto.disponibilita);
        }
    }

    public static void AggiungiProdotti()
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Inserisci il nome del prodotto: ");
            String nome = scanner.nextLine();

            // Controlli Nome prodotto
            if (nome == null || nome.length() < 3) {
                System.out.println("Il nome deve essere più lungo di 3 caratteri. Riprova.");
                continue; // Richiede all'utente di reinserire il nome
            }

            if (listaProdotti.contains(nome)) {
                System.out.println("Il prodotto è già presente. Riprova.");
                continue; // Richiede all'utente di reinserire il nome
            }


            // Controlli Prezzo prodotto
            System.out.print("Inserisci il prezzo del prodotto: ");
            double prezzo = 0;

            try {
                prezzo = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Il prezzo deve essere un numero valido. Riprova.");
                continue; // Richiede all'utente di reinserire il prezzo
            }

            if (prezzo <= 0) {
                System.out.println("Il prezzo non può essere negativo. Riprova.");
                continue; // Richiede all'utente di reinserire il prezzo
            }

            System.out.print("Inserisci la disponibilità del prodotto: ");
            int disponibilita = 0;

            try {
                disponibilita = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("La disponibilità deve essere un numero intero valido. Riprova.");
                continue; // Richiede all'utente di reinserire la disponibilità
            }

            if (disponibilita < 0) {
                System.out.println("La disponibilità non può essere negativa. Riprova.");
                continue; // Richiede all'utente di reinserire la disponibilità
            }

            Prodotto prodotto = new Prodotto(nome, prezzo, disponibilita);
            listaProdotti.add(prodotto);
            System.out.println("Prodotto aggiunto.");

            System.out.print("Vuoi inserire un altro prodotto? (S/N): ");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("N")) {
                break; // Termina il ciclo se l'utente non desidera inserire ulteriori prodotti
            }
        }


    }
    static void RimuoviProdotti()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto da rimuovere: ");
        String nome = scanner.nextLine().toLowerCase();

        for (Prodotto prodotto : listaProdotti)
        {
            if (prodotto.nome.equalsIgnoreCase(nome))
            {
                listaProdotti.remove(prodotto);
                System.out.println("Prodotto rimosso");
                return;
            }
        }
        System.out.println("Prodotto non trovato");

    }


}
