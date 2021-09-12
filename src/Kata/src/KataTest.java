import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class KataTest {
    @Test
    public void tests() {
        assertEquals(2, Kata.mostFrequentItemCount(new int[] {3, -1, -1}));
        assertEquals(5, Kata.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
        assertEquals(0, Kata.mostFrequentItemCount(new int[] {}));
    }
}
