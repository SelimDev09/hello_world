//import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
  /*

    System.out.println("Hello World ! je suis un affichage java");
    // System.in = l'entree standard generalement le clavier et ne permet pas de lire la ligne suivante
    //Scanner est un objet qui permet de lire et d'analyser les données saisies par l'utilisateur
    Scanner sc = new Scanner(System.in);
    // lire une ligne pour pouvoir la logger il faut l'ecrirer dans le terminal
    String ligneSuivant = sc.nextLine();

    System.out.println("Voici la ligne suivante : " + ligneSuivant);
    //pareil mais un int
    int nbreSuivant = sc.nextInt();
    System.out.println("Voici le nombre suivant : " + nbreSuivant);


    
    // rien n'est executé apres
    // System.exit(1); = par convencion il y a une erreur
    //System.exit(1);

    // afficher le temps en millisecondes 
    // nanosecondes => souvent pour calculer le temps qui s'ecoule
    long time = System.currentTimeMillis();
    long timeStart = System.nanoTime();
    // afficher une phrase ou variable
    System.out.println("Hello World ! je suis un affichage java");
    long timeEnd = System.nanoTime();

    System.out.println("Temps d'execution : " + (timeEnd - timeStart));
    
    // afficher une erreur
    System.err.println("Oups ! je suis un affichage java");

    // System.exit(0); = que tout c'est bien passé
    System.exit(0);

    // afficher les propriétés du systeme
    System.out.println( System.getProperties());
    
    VehiculeAMoteur voitureDeTata = new Voiture("Jaune");
    // Transtypage
    // Premeire solution est de creer une nouvelle variable :
    // Voiture voitureDeTataSousFormeDeVoiture=(Voiture)voitureDeTata;
    // 2me solution est le transtypage à la volet : 
    ((Voiture)voitureDeTata).nbPortes = 3;
    ((Voiture)voitureDeTata).automatique = false;
    ((Voiture)voitureDeTata).couleur = "Verte";

    System.out.println("Voiture est" + voitureDeTata.couleur);
    ((Voiture)voitureDeTata).klaxonner();
    System.out.println(      voitureDeTata.accelerer()
    );
    
    ((Voiture)voitureDeTata).passerRapport(true);
    ((Voiture)voitureDeTata).passerRapport(true);

    System.out.println(
      voitureDeTata.passerRapport(false) 
    );
    
    ((Voiture)voitureDeTata).tourner(false, 45);
    ((Voiture)voitureDeTata).tournerDeux("droite", 45);


    // creation du moteur + valorisation des proprietes 
    Moteur moteur = new Moteur();
    moteur.carburateur="Diesel";
    moteur.nbCylindres=6;
    Voiture voitureDeSimone = new Voiture(moteur);
    voitureDeSimone.nbPortes = 5;
    //Affectation de la propriete à la voiture de tata
    voitureDeTata.moteur=moteur;

    voitureDeSimone.moteur=moteur;

    // affectation à la référence du moteur donc les deux moteurs pointes vers cette référence
    // les deux deux voiture auront 8 cylindre
    moteur.nbCylindres = 8;



    System.out.println("le nombre de cylindre de la voiture de Tata est de " + voitureDeTata.moteur.nbCylindres);
  
  
    Passager passager = new Passager();
    passager.nom = "Dupont";
    passager.prenom = "Moreti";
    Ville ville = new Ville();
    ville.nom = "Paris";
    voitureDeSimone.transporter(passager, ville);
    System.out.println(
      "le nombre de roues de Simone" +
      voitureDeSimone.nbrRoues
    );
    System.out.println(
      // plus commun d'utiliser de la facon suivante car cela est commun a totutes les voitures
      "le nombre de roues " +
      Voiture.nbrRoues
    );

    //on peut changer la valeur des roues
    Voiture.nbrRoues = 6;

    System.out.println(
      "le nombre de roues de Simone " +
      voitureDeSimone.nbrRoues
    );
    System.out.println(
      // plus commun d'utiliser de la facon suivante car cela est commun a totutes les voitures
      "le nombre de roues " +
      Voiture.nbrRoues
    );

      Voiture.klaxonner();
      Voiture.tourner(true, 45);
      

      UsineDAssemblageVoiture ua = new UsineDAssemblageVoiture();

      Voiture v= ua.assemble();

      Bateau b = new Bateau();
      b.masse = 60;
      Port p = new Port();
      p.acceuilleEngin(b);
    */

    // Classe conteneur ou Wrapper

    Integer i = Integer.valueOf(5);
    int j = i.intValue();
    System.out.println(j);

    Float f = Float.valueOf(12.2f);
    // conversion de la chaine de caractere en float
    Float f2 = Float.valueOf("12.2f");
    System.out.println(f2 + f);
    float f3 = f.floatValue();
    System.out.println(f3);

    Voiture v = new Voiture();
    v.rapportCourant = Integer.valueOf(0);
    
    // conversion des types
    int i3 = Integer.valueOf("16");
    String i4 = String.valueOf(i3);
    System.out.println(i4);

    // les types enuméré => restraindre le type bool à une gamme pre determiner
    v.typeBoite = TypeBoiteAuto.SEMI_AUTO;
    System.out.println("le type de boite est " + v.typeBoite.nomTypeBoite);

    // les tableaux
    // 0 -> 4
    int[] tabDeInt = new int[5];
    // 5 caractere vide
    char[] tableDeChar = new char[5];
    // 5 null par defaut
    Voiture[] tabDeVoiture = new Voiture[5];

    tabDeInt[1] = 15;
    tabDeInt[4] = 20;
    System.out.println("La valeur du deuxieme element est " + tabDeInt[1]);

    tabDeVoiture[1] = v;
    v.couleur = "noir";
    tabDeVoiture[2] = new Voiture("rouge");
    System.out.println("Le deuxieme element de voiture est " + tabDeVoiture[1].couleur);
    
    // Recuperer la taille du tableau
    System.out.println("La taille du tableau est " + tabDeInt.length);
  }
}
