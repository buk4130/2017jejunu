/**
 * Created by seonghohong on 2017. 4. 19..
 */
public class 차림표 {

    private String 메뉴리스트[];
    private int 메뉴가격리스트[];

    public 차림표(String[] 차림리스트, int[] 가격리스트) {
        this.메뉴리스트 = 차림리스트;
        this.메뉴가격리스트 = 가격리스트;
    }

//    public void 메뉴판보여주기() {
//        System.out.println("* 음식명과 가격 ");
//        System.out.println(" 1." + 메뉴1 + ": " + 메뉴1가격 + "원");
//        System.out.println(" 2." + 메뉴2 + ": " + 메뉴2가격 + "원");
//        System.out.println(" 3." + 메뉴3 + ": " + 메뉴3가격 + "원");
//    }

    public String 코드음식얻기(int 코드번호) {
        String 음식이름 = new String();

        for (int i = 0; i < 메뉴리스트.length; i++) {
            int 코드인덱스 = 1;
            if (코드번호 == 코드인덱스) 음식이름 = 메뉴리스트[i];
            코드인덱스++;
        }

        return 음식이름;
    }

    public int 코드가격얻기(int 코드번호) {
        int 음식가격 = 0;

        for (int i = 0; i < 메뉴가격리스트.length; i++) {
            int 코드인덱스 = 1;
            if (코드번호 == 코드인덱스) 음식가격 = 메뉴가격리스트[i];
            코드인덱스++;
        }

        return 음식가격;
    }
}
