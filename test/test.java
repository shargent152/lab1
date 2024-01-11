import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test {
    @Test
    public void test_problem1(){
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{3,2,4};
        int[] nums3 = new int[]{3,3};
        try {
            assertArrayEquals(new int[]{0,1},Main.problem1(nums1,9));
        }catch (Exception e){
            fail("didnt equal" + e.toString());
        }
        try {
            assertArrayEquals(new int[]{1,2},Main.problem1(nums2,6));
        }catch (Exception e){
            fail("didnt equal" + e.toString());
        }
        try {
            assertArrayEquals(new int[]{0,1},Main.problem1(nums3,6));
        }catch (Exception e){
            fail("didnt equal" + e.toString());
        }
    }
    @Test
    public void test_problem2(){
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;
        try {
            assertTrue(Main.problem2(x1));
        }catch (Exception e){
            fail("not true" + e.toString());
        }
        try {
            assertFalse(Main.problem2(x2));
        }catch (Exception e){
            fail("not false" + e.toString());
        }
        try {
            assertFalse(Main.problem2(x3));
        }catch (Exception e){
            fail("not false" + e.toString());
        }
    }
}
