public class VaisseauCivil extends Vaisseau{
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
