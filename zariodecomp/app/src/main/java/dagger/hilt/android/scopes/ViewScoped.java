package dagger.hilt.android.scopes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Scope;

@Target({ElementType.METHOD, ElementType.TYPE})
@Scope
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\scopes\ViewScoped.smali */
public @interface ViewScoped {
}
