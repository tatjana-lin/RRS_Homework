package Homeworks.HW11_1;

public class Fighter {
//    Create a function that returns the name of the winner in a fight between two fighters.
//Each fighter takes turns attacking the other and whoever kills the other first is victorious.
// Death is defined as having health <= 0.
//Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0.
// You can mutate the Fighter objects.

//Your function also receives a third argument, a string, with the name of the fighter that attacks first.

//Example:
//  declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
//  Lew attacks Harry; Harry now has 3 health.
//  Harry attacks Lew; Lew now has 6 health.
//  Lew attacks Harry; Harry now has 1 health.
//  Harry attacks Lew; Lew now has 2 health.
//  Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
//public class Fighter {
//  public String name;
//  public int health, damagePerAttack;
//  public Fighter(String name, int health, int damagePerAttack) {
//    this.name = name;
//    this.health = health;
//    this.damagePerAttack = damagePerAttack;
//  }
//}

    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    // решение от ChatGPT :))
    public static String declare_winner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = fighter1.name.equals(firstAttacker) ? fighter1 : fighter2;
        Fighter defender = attacker == fighter1 ? fighter2 : fighter1;

        while (true) {
            defender.health -= attacker.damagePerAttack;
            if (defender.health <= 0) return attacker.name;

            // Меняем роли
            Fighter temp = attacker;
            attacker = defender;
            defender = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(declare_winner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));

    }

}



