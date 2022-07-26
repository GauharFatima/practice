public class StringPalindrome {
    public static void main(String[] args) {
        String b= "madnam" ;
        System.out.println(isPalindrome(b));

    }
    static boolean isPalindrome( String a){
        int n= a.length();
        int count = 0;
        for(int i=0;i<n; i++){
            if(a.charAt(i) == a.charAt((n-i)-1)){
                count++;
            }
//            count++;
        }
        if(count == n) {
            return true;
        }
        return false;
    }
}
