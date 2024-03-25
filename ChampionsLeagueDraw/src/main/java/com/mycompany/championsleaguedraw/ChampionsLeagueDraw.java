package com.mycompany.championsleaguedraw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ChampionsLeagueDraw {

    public static void main(String[] args) {
        final String round[] = {"4","8","16","32","64"};
        
        int choice = JOptionPane.showOptionDialog(null, "Please Choose The Option You Need", "Insertion",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, round, round[0]);
        
        int roundNumber = Integer.parseInt(round[choice]);
        String teamNames[] = new String[roundNumber];
        
        for (int i = 0; i < roundNumber; i++) {
           teamNames[i] = JOptionPane.showInputDialog(null, "Please, Enter " + (i+1) + " team:", "Team", JOptionPane.INFORMATION_MESSAGE).toLowerCase();
        }
        
        Random rand = new Random();
        ArrayList<Integer> choiceMade = new ArrayList<>(roundNumber);
        
        int i = 0;
        System.out.println("Game of round " + roundNumber + " is: ");
        while(i < roundNumber/2){
            int num1 = rand.nextInt(roundNumber);
            int num2 = rand.nextInt(roundNumber);
            
            if(num1 != num2 && !choiceMade.contains(num1) && !choiceMade.contains(num2)){
                System.out.println(teamNames[num1] + " VS " + teamNames[num2]);
                JOptionPane.showMessageDialog(null,teamNames[num1] + " VS " + teamNames[num2], "Game of round " + roundNumber, JOptionPane.INFORMATION_MESSAGE);
                choiceMade.add(num1);
                choiceMade.add(num2);
                i++;
            }
        }
    }
}
