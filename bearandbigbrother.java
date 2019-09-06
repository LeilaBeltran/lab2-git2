import java.util.*;

public class Bearandbigbrother {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int l,b,a=0;
    l = teclado.nextInt();
    b = teclado.nextInt();
    do{
        a++;
        l = l*3;
        b = b*2;
    } while(l<=b);
        System.out.println(a);
    }
}
