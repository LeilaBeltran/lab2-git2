    import java.util.Scanner;
     
    /**
     *
     * @author luis2112
     */
    public class wordcapitalization {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            String s = teclado.nextLine();
            String capi = s.substring(0, 1).toUpperCase() + s.substring(1);
            System.out.println(capi);
        }
    }
