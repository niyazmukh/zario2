package dagger.hilt.android;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@GeneratesRootInput
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\HiltAndroidApp.smali */
public @interface HiltAndroidApp {
    Class<?> value() default Void.class;
}
