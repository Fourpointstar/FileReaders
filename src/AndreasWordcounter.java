import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class AndreasWordcounter {
    public static void main(String[] args) throws IOException{
        int count=0;
        String story="";
        File tedsFile=new File("fixedFile.txt");
        FileReader words=new FileReader(tedsFile);
        char[] bytes=new char[(int)tedsFile.length()-2];
        words.read(bytes);
        String together=new String(bytes);
        String[] wordArray=together.split(" ");
        /*for (String element: wordArray) {
            System.out.println(element);
        }*/


        for(String element: wordArray){
            count++;
            story+=element+" ";
        }

        System.out.println(story.toUpperCase());
        System.out.println('\n'+"Number of words in the file are: "+count+"!");
    }

}