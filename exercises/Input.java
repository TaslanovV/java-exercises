

class Input{
    void main(){
        int currentYear = Integer.parseInt(IO.readln("Enter current year: "));
        int birthYear = Integer.parseInt(IO.readln("Enter your birth year: "));
        int age = currentYear - birthYear ;
        int currentMonth = Integer.parseInt(IO.readln("Enter current month (number form): "));
        int birthMonth = Integer.parseInt(IO.readln("Enter your birth month (number form): "));
        if (currentMonth < birthMonth){
            age = age-1;
        }

        if (currentMonth > 12 || birthMonth> 12){
            IO.println("lock in bro");
        }
        IO.println("You are "+age+" years old");


    }
}
