package dagger.hilt.android.qualifiers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Qualifier
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\qualifiers\ActivityContext.smali */
public @interface ActivityContext {
}
