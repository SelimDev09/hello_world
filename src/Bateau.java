public class Bateau implements Amarable{
  int masse;
	@Override
	public int combienDeCordes(int vitesseDuVent) {
		int nbCorde = masse/10;
    nbCorde = nbCorde + vitesseDuVent/100;
    return nbCorde;
	}
  
}
