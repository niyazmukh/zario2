package dagger.hilt.android.internal.modules;

import android.app.Activity;
import android.content.Context;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;
import g0.AbstractActivityC0570w;

@InstallIn({ActivityComponent.class})
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\modules\ActivityModule.smali */
abstract class ActivityModule {
    private ActivityModule() {
    }

    public static AbstractActivityC0570w provideFragmentActivity(Activity activity) {
        try {
            return (AbstractActivityC0570w) activity;
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e5);
        }
    }

    @ActivityContext
    public abstract Context provideContext(Activity activity);
}
