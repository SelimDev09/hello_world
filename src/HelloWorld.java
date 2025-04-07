public class HelloWorld {
  public static void main(String[] args) {
            
    Voiture voitureDeTata = new Voiture();
    voitureDeTata.nbPortes = 3;
    voitureDeTata.automatique = false;
    voitureDeTata.couleur = "vert";

    System.out.println("Voiture est" + voitureDeTata.couleur);

    voitureDeTata.klaxonner();
  }
}
