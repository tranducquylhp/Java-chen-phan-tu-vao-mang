import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 7, 3, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri muon them: ");
        int x = scanner.nextInt();
        System.out.println("Nhap vi tri muon them: ");
        int index = scanner.nextInt();
        try {
            System.out.println("Mang hien tai la: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            int[] temp = new int[arr.length + 1];
            if (index==0){
                temp[index] = x;
            } else {
                for (int i = 0; i < temp.length; i++) {
                    if (i<index){
                        temp[i] = arr[i];
                    } else if (i > index){
                        temp[i] = arr[i-1];
                    } else {
                        temp[i] = x;
                    }
                }
            }
            System.out.println();
            System.out.println("Mang sau khi da them la: ");
            for (int i=0; i<temp.length; i++){
                System.out.print(temp[i]+" ");
            }
        } catch (Exception e) {
            System.err.println("Không có vị trí " + index + " để chèn");
        }
    }
}
