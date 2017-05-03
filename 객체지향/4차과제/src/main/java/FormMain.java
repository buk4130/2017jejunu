/**
 * Created by seonghohong on 2017. 4. 25..
 */
public class FormMain {
    private static 메뉴판 메뉴;
    private static 음식주문 주문;
    private static 주문결과 주문결과주기;

    private static int 음식1개수;
    private static int 음식2개수;
    private static int 음식3개수;

    public static void main(String args[]) {
        컨트롤러();
    }

    public static void 컨트롤러() {
        //메뉴판은 메뉴를 관리하는 클래스입니다.
        메뉴 = new 메뉴판("정식", "갈비탕", "비빔밥", 9000, 8000, 7000);
        메뉴.메뉴판보여주기();

        //주문은 주문을 입력하는 클래스 입니다.
        주문 = new 음식주문();
        음식1개수 = 주문.음식개수받기(메뉴.메뉴1얻기());
        음식2개수 = 주문.음식개수받기(메뉴.메뉴2얻기());
        음식3개수 = 주문.음식개수받기(메뉴.메뉴3얻기());


        //주문결과주기는 주문결과를 계산하고 보여주는 클래스 입니다.
        주문결과주기 = new 주문결과(음식1개수, 음식2개수, 음식3개수, 메뉴);
        주문결과주기.주문결과보여주기();
    }
}

