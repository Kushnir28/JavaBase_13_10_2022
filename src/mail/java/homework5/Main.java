package homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //        ввести ім'я першої команди
//        ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
//        ввести ім'я другої команди
//        ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
//        підрахувати середнє арифметичне балів кожної команди
//        порівняти результати команд та визначити переможця
//        вивести у консоль:
//        "Перемогла команда" + teamName + "набрала" + result + "очків"

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  team's name # 1 ");
        String dreamTeam = sc.nextLine();
        System.out.println("Team's name # 1: " + dreamTeam);

        System.out.println("Enter quantity frags for 1 player:");
        int dreamPlayer1 = 22;
        if (sc.hasNextInt()) {
            System.out.println("1 dream's player: " + dreamPlayer1);
        }  else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 2 player:");
        int dreamPlayer2 = 18;
        if (sc.hasNextInt()) {
            System.out.println("2 dream's player: " + dreamPlayer2);
        }  else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 3 player:");
        int dreamPlayer3 = 15;
        if (sc.hasNextInt()) {
            System.out.println("3 dream's player: " + dreamPlayer3);
        } else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 4 player:");
        int dreamPlayer4 = 28;
        if (sc.hasNextInt()) {
            System.out.println("4 dream's player: " + dreamPlayer4);
        } else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 5 player:");
        int dreamPlayer5 = 37;
        if (sc.hasNextInt()) {
            System.out.println("5 dream's player: " + dreamPlayer5);
        } else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter team's name # 2");
        String starTeam = sc.nextLine();
        System.out.println("Team's name # 2: " + starTeam);

        System.out.println("Enter quantity frags for 1 player:");
        int starPlayer1 = 41;
        if (sc.hasNextInt()) {
            System.out.println("1 star's player: " + starPlayer1);
        }  else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 2 player:");
        int starPlayer2 = 23;
        if (sc.hasNextInt()) {
            System.out.println("2 star's player: " + starPlayer2);
        }  else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 3 player:");
        int starPlayer3 = 17;
        if (sc.hasNextInt()) {
            System.out.println("3 star's player: " + starPlayer3);
        } else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 4 player:");
        int starPlayer4 = 33;
        if (sc.hasNextInt()) {
            System.out.println("4 star's player: " + starPlayer4);
        } else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();
        System.out.println("Enter quantity frags for 5 player:");
        int starPlayer5 = 39;
        if (sc.hasNextInt()) {
            System.out.println("5 star's player: " + starPlayer5);
        } else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        sc.nextLine();

        int arithmeticMeanDreamTeam = (dreamPlayer1 + dreamPlayer2 + dreamPlayer3 + dreamPlayer4 + dreamPlayer5) / 5;
        int arithmeticMeanStarTeam = (starPlayer1 + starPlayer2 + starPlayer3 + starPlayer4 + starPlayer5) / 5;
        int DreamTeam = arithmeticMeanDreamTeam;
        int StarTeam = arithmeticMeanStarTeam;

        if (DreamTeam > StarTeam) {
            System.out.println("DreamTeam is win");
        }  else if (DreamTeam < StarTeam) {
            System.out.println("StarTeam is win");
        }  else  (DreamTeam == StarTeam) {

        }

        {

        }











    }






}
