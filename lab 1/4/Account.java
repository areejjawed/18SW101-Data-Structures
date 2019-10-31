import java.util.*;
    class Account{
             Scanner sc=new Scanner(System.in);
             double balance(){
                   System.out.print("Enter amount you want to deposit:");
                    double deposit=sc.nextInt();
                    System.out.print("Enter amount you want to withdraw:");
                    double withdraw=sc.nextInt();
                   return(deposit-withdraw);
}
}