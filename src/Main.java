public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }
    public static int[] problem1(int[] nums, int target){

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if (target == nums[j] + num){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static boolean problem2(int x){
        String og = Integer.toString(x);
        String newnum = "";
        for (int i = og.length()-1; i > -1; i--) {
            newnum = newnum + og.charAt(i);
        }
        return og.equals(newnum);
    }
    public static String problem3(String[] strs){
        String first = strs[0];
        String prefix = "";
        for (int i = 0; i < first.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].contains(first.charAt(i)))
            }
        }
        return "";
    }
}