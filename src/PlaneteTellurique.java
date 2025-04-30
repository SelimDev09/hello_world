public class PlaneteTellurique extends  Planete implements Habitable{

  // Decris les vaisseaux et si il y a un vaisseau ou pas sinon un vaisseau doit s'en aller
  public Vaisseau acceuillirVaisseau(Vaisseau vaisseau){
    
    if (vaisseau instanceof VaisseauDeguerre) {
      ((VaisseauDeguerre) vaisseau).activerBouclier();
    }
    
    
    if (vaisseauAccoste == null) {
      System.out.println(" Aucun vaisseau ne s'en va.");
    } else{
      System.out.println("Un vaisseau de type " +
      vaisseauAccoste.typeVaisseau +
      " doit s'en aller.");
    }
    // vaisseauPrecedent prends la valeur du  vaisseau accoster
    Vaisseau vaisseauPrecedent = vaisseauAccoste;
    //System.err.println("val 1 :" + vaisseauAccoste);
    // Le vaisseau accoste prends la valeur du vaisseau pour le vider des ses valeurs
    vaisseauAccoste = vaisseau;
    //System.err.println("val 2 :" + vaisseauAccoste);
    //System.err.println("val 3 :" + vaisseau);
    // le ttviseteur s'increment à chaque vaisseau accosté
    totalVisiteur = totalVisiteur + vaisseau.nmbPassagers;
    return vaisseauPrecedent;
  }

  PlaneteTellurique(String nom) {
    super(nom);
    //TODO Auto-generated constructor stub
  }
  
}
