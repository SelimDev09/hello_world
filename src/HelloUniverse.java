import java.util.Scanner;

public class HelloUniverse {
    public static void main(String[] args) {

        PlaneteTellurique Mercure = new PlaneteTellurique("Mercure", 1);
        PlaneteTellurique Venus = new PlaneteTellurique("Venus", 2);
        PlaneteTellurique Terre = new PlaneteTellurique("Terre", 0);
        PlaneteTellurique Mars = new PlaneteTellurique("Mars", 3);
        PlaneteGazeuse Jupiter = new PlaneteGazeuse("Jupiter");
        PlaneteGazeuse Saturne = new PlaneteGazeuse("Saturne");
        PlaneteGazeuse Neptune = new PlaneteGazeuse("Neptune");
        PlaneteGazeuse Uranus = new PlaneteGazeuse ("Uranus");
        PlaneteGazeuse X = new PlaneteGazeuse("X");                 

        Mercure.diametre = 	4880;
        //Mercure.matiere = "Tellurique";
        //Mercure.nom = "Mercure";

        Venus.diametre = 	12100;
        //Venus.matiere = "Tellurique";
        //Venus.nom = "Venus";

        Terre.diametre = 12756;
        //Terre.matiere = "Tellurique";
        //Terre.nom = "Terre";

        Mars.diametre = 	6792;
        //Mars.matiere = "Tellurique";
        //Mars.nom = "Mars";

        Jupiter.diametre = 		142984;
        //Jupiter.matiere = "Gazeuse";
        //Jupiter.nom = "Jupiter";

        Saturne.diametre = 	120536;
        //Saturne.matiere = "Gazeuse";
        //Saturne.nom = "Saturne";

        Neptune.diametre = 	49532;
        //Neptune.matiere = "Gazeuse";
        //Neptune.nom = "Neptune";

        //Uranus.nom = "Uranus";
        Uranus.diametre = 51118;
        //Uranus.matiere = "Gazeuse";
        /* 
        System.out.println(X.nom +" est une planète " + X.matiere + " avec un diametre de " + X.diametre + " Kilometre" );
    
        Neptune.rotation(-3542);
        Mars.rotation(-684);
        Venus.rotation(1250);
        Neptune.revolution(-9);
    
    
        Atmoshphere atmosphereUranus = new Atmoshphere();
        atmosphereUranus.tauxHydrogene = 83f;
        atmosphereUranus.tauxHelium = 15f;
        atmosphereUranus.tauxMethane = 2.5f;
        
        System.out.println(
        "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxHydrogene + "% d'hydrogène"
        );
        System.out.println(
            "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxArgon + "% d'argon"
        );
        System.out.println(
            "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxDioxydeDeCarbone + "% de dioxyde de carbone"
            );
            System.out.println(
                "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxAzote + "% d'azote"
        );
        System.out.println(
            "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxHelium + "% hélium"
            );
            System.out.println(
                "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxMethane + "% de méthane"
                );
        System.out.println(
            "L'atmosphere" + Uranus.nom + "est composée A " + atmosphere.tauxSodium + "% de sodium"
            );

        Vaisseau typeVaisseau1 = new Vaisseau();

        typeVaisseau1.nmbPassagers = 9;
        typeVaisseau1.typeVaisseau = "Frégate";
        
        
        Vaisseau typeVaisseau2 = new Vaisseau();
        
        typeVaisseau2.nmbPassagers = 42;
        typeVaisseau2.typeVaisseau = "Croisseur";
        Mars.acceuillirVaisseau(typeVaisseau1);
        Mars.acceuillirVaisseau(typeVaisseau2);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur "+ Mars.nom
        +" est actuellement de "
        + Mars.totalVisiteur +
        ".");
        
        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("la forme de " + Mars.nom + " est " + Planete.forme);
        System.out.println(
            Planete.expansion(10.5) 
            );
        System.out.println(
            Planete.expansion(14.2)
        );
        System.out.println(Planete.nbPlaneteDecouvertes);

        Vaisseau vaisseauTypeOne = new VaisseauDeguerre("Chasseur");
        //vaisseauTypeOne.typeVaisseau = "Chasseur";
        vaisseauTypeOne.blindage = 156;
        vaisseauTypeOne.resistanceDuBouclier = 2;
        
        Vaisseau vaisseauTypeTwo = new VaisseauCivil("vaisseau-monde");
        //vaisseauTypeTwo.typeVaisseau = "Vaisseau-Monde";
        vaisseauTypeTwo.blindage = 4784;
        vaisseauTypeTwo.resistanceDuBouclier = 30;

        vaisseauTypeTwo.activerBouclier();
        ((VaisseauDeguerre)  vaisseauTypeOne).activerBouclier();

        ((VaisseauDeguerre)  vaisseauTypeOne).attack(vaisseauTypeTwo, "Lasers photoniques", 3);

        vaisseauTypeTwo.desactiverBouclier();

        System.out.println(vaisseauTypeTwo.resistanceDuBouclier);
        System.out.println(vaisseauTypeTwo.blindage);
    
        Vaisseau typeVaisseau1 = new VaisseauDeguerre("Fregate");

        typeVaisseau1.nmbPassagers = 9;
        //typeVaisseau1.typeVaisseau = "Frégate";
        
        
        Vaisseau typeVaisseau2 = new VaisseauDeguerre("Fregate");
        
        typeVaisseau2.nmbPassagers = 42;
        //typeVaisseau2.typeVaisseau = "Croisseur";

        
        System.out.println("Le nombre d'humains ayant déjà séjourné sur "+ Mars.nom
        +" est actuellement de "
        + Mars.totalVisiteur +
        ".");
        
        Mars.acceuillirVaisseau(vaisseauTypeTwo);

        Mars.acceuillirVaisseau(vaisseauTypeOne);
        

        Vaisseau vaisseauChasseur = new VaisseauDeguerre("Chasseur");

        Terre.acceuillirVaisseau(vaisseauChasseur);
        
        System.out.println("Un chasseur a refusé de transporter " + vaisseauChasseur.emporterCargo(20) + 
        " tonnes.");

        Vaisseau vaisseauFregate = new VaisseauDeguerre("Fregate");
        Terre.acceuillirVaisseau(vaisseauFregate);
        vaisseauFregate.nmbPassagers = 100;
        System.out.println("Un fregate a refusé de transporter " + vaisseauFregate.emporterCargo(45) + 
        " tonnes.");
        System.out.println("Un fregate a refusé de transporter " + vaisseauFregate.emporterCargo(12) + 
        " tonnes.");

        Vaisseau vaisseauFregate2 = new VaisseauDeguerre("Fregate");
        Terre.acceuillirVaisseau(vaisseauFregate2);
        vaisseauFregate2.nmbPassagers = 14;
        System.out.println("Un fregate a refusé de transporter " + vaisseauFregate2.emporterCargo(30) + 
        " tonnes.");
        
        Vaisseau vaisseauMonde = new VaisseauCivil("Vaisseau-Monde");
        Terre.acceuillirVaisseau(vaisseauMonde);
        System.out.println("Un vaisseau-monde a refusé de transporter " + vaisseauMonde.emporterCargo(1560) + 
        " tonnes.");
        System.out.println("Un vaisseau-monde a refusé de transporter " + vaisseauMonde.emporterCargo(600) + 
        " tonnes.");
        

        Vaisseau vaisseauChasseur = new VaisseauDeguerre("Chasseur");
        
        Vaisseau vaisseauFregate = new VaisseauDeguerre("Fregate");
        vaisseauFregate.nmbPassagers = 24;
        Vaisseau vaisseauCroiseur = new VaisseauDeguerre("Croiseur");

        Vaisseau vaisseauCargo = new VaisseauCivil("Vaisseau-Cargo");

        Vaisseau vaisseauMonde = new VaisseauCivil("Vaisseau-Monde");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel vaisseau voulez-vous selectionner ?");
        String vaisseauSelectionne = sc.nextLine();

        System.out.println("Quelle est la planete sur laquelle vous voulez aller ? ( Mercure, Venus, Terre ou Mars )");
        String planeteSelectionne = sc.nextLine();

        System.out.println("Quel est le tonnage de votre cargo ?");
        int tonnageCargo = sc.nextInt();

        Vaisseau vaisseau = null;
        switch (vaisseauSelectionne) {
            case "Chasseur":
                vaisseau  = vaisseauChasseur;
                break;
            case "Fregate":
                vaisseau = vaisseauFregate;
                break;
            case "Croiseur":
                vaisseau = vaisseauCroiseur;
                break;
            case "Vaisseau-Cargo":
                vaisseau = vaisseauCargo;
                break;
            case "Vaisseau-Mondefr":
                vaisseau = vaisseauMonde;
                break;
        }

        Planete planete = null;
        switch (planeteSelectionne) {
            case "Mercure":
                planete = Mercure;
                break;
            case "Venus":
                planete = Venus;
                break;
            case "Terre":
                planete = Terre;
                break;
            case "Mars":
                planete = Mars;
                break;
        }
        planete.acceuillirVaisseau(vaisseau);
        int tonnageRejeter = vaisseau.emporterCargo(tonnageCargo);  
        System.out.println("Le vaisseau " + vaisseauSelectionne + " a refusé de transporter " + tonnageRejeter + 
        " tonnes.");
        */

        Atmoshphere atmosphereUranus = new Atmoshphere();
        
        atmosphereUranus.tauxHydrogene = Float.valueOf(83f);
        atmosphereUranus.tauxHelium = Float.valueOf(15f);
        atmosphereUranus.tauxMethane = Float.valueOf(2.5f);
        atmosphereUranus.tauxAzote = Float.valueOf(0.0f);
        Uranus.atmosphere = atmosphereUranus;
        System.out.println("L'atmosphere " + Uranus.nom + " est composée :");
        if (Uranus.atmosphere.tauxHydrogene != null) {
            System.out.println(
                "A " + atmosphereUranus.tauxHydrogene.floatValue() + "% d'hydrogène"
            );
        }
        if (Uranus.atmosphere.tauxArgon != null) {
            System.out.println(
                "A " + atmosphereUranus.tauxArgon.floatValue() + "% d'argon"
            );
        }    
        if (Uranus.atmosphere.tauxDioxydeDeCarbone != null) {
            System.out.println(
                "A " + atmosphereUranus.tauxDioxydeDeCarbone.floatValue() + "% de dioxyde de carbone"
            );
        }
        if (Uranus.atmosphere.tauxAzote != null) {
            System.out.println(
                "A " + atmosphereUranus.tauxAzote.floatValue() + "% d'azote"
            );
        }
        if (Uranus.atmosphere.tauxHelium != null) {
            System.out.println(
                "A " + atmosphereUranus.tauxHelium.floatValue() + "% hélium"
            );
        }
        if (Uranus.atmosphere.tauxMethane != null) {
            System.out.println(
                "A " + atmosphereUranus.tauxMethane.floatValue() + "% de méthane"
            );
        }
            
        if (Uranus.atmosphere.tauxSodium != null) {    
            System.out.println(
                "A " + atmosphereUranus.tauxSodium.floatValue() + "% de sodium"
            );
        }

        Vaisseau vaisseauChasseur = new VaisseauDeguerre(TypeVaisseau.CHASSEUR);
        
        Vaisseau vaisseauFregate = new VaisseauDeguerre(TypeVaisseau.FREGATE);
        vaisseauFregate.nmbPassagers = 24;
        Vaisseau vaisseauCroiseur = new VaisseauDeguerre(TypeVaisseau.CROISEUR);

        Vaisseau vaisseauCargo = new VaisseauCivil(TypeVaisseau.CARGO);

        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        
        Scanner sc = new Scanner(System.in);
        String recommencer;
        do {
            
        
            System.out.println("Quel vaisseau voulez-vous selectionner ?");
            String vaisseauSelectionne = sc.nextLine();

            System.out.println("Quelle est la planete sur laquelle vous voulez aller ? ( Mercure, Venus, Terre ou Mars )");
            String planeteSelectionne = sc.nextLine();

            System.out.println("Quel est le tonnage de votre cargo ?");
            int tonnageCargo = sc.nextInt();
            sc.nextLine();

            TypeVaisseau typeVaisseauSelectionne = TypeVaisseau.valueOf(vaisseauSelectionne);

            Vaisseau vaisseau = null;
            switch (typeVaisseauSelectionne) {
                case CHASSEUR:
                    vaisseau  = vaisseauChasseur;
                    break;
                case FREGATE:
                    vaisseau = vaisseauFregate;
                    break;
                case CROISEUR:
                    vaisseau = vaisseauCroiseur;
                    break;
                case CARGO:
                vaisseau = vaisseauCargo;
                    break;
                case VAISSEAUMONDE:
                vaisseau = vaisseauMonde;
                    break;
                default:
                    break;
            }

            PlaneteTellurique planete = null;
            switch (planeteSelectionne) {
                case "Mercure":
                    planete = Mercure;
                    break;
                case "Venus":
                    planete = Venus;
                    break;
                case "Terre":
                    planete = Terre;
                    break;
                case "Mars":
                    planete = Mars;
                    break;
            }
            planete.acceuillirVaisseau(vaisseau);
            int tonnageRejeter = vaisseau.emporterCargo(tonnageCargo);  
            System.out.println("Le vaisseau " + vaisseauSelectionne + " a refusé de transporter " + tonnageRejeter + 
            " tonnes.");
            
            System.out.println("Le type de vaisseau choisi est : " + vaisseau.typeVaisseau);
            
            if(!planete.restePlace()) {
                System.out.println("Plus de place, le vaisseau ne peut pas se poser dans ma baie.");
            }

            System.out.println("Voulez-vous recommencer ? (oui/non)");
            recommencer = sc.nextLine();
        } while (recommencer.equals("oui"));
    }
}
