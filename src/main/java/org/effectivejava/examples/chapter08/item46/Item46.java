package org.effectivejava.examples.chapter08.item46;

import javax.xml.bind.Element;
import java.util.*;

public class Item46 {

    //before jdk 1.5

    public void forEach(Collection<Element> c, Element[] a) {
        //no longer the preferred idiom to iterate over a collection!
        for (Iterator i = c.iterator(); i.hasNext(); ) {
            //do something
        }
        //no longer the preferred idiom to iterate over an array!
        for (int i = 0; i < a.length; i++) {
            //doSomething(a[i]);
        }

        //the preferred idiom for iterating over collections and arrays.
        for (Element e : c) {
            //do something
        }
        for (Element e : a) {
            //do something
        }

    }

    enum Suit {
        CLIB, DIAMOND, HEART, SPADE
    }

    enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    class Card {
        public Card(Suit suit, Rank rank) {
            //init
        }
    }

    //can you spot the BUG?
    public void iterate() {
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> cards = new ArrayList<Card>();

        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                cards.add(new Card(i.next(), j.next()));//Here NoSuchElementException. i will iterate each time j get next
            }
        }


        //fixed bug ugly - you can do better!
        for (Iterator<Suit> i = suits.iterator(); i.hasNext();) {
            Suit suit = i.next();
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();) {
                cards.add(new Card(suit, j.next()));
            }
        }

        //preferred idiom for nested iteration on collections and arrays.
        for (Suit suit: suits)
            for (Rank rank: ranks)
                cards.add(new Card(suit, rank));
    }



    //some bug, different symptom!
    enum Face{ONE, TWO, THREE, FOUR,FIVE, SIX}
    Collection<Face> faces = Arrays.asList(Face.values());

    public void iterate2() {
        for(Iterator<Face> i = faces.iterator(); i.hasNext();) {
            for (Iterator<Face> j = faces.iterator(); j.hasNext();) {
                System.out.println(i.next() + " " + j.next());
            }
        }
    }


}
