import java.util.*;

public class Policerecruits {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Police = 0;
		int re = 0;
		for(int i = 0; i < n; i++){
			int c = sc.nextInt();
			if(c==-1){
				if(Police > 0){
					Police--;
				}else{
					re++;
				}
			}else{
				Police += c;
			}
			
		}
		System.out.println(re);
		
	}
}
