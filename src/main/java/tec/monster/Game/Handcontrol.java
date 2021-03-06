package tec.monster.Game;

import tec.monster.DeckStructure.Deck;
import tec.monster.HandStructure.Hand;

import java.io.IOException;
/**
 * Clase encargada de la suministración de las cartas mínimas que puede tener el jugador en su mano para iniciar el juego
 * @author Bryan
 *
 */
public class Handcontrol {
    Hand mano;
    Deck deckn;

    /**
     * Inserta las primeras cuatro cartas de la pila Deck a la lista circular Hand
     * @param deck obtiene el deck de el jugador
     * @return
     */
    public Hand GenerateHand(Deck deck,int cont){
        int contador = cont;
        mano = new Hand();
        try {
            while (contador!=0){
                Cards carta = deck.Top();
                mano.Insert(carta);
                deck.Remove(carta.getID());
                contador--;
            }
            mano.Show();
            System.out.println("------------------");
            this.deckn = deck;

        }catch (Exception a){
            System.out.println("No se pudo cargar la mano, el deck no tiene cartas");
        }
        return mano;
    }

    public Deck getDeck() {
        return deckn;
    }
}
