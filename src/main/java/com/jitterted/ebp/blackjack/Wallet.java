package com.jitterted.ebp.blackjack;

public class Wallet {

  private int balance;

  public Wallet() {
    balance = 0;
  }

  public boolean isEmpty() {
    return balance == 0;
  }

  public void addMoney(int amount) {
    balance += amount;
  }

  public int balance() {
    return balance;
  }

  public void bet(int amount) {
    requireValidAmount(amount);
    requireSufficientBalanceOf(amount);
    balance -= amount;
  }

  private void requireValidAmount(int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
  }

  private void requireSufficientBalanceOf(int amount) {
    if (amount > balance) {
      throw new IllegalArgumentException();
    }
  }

}
