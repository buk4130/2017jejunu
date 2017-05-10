package View;

/**
 * Created by seonghohong on 2017. 5. 3..
 */
public class EvenNumView extends ViewWork<Integer>{
    private int evenNum;

    public void setResult(Integer evenNum) {
        this.evenNum = evenNum;
    }

    public void showResult() {
        System.out.println("리스트의 짝수의 개수는 "+evenNum+" 입니다");
    }
}
