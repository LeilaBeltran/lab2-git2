 import java.util.Scanner;

public class Petyaandstrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        String s1=input.next();
        if(s.length()>=1 && s.length()<=100 && s1.length()>=1 && s1.length()<=100){
         int count=s.compareToIgnoreCase(s1);

          if(count==0){
            System.out.println("0");
           }
           else if(count>0){
            System.out.println("1");
            }
          else if(count<0){
          System.out.println("-1");
    }
   }
}  

}
