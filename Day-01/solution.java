import java.util.Scanner;
public class Main {
    public static String determineColor(String s) {
        char l=s.charAt(0);
        char x=s.charAt(1);
        int n = Character.getNumericValue(x);
        if(l=='a'||l=='c'||l=='e'||l=='g')
        {
            if(n%2==0)
            {
                return "White";
            }
            return "Black";
        }
        if(l =='b'||l=='d'||l=='f'||l=='h'){
            if(n%2==0){
                return "Black";
            }
            return "White";
        }
        return "White";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}