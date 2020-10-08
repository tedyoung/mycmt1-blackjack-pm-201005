package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GameBettingTest {

  @Test
  public void newGamePlayerBalanceIsZero() throws Exception {
    Game game = new Game();

    assertThat(game.playerBalance())
        .isZero();
  }

  @Test
  public void playerDeposits75BalanceIs75() throws Exception {
    Game game = new Game();
    game.deposit(75);

    assertThat(game.playerBalance())
        .isEqualTo(75);
  }

  @Test
  public void playerWith80BalanceBets30BalanceIs50() throws Exception {
    Game game = new Game();
    game.deposit(80);

    game.playerBets(30);

    assertThat(game.playerBalance())
        .isEqualTo(80 - 30);
  }

  @Test
  public void playerWith100BalanceBet50WhenWinsBalanceIs150() throws Exception {
    Game game = new Game();
    game.deposit(100);
    game.playerBets(50);

    game.playerWins();

    assertThat(game.playerBalance())
        .isEqualTo(100 - 50 + (2 * 50));
  }

}