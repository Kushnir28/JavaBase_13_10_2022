package homework5;

import java.util.Scanner;



public class Main {
    public static void Main(String[] args) {

//        ввести ім'я першої команди
//        ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)
//        ввести ім'я другої команди
//        ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)
//        підрахувати середнє арифметичне балів кожної команди
//        порівняти результати команд та визначити переможця
//        вивести у консоль:
//        "Перемогла команда" + teamName + "набрала" + result + "очків"

        Scanner sc = new Scanner(System.in);
        String teamName1 = sc.nextLine();
        System.out.println("Team # 1: " + teamName1);
        int dreamPlayer1 = 22;
        if (sc.hasNextInt()) {
            dreamPlayer1 = sc.nextInt();
            System.out.println(dreamPlayer1);
        }  else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }
        int dreamPlayer2 = 18;
        if (sc.hasNextInt()) {
            dreamPlayer2 = sc.nextInt();
            System.out.println(dreamPlayer2);
        }  else {
            System.out.println("Wrong data, enter integer data");
            System.exit(0);
        }


        int thirdPlayer = sc.nextInt();
        System.out.println("3 player frags = " + thirdPlayer);
        int fourthPlayer = sc.nextInt();
        System.out.println("4 player frags = " + fourthPlayer);
        int fifthPlayer = sc.nextInt();
        System.out.println("5 player frags = " + fifthPlayer);
        sc.nextLine();
        String secondTeam = sc.nextLine();
        System.out.println("Starteam = " + secondTeam);
        int player1 = sc.nextInt();
        System.out.println("1 player frags = " + player1);
        int player2 = sc.nextInt();
        System.out.println("2 player frags = " + player2);
        int player3 = sc.nextInt();
        System.out.println("3 player frags = " + player3);
        int player4 = sc.nextInt();
        System.out.println("4 player frags = " + player4);
        int player5 = sc.nextInt();
        System.out.println("5 player frags = " + player5);

















    }
}