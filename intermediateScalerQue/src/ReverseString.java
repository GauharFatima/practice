package com.learning;

public class ReverseString {

    public static void main(String[] args) {
        String str ="my name is khan"; //ym eman si nahk
        StringBuffer s = new StringBuffer(str);
        str = s.reverse().toString();
        String [] rev = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for(int i = rev.length - 1; i >= 0; i--) {
            reverse.append(rev[i]).append(" "); // .append is use to add the value in the reverse
        }
        System.out.println(reverse.toString());
    }

}
