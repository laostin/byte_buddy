package bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class DynamicClass {
    public String dynamicClassToString() throws Exception {
        Class<?> dynamicClass = new ByteBuddy()
              //write your code here

                // do not change code below
                .make()
                .load(DynamicClass.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
                .getLoaded();
        Object instance = dynamicClass.getDeclaredConstructor().newInstance();
        return instance.toString();
    }
}