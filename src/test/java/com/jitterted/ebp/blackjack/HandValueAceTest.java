package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

  private static final Suit DUMMY_SUIT = Suit.HEARTS;

  @Test
  public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
    Hand hand = createHand("A", "5");

    assertThat(hand.valueEquals(11 + 5))
        .isTrue();
  }

  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    Hand hand = createHand("A", "8", "3");

    assertThat(hand.valueEquals(1 + 8 + 3))
        .isTrue();
  }

  private Hand createHand(String... ranks) {
    Hand hand = new Hand();
    for (String rank : ranks) {
      hand.add(new Card(DUMMY_SUIT, rank));
    }
    return hand;
  }

}
