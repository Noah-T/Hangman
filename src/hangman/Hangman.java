/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.IOException;

/**
 *
 * @author noahteshu
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Game game = new Game("Noah's Game");
        Prompter prompter = new Prompter(game);
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("We got a hit!");
        } else {
            System.out.println("That's a miss.");
        }
    }

}
