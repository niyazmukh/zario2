package dagger.hilt.android.lifecycle;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\lifecycle\HiltViewModel.smali */
public @interface HiltViewModel {
    Class<?> assistedFactory() default Object.class;
}
