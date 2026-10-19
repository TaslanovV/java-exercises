void main(){
    String word = IO.readln("Enter the word: ");
    String Reverse = "";

    for(int i = word.length()-1; i>=0; i-- ){
        Reverse += word.charAt(i);

    }

    if (Reverse == word){
        IO.println("This is a palindrome");
        IO.println(word + " "+ Reverse);
    } else{
        IO.println("This is not a palindrome");
        IO.println(word + " "+ Reverse);

    }


}
