public class Planete {
  String nom;
  String matiere;
  static String forme="Sphérique";
  long diametre;
  int totalVisiteur=0;
  
  Atmoshphere atmosphere;
  Vaisseau vaisseauAccoste;


  void revolution(int tour){
    System.out.println(nom +" a effectué "+ tour + " tours complets autour de son étoile");
  }

  void rotation(int angleRotation){
    System.out.println("Je suis la planète "+ nom + " et je tourne sur moi-même à " + angleRotation+"°");
  }
  // Decris les vaisseaux et si il y a un vaisseau ou pas sinon un vaisseau doit s'en aller
  Vaisseau acceuillirVaisseau(Vaisseau vaisseau){
    if (vaisseauAccoste == null) {
      System.out.println(" Aucun vaisseau ne s'en va.");
    } else{
      System.out.println("Un vaisseau de type " +
      vaisseauAccoste.typeVaisseau +
      " doit s'en aller.");
    }
    // vaisseauPrecedent prends la valeur du  vaisseau accoster
    Vaisseau vaisseauPrecedent = vaisseauAccoste;
    //System.err.println("val 1 :" + vaisseauAccoste);
    // Le vaisseau accoste prends la valeur du vaisseau pour le vider des ses valeurs
    vaisseauAccoste = vaisseau;
    //System.err.println("val 2 :" + vaisseauAccoste);
    //System.err.println("val 3 :" + vaisseau);
    // le ttviseteur s'increment à chaque vaisseau accosté
    totalVisiteur = totalVisiteur + vaisseau.nmbPassagers;
    return vaisseauPrecedent;
  }

  // combien de passager à acceuilli
  void baieAccostage(){
    System.out.println("Le nombre d'humains ayant déjà séjourné sur "+ nom
    +" est actuellement de "
    + totalVisiteur +
    ".");
  }

  static String expansion(double  distance){
    if (distance < 14) {
      return "Oh la la mais c'est super rapide !";
    } else {
      return "Je rêve ou c'est plus rapide que la lumière ?";
    }
    
  }



}
