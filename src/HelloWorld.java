public class HelloWorld {
  public static void main(String[] args) {
            
    Voiture voitureDeTata = new Voiture();
    voitureDeTata.nbPortes = 3;
    voitureDeTata.automatique = false;
    voitureDeTata.couleur = "vert";

    System.out.println("Voiture est" + voitureDeTata.couleur);

    voitureDeTata.klaxonner();
    System.out.println(

      voitureDeTata.accelerer()
    );
    voitureDeTata.passerRapport(true);
    voitureDeTata.passerRapport(true);
    System.out.println(
      voitureDeTata.passerRapport(false) 
      );
    voitureDeTata.tourner(false, 45);
    voitureDeTata.tournerDeux("droite", 45);

  }
}
