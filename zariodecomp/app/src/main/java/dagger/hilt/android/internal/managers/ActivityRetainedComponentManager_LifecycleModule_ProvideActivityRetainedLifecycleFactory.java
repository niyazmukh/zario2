package dagger.hilt.android.internal.managers;

import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import u0.v;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.smali */
public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements InterfaceC1060c {

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory$InstanceHolder.smali */
    public static final class InstanceHolder {
        private static final ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory INSTANCE = new ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();

        private InstanceHolder() {
        }
    }

    public static ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        ActivityRetainedLifecycle activityRetainedLifecycleProvideActivityRetainedLifecycle = ActivityRetainedComponentManager.LifecycleModule.provideActivityRetainedLifecycle();
        v.b(activityRetainedLifecycleProvideActivityRetainedLifecycle);
        return activityRetainedLifecycleProvideActivityRetainedLifecycle;
    }

    @Override // javax.inject.Provider
    public ActivityRetainedLifecycle get() {
        return provideActivityRetainedLifecycle();
    }
}
