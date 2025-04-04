public class HelloUniverse {
    public static void main(String[] args) throws Exception {
        
        int annéeNum = 2003;
        int annéeNum1 = 2003;
        int annéeNum2 = 2014;

        int value = 8;
        int value1 = 9;

        if (annéeNum < 2006) {
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d",annéeNum1, value1);
        } else {
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : %d",annéeNum2, value);
        }

    }
}
