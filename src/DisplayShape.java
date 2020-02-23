import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice  = input.nextInt();

        switch (choice){
            case 1:
                for(int i = 0; i < 3; i++){
                    for (int j = 0; j < 5; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++){
                    for (int j = 1; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("---------------");
                for (int i = 5; i >= 1; i--){
                    for (int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println("----------------");
                for (int i = 5; i > 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= 5 - i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("--------------------");
                for (int i = 1; i <= 5; i++){
                    for (int j = 1; j <= i; j++){
                        System.out.print(" ");
                    }
                    for (int n = 5; n >= i; n--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++){
                    // 5 la chieu cao cua tam giac.
                    for (int j = 1; j <= (2*5) - 1; j++){
                        if (j >= 5 - ( i - 1) && j <= 5 + (i - 1)){
                            System.out.print("*");
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }
}
