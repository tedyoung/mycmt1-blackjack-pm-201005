package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private final List<Card> cards = new ArrayList<>();

  // GOAL (Scaffolding) -> Get rid of this method
  public List<Card> getCards() {
    return cards;
  }

  public void add(Card card) {
    cards.add(card);
  }

  int valueOf() {
    List<Card> hand = getCards();
    int handValue = hand
        .stream()
        .mapToInt(Card::rankValue)
        .sum();

    // does the hand contain at least 1 Ace?
    boolean hasAce = hand
        .stream()
        .anyMatch(card -> card.rankValue() == 1);

    // if the total hand value <= 11, then count the Ace as 11 by adding 10
    if (hasAce && handValue < 11) {
      handValue += 10;
    }

    return handValue;
  }
}
