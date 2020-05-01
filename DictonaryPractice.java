package dictonarypractice;
import java.util.*;

public class DictonaryPractice {

    
    public static void main(String[] args) {
        // English to Spanish Dictonary
        //Here We Are using Mapping Concept we are going to map English words to Spanish
        map<String,String> engspanDict = new HashMap<String,String>();
        engspanDict.put("hello","Hola");
        engspanDict.put("yes","si");
        engspanDict.put("National","Nacional");
        System.out.println(engspanDict.get("hello"));
    }
    
}