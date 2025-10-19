package dagger.hilt.internal.aliasof;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\internal\aliasof\AliasOfPropagatedData.smali */
public @interface AliasOfPropagatedData {
    Class<? extends Annotation> alias();

    Class<? extends Annotation>[] defineComponentScopes();
}
