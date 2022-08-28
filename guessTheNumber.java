import java.util.Random;
import java.util.Scanner;

class game{
    Random rand = new Random();  //CREATING THE OBJECT FOR RANDOM NUMBER
    int n = rand.nextInt(50);  //STORING THE RANDOM VALUE IN N WHICH IS NOT MORE THAN GIVEN INTEGER
    int guess;
    int times;

    public void setGuess(int num)    //SETS THE VALUE OF USER TO THE GUESS
    {
        this.times+=1;   //IT COUNTS THE TOTAL GUESS MADE BY THE USER
        this.guess = num;
    }
    public int getGuess()    //GETS THE VALUE OF THE GUESS
    {
        return this.guess;
    }
    public int getNum(){     //GETS THE VALUE PICKED BY THE COMPUTER
        return (this.n);
    }
    public void isCorrect()    //METHOD TO CHECK WHETHER THE VALUE PICKED BY USER MATCHES WITH COMPUTER OR NOT
    {
        if (this.guess == this.n)
        {
            System.out.println("Wow!!! You got it dude:)");
            if (this.times <= 5)
            {
                System.out.println("You got it in: " + this.times + " guess, you are blazing fast");
            }
            else {
                System.out.println("You got it in :" + this.times);
            }
        }else if (this.guess > this.n) {
            System.out.println("You guessed the higher number, Try Again Dude!!!");
        }
        else
        {
            System.out.println("You have guessed the lower number, Try Again!!!");
        }
    }
}

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        game numberGuessing = new game();     //MAKING OBJECT OF OUR CUSTOM CLASS
        System.out.println("Enter your guess not greater than 50: ");
        numberGuessing.setGuess(scan.nextInt());    //SETTING THE INPUT OF THE USER TO OUR CUSTOM CLASS VARIABLE GUESS
        while (true) {
            if (numberGuessing.getGuess() != numberGuessing.getNum()) {
                numberGuessing.isCorrect();
                numberGuessing.setGuess(scan.nextInt());
            } else {
                numberGuessing.isCorrect();
                break;
            }
        }
    }
}
