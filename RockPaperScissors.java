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
        
        int compWin =0;
        int userWin = 0;
        int ties=0;
        boolean continueGame =true;
        
        Scanner scanner = new Scanner(System.in);
        
        do{
            
       
        System.out.println("enter the number of rounds");
        int r = scanner.nextInt();
        scanner.reset();
        
        if (r>=1 && r <=10){  
            
            for (int i =1 ; i<=r ; i++){
       
            /*create a random array for rock , paper an scissors*/
        String[] rps = {"r" , "p" , "s"};
        /*create a random array from 0 to 1 for r,p and s*/
        String computerMove = rps[new Random().nextInt(rps.length)];
        
        /* define the playermove for the player or the user*/
        String playerMove;
        
        while(true){
        System.out.println("please enter your move(r,p or s)");
        
        playerMove = scanner.nextLine();
        /* if the player choose r or p or s*/
        
        if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
        
            break;
        
        }
        else{
        System.out.println(playerMove + " is not a valid move.");
        }
        
        }
        /*check what the computer played or chose*/
        System.out.println("computer played: " + computerMove);
        
        /* if the player move equals to the computer chose it said that the gams was tie*/
        if (playerMove.equals(computerMove)) {
            ties++;
            System.out.println("the game was a tie" );
        }
        /*if the player chose rock and the computer chose paper then then the player lose the game*/
        else if ( playerMove.equals("r")){
                if (computerMove.equals("p")){
                    System.out.println("you lose");
                    compWin++;
                }else if ( computerMove.equals("s")){
                          System.out.println("you win");
                          userWin++;
                        }
                }
        else if ( playerMove.equals("p")){
                if (computerMove.equals("r")){
                    System.out.println("you win");
                    userWin++;
                }else if ( computerMove.equals("s")){
                        System.out.println("you lose");
                        compWin++;
                      }
        }
        else if ( playerMove.equals("s")){
                if (computerMove.equals("p")){
                    System.out.println("you win");
                    userWin++;
                }else if ( computerMove.equals("r")){
                         System.out.println("you lose");
                         compWin++;
                        }
        
               }
            }
            
            System.out.println("user won "+ userWin);
            System.out.println("computer won "+ compWin);
            System.out.println("ties "+ ties);
           
            System.out.println("wouldu like to play again (y/n");
            String answer = scanner.nextLine();
            
            if(answer.equals("n")){
            
                continueGame = false;
            }
        } 
        
        else{
                System.out.println("invalid entry .. the range should be 1 to 10");
                continueGame=false;
        }
        } while(continueGame);
        

        
    
           
       
       // }
       
       
    }
}

        