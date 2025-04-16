public class UsineDAssemblageVoiture extends UsineDAssemblage{
  Voiture assemble(){
    Voiture v = new Voiture();
    v.accelerer(30);
    return v;
  }
}
