import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by samsung on 2017-05-26.
 */
public class 계산서 extends JFrame{

    JTable 계산목록;
    JScrollPane scroll;
    JButton 제거, 전체제거, 계산;

    DefaultTableModel 주문생성;

    public 계산서() {
        setTitle("계산서");

        String[] 계산컬럼 = {"음식이름", "음식개수", "합계"};

        주문생성 = new DefaultTableModel();
        주문생성.setColumnIdentifiers(계산컬럼);
        계산목록 = new JTable(주문생성);
        scroll = new JScrollPane(계산목록);

        제거 = new JButton("주문 제거");
        전체제거 = new JButton("주문 초기화");
        계산 = new JButton("계산");

        add("Center", scroll);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(800, 600, 600, 600);
        setVisible(true);
    }

}
