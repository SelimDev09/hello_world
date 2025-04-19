public class Mongolfiere implements Amarable{
  int surface;
  @Override
  public int combienDeCordes(int vitesseDuVent) {
    int nbCorde = surface/50;
    nbCorde = nbCorde+vitesseDuVent/100;
    return nbCorde;
  }
  
}
