package by.it.shabalkina.lesson02;


import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/

        import java.util.Scanner;
        class TaskC1 {
            public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int a=in.nextInt();//считываем целое число a
                int b=in.nextInt();//считываем целое число
                int c=a+b;
                System.out.println("Sum = "+c);


            }
}






