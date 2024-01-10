public class FirstProgram{
    public static void main(String[] args) {
        System.out.println("First  Program!");
        String s1="hi there";
        String s2="how are you?";
        System.out.println(s1+","+s2);
        int[] a={1,2,3};
        int[] b=a;
        a[1]=9;
        System.out.println(a[1]+""+b[1]);
    }
}