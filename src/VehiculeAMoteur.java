
public class VehiculeAMoteur {
  // Des propriétés sous forme d'objet + appelle de la class pour l'utilisation des proprietes
  Moteur moteur;

  //Surcharge methode
  int vitesseCourante;


  int accelerer(int vitessePlus){
    System.out.println("J'accelere");
    return vitesseCourante+vitessePlus;
  }

  void transporter(Passager passager, Ville villeDepart){
    System.out.println("le vehicule transporte un passager qui s'appelle " + passager.nom + " " + passager.prenom + " depuis la ville " + villeDepart.nom);
  }


}
