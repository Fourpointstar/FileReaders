package w1d2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordDriver {
    public static void main(String[] args){
        try{
            File story= new File("fixedFile.txt");
            FileReader storyReader=new FileReader(story);
            Word[] wordArray=new Word[1000];
            //we don't know what a word is while we're still reading it
            //we will need to use a buffer of characters that we will send to the word when we encounter a space or a new line

            char[] charBuffer= new char[1000];
            //because we are using a big buffer, we need to keep track of how much of that buffer space should be in a word
            int bufferWordSize=0;
            int numberOfWords=0;
            boolean readingFile=true;
//--------------------------------------------------------------------------------------------
            char[] charstory=new char[1000];
            int bufferCharacterCount=0;
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            while (readingFile){
                int readByteFromFile=storyReader.read();
                char charFromByte=(char) readByteFromFile;
                if (readByteFromFile == -1) {

                    readingFile=false;
                }
                if (charFromByte==' '||charFromByte=='\n'){
                    //we have a new word array

                    wordArray[numberOfWords]=new Word(charBuffer, bufferWordSize);


                    numberOfWords++;
                    bufferWordSize=0;
                }else{
                    charBuffer[bufferWordSize]=charFromByte;
                    bufferWordSize++;
                }
//--------------------------------------------------------------------------------------------
                charstory[bufferCharacterCount]=charFromByte;
                bufferCharacterCount+=1;
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            }
            for (int i=0; i<numberOfWords; i++){
                if(!(wordArray[i].contains('e'))){
                    System.out.println(wordArray[i]);
                }

            }




//--------------------------------------------------------------------------------------------
            Word stories=new Word(charstory);
            System.out.println(charstory);
            char pick='u';

            System.out.println("The letter "+pick+" is in the text "+stories.numOfOccurances(pick)+" times!");
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
