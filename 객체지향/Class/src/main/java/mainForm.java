import java.util.Scanner;

/**
 * Created by seonghohong on 2017. 3. 15..
 */
public class mainForm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한가지 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("입력한 숫자는 " + num1);


        System.out.println("두가지 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.print("입력한 숫자는 " + num2);
        System.out.println(" ,"  + num3);


        System.out.println("이름을 입력하세요 : ");
        String name = scanner.next();
        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.println("Name : " + name);
        System.out.println("age : " + age);


        System.out.println("숫자의 합, 차, 곱, 몫, 나머지할 두 숫자를 이렵하세요.");
        System.out.println("첫번째 숫자 : ");
        int num4 = scanner.nextInt();
        System.out.println("두번쨰 숫자 : ");
        int num5 = scanner.nextInt();

        int sum = num4 + num5;
        int distance = num4 - num5;
        int mul = num4 * num5;
        int div = num4 / num5;
        int remainder = num4 % num5;

        System.out.println("숫자의 합 " + sum);
        System.out.println("숫자의 차 " + distance);
        System.out.println("숫자의 곱 " + mul);
        System.out.println("숫자의 몫 " + div);
        System.out.println("숫자의 합 " + remainder);

    }
}
