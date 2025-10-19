package dagger.hilt.internal.aggregatedroot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\internal\aggregatedroot\AggregatedRoot.smali */
public @interface AggregatedRoot {
    String originatingRoot();

    String originatingRootPackage();

    String[] originatingRootSimpleNames();

    String root();

    Class<?> rootAnnotation();

    String rootPackage();

    String[] rootSimpleNames();
}
