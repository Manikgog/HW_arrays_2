import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static String toMoneyFormat(float cost){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(cost);
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int[] arr = generateRandomArray();
        int costsPerMonth = 0;
        for (int costsPerDay : arr) {
            costsPerMonth += costsPerDay;
        }
        System.out.println("Сумма затрат за месяц составила " + toMoneyFormat(costsPerMonth));
    }

    public static void task2(){
        System.out.println("\nЗадача 2.");
        int[] arr = generateRandomArray();
        int minCost = arr[0];
        int maxCost = arr[0];
        for (int day = 1; day < arr.length; day++) {
            if(minCost > arr[day]){
                minCost = arr[day];
            }
            if(maxCost < arr[day]){
                maxCost = arr[day];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + toMoneyFormat(minCost)
                + "\nМаксимальная сумма трат за день составила " + toMoneyFormat(maxCost));
    }

    public static void task3(){
        System.out.println("\nЗадача 3.");
        int[] arr = generateRandomArray();
        float averageCost;
        int costsPerMonth = 0;
        for (int costsPerDay : arr) {
            costsPerMonth += costsPerDay;
        }
        averageCost = costsPerMonth/(float)arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + toMoneyFormat(averageCost));
    }

    public static void task4(){
        System.out.println("\nЗадача 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println("\n");
    }

}