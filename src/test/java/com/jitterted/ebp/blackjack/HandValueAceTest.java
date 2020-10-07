package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

  private static final Suit DUMMY_SUIT = Suit.HEARTS;

  @Test
  public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
    Hand hand = createHand("A", "5");

    assertThat(hand.valueOf())
        .isEqualTo(11 + 5);
  }

  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    Hand hand = createHand("A", "8", "3");

    assertThat(hand.valueOf())
        .isEqualTo(1 + 8 + 3);
  }

  private Hand createHand(String... ranks) {
    Hand hand = new Hand();
    for (String rank : ranks) {
      hand.add(new Card(DUMMY_SUIT, rank));
    }
    return hand;
  }

}
