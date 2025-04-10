public class HelloWorld {
  public static void main(String[] args) {
            
    Voiture voitureDeTata = new Voiture();
    voitureDeTata.nbPortes = 3;
    voitureDeTata.automatique = false;
    voitureDeTata.couleur = "vert";
    /*
    System.out.println("Voiture est" + voitureDeTata.couleur);
     */

    voitureDeTata.klaxonner();
    /*System.out.println(      voitureDeTata.accelerer()
    );
    */
    voitureDeTata.passerRapport(true);
    voitureDeTata.passerRapport(true);
    /*
     * 
     System.out.println(
       voitureDeTata.passerRapport(false) 
      );
     */
    voitureDeTata.tourner(false, 45);
    voitureDeTata.tournerDeux("droite", 45);


    Voiture voitureDeSimone = new Voiture();
    voitureDeSimone.nbPortes = 5;
    // creation du moteur + valorisation des proprietes 
    Moteur moteur = new Moteur();
    moteur.carburateur="Diesel";
    moteur.nbCylindres=6;

    //Affectation de la propriete à la voiture de tata
    voitureDeTata.moteur=moteur;

    voitureDeSimone.moteur=moteur;

    // affectation à la référence du moteur donc les deux moteurs pointes vers cette référence
    // les deux deux voiture auront 8 cylindre
    moteur.nbCylindres = 8;



    System.out.println("le nombre de cylindre de la voiture de Tata est de " + voitureDeTata.moteur.nbCylindres);
  
  
    Passager passager = new Passager();
    passager.nom = "Dupont";
    passager.prenom = "Moreti";
    Ville ville = new Ville();
    ville.nom = "Paris";
    voitureDeSimone.transporter(passager, ville);
    System.out.println(
      "le nombre de roues de Simone" +
      voitureDeSimone.nbrRoues
    );
    System.out.println(
      // plus commun d'utiliser de la facon suivante car cela est commun a totutes les voitures
      "le nombre de roues " +
      Voiture.nbrRoues
    );

    //on peut changer la valeur des roues
    Voiture.nbrRoues = 6;

    System.out.println(
      "le nombre de roues de Simone " +
      voitureDeSimone.nbrRoues
    );
    System.out.println(
      // plus commun d'utiliser de la facon suivante car cela est commun a totutes les voitures
      "le nombre de roues " +
      Voiture.nbrRoues
    );
  }
}
