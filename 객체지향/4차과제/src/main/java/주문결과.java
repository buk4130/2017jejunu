/**
 * Created by seonghohong on 2017. 4. 25..
 */
public class 주문결과 {
    private int 음식1개수;
    private int 음식2개수;
    private int 음식3개수;

    private int 주문가격;

    private 메뉴판 메뉴;

    //음식코드와 메뉴 정보를 받아 옵니다
    public 주문결과(int 음식1개수, int 음식2개수, int 음식3개수, 메뉴판 메뉴) {
        this.메뉴 = 메뉴;
        this.음식1개수 = 음식1개수;
        this.음식2개수 = 음식2개수;
        this.음식3개수 = 음식3개수;
    }

    //주문계산을 하는 메소드 입니다
    private void 주문계산() {

        int 음식1단가 = 메뉴.메뉴1가격얻기();
        int 음식2단가 = 메뉴.메뉴2가격얻기();
        int 음식3단가 = 메뉴.메뉴3가격얻기();

        주문가격 = (음식1단가 * 음식1개수) + (음식2단가 * 음식2개수) + (음식3단가 * 음식3개수);
    }

    //주문결과를 보여줍니다
    public void 주문결과보여주기() {
        주문계산();
        System.out.println("주문하신 음식가격은 " + 주문가격 + "원입니다!");
    }
}
