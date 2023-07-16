import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {

    @Test
    public void testSum() {
        int[] arr = {1, 1, 1, 1, 1};
        int result = StatsService.sum(arr);
        int expected = 5;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAvg() {
        int[] arr = {1, 1, 1, 1, 1};
        int sum = StatsService.sum(arr);
        int result = StatsService.avg(arr, sum);
        int expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testHighest() {
        int[] arr = {1, 1, 2, 1, 1};
        int result = StatsService.highest(arr);
        int expected = 3;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLowest() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = StatsService.lowest(arr);
        int expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLowestAvgList() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = StatsService.lowestAvgList(arr, 3);
        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testHighestAvgList() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = StatsService.highestAvgList(arr, 3);
        int[] expected = {4, 5};

        Assertions.assertArrayEquals(expected, result);
    }
}
