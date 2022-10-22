package homework2;

public class Main {
    public static void main(String[] args) {

        String position = "My position";
        byte latitude1 = 46;
        byte latitude2 = 34;
        float latitude3 = 22.41F;
        short longitude1 = 329;
        byte longitude2 = 12;
        float longitude3 = 44.58F;
        char degreeSymb = '\u00B0';
        char minutesSymb = '\u2032';
        char secondSymb = '\u2033';

        System.out.println(position);
        System.out.println( " latitude:  " + latitude1 + degreeSymb + latitude2 + minutesSymb + latitude3 + secondSymb);
        System.out.println( " longitude: " + longitude1 + degreeSymb + longitude2 + minutesSymb + latitude3 + secondSymb);




    }
}
