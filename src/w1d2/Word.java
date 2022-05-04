package w1d2;

public class Word {
    //this is a constructor..

    private char[] charArray;
    private int length;
    public Word(){
        charArray= new char[]{'c', 'h','a','r'};
        length=charArray.length;

    }

    //getters and setters are convention to allow other objects to be able to access private variables
    public int getLength(){
        return length;
    }


    public Word(char[] newCharArray){
        this.charArray=newCharArray;
        length=charArray.length;
    }


    //we can have multiple constructors.. typically we'd call this method overloading

    public Word(char[] charArray, int length) {
        char[] copiedValues = new char[length];
        for (int i = 0; i < length; i++) {
            copiedValues[i] = charArray[i];
        }
        this.charArray = copiedValues;
        this.length = length;
    }
    public void setCharArray(char[] charArray){
        this.charArray=charArray;
        length=charArray.length;
    }


    //this is a method.. a reusable block of code that belongs to an object
    public static void print(){
        System.out.println("Hello, this is a word object");
    }

    //a method that converts our char array to a string..
    public String toString(){
        String stringRepresentation="";
        for (int i=0; i< charArray.length; i++){
            stringRepresentation=stringRepresentation+charArray[i];
        }
        return stringRepresentation;
    }
    //return true if the char array contains a certain character
    public boolean contains(char c){
        for (char element:charArray){
            if (element==c){
                return true;
            }else{
                return false;
            }

        }
        return false;
    }

    //returns the character at a specific position in the char array
    public char charAt(int n){
        return charArray[n];
    }

    public int indexOf(char c){
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] == c) {
                return i;
            } else {
                System.out.println("not in array");
            }
        }
        return -1;
    }

    //a method that replaces all instances of a certain character with another character
    public void replaceall(char tobeReplaced, char replacer){
        for (int i=0; i<charArray.length; i++){
            if (charArray[i]==tobeReplaced){
                charArray[i]=replacer;
            }
        }
    }


    public void append(Word toBeCombined){
        //multiple steps because arrays are of a fixed size, we are going to need to create a new array that is the size of both words combined
        //then we should add all the elements of this word followed by all the elements of the next word
        char[] combined=new char[length+toBeCombined.getLength()];
        for (int i=0; i<length; i++){
            combined[i]=charArray[i];
        }
        for (int i=length; i<combined.length; i++){
            combined[i]=toBeCombined.charAt(i-length);
        }
        setCharArray(combined);

    }



    //--------------------------------------------------------------------------------------------
    public boolean compared(Word toBeCompared){
        String current=new String("");
        String current2=toBeCompared.toString();
        for (char element: charArray){
            current+=element;
        }
        if (!(current.compareTo(current2)==0)){
            return false;
        }
        return true;
    }




    public int instances(char comparedcharacter){
        int count=0;
        for(int i=0; i<charArray.length; i++){
            if (this.charArray[i]==comparedcharacter){
                count=count+1;
            }
        }
        return count;

    }
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^



}
