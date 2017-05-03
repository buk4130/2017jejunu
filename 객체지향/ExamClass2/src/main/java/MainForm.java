import java.util.Scanner;

/**
 * Created by seonghohong on 2017. 3. 16..
 */
public class MainForm {

    public static void main(String arg[]) {
        //while 문을 이용한 반복

        int i = 1;
        while(i <= 10) {
            System.out.println("while을 이용한 출력 : " + i);
            i = i + 1;
        }

        System.out.println("==================================");

        //for 문을 이용한 반복
        for(int j=0; j<=10; j++){
            System.out.println("for을 이용한 출력 : " + j);
        }

        System.out.println("==================================");

        //do를 이용한 반복
        int a = 1;
        do {
            System.out.println("do를 이용한 출력 : " +a);
            a = a + 1;
        }while(a <= 10);

        System.out.println("==================================");

        //키보드에서 숫자를 받아들이기

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요");
        int num1 = scanner.nextInt();

        //입력한 숫자까지의 합

        int sum = 0;

        for(int b=0; b<=num1; b++){
            sum = sum + b;
        }


        System.out.println("입력하신 숫자까지의 합은 " + sum);

        System.out.println("============3번============");

        //경우의 수 구하기
        int forCount = 0;

            //200원 경우의수
            for(int a1 = 0; a1*200 < 10000; a1++){
                //300원 경우의수
                for(int a2 = 0; a2*300 < 10000; a2++){
                    //500원 경우의수
                    for(int a3 = 0; a3*500 < 10000; a3++){

                        int result = a1*200 + a2*300 + a3*500;

                        if(result == 10000) {
                            System.out.println("200원 : "+ a1 +" 개 " +
                                    "300원 : "+ a2 +" 개" +
                                    "500원 : "+ a3 +" 개" +10
                                    "일때 10000원이 충족 된다.");

                            forCount = forCount + 1;
                        }
                    }
                }
            }

        System.out.println("모든 경우의 수는 "+ forCount +"개 입니다.");


        System.out.println("============4번============");
        //구구단

        System.out.println("몇단을 출력 할까요? ");
        int inputNum = scanner.nextInt();

        for(i=1; i<10; i++){

            int result = inputNum*i; //구구단 연산

            System.out.println(""+inputNum+" 의 "+ i +"곱은 "+ result +" 입니다");
        }
    }
}
