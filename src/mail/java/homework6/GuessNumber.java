package homework6;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {





//                                         Вгадай число

//            Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//            Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


        Scanner scanner = new Scanner(System.in);

        int countChance = 0;
        int numberWin = 5;
        System.out.println(" Please enter your number in range from 1 to 10");
        System.out.println(" You have 3 attempts, Good luck ");
        while (-3 < countChance--) {
            int randomNumber;
            if (scanner.hasNextInt()) {
                randomNumber = scanner.nextInt();
                System.out.println(" You've entered: " + randomNumber);
            } else {
                System.out.println(" You've written with letters, please restart the game," +
                        "and enter the integer, in range from 1 to 10 ");
                break;
            }
            if (randomNumber > 10 || randomNumber < 1) {
                System.out.println(" You've entered the integer out of range, please restart" +
                        " the game, and enter the integer from 1 to 10 ");
                break;
            } else if (numberWin == randomNumber) {
                System.out.println(" You've won, congrats ");
                break;
            } else if (randomNumber < numberWin) {
                System.out.println("You've missed, my number higher, try again. Remained: "
                        + countChance + " " + "attempts");
                continue;
            } else if (randomNumber > numberWin) {
                System.out.println(" You've missed, my number lower, try again. Remained: "
                        + countChance + " " + " attempts ");
                continue;
            }
            countChance--;

        }






























    }
}
