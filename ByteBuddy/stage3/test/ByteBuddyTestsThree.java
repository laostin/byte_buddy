import bytebuddy.ForecastDynamicClass;
import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;

import java.util.Objects;

public class ByteBuddyTestsThree extends StageTest {

    @DynamicTest
    CheckResult testWeatherCondition() throws Exception {
        return test();
    }

    private CheckResult test() throws Exception {
        ForecastDynamicClass forecastDynamicClass = new ForecastDynamicClass();
        String actual = forecastDynamicClass.dynamicClassPrintForecast();
        String expected = "Today is expected rain";
        return new CheckResult(
                Objects.equals(actual, expected),
                "Method should return: " + expected + ", " +
                        "but your program returned: " + actual
        );
    }
}
