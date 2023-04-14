import org.example.Cook;
import org.example.Cooking;
import org.example.MenuItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요리사 클래스
 */
public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);
        Cook cook = cooking.makeCook(menuItem); // 메뉴항목을 전달하여 요리르 만들어달라고 한다

        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
