package dagger.hilt.android;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@GeneratesRootInput
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\AndroidEntryPoint.smali */
public @interface AndroidEntryPoint {
    Class<?> value() default Void.class;
}
