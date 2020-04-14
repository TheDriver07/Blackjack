package com.agendize.android.blackjack.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>(52);
    }
}

public void shuffleCards() {
        Collections.shuffle(cards, new Random());
        currentCard = 0;
}

public Deck() {
        cards = new ArrayList<>(52);
        for (Card..Rank rank : Card.Rank.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        shuffleCards();
    }