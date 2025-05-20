public enum TypeVaisseau {
  CHASSEUR("Chasseur"),
  FREGATE("Fregate"), 
  CROISEUR("Croiseur"), 
  VAISSEAUMONDE("Vaisseau-Monde"), 
  CARGO("Cargo");

  String nom;

  private TypeVaisseau (String nom) {
    this.nom = nom;
  }
}
