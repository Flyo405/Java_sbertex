package TaskThree;

public class TaskThree{
    public static void main (String[] args) {
        System.out.println("Простые числа в промежутке [2, 100]: ");
        for (int i = 2; i <= 100; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean Prime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
