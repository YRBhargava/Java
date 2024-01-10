import java.util.Scanner;
public class FirstProgram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a1=sc.nextInt();
        int a2=sc.nextByte();
        System.out.println(a1);
        System.out.println("First  Program!");
        System.out.println(a2);
        String s1="hi there";
        String s2="how are you?";
        System.out.println(s1+","+s2);
        int[] a={1,2,3};
        int[] b=a;
        a[1]=9;
        System.out.println(a[1]+""+b[1]);
        }
        finally{
            sc.close();
        }
        
    }
}