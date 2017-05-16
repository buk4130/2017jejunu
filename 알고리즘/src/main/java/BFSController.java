/**
 * Created by samsung on 2017-05-16.
 */
public class BFSController {

    String[] listName = {"성호", "승호", "동완", "재현", "택종", "철환", "형남", "다민", "은형", "지완", "송지", "동건", "효석", "동환", "영훈"};

    ClassSelector classSelector = new ClassSelector();
    boolean[] isVisited = new boolean[15];

    public void run(int startPoint) {
        NeighborListmodel neighborListmodel;

        isVisited[startPoint] = true;
        neighborListmodel = classSelector.getClassOfNum(startPoint);

        for (int i = startPoint; i < neighborListmodel.getNeighborLength(); i++) {
            if (neighborListmodel.getNeighbor(i) != 15 && isVisited[neighborListmodel.getNeighbor(i)] != true) {
                isVisited[neighborListmodel.getNeighbor(i)] = true;
                System.out.println("" + listName[i] + " 와 " + listName[neighborListmodel.getNeighbor(i)] + "로 연결");
            } else if (neighborListmodel.getNeighbor(i) != 15 && isVisited[neighborListmodel.getNeighbor(i)] == true) {
                continue;
            } else if (neighborListmodel.getNeighbor(i) == 15) {
                for (int j = 0; j < 15; j++) {
                    if (isVisited[j] == true) continue;
                }
            }
        }
    }
}
