/**
 * Created by seonghohong on 2017. 4. 19..
 */
public class 주문결과 {
    private int 음식코드;
    private int 음식개수;

    private String 주문음식;
    private int 주문가격;

    private 차림표 메뉴;

    //음식코드와 메뉴 정보를 받아 옵니다
    public 주문결과(int 음식코드, int 음식개수, 차림표 메뉴) {
        this.메뉴 = 메뉴;
        this.음식코드 = 음식코드;
        this.음식개수 = 음식개수;
    }

    //주문계산을 하는 메소드 입니다
//    private void 주문계산() {
//
//        //코드에 맞는 메뉴를 받아옵니다
//        if (음식코드 == 1) 주문음식 = 메뉴.메뉴1얻기();
//        else if (음식코드 == 2) 주문음식 = 메뉴.메뉴2얻기();
//        else if (음식코드 == 3) 주문음식 = 메뉴.메뉴3얻기();
//        else 주문음식 = "잘못 주문 하셧습니다.";
//
//        //메뉴의 음식단가를 받아옵니다
//        int 음식단가;
//        if (음식코드 == 1) 음식단가 = 메뉴.메뉴1가격얻기();
//        else if (음식코드 == 2) 음식단가 = 메뉴.메뉴2가격얻기();
//        else if (음식코드 == 3) 음식단가 = 메뉴.메뉴3가격얻기();
//        else 음식단가 = 0;
//
//        //주문가격을 가지고 옵니다
//        주문가격 = 음식단가 * 음식개수;
//    }

//    //주문결과를 보여줍니다
//    public void 주문결과보여주기() {
//        주문계산();
//        System.out.println("주문하신 음식은 " + 주문음식 + " " + 음식개수 + "개이며 금액은 " + 주문가격 + "원입니다!");
//    }
}
