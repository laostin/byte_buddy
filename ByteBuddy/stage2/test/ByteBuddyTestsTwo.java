import bytebuddy.GreetDynamicClass;
import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;

import java.util.Objects;

public class ByteBuddyTestsTwo extends StageTest {

    @DynamicTest
    CheckResult testOverrideMethod() throws Exception {
        return test();
    }

    private CheckResult test() throws Exception {
        GreetDynamicClass greetDynamicClass = new GreetDynamicClass();
        String actual = greetDynamicClass.dynamicClassSayHelloFromSpain();
        String expected = "Hola!";
        return new CheckResult(
                Objects.equals(actual, expected),
                "Method should return: " + expected + ", " +
                        "but your program returned: " + actual
        );
    }
}
