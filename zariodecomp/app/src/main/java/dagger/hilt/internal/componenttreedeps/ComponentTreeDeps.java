package dagger.hilt.internal.componenttreedeps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\internal\componenttreedeps\ComponentTreeDeps.smali */
public @interface ComponentTreeDeps {
    Class<?>[] aggregatedDeps() default {};

    Class<?>[] aliasOfDeps() default {};

    Class<?>[] defineComponentDeps() default {};

    Class<?>[] earlyEntryPointDeps() default {};

    Class<?>[] rootDeps() default {};

    Class<?>[] uninstallModulesDeps() default {};
}
