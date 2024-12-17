package org.example.eiscuno.model.StatePatron;

import org.example.eiscuno.controller.GameUnoController;
import org.example.eiscuno.model.card.Card;

public class GameOverState implements GameState {
    private GameUnoController controller;

    public GameOverState(GameUnoController controller) {
        this.controller = controller;
    }

    @Override
    public void playCard(Card card) {
        // No se puede jugar más cartas, el juego ha terminado
        throw new IllegalStateException("El juego ha terminado.");
    }

    @Override
    public void drawCard() {
        // No se puede robar cartas, el juego ha terminado
        throw new IllegalStateException("El juego ha terminado.");
    }

    @Override
    public void pressUnoButton() {
        // No se puede presionar el botón UNO, el juego ha terminado
        throw new IllegalStateException("El juego ha terminado.");
    }
}