import java.util.Scanner;
public class exo1 {
    public static void main(String[] args) {
        String str = "Bonjour";
        System.out.println(str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println(str);
    }

    static {
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(". ");
            }
            System.out.println();
        }


    for( int i = 1 ; i<=1000 ; i++){
        while (i<=1000){
    System.out.println(i++);
        }
        }
        int nbr;
        System.out.print("Entrez un entier : ");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextInt();

        if (nbr % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }
}
