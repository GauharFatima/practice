package assignmentskk;

public class StringReverse {
    public static void main(String[] args) {
        String str = "nature";
        System.out.println("isReverse - " + isReverse(str));
        String sen = "My name is Khan";
        System.out.println("reverseString - " + reverseString(sen));
        String sb = "today is holiday";
        System.out.println("reverseOf - "+ reverseOf(sb));


    }

    //         Reverse A String In Java (one word)
    static String isReverse(String s) {
        String rev = "";
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    //     Reverse A String In Java (more than one word)
    static String reverseString(String s) {

        String [] wordArray = s.split(" ");   // store individual words in s in the array of string
        String reverse="";  //contain the final reverse ans

        for(String w:wordArray){    // individual words form the word array is use
            String wordRev="";    //contains the reverse of individual words
            int n=w.length();

            for(int j =n-1; j>=0; j--){    //iterating througth the individual word
                wordRev+=w.charAt(j);   //reverse of the words are added to the wordrev
            }
            reverse+=wordRev+" ";  //reverse of individual word is add to form the reverse of the s
        }
        return reverse;  //return
    }

//    Reverse A String In Java (more than one word) using stringbuilder
    static String reverseOf(String a){
        String [] words = a.split(" ");
        String reverseAns="";

        for(String w:words){

            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseAns = reverseAns+sb.toString()+" ";
        }
        return reverseAns;
    }
}
