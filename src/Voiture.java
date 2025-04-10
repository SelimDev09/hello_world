public class Voiture {
  
  //Propriété 
  //Par default 0,0
  int nbPortes;
  // Par default = false
  boolean automatique;
  // Par default Null
  String couleur;
  // Par default char sans valeur /u000
  char premeireLettrePlauqe;

  //Propriété dite statique car elle commune à toute les voitures, la valeur est definit par la classe dite aussi variable de classe
  // Variable d'instance differe selon l'objet 
  static int nbrRoues = 4;

  // Sera utiliser pour passer les rapport entre la valeur initiale et l'execution de la methode
  int rapportCourant;
  //Méthode Avancer, reculer*

  //Surcharge methode
  int vitesseCourante;

  // Des propriétés sous forme d'objet + appelle de la class pour l'utilisation des proprietes
  Moteur moteur;



  void klaxonner(){
    System.out.println("tutu!!!");
  }

  int accelerer(){
    System.out.println("J'accelere");
    return 100;
  }

  int accelerer(int vitessePlus){
    System.out.println("J'accelere");
    return vitesseCourante+vitessePlus;
  }

  int passerRapport(boolean augmenter){
    if (augmenter) {
      rapportCourant++;
    }else{
      rapportCourant--;
    }
    return rapportCourant;
  }

  void tourner(boolean droite, int angle){
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

  
  void transporter(Passager passager, Ville villeDepart){
    System.out.println("Je transporte un passager qui s'appelle " + passager.nom + " " + passager.prenom + " depuis la ville " + villeDepart.nom);

  }
}
