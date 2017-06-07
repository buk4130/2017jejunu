package 출력뷰.주문서메인뷰;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by samsung on 2017-06-07.
 */
public class 테이블관리 extends JFrame {

    JTable[] 테이블주문결과;
    DefaultTableModel[] 주문결과;
    JScrollPane[] jScrollPane;

    JButton[] 테이블결제;
    JButton[] 테이블주문;

    JPanel[] 테이블;
    JLabel[] 테이블번호;

    public 테이블관리(){
        setTitle("테이블관리창");
        setBounds(200, 50, 2000, 1400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String[] 결과컬럼 = {"음식이름", "음식개수", "합계"};

        테이블 = new JPanel[20];
        테이블번호 = new JLabel[20];
        주문결과 = new DefaultTableModel[20];
        테이블주문결과 = new JTable[20];
        jScrollPane = new JScrollPane[20];
        테이블결제 = new JButton[20];
        테이블주문 = new JButton[20];

        int xButton01Index = 0;
        int yButton01Index = 0;
        int xButton02Index = 0;
        int yButton02Index = 0;

        int xTableIndex = 0;
        int yTableIndex = 0;
        int xPanelIndex = 0;
        int yPanelIndex = 0;

        for(int i=0; i<20; i++) {
            테이블[i] = new JPanel();
            테이블번호[i] = new JLabel(""+i+"번 테이블");
            테이블[i].add(테이블번호[i]);
            주문결과[i] = new DefaultTableModel();
            주문결과[i].setColumnIdentifiers(결과컬럼);
            테이블주문결과[i] = new JTable(주문결과[i]);
            jScrollPane[i] = new JScrollPane(테이블주문결과[i]);
            테이블결제[i] = new JButton("결제");
            테이블주문[i] = new JButton("주문");


            setLayout(null);
            테이블[i].setBounds(210 + (50*xPanelIndex),100 + (200*yPanelIndex),80,20);
            setLayout(null);
            jScrollPane[i].setBounds(100 + (50*xTableIndex),120 + (200*yTableIndex),300,200);
            setLayout(null);
            테이블결제[i].setBounds(170+(50*xButton01Index),330+(200*yButton02Index),70,40);
            테이블주문[i].setBounds(260,330,70,40);

        }

        add(테이블[0]);
        add(jScrollPane[0]);
        add(테이블결제[0]);
        add(테이블주문[0]);
        setVisible(true);
    }

    public static void main(String[] args) {
        new 테이블관리();
    }
}
