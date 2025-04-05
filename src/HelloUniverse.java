public class HelloUniverse {
    public static void main(String[] args) {
        
        short annéeNum = 1700;


        int value = 0;

        if (annéeNum < 1600 || annéeNum > 2020) {
                System.out.printf("Le programme ne peut pas fournir de résultat pour l'année %d",annéeNum);
        } 
        
        else {

            
            if (annéeNum < 1700) {
                value = 7;
            }
            if (annéeNum < 2006) {
                value = 9;
            } 

            else{
                value = 8;
            }

            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d",annéeNum, value);
        }


    }


}
