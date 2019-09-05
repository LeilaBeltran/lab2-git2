import java.util.Scanner;
 
public class Vanyaandfence{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n,h,aux, suma=0;
        n = teclado.nextInt();
        h = teclado.nextInt();
        for(int i = 0; i < n;i++){
            aux = teclado.nextInt();
            if(aux > h){
                suma+=2;
            } else{
                suma++;
            }
        }
        System.out.println(suma);
    }
 
}
