import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.floor(Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can chen");
        double x = scanner.nextDouble();
        System.out.println("nhap vi tri can chen");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length - 1) {
            System.out.println(" khong duoc chen vao mang");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (index == i) {
                    array[i] = x;
                }
                System.out.print(array[i] + " ");
            }
        }
    }
}