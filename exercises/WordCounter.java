void main(){
    String askSentence = IO.readln("Write a sentence: ");
    String[] words = askSentence.split(" ");
    int wordCount = words.length;

    IO.println("You have "+wordCount+" words in your sentence");

}
