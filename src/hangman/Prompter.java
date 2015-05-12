/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author noahteshu
 */
public class Prompter {
    private Game mGame;
    
    public Prompter (Game game){
        mGame = game;
    }
    
    public boolean promptForGuess() throws IOException{
        BufferedReader theReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a letter:  ");
        String answer = theReader.readLine();
     
        char guess = answer.charAt(0);
        return mGame.applyGuess(guess);

    }
    
}
