
import java.util.*;

public class GravityFlip {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int n;
    n= teclado.nextInt();
    int matriz[] = new int[n];
        for(int i =0;i<n;i++){
            matriz[i]=teclado.nextInt();
        }
        for(int i =0; i<n-1;i++){
            for(int j = 0; j<n-1;j++){
                if(matriz[j+1]<matriz[j]){ //Metodo burbuja
                    int aux = matriz[j+1];
                    matriz[j+1]=matriz[j];
                    matriz[j]=aux;
            }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(matriz[i] + " ");
        }
    }
}
