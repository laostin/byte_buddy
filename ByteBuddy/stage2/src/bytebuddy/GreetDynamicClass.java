package bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GreetDynamicClass {
    public String dynamicClassSayHelloFromSpain() throws Exception {
        Class<?> dynamicClass = new ByteBuddy()
                // write your code here

                // do not change code below
                .make()
                .load(DynamicClass.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                .getLoaded();

        Object instance = dynamicClass.getDeclaredConstructor().newInstance();

        Method m = dynamicClass.getDeclaredMethod("sayHello");
        return m.invoke(instance).toString();
    }
}