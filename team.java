import java.util.Scanner;
 
public class team{
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),c=0,c1=0;
                int [][]a=new int [n][3];
                for(int i=0;i<n;++i){
                    for(int j=0;j<3;++j){
                        a[i][j]=sc.nextInt();}
                }
                for(int i=0;i<n;++i){
                    for(int j=0;j<3;++j){
                        if(a[i][j]==1)
                            c++;
                        if((j+1)%3==0){
                            if(c>1)
                                c1++;
                            c=0;
                        }
                    }
                }
                System.out.println(c1);               
    }   
}
