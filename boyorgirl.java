    import java.util.HashSet;
    import java.util.Scanner;
    import java.util.Set;
    /**
     *
     * @author luis2112
     */
    public class boyorgirl {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            String word = teclado.nextLine();
            Set<Character> ch = new HashSet<>();
    	for (int i = 0; i < word.length(); i++){
    	    ch.add(word.charAt(i));
                }
    	if (ch.size() % 2 == 0){
    	    System.out.println("CHAT WITH HER!");
            }else{
    	     System.out.println("IGNORE HIM!");
            }
        }
    }


