import com.example.FilmRatingAgeChecker;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FilmRatingAgeCheckerTest {

    private FilmRatingAgeChecker checker;

    @BeforeAll
    public static void startTest() {
        System.out.println("Начало тестирования");
    }

    @BeforeEach
    public void setUp() {
        checker = new FilmRatingAgeChecker();
        System.out.println("Переход к следующему тест-кейсу");
    }

    @AfterAll
    public static void endTest() {
        System.out.println("Конец тестирования");
    }

    // Проверка позитивных сценариев
    @Test
    @Order(1)
    public void filmIsAllowed() {
        String result = checker.ageCheck(17, 16, false);
        assertEquals("разрешено", result);
    }

    @Test
    @Order(4)
    public void filmIsAllowedWithParent() {
        String result = checker.ageCheck(6, 12, true);
        assertEquals("разрешено", result);
    }

    // Проверка негативных сценариев
    @Test
    @Order(2)
    public void filmIsDeclined() {
        String result = checker.ageCheck(14, 18, false);
        assertEquals("запрещено", result);
    }

    @Test
    @Order(5)
    public void filmIsDeclinedWithParent() {
        String result = checker.ageCheck(15, 16, true);
        assertEquals("запрещено", result);
    }

    @Test
    @Order(3)
    public void RatingIsIncorrect() {
        String result = checker.ageCheck(20, 20, false);
        assertEquals("Введено некорректное значение возрастного ограничения.", result);
    }

    @Test
    @Order(9)
    public void ViewerIsTooOld() {
        String result = checker.ageCheck(101, 18, false);
        assertEquals("запрещено", result);
    }

    @Test
    @Order(10)
    public void ViewerIsTooYoung() {
        String result = checker.ageCheck(-1, 0, false);
        assertEquals("запрещено", result);
    }

    // Граничные значения
    @Test
    @Order(6)
    public void checkBoundaryMinAge() {
        String result = checker.ageCheck(0, 0, false);
        assertEquals("разрешено", result);
    }

    @Test
    @Order(7)
    public void checkBoundaryMaxAge() {
        String result = checker.ageCheck(100, 18, false);
        assertEquals("разрешено", result);
    }

    @Test
    @Order(8)
    public void checkBoundaryRatingAge() {
        String result = checker.ageCheck(12, 12, false);
        assertEquals("разрешено", result);
    }

}