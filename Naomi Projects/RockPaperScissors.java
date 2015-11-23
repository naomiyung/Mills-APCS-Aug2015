import java.util.*;
public class RockPaperScissors
{
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        //used to stop when I need it to
        int sentinal=0;
        //I decided to make it simpler by just having it be numbers
        System.out.println("Choose your move by typing 0 for rock,1 for paper, 2 or scissors:");
        //will basically always run until 3 is input
        while(sentinal==0){
            int theirMove=console.nextInt();
            //used to change it to stop
            if(theirMove==3){
                sentinal=1;
            }
            int compMove=computeMove();
            whoWins(theirMove, compMove);
        }
    }

    public static int computeMove(){
        Random r=new Random();
        int computedMove=r.nextInt(3);
        return computedMove;
    }

    public static void whoWins(int theirMove, int comMove){
        String loser="You lose.";
        String winner="You win.";
        //basically all possible situations are accounted for
        if(theirMove==comMove){
            System.out.println("Your opponent chose the same move. It is a tie.");
            playAgain();
        }
        else if(theirMove==0 && comMove==2){
            System.out.println("Your opponent chose scissors. "+winner);
            playAgain();
        }
        else if(theirMove==2 && comMove==0){
            System.out.println("Your opponent chose rock. "+loser);
            playAgain();
        }
        else if(theirMove==0 && comMove==1){
            System.out.println("Your opponent chose paper. "+loser);
            playAgain();
        }
        else if(theirMove==1 && comMove==0){
            System.out.println("Your opponent chose rock. "+winner);
            playAgain();
        }
        else if(theirMove==1 && comMove==2){
            System.out.println("Your opponent chose scissors. "+loser);
            playAgain();
        }
        else if(theirMove==2 && comMove==1){
            System.out.println("Your opponent chose paper. "+winner);
            playAgain();
        }
    }
    public static void playAgain(){
        System.out.println("To play again input another number.");
        System.out.println("If you want to quit input 3");
    }
}
