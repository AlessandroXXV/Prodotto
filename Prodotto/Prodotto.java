package Prodotto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prodotto {
    String nome;
    int prezzo;
    int disponibilita;

    public Prodotto(String nome, int prezzo, int disponibilita)
    {
        this.nome = nome;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }
    static  List<Prodotto> listaProdotti = new ArrayList<>();

    public static void VisualizzaProdotti ()
    {
        System.out.println("Prodotti disponibili: ");
        System.out.println(listaProdotti);
    }

    public static void AggiungiProdotti()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto: ");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il prezzo del prodotto: ");
        int prezzo = scanner.nextInt();
        System.out.println("Inserisci la disponibilità del prodotto: ");
        int disponibilita = scanner.nextInt();

        if(disponibilita < 0)
        {
            System.out.println("La disponibilità non può essere negativa");
            return;
        }

        if (prezzo < 0)
        {
            System.out.println("Il prezzo non può essere negativo");
            return;
        }
        if (nome == null)
        {
            System.out.println("Il nome non può essere nullo");
            return;
        }
        if (nome.length() < 3)
        {
            System.out.println("Il nome deve essere più lungo di 3 caratteri");
            return;
        }

        if(listaProdotti.contains(nome))
        {
            System.out.println("Il prodotto è già presente");
            return;
        }
        Prodotto prodotto = new Prodotto(nome, prezzo, disponibilita);
        listaProdotti.add(prodotto);
        System.out.println("Prodotto aggiunto");
    }
    static void RimuoviProdotti()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto da rimuovere: ");
        String nome = scanner.nextLine();

        if(listaProdotti.contains(nome))
        {
            listaProdotti.remove(nome);
            System.out.println("Prodotto rimosso");
        }
        else
        {
            System.out.println("Prodotto non presente");
        }
    }


}
