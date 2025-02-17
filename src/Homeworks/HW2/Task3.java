package Homeworks.HW2;

public class Task3 {

    public static void main(String[] args) {
        /*
        Задача №3
Создать программу дележа добычи на пиратском корабле.
По обычаю, половина добычи идет владельцу корабля,
половина оставшегося — капитану,
остальное делится поровну между всеми членами команды, включая капитана.

Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

Дополнительное задание со звездочкой
Попробовать придумать как программа может проверить правильность дележа.
         */

        int plunder = 5000;
        int numberOfPirates = 50;

        double ownersShare = plunder / 2.0;
        double captainsShare = (plunder - ownersShare) / 2.0;
        double piratesShare = (plunder - ownersShare - captainsShare) / (numberOfPirates - 1);

        System.out.println("Owner's share is " + ownersShare + " piasters");
        System.out.println("Captain's share is " + (captainsShare + piratesShare) + " piasters");
        System.out.println("Pirate's share is " + piratesShare + " piasters");
        System.out.println("Is it fair? " + (ownersShare + captainsShare + piratesShare * (numberOfPirates - 1) == plunder));

        piratesShare = (plunder - ownersShare - captainsShare) / numberOfPirates;

        System.out.println("Jack Sparrow's share is " + (ownersShare + captainsShare + piratesShare));
        System.out.println("Is it fair? " + (ownersShare + captainsShare + piratesShare * numberOfPirates == plunder));

        //        решение преподавателя

        System.out.println("--------------------Решение преподавателя----------------------");

        int totalLoot = 2599;
        int numberOfPirates1 = 37; // без владельца и капитана
        int remainder = totalLoot; // остаток от деления

        int ownerShare = remainder / 2;
        remainder = remainder - ownerShare;
        int captainShare = remainder / 2;
        remainder = remainder - captainShare;
        int eachPirateShare =  remainder / (numberOfPirates1 + 1);
        remainder = remainder % (numberOfPirates1 + 1);
        captainShare += eachPirateShare;

        System.out.println("Total loot: " + totalLoot);
        System.out.println("Owner: " + ownerShare);
        System.out.println("Captain: " + captainShare);
        System.out.println("Each pirate: " + eachPirateShare);
        System.out.println("Remainder: " + remainder);

        System.out.println("Captain Jack Sparrow: " + (ownerShare + captainShare));
        System.out.println("Total loot check: " + (ownerShare + captainShare + eachPirateShare * numberOfPirates1 + remainder));

    }


}
