import java.util.*;
public class PatternSearching{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int pos = s1.indexOf(s2);
        System.out.println();
        while(pos>=0){
            System.out.println(pos+" ");
            for(int i=pos;i<(pos+s2.length());i++){
                System.out.print(s1.charAt(i));
            }
            pos = s1.indexOf(s2,pos+1);
        }
    }
}