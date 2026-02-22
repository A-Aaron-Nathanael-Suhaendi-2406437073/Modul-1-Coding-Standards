package id.ac.ui.cs.advprog.eshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EshopApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true, "Context loads successfully");
    }

    @Test
    void main() {
        EshopApplication.main(new String[] {});
        assertTrue(true, "Main method executes successfully");
    }
}