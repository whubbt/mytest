import java.util.Scanner;

public class huiwen{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       // int a=in.nextInt();
        while(in.hasNextInt()){
            int ww=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();
            int w=in.nextInt();
            int ax= x-z; int b=y-w;
            double distance=Math.sqrt((double)(ax*ax+b*b));
            System.out.println((int)Math.ceil(distance/2/ww));
        }

    }
}