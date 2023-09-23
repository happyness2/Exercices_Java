import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CompteurMots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le chemin du fichier :");
        String chemin = scanner.nextLine();
        File fichier = new File(chemin);
        if (!fichier.exists()) { System.out.println("Le fichier n'existe pas.");
            return; }
        try { Scanner lecteur = new Scanner(fichier);
            int nombreMots = 0; while (lecteur.hasNext()) { lecteur.next();
                nombreMots++; } lecteur.close();
            System.out.println("Le fichier contient " + nombreMots + " mots."); }
        catch (FileNotFoundException e) { System.out.println("Une erreur s'est produite lors de la lecture du fichier.");
            e.printStackTrace(); }
    }
}

