package homework6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Shuttles {

    public static void main(String[] args) {




//                                Shuttle numbering.
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів
//        не траплялося нещасливих чисел. Напишіть функцію, яка виводить усі номери таких шатлів.


          int counterShuttles = 0;
          int numberShuttles = 100;
        for (int i = 1; counterShuttles < numberShuttles; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14) {
                continue;
            }

            System.out.println("Shuttle number: " + i);
            counterShuttles++;
            System.out.println(counterShuttles);
            }

    }


}

