package homework4;

public class Main {
    public static void main(String[] args) {

        /*Паралелепіпед:
          Створити у новому класі main-метод;
          Створити три змінні для зберігання сторін паралелепіпеда;
          Порахувати обсяг у змінній volume;
          Вивести на екран змінну volume у вигляді:
          System.out.println("Об'єм паралелепіпеда = " + volume);
          Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;*/
//      Parallelepiped:

        int adgeA = 45;
        int adgeB = 30;
        int adgeD = 25;

        System.out.println("volumeParallelepiped = " + adgeA * adgeB * adgeD);
        System.out.println();
        System.out.println("lengthAllAdges = " + 4 * (adgeA + adgeB + adgeD));
        System.out.println();


        /*За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
          З кожного боку боролися 3 типи воїнів з такими показниками атаки:
         Лі:
        воїн - 13
        лучник - 24
        вершник - 46
         Мінь:
        воїн - 9
        лучник - 35
        вершник - 12
        Розрахувати: загальний показник атаки для обох династій, якщо відомо,
        що воїнів династії Лі кожного типу було 860,
        а кількість воїнів династії Мінь кожного типу в півтора рази більша.
        Вивести в консоль значення загальної атаки кожної армії;*/
//       ChineseDynasty:

//          Li0
        int warriorLiIndexAttacks = 13;
        int archerLiIndexAttacks = 24;
        int riderLiIndexAttacks = 46;
        System.out.println();
        System.out.println();
//          Min
        int warriorMinIndexAttacks = 9;
        int archerMinIndexAttacks = 35;
        int riderMinIndexAttacks = 12;
        System.out.println();
        System.out.println();
        int liWarriorsAllBranchQuantity = 860;
        System.out.println("minWarriorsAllBranchQuantity = " + liWarriorsAllBranchQuantity * 1.5 );
        int minWarriorsAllBranchQuantity = 1290;
        System.out.println();
        System.out.println("liGeneralIndexAttacks = " + liWarriorsAllBranchQuantity * (warriorLiIndexAttacks +
                archerLiIndexAttacks + riderLiIndexAttacks));
        System.out.println();
        int liGeneralIndexAttacks = 71380;
        System.out.println("minGeneralIndexAttacks  = " + minWarriorsAllBranchQuantity * (warriorMinIndexAttacks +
                archerMinIndexAttacks + riderMinIndexAttacks));
        System.out.println();






       /* int x = 6;
        int y = 12;
                                           6  + 13  +  8  -  9  + 13  -  8  +  11 +  7
         System.out.println("result =" + (x++ + ++y + ++x - ++x + y-- - --x + --y + --x)); //6+13+8-9+13-8+11+7=41
         6 + 11 +  5  - 12 (x=11)
         x+=--y + --x - y++; = 11   6+11 17+5 22-12 = 11. but "++" (outside expression)
         "++" after "y" therefore it hasn't to add to meaning "x", so "x" equal 11
        System.out.println(" x = " + x);
         6 + 11 +  5  - 12 (x=10)
         x+=--y + --x - ++y; = 10   6+11 17+5 22-12 = 10. but "++" (inside expression)
         "++" before "y"  therefore it has to add to meaning "x", so "x" equal 10
        System.out.println(" x = " + x);
        System.out.println();
        x += x + --y + --x - y++ + --y + --x - ++y; = 20
        System.out.println("x =" + x);*/
        /*System.out.println();
        System.out.println();

        int resultNumber = (int) ((Math.random() * 16) + 15);
        System.out.println(resultNumber);

        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println((int) ((Math.random() * 16) + 15));
        System.out.println((int) ((Math.random() * 16) + 15));*/


    }
}