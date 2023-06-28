import bytebuddy.VariableDynamicClass;
import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;

import java.util.Objects;

public class ByteBuddyTestsFour extends StageTest {

    @DynamicTest
    CheckResult testField() throws Exception {
        return test();
    }

    private CheckResult test() throws Exception {
        VariableDynamicClass variableDynamicClass = new VariableDynamicClass();
        String actual = variableDynamicClass.getField();
        String expected = "NameOfField";
        return new CheckResult(
                Objects.equals(actual, expected),
                "Method should return: " + expected + ", " +
                        "but your program returned: " + actual
        );
    }
}
