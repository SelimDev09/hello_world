public class Planete {
  String nom;
  String matiere;
  long diametre;
  int totalVisiteur=0;
  void revolution(int tour){
    System.out.println(nom +" a effectué "+ tour + " tours complets autour de son étoile");
  }

  void rotation(int angleRotation){
    System.out.println("Je suis la planète "+ nom + " et je tourne sur moi-même à " + angleRotation+"°");
  }

  void acceuillirVaisseau(int nmbHumain){
    totalVisiteur = totalVisiteur + nmbHumain;
  }

  void acceuillirVaisseau(String typeVaisseau){

    switch (typeVaisseau) {
      case "CHASSEUR":
        totalVisiteur = totalVisiteur + 3;
        break;
        case "FREGATE":
        totalVisiteur = totalVisiteur + 12;
        break;
        case "CROISEUR":
        totalVisiteur = totalVisiteur + 50  ;
        break;
    }
  }
  Atmoshphere atmosphere;




}
