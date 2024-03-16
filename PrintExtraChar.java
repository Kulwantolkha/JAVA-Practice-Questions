import java.util.*;

public class PrintExtraChar {
//Method 1
    public static void main(String[] args) {
        String str1 = new String("abcd");
        String str2 = new String("daeca");
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                System.out.print(arr2[i]);
            }
        }
        int n = arr2.length;
        if(n>str1.length())
            System.out.println(arr2[n-1]);
        
    }

// //Method 2
    public static void main(String[] args) {
        String str3 = "kuwlant";
        String str4 = "tanlwuko";
        int[] count = new int[26];
        for(int i=0;i<str3.length();i++){
            count[str3.charAt(i)-'a']--;
            count[str4.charAt(i)-'a']++;
        }
        int n = str4.length()-1;
        count[str4.charAt(n)-'a']++;
        for(int i=0;i<26;i++){
            if(count[i]==1)
                System.out.println((char)(i+'a'));
        }

     }


//Method 3
        public static void main(String[] args) {
            String str5 = "olkha";
            String str6 = "ahkols";
            int res = 0;
            for(int i=0;i<str5.length();i++){
                res = res ^ str5.charAt(i) ^ str6.charAt(i); 
            }
            res = res ^ str6.charAt(str6.length()-1);
            System.out.println((char)(res));
        }
}
