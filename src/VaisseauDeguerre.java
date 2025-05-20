public class VaisseauDeguerre extends Vaisseau{
  

  boolean armeDesactive;
  
  VaisseauDeguerre(TypeVaisseau typeVaisseau){
    this.typeVaisseau = typeVaisseau;
    switch (typeVaisseau) {
      case CHASSEUR:
        tonnageMax = 0;
        break;
      case FREGATE:
        tonnageMax = 50;
        break;
      case CROISEUR:
        tonnageMax = 100;
        break;
      default:
        break;
    }
  }
  
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
  
  @Override
  void activerBouclier() {
    desactiverArmes();
    super.activerBouclier();
  }
  int emporterCargo(int cargo) {
    if (this.typeVaisseau == TypeVaisseau.CHASSEUR) {
      return cargo;
    } 
    else {
      if (nmbPassagers <12) {
        return cargo;
      }
      else{
        //tonnage passager pouvant accepter le cargo
        int cargoPassager = nmbPassagers*2;
        //Tonnage disponible à embarquer
        int tonnageRestant = tonnageMax - tonnageActuel;
        int tonnageAConsiderer = (cargoPassager < tonnageRestant ? cargoPassager : tonnageRestant);
        if (cargo>tonnageAConsiderer) {
          tonnageActuel = tonnageMax;
          return cargo-tonnageAConsiderer;
        }
        else{
          tonnageActuel += cargo;
          return 0;
        }
      }
      
    }
  }

}
