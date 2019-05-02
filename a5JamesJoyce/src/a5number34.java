import java.util.Scanner;

public class a5number34 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        
        int youLose = 0;
        int youWin = 0;
        
        int compWeapon, playerWeapon;
        
        do {
            System.out.println("Choose rock, paper, or scissors. \n 0 is Scissors, \n 1 is Rock, \n 2 is Paper");
            playerWeapon = input.nextInt();
            compWeapon = (int)(Math.random()* 3);
        
            // O = Scissors
            // 1 = Rock
            // 2 = Paper
            
            switch(playerWeapon){
                case 0:
                    if(compWeapon == 0) {//tie
                        System.out.println("The computer chose scissors. You chose scissors. It is a draw.\n");
                        break;
                    }
                    if(compWeapon == 1) {//you lose
                        youLose ++;
                        System.out.println("The computer chose rock. You chose scissors. You lost.\n");
                        break;
                    }
                    if(compWeapon == 2) {//you win
                        youWin ++;
                        System.out.println("The computer chose paper. You chose scissors. You win.\n");
                        break;
                    }
                case 1:
                    if(compWeapon == 0) {//you win
                        youWin ++;
                        System.out.println("The computer chose scissors. You chose a rock. You win.\n");
                        break;
                    }
                    if(compWeapon == 1) {//tie
                        System.out.println("The computer chose rock. You chose a rock. It is a draw.\n");
                        break;
                    }
                    if(compWeapon == 2) {//you lose
                        System.out.println("The computer chose paper. You chose a rock. You lost.\n");
                        youLose ++;
                        break;
                    }
                case 2:
                    if(compWeapon == 0) {//you lose
                        youLose ++;
                        System.out.println("The computer chose scissors. You chose paper. You lose.\n");
                        break;
                    }
                    if(compWeapon == 1) {//you win
                        youWin ++;
                        System.out.println("The computer chose rock. You chose paper. You win.\n");
                        break;
                    }
                    if(compWeapon == 2) {//tie
                        System.out.println("The computer chose paper. You chose paper. It is a draw.\n");
                        break;
                    }
                    
            }
        } while (youWin <= 2 && youLose <= 2);
        
        if (youWin == 3)
            System.out.println("You Win!");
        else if (youLose == 3)
            System.out.println("You Lose!");

    }
}
