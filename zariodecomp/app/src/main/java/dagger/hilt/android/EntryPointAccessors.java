package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import g0.AbstractComponentCallbacksC0567t;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\EntryPointAccessors.smali */
public final class EntryPointAccessors {
    public static final EntryPointAccessors INSTANCE = new EntryPointAccessors();

    private EntryPointAccessors() {
    }

    public static final <T> T fromActivity(Activity activity, Class<T> entryPoint) {
        i.e(activity, "activity");
        i.e(entryPoint, "entryPoint");
        return (T) EntryPoints.get(activity, entryPoint);
    }

    public static final <T> T fromApplication(Context context, Class<T> entryPoint) {
        i.e(context, "context");
        i.e(entryPoint, "entryPoint");
        return (T) EntryPoints.get(Contexts.getApplication(context.getApplicationContext()), entryPoint);
    }

    public static final <T> T fromFragment(AbstractComponentCallbacksC0567t fragment, Class<T> entryPoint) {
        i.e(fragment, "fragment");
        i.e(entryPoint, "entryPoint");
        return (T) EntryPoints.get(fragment, entryPoint);
    }

    public static final <T> T fromView(View view, Class<T> entryPoint) {
        i.e(view, "view");
        i.e(entryPoint, "entryPoint");
        return (T) EntryPoints.get(view, entryPoint);
    }

    public final <T> T fromActivity(Activity activity) {
        i.e(activity, "activity");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T fromApplication(Context context) {
        i.e(context, "context");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T fromFragment(AbstractComponentCallbacksC0567t fragment) {
        i.e(fragment, "fragment");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T fromView(View view) {
        i.e(view, "view");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
