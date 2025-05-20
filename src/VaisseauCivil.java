public class VaisseauCivil extends Vaisseau{

  VaisseauCivil(TypeVaisseau typeVaisseau) {
    this.typeVaisseau = typeVaisseau;
    switch (typeVaisseau) {
      case CARGO:
        tonnageMax = 500;
        break;
      case VAISSEAUMONDE:
        tonnageMax = 2000;
        break;
      default:
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
