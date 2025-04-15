public class Vaisseau {
  String typeVaisseau;
  int nmbPassagers;
  int blindage;
  int resistanceDuBouclier;

  void activerBouclier() {
    System.out.println("Activation du bouclier d'un vaisseau de type " + this.typeVaisseau);
  }

  void desactiverBouclier() {
    System.out.println("Désactivation du bouclier d'un vaisseau de type " + this.typeVaisseau);
  }
}
