public class Main {
    public static void main(String[] args) {

        int x = 300; // Текущий остаток на счете

        int y = 1000; // Сумма пополнения

        int percent;
        if (y >= 1000) {
            percent = y / 100;
        } else {
            percent = 0;
        }

        int bonus = (y + percent + x);

        System.out.printf(" Баланс на счете " + bonus);
        System.out.println();
        System.out.printf(" Итого начисленных бонусов при пополнении " + percent);
    }
}