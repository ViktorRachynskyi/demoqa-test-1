package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
        System.out.println("before all");
    }

    @BeforeEach
    void openBrowser() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void closeBrowser() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @Test
    void simple1Test() {
        System.out.println("test 1");
    }

    @Test
    void simple2Test() {
        System.out.println("test 2");
    }
}
