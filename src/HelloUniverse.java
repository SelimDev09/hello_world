public class HelloUniverse {
    public static void main(String[] args) {

        PlaneteTellurique Mercure = new PlaneteTellurique("Mercure");
        PlaneteTellurique Venus = new PlaneteTellurique("Venus");
        PlaneteTellurique Terre = new PlaneteTellurique("Terre");
        PlaneteTellurique Mars = new PlaneteTellurique("Mars");
        PlaneteGazeuse Jupiter = new PlaneteGazeuse("Jupiter");
        PlaneteGazeuse Saturne = new PlaneteGazeuse("Saturne");
        PlaneteGazeuse Neptune = new PlaneteGazeuse("Neptune");
        PlaneteGazeuse Uranus = new PlaneteGazeuse ("Uranus");
        Planete X = new Planete("X");

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
    
    
        Atmoshphere atmosphere = new Atmoshphere();
        atmosphere.tauxHydrogene = 83f;
        atmosphere.tauxHelium = 15f;
        atmosphere.tauxMethane = 2.5f;
        
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
    */     
        VaisseauDeguerre vaisseauTypeOne = new VaisseauDeguerre();
        vaisseauTypeOne.typeVaisseau = "Chasseur";
        vaisseauTypeOne.blindage = 156;
        vaisseauTypeOne.resistanceDuBouclier = 2;
        
        VaisseauCivil vaisseauTypeTwo = new VaisseauCivil();
        vaisseauTypeTwo.typeVaisseau = "Vaisseau-Monde";
        vaisseauTypeTwo.blindage = 4784;
        vaisseauTypeTwo.resistanceDuBouclier = 30;

        vaisseauTypeTwo.activerBouclier();
        vaisseauTypeOne.activerBouclier();

        vaisseauTypeOne.attack(vaisseauTypeTwo, "Lasers photoniques", 3);

        vaisseauTypeTwo.desactiverBouclier();

        System.out.println(vaisseauTypeTwo.resistanceDuBouclier);
        System.out.println(vaisseauTypeTwo.blindage);
    
    Vaisseau typeVaisseau1 = new Vaisseau();

        typeVaisseau1.nmbPassagers = 9;
        typeVaisseau1.typeVaisseau = "Frégate";
        
        
        Vaisseau typeVaisseau2 = new Vaisseau();
        
        typeVaisseau2.nmbPassagers = 42;
        typeVaisseau2.typeVaisseau = "Croisseur";

        /* 
        System.out.println("Le nombre d'humains ayant déjà séjourné sur "+ Mars.nom
        +" est actuellement de "
        + Mars.totalVisiteur +
        ".");
        */
        Mars.acceuillirVaisseau(vaisseauTypeTwo);

        Mars.acceuillirVaisseau(vaisseauTypeOne);
        
    }

}
