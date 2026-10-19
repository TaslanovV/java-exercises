void main(){
    int tries = 3;
    String password = "ZKZK";
    while(true){

        String enterPassword = IO.readln("Please enter your password or change: ");
        if (enterPassword.equals(password)){
            IO.println("You have successfully logged in");
            break;

        } else if(enterPassword.equalsIgnoreCase("change")){
            password = IO.readln("Enter the new password: ");
            IO.println("You have changed your password");
        }
        else {
            IO.println("Wrong password try again, tries left: "+tries);
            tries = tries - 1;
        }

        if (tries == 0){
            IO.println("you aint him bro move on");
            break;
        }
    }


}
