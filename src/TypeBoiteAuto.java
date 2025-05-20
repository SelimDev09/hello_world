public enum TypeBoiteAuto {
  /*
  // final = ne peut jamais etre modifier 
  // static + final = nommage en maj car convention
  // Version Class
  static final int AUTO = 1;
  static final int SEMI_AUTO = 2;
  static final int MANUELLE = 3;

  Forme complexe d'enumeration exemple :
   */ 
  AUTO("Automatique"),
  SEMI_AUTO("Semi-automatique"), 
  MANUELLE( "Manuelle");

  String nomTypeBoite;

  private TypeBoiteAuto (String nomTypeBoite) {
    this.nomTypeBoite = nomTypeBoite;
  }

}
