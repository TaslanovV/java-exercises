void main(){
    int num1 = Integer.parseInt(IO.readln("Input first number: "));
    int num2 = Integer.parseInt(IO.readln("Input second number: "));
    int num3 = Integer.parseInt(IO.readln("Input third number: "));

    if (num1 < num2 && num2<num3){
        IO.println("Your numbers are in order");


    } else{
        IO.println("Your numbers are not in order");
    }

}
