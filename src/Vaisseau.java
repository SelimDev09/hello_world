public abstract class Vaisseau {
  String typeVaisseau;
  int nmbPassagers;
  int blindage;
  int resistanceDuBouclier;
  int tonnageMax;
  int tonnageActuel;


  void activerBouclier() {
    System.out.println("Activation du bouclier d'un vaisseau de type " + this.typeVaisseau);
  }

  void desactiverBouclier() {
    System.out.println("Désactivation du bouclier d'un vaisseau de type " + this.typeVaisseau);
  }

  abstract int emporterCargo(int cargo);
}
