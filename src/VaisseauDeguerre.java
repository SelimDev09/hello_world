public class VaisseauDeguerre extends Vaisseau{
  

  void attack(Vaisseau cible, String arme, int timeAttack) {
    System.out.println("Un vaisseau de type "+  this.typeVaisseau + " attaque un vaisseau de type "+ cible.typeVaisseau +" en utilisant l'arme "+  arme   +" pendant " + timeAttack +  " minutes.");
    cible.resistanceDuBouclier = 0;
    cible.blindage = cible.blindage/2;

  }
}
