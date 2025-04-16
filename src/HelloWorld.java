public class HelloWorld {
  public static void main(String[] args) {

    /*
    VehiculeAMoteur voitureDeTata = new Voiture("Jaune");
    // Transtypage
    // Premeire solution est de creer une nouvelle variable :
    // Voiture voitureDeTataSousFormeDeVoiture=(Voiture)voitureDeTata;
    // 2me solution est le transtypage à la volet : 
    ((Voiture)voitureDeTata).nbPortes = 3;
    ((Voiture)voitureDeTata).automatique = false;
    ((Voiture)voitureDeTata).couleur = "Verte";

    System.out.println("Voiture est" + voitureDeTata.couleur);

    ((Voiture)voitureDeTata).klaxonner();
    System.out.println(      voitureDeTata.accelerer()
    );
    
    ((Voiture)voitureDeTata).passerRapport(true);
    ((Voiture)voitureDeTata).passerRapport(true);

    System.out.println(
      voitureDeTata.passerRapport(false) 
    );
    
    ((Voiture)voitureDeTata).tourner(false, 45);
    ((Voiture)voitureDeTata).tournerDeux("droite", 45);


    // creation du moteur + valorisation des proprietes 
    Moteur moteur = new Moteur();
    moteur.carburateur="Diesel";
    moteur.nbCylindres=6;
    Voiture voitureDeSimone = new Voiture(moteur);
    voitureDeSimone.nbPortes = 5;
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

    Voiture.klaxonner();
    Voiture.tourner(true, 45);
    */

    UsineDAssemblageVoiture ua = new UsineDAssemblageVoiture();

    Voiture v= ua.assemblage();

  }
}
