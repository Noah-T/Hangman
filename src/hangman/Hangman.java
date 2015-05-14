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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //fever of 102 today. Not such a great day for coding. But the streak lives on...
        Game game = new Game("Noah's Game");
        Prompter prompter = new Prompter(game);
        prompter.play();
       
        
    }

}
