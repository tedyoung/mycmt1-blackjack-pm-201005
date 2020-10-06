package com.jitterted.ebp.blackjack;

public enum Suit {
  HEARTS("♥", true),
  CLUBS("♣", false),
  DIAMONDS( "♦", true),
  SPADES("♠", false);

//  enum SuitColor {
//    BLUE,
//    BLACK,
//    RED,
//    GREEN
//  }

  private final String symbol;
  private final boolean isRed;

  Suit(String symbol, boolean isRed) {
    this.symbol = symbol;
    this.isRed = isRed;
  }

  public String symbol() {
    return symbol;
  }

  public boolean isRed() {
    return isRed;
  }
}
