package w1d2;

public class WordReader {
    public static void main(String[] args){
        //as you might guess, an object can contain a lot of information.. and this information rewquires the computer to reserve some amount of space in the memory
        //the 'new' keyword is special.. it is telling java to reserver a new amount of space for our object
        //likewise, we call the constructor, because usually objects require some amount of setup
        //(eg, files require a file name, filereader required a file object, etc)

        //our goal for now.. will be to create an object that can store a sequence of characters(like a word/string)
        //that object will be able to conduct useful operations on that sequence.. largely these are operations that the string class in java lready does

        //the class is what I'm actually writing.. it is the blueprints for the behavior of some objects
        //the object is an instantiation of a class - a word object is a single word class or a word type.
        // a word class set of instructions for the states and behavior of that object.


        //what do people struggle with here?
        //whether your knowledge comes from school or tutorials, you're typically engaged in functional programming
        //(every operation is done by individual functions),
        //but enterprise level applications more often revolve around objects - both on the front end and the back end
        // this is because we have increased reusability of code and increased ability to debut and test code
        //this is because objects have their own independent life even if they solve the same problem

        //if you're seeing that the IDE is asking you to make all of your code (methods, variables) static
        //you're probably doing something wrong-
        //static means that that method or variable is attached to the existence of a class in memory rather than an object-
        //which is to say that there is only a single static copy of a method or variable across the application


        Word tedsWord= new Word();
        //Word.doSomething();
        //tedsWord.doSomething();
        Word.print();
        tedsWord.print();

        char[] word1=new char[]{'b','a','t','m','a','n'};
        char[] word2=new char[]{'c','a','t'};
        Word dogWord=new Word(word1);
        Word catWord=new Word(word2);

        System.out.println(dogWord.toString());
        System.out.println("Dogword contains c: " +dogWord.contains('c'));
        System.out.println("catword contains c: " +catWord.contains('c'));

        System.out.println("Index of c in dogword ;" + dogWord.indexOf('c'));
        System.out.println("Index of c in catword ;" + catWord.indexOf('c'));
        catWord.replaceall('c','b');
        System.out.println(word2);


        char[] word3=new char[]{'m', 'a','n'};
        Word manWord= new Word(word3);
        catWord.append(manWord);
        System.out.println(catWord);
//--------------------------------------------------------------------------------------------
        System.out.println("catword and dogword are the same: "+catWord.compared(manWord));
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }
}
