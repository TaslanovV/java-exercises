void main(){
    int Counter = 0;
    String word = IO.readln("Enter the word: ");

    for (int i = 0; i < word.length(); i++){
        char vowel = word.charAt(i);
        if(vowel == 'a' ||vowel == 'e'||vowel == 'i'||vowel == 'o'||vowel == 'u' ){
            Counter = Counter+1;
        }


    }
    IO.println("your message has "+Counter+" vowels");
}
