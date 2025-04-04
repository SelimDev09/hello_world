public class OperateurIncréDecre {

  public static void main(String[] args) {
    int valeurEntiere=5;
    int valeurEntiere2;

    valeurEntiere2=++valeurEntiere;
    System.out.println(valeurEntiere);
    System.out.println(valeurEntiere2);

    // Difference de l'emplacement du signe ++ && -- et l'effet de que cela fait
    int valeurEntiere3=5;
    int valeurEntiere4;

    valeurEntiere4=valeurEntiere3++;
    System.out.println(valeurEntiere3);
    System.out.println(valeurEntiere4);
    
  }
}