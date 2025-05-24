public class Voiture extends VehiculeAMoteur implements Vidangeable{
  

    //Propriété dite statique car elle commune à toute les voitures, la valeur est definit par la classe dite aussi variable de classe
  // Variable d'instance differe selon l'objet 
  static int nbrRoues = 4;
  //Propriété 
  //Par default 0,0
  int nbPortes;
  // Par default = false
  //boolean automatique;
  TypeBoiteAuto typeBoite;

  // Par default Null
  String couleur;
  // Par default char sans valeur /u000
  char premeireLettrePlauqe;



  // Sera utiliser pour passer les rapport entre la valeur initiale et l'execution de la methode
  Integer rapportCourant;
  //Méthode Avancer, reculer*
  Voiture(){
    super(new Moteur());
  }

  // Ellipses ou varargs
  // le varargs ... apres le dernier argument il peut y avoir plusieurs arguments qui sra tranformé en tableau
  // pas plus d'une ellipse par methode et elle doit etre à la fin des params
  void transporter(Passager passager, Ville villeDepart, Ville... villeEtapes){
    System.out.println("La voiture transporte un passager qui s'appelle " + passager.nom + " " + passager.prenom + " depuis la ville " + villeDepart.nom);
    System.out.println("la premiere ville etape est " + villeEtapes[0].nom);
    System.out.println("la longueur du tableau est " + villeEtapes.length);
  }


  Voiture (Moteur moteur) {
    this();
  }


  Voiture(String couleur){
    this();
    this.couleur=couleur;
    System.out.println("Ceci est une voiture en cours de construction avec un parametre couleur");
  }

  static void klaxonner(){
    System.out.println("tutu!!!");
  }


  int passerRapport(boolean augmenter){
    if (augmenter) {
      rapportCourant++;
    }else{
      rapportCourant--;
    }
    return rapportCourant;
  }

  static void tourner(boolean droite, int angle){
    String droiteOuGauche=null;
    if (droite) {
      droiteOuGauche = "Droite";
    }else{
      droiteOuGauche = "Gauche";
    }
    System.out.println("La voiture Tata va touner à" + droiteOuGauche + " d'un angle de " + angle);
  }

  void tournerDeux(String droiteOuGauche, int angle){
    System.out.println("La voiture Tata va touner à" + droiteOuGauche + " d'un angle de " + angle);
  }


  @Override
  public void vidanger() {
    System.out.println("Dévicer le bouchon sous la culasse et attendre que cela coule.");
  }

  

}
