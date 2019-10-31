import java.util.*;
class Area{
          Scanner sc=new Scanner(System.in);
           double length,breadth,area;
        Area(){
                 System.out.println("Enter length:");
                  length=sc.nextInt();
                 System.out.println("Enter breadth:");
                  breadth=sc.nextInt();
}
      double returnArea(){
                  area=length*breadth;
                   return area;
}
   public static void main(String args[]){
                                Area e=new Area();
                                System.out.println("area="+e.returnArea());
}
}