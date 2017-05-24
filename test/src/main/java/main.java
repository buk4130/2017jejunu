/**
 * Created by samsung on 2017-05-20.
 */
public class main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7};
        int answer = solution(nums);

        System.out.print(answer);
    }

    public static int solution(int[] nums) {

        int answer = 0;

            int indexNum1 = 0;
            int indexNum2 = 1;
            int indexNum3 = 2;

            int finalNum;


            for(int i=2; i<nums.length; i++) {
                finalNum = nums[indexNum1] + nums[indexNum2] + nums[i];
                int demical = 0;
                for(int j=2; j<finalNum; j++) {
                    if(finalNum % j == 0) demical++;
                }
                if(demical == 0) answer++;

                indexNum3++;
            }

        for(int i=2; i<nums.length-1; i++) {
            finalNum = nums[indexNum1] + nums[i] + nums[indexNum3-1];
            int demical = 0;
            for(int j=2; j<finalNum; j++) {
                if(finalNum % j == 0) demical++;
            }
            if(demical == 0) answer++;

            indexNum2++;
        }

        for(int i=1; i<nums.length-2; i++) {
            finalNum = nums[i] + nums[indexNum2-1] + nums[indexNum3-1];
            int demical = 0;
            for(int j=2; j<finalNum; j++) {
                if(finalNum % j == 0) demical++;
            }
            if(demical == 0) answer++;

            indexNum1++;
        }




        return answer;
    }
}
