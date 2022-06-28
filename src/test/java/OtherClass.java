import org.testng.annotations.Test;

public class OtherClass {
    @Test
    public void testReverseString() {
        String text = "I believe I can fly";
        for (int i = text.length() - 5; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
