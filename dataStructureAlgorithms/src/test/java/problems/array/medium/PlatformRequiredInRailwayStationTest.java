package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PlatformRequiredInRailwayStationTest {

    private PlatformRequiredInRailwayStation obj = new PlatformRequiredInRailwayStation();

    @Test
    public void test1() {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dept[] = {910, 1200, 1120, 1130, 1900, 2000};

        Assert.assertEquals(3, obj.platforms(arr, dept));
    }
}
