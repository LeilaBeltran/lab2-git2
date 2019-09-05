    import java.util.Scanner;
     
    /**
     *
     * @author luis2112
     */
    public class stonesonthetable {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            int n = teclado.nextInt();
            String s = teclado.next();
            int c = 0;
    	char last = s.charAt(0);
    	for (int i = 1; i < n; i++) {
    	    if (s.charAt(i) == last){ 
                    c++;
                }else{ 
                    last = s.charAt(i);
    	   }
            }
            System.out.println(c);
        }
    }
