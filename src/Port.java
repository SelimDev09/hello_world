public class Port {
  void acceuilleEngin(Amarable amarable) {
    
    if (amarable instanceof Bateau) {
      System.out.println("il s'agit bien d'un bateau");
    }
    
    
    int nbCorde = amarable.combienDeCordes(50);
    System.out.println("Le nombre de cordes nécéssaires est de " + nbCorde);
  }
}
