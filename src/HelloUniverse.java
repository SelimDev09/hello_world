public class HelloUniverse {
    public static void main(String[] args) {
        Planete Mercure = new Planete();
        Planete Venus = new Planete();
        Planete Terre = new Planete();
        Planete Mars = new Planete();
        Planete Jupiter = new Planete();
        Planete Saturne = new Planete();


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


        System.out.println(Jupiter.nom +" est une planète " + Jupiter.matiere + " avec un diametre de " + Jupiter.diametre + " Kilometre" );
    }


}
