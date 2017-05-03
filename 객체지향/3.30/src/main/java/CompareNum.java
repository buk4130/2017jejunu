/**
 * Created by seonghohong on 2017. 3. 30..
 */
public class CompareNum {

    private int num1, num2, num3;

    private int firstNum;
    private int secondNum;

    public CompareNum(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getFirstNum() {

        if(num1 >= num2) {
            if (num1 > num3) {firstNum = num1;}
            else {firstNum = num3;}
        } else {
            if (num2 > num3) {firstNum = num2;}
            else {firstNum = num1;}
        }

        return firstNum;
    }

    public int getSecondNum() {

        if(num1 == firstNum){
            if(num2 > num3){secondNum = num2;}
            else {secondNum = num3;}
        } else if(num2 == firstNum){
            if (num1 > num3){secondNum = num1;}
            else {secondNum = num3;}
        } else {
            if (num1 > num2) {secondNum = num1;}
            else{secondNum = num3;}
        }

        return secondNum;
    }
}
