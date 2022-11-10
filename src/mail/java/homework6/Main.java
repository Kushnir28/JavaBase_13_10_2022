package homework6;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів
//        не траплялося нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.


          int counterShuttles = 0;
          int numberShuttles = 100;
        for (int i = 1; counterShuttles < numberShuttles; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14)
            {
                continue;
            }

            System.out.println("Shuttle number: " + i);
            counterShuttles++;
            System.out.println(counterShuttles);













//        Последованность Фибоначчи:

//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55



//        int num1 = 0;
//        int num2 = 1;
//        int sum;
//        System.out.print(num1 + " " + num2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;

        }











    }



}
