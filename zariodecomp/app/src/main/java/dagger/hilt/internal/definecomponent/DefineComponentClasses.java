package dagger.hilt.internal.definecomponent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\internal\definecomponent\DefineComponentClasses.smali */
public @interface DefineComponentClasses {
    String builder() default "";

    String component() default "";
}
