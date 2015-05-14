/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author noahteshu
 */
public class Game {
    public static final int MAX_MISSES = 7;
    private String mAnswer;
    private String mHits;
    private String mMisses;
    
    public Game(String answer){
        mAnswer = answer;
        mHits = "";
        mMisses = "";
    }
    
    public boolean applyGuess(char letter){
        //if char is found in answer
        boolean isHit = mAnswer.indexOf(letter) >= 0;
        if(isHit){
            //add to list of hits
            mHits += letter;
        } else {
            mMisses += letter;
        }
        return isHit;
    }
    
    public String getCurrentProgress(){
        String progress = "";
        for (char letter: mAnswer.toCharArray()){
            char display = '-';
            if (mHits.indexOf(letter) >=0){
                //show the letter if they've already guessed it
                display =  letter;
            }
            progress += display;
        }
        return progress;
    }
    
    public int getRemainingTries(){
        return MAX_MISSES - mMisses.length();
    }
}
