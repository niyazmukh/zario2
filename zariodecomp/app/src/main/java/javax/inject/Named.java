package javax.inject;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\javax\inject\Named.smali */
public @interface Named {
    String value() default "";
}
