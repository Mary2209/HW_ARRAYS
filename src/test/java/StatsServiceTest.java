import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import java.util.ArrayList;

public class StatsServiceTest {

    @Test
    public void testSum() {
        int[] arr = {1,1,1,1,1};
        int result = StatsService.sum(arr);
        int expected = 5;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAvg() {
        int[] arr = {1,1,1,1,1};
        int result = StatsService.avg(arr);
        int expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testHighest() {
        int[] arr = {1,1,2,1,1};
        int result = StatsService.highest(arr);
        int expected = 3;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLowest() {
        int[] arr = {1,2,3,4,5};
        int result = StatsService.lowest(arr);
        int expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLowestAvgList() {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> result = StatsService.lowestAvgList(arr, 3);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testHighestAvgList() {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> result = StatsService.highestAvgList(arr, 3);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(5);

        Assertions.assertEquals(expected, result);
    }
}
