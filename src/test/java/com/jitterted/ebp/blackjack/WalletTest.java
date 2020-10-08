package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

  @Test
  public void newWalletIsEmpty() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void addMoneyToWalletIsNotEmpty() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(10);

    assertThat(wallet.isEmpty())
        .isFalse();
  }

  @Test
  public void newWalletBalanceIsZero() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.balance())
        .isZero();
  }

  @Test
  public void addMoney15ToWalletThenBalanceIs15() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(15);

    assertThat(wallet.balance())
        .isEqualTo(15);
  }

  @Test
  public void add12AndAdd17ThenBalanceIs29() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(12);
    wallet.addMoney(17);

    assertThat(wallet.balance())
        .isEqualTo(12 + 17);
  }

}
