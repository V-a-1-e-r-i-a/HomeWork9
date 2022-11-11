public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double [] number2 = {1.57, 7.654, 9.986};

        int[] number3 = {1, 2, 4, 56, 74, 92, 36};

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i <= 2; i++) {
            if (i != 2) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.println(number[i]);
            }
        }

        for (int i = 0; i <= 2; i++) {
            if (i != 2) {
                System.out.print(number2[i] + ", ");
            } else {
                System.out.println(number2[i]);
            }
        }

        for (int i = 0; i <= 6; i++) {
            if (i != 6) {
                System.out.print(number3[i] + ", ");
            } else {
                System.out.println(number3[i]);
            }
        }


        //Задача 3
        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.println(number[i]);
            }
        }

        for (int i = 2; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number2[i] + ", ");
            } else {
                System.out.println(number2[i]);
            }
        }

        for (int i = 5; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number3[i] + ", ");
            } else {
                System.out.println(number3[i]);
            }
        }

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < number.length; i++) {
            if (number [i] % 2 != 0){
                number [i] += + 1;}
            System.out.print(number[i] + ", ");
        }
    }
}
