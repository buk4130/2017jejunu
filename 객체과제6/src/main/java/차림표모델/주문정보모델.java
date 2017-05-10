package 차림표모델;

/**
 * Created by samsung on 2017-05-10.
 */
public class 주문정보모델 {
    private 차림표 차림;

    private int 음식코드;
    private int 음식총가격;
    private int 음식개수;

    public 주문정보모델(차림표 차림) {this.차림 = 차림;}


    public void 주문정보입력(int 음식총가격, int 음식코드, int 음식개수) {
        this.음식총가격 = 음식총가격;
        this.음식코드 = 음식코드;
        this.음식개수 = 음식개수;
    }

    public String 주문음식이름얻기(){return 차림.코드음식얻기(음식코드);}

    public int 주문음식개수얻기(){return 음식개수;}

    public int 주문가격얻기(){return 음식총가격;}
}
