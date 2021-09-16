import java.util.Scanner;

public class phuongtrinhbacnhat {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap so a ");
        a = scanner.nextFloat();
        System.out.println(" nhap so b ");
        b = scanner.nextFloat();

        if (a == 0 && b == 0) {
            System.out.println("Phuong tring vo so nghiem");
        } else {
            if (a == 0 && b != 0) {
                System.out.println("Phuong Trinh Vo Nghiem");
            } else {
                System.out.println("Phuong trinh co nghiem x = " + (-b / a));
            }
        }
    }
}
