import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static double[] createRandom() {
        double[] arr = new double[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] =    Math.floor(Math.random()*100);
            System.out.print(arr[i]+ " ");
        }
        return arr;

    }
    public static void main(String[] args) {
        double[] arr = createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số : " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
