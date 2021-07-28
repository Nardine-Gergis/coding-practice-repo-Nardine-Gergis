 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class RockPaperScissors {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            /* create string array for rock papers an scissors */
        String[] rps = {"r" , "p" , "s"};
        /**we create string computer move and 
         * we want get a random computer move between an array from 0 to 1 for r , p ,s and 
         * we pass 3 which is the length of the array*/
        String computerMove = rps[new Random().nextInt(rps.length)];
        
        
        String playerMove;
        
        while(true){
       
        System.out.println("please enter your move(r,p or s)");
        playerMove = scanner.nextLine();
        
        if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
        
            break;
        
        }
        System.out.println(playerMove + " is not a valid move.");
        
        }
        
        System.out.println("computer played: " + computerMove);
        
        if (playerMove.equals(computerMove)) {
            
            System.out.println("the game was a tie");
        }
        else if ( playerMove.equals("r")){
            if (playerMove.equals("p")){
                System.out.println("you lose");
            }else if ( computerMove.equals("s")){
                System.out.println("you win");
        }
            else if ( playerMove.equals("p")){
            if (playerMove.equals("r")){
                System.out.println("you win");
            }else if ( computerMove.equals("s")){
                System.out.println("you lose");
        }
            else if ( playerMove.equals("s")){
            if (playerMove.equals("p")){
                System.out.println("you win");
            }else if ( computerMove.equals("r")){
                System.out.println("you lose");
        }
        
    }
            System.out.println("play again? (yes/no)");
            String playAgain = scanner.nextLine();
            
            if(!playAgain.equals("yes")){
                break;
            }
}
        }
    }
}
}