import java.util.Random;

void main() {
    int counter = 0;
    Random rand = new Random();
    while (counter != 30) {
        int numb = rand.nextInt(30) + 1;
        counter = counter + 1;

        if (numb % 3 == 0 && numb % 5 == 0) {
            IO.println(numb + " FizzBuzz");
        } else if (numb % 3 == 0 && numb % 5 != 0) {
            IO.println(numb + " Fizz");
        } else if (numb % 3 != 0 && numb % 5 == 0) {
            IO.println(numb + " Buzz");
        } else {
            IO.println(numb);
        }
    }
}
