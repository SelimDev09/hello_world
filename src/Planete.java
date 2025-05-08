public abstract class Planete {
  String nom;
  //String matiere;
  static String forme="Sphérique";
  long diametre;
  int totalVisiteur=0;
  static int nbPlaneteDecouvertes = 0;
  Atmoshphere atmosphere;
  Vaisseau vaisseauAccoste;

  
  Planete(String nom){
    this.nom = nom;
    nbPlaneteDecouvertes = ++nbPlaneteDecouvertes;
  }


  void revolution(int tour){
    System.out.println(nom +" a effectué "+ tour + " tours complets autour de son étoile");
  }

  void rotation(int angleRotation){
    System.out.println("Je suis la planète "+ nom + " et je tourne sur moi-même à " + angleRotation+"°");
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
