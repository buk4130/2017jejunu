package View;

/**
 * Created by samsung on 2017-05-03.
 */
public class SortListView extends ViewWork<int[]>{
    private int[] sortList;

    protected void setResult(int[] sortList) {
        this.sortList = sortList;
    }

    protected void showResult() {
        int listIndex = sortList.length-1;

        System.out.println("정렬된 배열은 ");
        for(int i=0; i<sortList.length; i++) {
            System.out.print(""+sortList[listIndex]+",");
            listIndex--;
        }
    }
}
