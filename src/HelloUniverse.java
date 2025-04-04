public class HelloUniverse {
    public static void main(String[] args) throws Exception {
        String phraseOne = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :";
        int value = 8;
        System.out.println( phraseOne + value);
        String phraseTwo = "Il y a quelques années cependant, elles étaient au nombre de :";
        value = ++value;
        System.out.println( phraseTwo + value);
    }
}
