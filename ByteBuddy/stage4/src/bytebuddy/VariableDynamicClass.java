package bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class VariableDynamicClass {
    public String getField() throws Exception {
        Class<?> type = new ByteBuddy()
        //write your code here

        // do not change code below
        Object instance = type.getDeclaredConstructor().newInstance();

        Field fieldX = type.getDeclaredField("Field");
        fieldX.set(instance, "NameOfField");
        return fieldX.get(instance).toString();
    }
}

