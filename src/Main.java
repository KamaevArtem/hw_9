public class Main {
    public static void main(String[] args) {
        //Задача 1
        int [] expenses = {62, 25, 73, 31, 42};
        int sum = 0;
        for (int element : expenses){
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задача 2
        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];
        for (int expens : expenses) {
            if (expens > maxExpenses) {
                maxExpenses = expens;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила "+maxExpenses+" рублей");
        for (int expens : expenses) {
            if (expens < minExpenses) {
                minExpenses = expens;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "+minExpenses+" рублей");
        //Задача 3
        double averageExpenses = 0;
        sum = 0;
        for (int expens : expenses) {
            sum = sum + expens;
        }
        averageExpenses = (double) sum / expenses.length;
        System.out.println(averageExpenses);
        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]+" ");
        }

    }
}