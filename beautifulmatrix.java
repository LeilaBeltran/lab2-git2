import java.util.Scanner;

public class Beatifulmatrix {

    public static void main(String[] args) {
       
   
        Scanner teclado = new Scanner(System.in);
        int c, posi=0;
        int matriz[][] = new int[5][5];
        for(int i = 0;i<5;i++){
            for(int j = 0; j < 5; j++){
                c = teclado.nextInt();
                matriz[i][j]=c;
                if(matriz[i][j]==1){
                    posi = Math.abs(i -2) + Math.abs(j - 2);
                }
            }
        }
        System.out.println(posi);
    }
}
    
