import java.util.Random;

void main(){
    int guesses = 0;
    Random rand = new Random();
    int numb = rand.nextInt(15) +1;


    while(true){
    int guess = Integer.parseInt(IO.readln("Enter your guess (1-15): "));
    guesses = guesses+1;


    if(guess == numb){
        IO.println("Nice one ");
        break;


    }

    if (guess < numb){
        IO.println("Ag eledin, higher");

    }

    if (guess>numb){
        IO.println("lower");

    }

    }
}
