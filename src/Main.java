import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char users;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli");
        number1 = input.nextDouble();

        System.out.println("Ievadi otro skaitli");
        number2 = input.nextDouble();

        System.out.println("Izvēlies darbību: +, -, *, vai /");
        users= input.next().charAt(0);



        switch (users) {


            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;


            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;


            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;


            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Nesapratama darbība, mēģiniet velreiz");
                break;
        }

        input.close();
    }
}