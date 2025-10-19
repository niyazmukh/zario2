package dagger.hilt.migration;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE})
@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\migration\AliasOf.smali */
public @interface AliasOf {
    Class<? extends Annotation>[] value();
}
