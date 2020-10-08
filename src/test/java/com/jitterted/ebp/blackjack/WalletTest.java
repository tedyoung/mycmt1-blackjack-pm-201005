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

  @Test
  public void bet37ReducesBalanceBy37() throws Exception {
    // GIVEN a wallet with 58
    Wallet wallet = new Wallet();
    wallet.addMoney(58);

    // WHEN I bet 37
    wallet.bet(37);

    // THEN balance is 21
    assertThat(wallet.balance())
        .isEqualTo(58 - 37);
  }

  @Test
  public void bet45AndBet23ReducesBalanceBy68() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(69);

    wallet.bet(45);
    wallet.bet(23);

    assertThat(wallet.balance())
        .isEqualTo(69 - 45 - 23);
  }

  @Test
  public void walletWith72AndBet72IsEmpty() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(72);

    wallet.bet(72);

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void betMoreThanBalanceThrowsException() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(5);

    assertThatThrownBy(() -> {
      wallet.bet(6);
    })
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  public void betLessThanZeroThrowsException() throws Exception {
    Wallet wallet = new Wallet();

    assertThatThrownBy(() -> {
      wallet.bet(-1);
    })
        .isInstanceOf(IllegalArgumentException.class);
  }

}
