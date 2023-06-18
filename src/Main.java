public class Main {
    public static void main(String[] args) {

        int remains = 300; // Текущий остаток на счете

        int replenishment = 1050; // Сумма пополнения

        int percent;
        if (replenishment >= 1000) {
            percent = replenishment / 100;
        } else {
            percent = 0;
        }

        int bonus = (replenishment + percent + remains);

        System.out.printf(" Баланс на счете " + bonus);
        System.out.println();
        System.out.printf(" Итого начисленных бонусов при пополнении " + percent);
    }
}