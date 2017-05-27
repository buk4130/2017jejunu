import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by samsung on 2017-05-25.
 */
public class 주문서 extends JFrame implements MouseListener, ActionListener {

    JTable 차림표;
    JScrollPane scroll;
    JPanel 차림표제목, 버튼판넬;
    JLabel 주문서이름, 주문확인;
    JTextField 주문개수;
    JButton 주문생성;

    계산서 계산;

    String[] 음식리스트 = new String[]{"정식", "갈비탕", "비빔밥", "제육덮밥", "컵밥", "밥버거", "짜장면", "짬뽕", "국밥", "비빔국수"};
    int[] 차림가격리스트 = new int[]{9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000, 1000, 10000};

    DefaultTableModel 차림표초기값;

    public 주문서() {
        setTitle("주문서");

        Object[][] 차림표내용 = new Object[음식리스트.length][3];
        int 음식번호 = 1;

        for (int i = 0; i < 음식리스트.length; i++) {
            차림표내용[i][0] = 음식번호;
            차림표내용[i][1] = 음식리스트[i];
            차림표내용[i][2] = 차림가격리스트[i];
            음식번호++;
        }

        Object[] 차림표목록 = {"음식번호", "음식이름", "가격"};

        차림표초기값 = new DefaultTableModel(차림표내용, 차림표목록);
        차림표 = new JTable(차림표초기값);
        scroll = new JScrollPane(차림표);
        주문서이름 = new JLabel("홍식당 차림표");
        차림표제목 = new JPanel();
        차림표제목.add(주문서이름);

        주문생성 = new JButton("주문생성");
        버튼판넬 = new JPanel();
        주문확인 = new JLabel("주문내용");
        주문개수 = new JTextField(5);
        버튼판넬.add(주문확인);
        버튼판넬.add(주문개수);
        버튼판넬.add(주문생성);

        add("Center", scroll);
        add("North", 차림표제목);
        add("South", 버튼판넬);

        setBounds(800, 600, 600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        eventUp();
    }

    private void eventUp() {
        차림표.addMouseListener(this);
        주문생성.addActionListener(this);
    }

    Object 주문내용[] = new Object[3];

    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();

        if (ob == 주문생성 && 계산 == null) {
            계산 = new 계산서();
            주문내용[2] = 주문개수.getText();
            계산.주문생성.addRow(주문내용);
        } else if (ob == 주문생성 && 계산 != null) {
            주문내용[2] = 주문개수.getText();
            계산.주문생성.addRow(주문내용);
        }
    }

    public void mouseClicked(MouseEvent e) {
        int srow = 차림표.getSelectedRow();

        Object 음식이름 = 차림표.getValueAt(srow, 1);
        주문확인.setText("선택음식: " + 음식이름 + "");

        주문내용[0] = 차림표.getValueAt(srow, 1);
        주문내용[1] = 차림표.getValueAt(srow, 2);
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new 주문서();
    }
}
