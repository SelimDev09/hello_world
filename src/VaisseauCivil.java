public class VaisseauCivil extends Vaisseau{

  VaisseauCivil(String typeVaisseau) {
    this.typeVaisseau = typeVaisseau;
    switch (typeVaisseau) {
      case "CARGO ":
        tonnageMax = 500;
        break;
      case "Vaisseau-Monde":
        tonnageMax = 2000;
        break;
    }
  }
  @Override
  public int emporterCargo(int cargo) {
    int tonnageRestant = tonnageMax - tonnageActuel; 
        
    if (cargo > tonnageRestant) {
      tonnageActuel = tonnageMax;
      return cargo - tonnageRestant;
    } else {
      tonnageActuel += cargo;
      return 0;
    }
  }

}
