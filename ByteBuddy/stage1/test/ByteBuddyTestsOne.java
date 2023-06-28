import bytebuddy.DynamicClass;
import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;

public class ByteBuddyTestsOne extends StageTest {

    @DynamicTest
    CheckResult testToString() throws Exception {
        return test();
    }

    private CheckResult test() throws Exception {
        DynamicClass dynamicClass = new DynamicClass();
        String actual = dynamicClass.dynamicClassToString();
        String expected = "Hello, ByteBuddy!";
        return new CheckResult(
                actual.equals(expected),
                "Method should return: " + expected + ", " +
                        "but your program returned: " + actual
        );
    }
}
