package dagger.hilt.android.internal.modules;

import android.app.Activity;
import g0.AbstractActivityC0570w;
import javax.inject.Provider;
import u0.v;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\modules\ActivityModule_ProvideFragmentActivityFactory.smali */
public final class ActivityModule_ProvideFragmentActivityFactory implements InterfaceC1060c {
    private final Provider<Activity> activityProvider;

    public ActivityModule_ProvideFragmentActivityFactory(Provider<Activity> provider) {
        this.activityProvider = provider;
    }

    public static ActivityModule_ProvideFragmentActivityFactory create(Provider<Activity> provider) {
        return new ActivityModule_ProvideFragmentActivityFactory(provider);
    }

    public static AbstractActivityC0570w provideFragmentActivity(Activity activity) {
        AbstractActivityC0570w abstractActivityC0570wProvideFragmentActivity = ActivityModule.provideFragmentActivity(activity);
        v.b(abstractActivityC0570wProvideFragmentActivity);
        return abstractActivityC0570wProvideFragmentActivity;
    }

    @Override // javax.inject.Provider
    public AbstractActivityC0570w get() {
        return provideFragmentActivity(this.activityProvider.get());
    }
}
