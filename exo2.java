import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class exo2 {

    public static void main(String args[]) {
        String phrase1 = " Joie de vivre! ";
        StringTokenizer stringTokenizer1 = new StringTokenizer(phrase1);
        int tokensCount1 = stringTokenizer1.countTokens();
        System.out.println("votre phrase contient: " + String.valueOf(tokensCount1));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase :");
        String phrase = scanner.nextLine();
        System.out.println("La phrase est : " + phrase);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fichier.txt"));
            writer.write(phrase);
            writer.close();
            System.out.println("La phrase a été sauvegardée dans le fichier 'fichier.txt'");
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la sauvegarde du fichier.");
            e.printStackTrace();

        }}}



