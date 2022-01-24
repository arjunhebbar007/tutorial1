import java.util.Scanner;

public class Username {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username: ");
        System.out.println("Enter Password: ");

        String username = sc.next();
        String password = sc.next();

        if(username.equals("Arjun")&&password.equals("12345"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid username and pass");


    }
}
