import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public int removeElement(int[] nums, int val) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite os números");
            for(int i = 0; i <= nums.length; i++){
                if (nums[i] != val) {
                    nums = new int[]{nums[i]};
                }
            }

            return nums.length;

            sc.close();
        }
    }
}