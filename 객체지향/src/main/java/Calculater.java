/**
 * Created by seonghohong on 2017. 3. 30..
 */
public class Calculater {

    private int num1, num2;

    public Calculater(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        int addResult = num1+num2;
        return addResult;
    }

    public int min() {
        int minResult = num1-num2;
        return minResult;
    }

    public  int mul() {
        int mulReuslt = num1*num2;
        return mulReuslt;
    }

    public int div() {
        int divResult = num1/num2;
        return divResult;
    }


    public int bigNum() {
        int bigNum;

        if(num1>=num2) bigNum = num1;
        else bigNum = num2;

        return bigNum;
    }

}
