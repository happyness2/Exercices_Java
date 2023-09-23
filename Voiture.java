 public class Voiture {
        private String couleur;
        private int vitesse;

         public Voiture(String couleur, int vitesse) {
             this.couleur = couleur;
             this.vitesse = vitesse;
         }

         public String rouler(){
            return ("Vitesse : " + vitesse);
        }
}
 public class Utilisateur {
     private String nom;
     private int age;

     public Utilisateur(String nom, int age) {
         this.nom = nom;
         this.age = age;
     }

     public String parler(){
         return ("age : " + age);
     }
 }