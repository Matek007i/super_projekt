package zaddom3103;

/*Stwórz metodę `containTheSameAmountOfSpaces`
        - która przyjmie za parametry dwa łańcuchy znaków, a która zwróci odpowiedź na pytanie, czy obydwa łańcuchy zawierają tyle samo spacji.*/

public class Zad0302 {
    public static void main(String[] args) {
        System.out.println(containTheSameAmountOfSpaces("ala ma ", "   "));
    }

    public static boolean containTheSameAmountOfSpaces(String a, String b){
        return countChar(a, ' ') == countChar(b, ' ');
    }

    public static int countChar(String a, char ch) {
/*        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;*/

        return (int) a.chars()
                .filter(e -> e == ch)
                .count();
    }
}
