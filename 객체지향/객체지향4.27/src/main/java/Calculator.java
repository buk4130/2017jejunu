/**
 * Created by seonghohong on 2017. 4. 27..
 */
public class Calculator {

    private int listSum = 0;
    private int oddNum;
    private int evenNum;

    public int getListSum(int[] numList) {
        for (int i = 0; i < numList.length; i++) {
            listSum = listSum + numList[i];
        }

        return listSum;
    }

    public int[] getSortList(int[] numList) {

        int[] sortList = new int[numList.length];
        int randomNumLength = numList.length;

        if (numList[0] > numList[1]) {
            sortList[0] = numList[1];
            sortList[1] = numList[0];
        } else {
            sortList[1] = numList[1];
            sortList[0] = numList[0];
        }
        //처음 두 개의 숫자를 정렬하여 sort를 만들고 다음 수와 비교하기위해 먼저 정렬했습니다.

        for (int i = 2; i < randomNumLength; i++) {

            int index = numList[i];

            if (sortList[i - 1] < index) {
                sortList[i] = index;
                //index넘버가 정렬된 숫자보다 크면 현재 나온수중 제일 큰 수이고 비교할때 연산 카운트가 1증가합니다.
            } else {
                int j = i - 1;
                while (sortList[j] > index) {
                    sortList[j + 1] = sortList[j];
                    sortList[j] = index;
                    j--;
                    if (j == -1) break;
                    //정렬된 숫자중에 index넘버보다 작을수를 찾는 연산입니다.
                }
            }
        }

        return sortList;
    }

    public void setOddEvenList(int[] numList) {

        evenNum = 0;
        oddNum = 0;

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
    }

    public int getOddList() {
        return oddNum;
    }

    public int getEvenList() { return evenNum; }
}
