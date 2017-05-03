package view;

/**
 * Created by seonghohong on 2017. 4. 6..
 */
public class AskView {

    private String whatInput;

    public AskView(String whatInput) {
        this.whatInput = whatInput;
    }

    public void ask() {
        System.out.println(""+whatInput+"을 입력해 주세요!");
    }
}
