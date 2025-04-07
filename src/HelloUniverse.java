public class HelloUniverse {
    public static void main(String[] args) {
        Planete Mercure = new Planete();
        Planete Venus = new Planete();
        Planete Terre = new Planete();
        Planete Mars = new Planete();
        Planete Jupiter = new Planete();
        Planete Saturne = new Planete();
        Planete Neptune = new Planete();
        Planete X = new Planete();


        Mercure.diametre = 	4880;
        Mercure.matiere = "Tellurique";
        Mercure.nom = "Mercure";

        Venus.diametre = 	12100;
        Venus.matiere = "Tellurique";
        Venus.nom = "Venus";

        Terre.diametre = 12756;
        Terre.matiere = "Tellurique";
        Terre.nom = "Terre";

        Mars.diametre = 	6792;
        Mars.matiere = "Tellurique";
        Mars.nom = "Mars";

        Jupiter.diametre = 		142984;
        Jupiter.matiere = "Gazeuse";
        Jupiter.nom = "Jupiter";

        Saturne.diametre = 	120536;
        Saturne.matiere = "Gazeuse";
        Saturne.nom = "Saturne";

        Neptune.diametre = 	49532;
        Neptune.matiere = "Gazeuse";
        Neptune.nom = "Neptune";


        System.out.println(X.nom +" est une planète " + X.matiere + " avec un diametre de " + X.diametre + " Kilometre" );
    
        Neptune.rotation(-3542);
        Mars.rotation(-684);
        Venus.rotation(1250);
        Neptune.revolution(-9);
        
        Mars.acceuillirVaisseau(8);
        Mars.acceuillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + Mars.totalVisiteur);
    
    
    
    
    
    }


}
