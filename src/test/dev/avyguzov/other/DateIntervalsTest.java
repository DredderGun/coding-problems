package dev.avyguzov.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DateIntervalsTest {
    @Test
    public void simpleTest1() throws Exception {
        Assertions.assertEquals(Arrays.asList("2020-01-10 2020-01-31", "2020-02-01 2020-02-29", "2020-03-01 2020-03-25"),
                DateIntervals.solution("MONTH", "2020-01-10", "2020-03-25"));
    }

    @Test
    public void simpleTest2() throws Exception {
        Assertions.assertEquals(Arrays.asList("2020-01-26 2020-01-26", "2020-01-27 2020-02-02", "2020-02-03 2020-02-09", "2020-02-10 2020-02-16",
                "2020-02-17 2020-02-23", "2020-02-24 2020-03-01", "2020-03-02 2020-03-08", "2020-03-09 2020-03-15", "2020-03-16 2020-03-22", "2020-03-23 2020-03-23"),
                DateIntervals.solution("WEEK", "2020-01-26", "2020-03-23"));
    }

    @Test
    public void simpleTest3() throws Exception {
        Assertions.assertEquals(Arrays.asList("2020-01-26 2020-12-31", "2021-01-01 2021-03-23"),
                DateIntervals.solution("YEAR", "2020-01-26", "2021-03-23"));
    }

    @Test
    public void simpleTest4() throws Exception {
        Assertions.assertEquals(Arrays.asList("2016-09-20 2016-09-30", "2016-10-01 2017-03-31", "2017-04-01 2017-09-30", "2017-10-01 2018-03-31", "2018-04-01 2018-09-30",
                "2018-10-01 2019-03-31", "2019-04-01 2019-09-30", "2019-10-01 2020-03-31", "2020-04-01 2020-09-30", "2020-10-01 2021-03-31", "2021-04-01 2021-09-30",
                "2021-10-01 2022-03-31", "2022-04-01 2022-09-30", "2022-10-01 2022-11-30"),
                DateIntervals.solution("REVIEW", "2016-09-20", "2022-11-30"));
    }
}
