import java.util.Scanner;

/**
 * Created by apple on 15/9/19.
 */
public class fic {
    static boolean ishuiwen(String str){
        if(str==null||str.length()==1)
            return true;
        if(str.length()>10)
            return false;
        String test=str+str.charAt(0);
        int i=0,j=test.length()-1;
        while(i<j){
            if(test.charAt(i)==test.charAt(j)){
                i++;j--;
            }
            else
                return false;
        }
        return true;
    }
   static boolean istrue(String str){
       int flag;
        for(int i=0;i<str.length();i++)
        {
            flag=0;
            String test =str.substring(0,i)+str.substring(i+1,str.length());
            int m=0,n=test.length()-1;
            while(m<n){
                if(test.charAt(m)==test.charAt(n)){
                    m++;n--;
                }
                else {
                    flag++;
                    break;
                }
            }
            if(flag!=0)
                continue;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner   in =new Scanner(System.in);
        while(in.hasNext()){
            if(istrue(in.nextLine()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
