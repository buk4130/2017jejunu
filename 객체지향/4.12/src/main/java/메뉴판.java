/**
 * Created by seonghohong on 2017. 4. 19..
 */
public class 메뉴판 {

    private String 메뉴1;
    private String 메뉴2;
    private String 메뉴3;

    private int 메뉴1가격;
    private int 메뉴2가격;
    private int 메뉴3가격;

    public 메뉴판(String 메뉴1, String 메뉴2, String 메뉴3,
               int 메뉴1가격, int 메뉴2가격, int 메뉴3가격) {
        this.메뉴1 = 메뉴1;
        this.메뉴2 = 메뉴2;
        this.메뉴3 = 메뉴3;

        this.메뉴1가격 = 메뉴1가격;
        this.메뉴2가격 = 메뉴2가격;
        this.메뉴3가격 = 메뉴3가격;
    }

    public void 메뉴판보여주기() {
        System.out.println("* 음식명과 가격 ");
        System.out.println(" 1." + 메뉴1 + ": " + 메뉴1가격 + "원");
        System.out.println(" 2." + 메뉴2 + ": " + 메뉴2가격 + "원");
        System.out.println(" 3." + 메뉴3 + ": " + 메뉴3가격 + "원");
    }

    public String 메뉴1얻기() {
        return 메뉴1;
    }

    public String 메뉴2얻기() {
        return 메뉴2;
    }

    public String 메뉴3얻기() {
        return 메뉴3;
    }

    public int 메뉴1가격얻기() {
        return 메뉴1가격;
    }

    public int 메뉴2가격얻기() {
        return 메뉴2가격;
    }

    public int 메뉴3가격얻기() {
        return 메뉴3가격;
    }
}
