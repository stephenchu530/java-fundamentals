package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnalyzeWeatherTest {
    @Test public void testAnalyzeWeather() {
        int[][] weatherData = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expectedString = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";

        AnalyzeWeather classUnderTest = new AnalyzeWeather();
        String actualString = classUnderTest.analyzeData(weatherData);

        assertEquals(expectedString, actualString);
    }
}
