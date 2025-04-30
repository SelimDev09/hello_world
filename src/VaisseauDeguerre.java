public class VaisseauDeguerre extends Vaisseau{
  

  boolean armeDesactive;
  void attack(Vaisseau cible, String arme, int timeAttack) {
    if (armeDesactive == true) {
      System.out.println("Attaque impossible.");
    } else{
      System.out.println("Un vaisseau de type "+  this.typeVaisseau + " attaque un vaisseau de type "+ cible.typeVaisseau +" en utilisant l'arme "+  arme   +" pendant " + timeAttack +  " minutes.");
      cible.resistanceDuBouclier = 0;
      cible.blindage = cible.blindage/2;
    }
  }
  void desactiverArmes() {
    armeDesactive = true;
    System.out.println("Desactivation des armes d'un vaisseau de type "+ this.typeVaisseau);
  }
  
}
