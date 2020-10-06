package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SuitTest {

  @Test
  public void heartsAreRed() throws Exception {
    Suit suit = Suit.HEARTS;

    assertThat(suit.isRed())
        .isTrue();
  }
}