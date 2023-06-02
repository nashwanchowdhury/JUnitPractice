import org.example.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class RegexTest {

        @Test
        public void testEmail() {
            String email = "infolog@example.com";
            Assertions.assertTrue(Main.email(email));
        }
        @Test
        public void testPhone() {
            Assertions.assertTrue(Main.phone("(615) 243-5172"));
        }
        @Test
        public void testDate() {
            Assertions.assertTrue(Main.date("10/04/1999"));;
        }
        @Test
        public void testURL() {
            Assertions.assertTrue(Main.url("https://google.com"));
        }
        @Test
        public void testCreditCard() {
            Assertions.assertTrue(Main.creditcard("1111 2222 3333 4444 5555"));
        }
    }


