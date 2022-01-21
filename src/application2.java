public class application2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println("before swapping: "+a);
        System.out.println("before swapping: "+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swapping: "+a);
        System.out.println("after swapping: "+b);
    }
}
