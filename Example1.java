package Homework_NestedForLoop;

public class Example1 {

    public static void main(String[] args) {

        int data[][] = new int[4][4];
        data[0][0] = 5;
        data[0][1] = 10;
        data[0][2] = 15;
        data[0][3] = 20;

        data[1][0] = 25;
        data[1][1] = 30;
        data[1][2] = 35;
        data[1][3] = 40;

        data[2][0] = 45;
        data[2][1] = 50;
        data[2][2] = 55;
        data[2][3] = 60;

        data[3][0] = 65;
        data[3][1] = 70;
        data[3][2] = 75;
        data[3][3] = 80;


        for (int i = 0; i < data.length; i++) {

            for (int j = 0; j < data.length; j++) {

                System.out.print(data[i][j] + " ");
            }

            System.out.println();
        }
    }
}