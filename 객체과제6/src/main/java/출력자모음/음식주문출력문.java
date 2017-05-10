package 출력자모음;

/**
 * Created by samsung on 2017-05-10.
 */
public class 음식주문출력문 extends 출력자<String> {
    private  String 개수주문대사;

    protected void 출력값설정(String 개수주문대사) {this.개수주문대사 = 개수주문대사;}

    protected void 출력() {System.out.println(개수주문대사);}
}
