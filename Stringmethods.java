import java.util.*;
/*

methods Studied
1. initialization
2. length()
3. concatenation
4. charAt()
5. getChars()
6. toCharArray()
7. equals()
8. equalsIgnoreCase()
9. indexOf() and lastindexOf()

*/

class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
    }
    public String toString() {  //this method is Automatically called by Object
    return "Dimensions are " + width + " by " +
    depth + " by " + height + ".";
    }
}

public class Stringmethods{
    
    public static void main(String[] args) {
        //to Create an Empty String
        String s =new String(); //created String Object

        char chars[] ={'a','b','x','d','r','g','h','p'};

        String sn = new String(chars, 2 /*starting index This parameter & next are optional*/,4/*Number of charachters*/);
        //now sn is initialized to "xdrg" 

        //can be also Initialized as shown below also Called String Literal
        String sp ="hi";


        //String length note str.length() is for string and arr.length is for int,float like arrays
        System.out.println(sn.length());

        //String Concatenation and can also concate with other data type too....
        int data=10;
        String so= "Shyam";
        String all = sp +" "+ so +data+ " ,how are you ?";
        System.out.println(all);

        //to string 
        Box b =new Box(12,23,34);
        System.out.println(b);  //auto call tostring() method
        //it converts box object to string

        //charAt() charachter at Specific index
        char ch;
        ch = "abc".charAt(1); //it stores b in ch
        System.out.println(ch); 

        //getting Multiple Charachters
        //void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart);
        String str = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        str.getChars(start,end,buf,0);
        System.out.println(buf); //prints "demo"

        //Conversion to Charachter Array
       char[] psq= so.toCharArray();
        System.out.println(psq[2]); //prints y from "shyam"


        //comparision
        /*
        boolean equals(Object str)
        boolean equalsIgnoreCase(String str)
        */
            String s1 = "Hello";
            String s2 = "Hello";
            String s3 = "HEllo";
            System.out.println(s1.equals(s2));
            System.out.println(s1.equalsIgnoreCase(s3));

            //Finding Location of Charachter of Substring in String
            System.out.println(s2.indexOf('l'));
            System.out.println(s2.lastIndexOf('l'));
            //for Substring            
            System.out.println(s2.indexOf("llo"));
            System.out.println(s2.lastIndexOf("llo"));

            //Modifying a String

            String org="This game is big Very bada ".concat("yeh game Sabse bada hai bahot bada"); //the concat function
            //have Same Effect just like +

            int i =org.indexOf("bada");
            String orgcut = org.substring(0,i); //substring created from Start index 0 and End Index i
            System.out.println(orgcut);

            org=org.replace('h','5');
            System.out.println(org);
            System.out.println(org.replace("game","matter")); //replaced word 'game' with 'matter'
            



    }
}