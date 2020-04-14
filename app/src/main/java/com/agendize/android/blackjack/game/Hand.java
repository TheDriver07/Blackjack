package com.agendize.android.blackjack.game;

public class Hand {
    public static void main(String [] args){
        Card c1 = new Card(10,2);
        Card c2 = new Card(Card.ROI,Card.TREFLES);
        System.out.println(c1);
        System.out.println(c2.getColor());
        System.out.println(c2);
        private Card [] mainJ;
        private int nbCartes;
    }
}

public class MainJoueur {
    private Card[] mainJ;
    private int nbCartes;
}

public class Main {
    public static void main(String [] args){
        Card c1 = new Card(10,2);
        Card c2 = new Card(Card.ROI,Card.TREFLES);
        Card c3 = new Card(8,Card.TREFLES);
        Card c4 = new Card(6, Card.TREFLES);
        MainJoueur mj = new MainJoueur();
        mj.ajouterCard(c1);
        mj.ajouterCard(c2);
        mj.ajouterCard(c3);
        mj.ajouterCard(c4);
        System.out.println(mj);
        mj.enleverCard(2);

        System.out.println(mj);

    }
}