package Q3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: s */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\e.smali */
public @interface e {
    String c() default "";

    String f() default "";

    int[] l() default {};

    String m() default "";

    int v() default 1;
}
