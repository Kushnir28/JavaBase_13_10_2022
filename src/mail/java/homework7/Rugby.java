package homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {


//                                Регби
//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.


          int sumAgeTitans = 0;
          int[] titans = new int[25];
        System.out.println(" The age titans' players: ");
        for (int i = 0; i < titans.length; i++) {
            titans[i] = (int) ((Math.random() * 22) + 18);
                if (i == titans.length - 1) {
                    System.out.print(titans[i]);
                } else {
                    System.out.print(titans[i] + ",");
                }
            sumAgeTitans = sumAgeTitans + titans[i];
        }
        System.out.println();
        System.out.println(" The age arithmetic mean for titans' player: " + (sumAgeTitans / titans.length));
        System.out.println();

        int sumAgeEagles = 0;
        int[] eagles = new int[25];
        System.out.println(" The age eagles' players: ");
        for (int i = 0; i < eagles.length; i++) {
            eagles[i] = (int) ((Math.random() * 22) + 18);
            if (i == eagles.length - 1) {
                System.out.print(eagles[i]);
            } else {
                System.out.print(eagles[i] + ",");
            }
            sumAgeEagles = sumAgeEagles + eagles[i];
        }
        System.out.println();
        System.out.println(" The age arithmetic mean for eagles' player: " + (sumAgeEagles / eagles.length));



    }
    
}
