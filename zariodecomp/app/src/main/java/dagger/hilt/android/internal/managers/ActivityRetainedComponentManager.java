package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import b.AbstractActivityC0255l;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponentManager;
import k0.AbstractC0653c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ActivityRetainedComponentManager.smali */
final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    private volatile ActivityRetainedComponent component;
    private final Object componentLock = new Object();
    private final Context context;
    private final n0 viewModelStoreOwner;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ActivityRetainedComponentManager$ActivityRetainedComponentBuilderEntryPoint.smali */
    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ActivityRetainedComponentManager$ActivityRetainedComponentViewModel.smali */
    public static final class ActivityRetainedComponentViewModel extends f0 {
        private final ActivityRetainedComponent component;
        private final SavedStateHandleHolder savedStateHandleHolder;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.component = activityRetainedComponent;
            this.savedStateHandleHolder = savedStateHandleHolder;
        }

        public ActivityRetainedComponent getComponent() {
            return this.component;
        }

        public SavedStateHandleHolder getSavedStateHandleHolder() {
            return this.savedStateHandleHolder;
        }

        @Override // androidx.lifecycle.f0
        public void onCleared() {
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.get(this.component, ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    @EntryPoint
    @InstallIn({ActivityRetainedComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\ActivityRetainedComponentManager$ActivityRetainedLifecycleEntryPoint.smali */
    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    public ActivityRetainedComponentManager(AbstractActivityC0255l abstractActivityC0255l) {
        this.viewModelStoreOwner = abstractActivityC0255l;
        this.context = abstractActivityC0255l;
    }

    private ActivityRetainedComponent createComponent() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).a(ActivityRetainedComponentViewModel.class)).getComponent();
    }

    private l0 getViewModelProvider(n0 n0Var, final Context context) {
        return new l0(n0Var, new i0() { // from class: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.1
            @Override // androidx.lifecycle.i0
            public /* bridge */ /* synthetic */ f0 create(Class cls) {
                super.create(cls);
                throw null;
            }

            @Override // androidx.lifecycle.i0
            public <T extends f0> T create(Class<T> cls, AbstractC0653c abstractC0653c) {
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(abstractC0653c);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.fromApplication(context, ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
            }
        });
    }

    public SavedStateHandleHolder getSavedStateHandleHolder() {
        return ((ActivityRetainedComponentViewModel) getViewModelProvider(this.viewModelStoreOwner, this.context).a(ActivityRetainedComponentViewModel.class)).getSavedStateHandleHolder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // dagger.hilt.internal.GeneratedComponentManager
    public ActivityRetainedComponent generatedComponent() {
        if (this.component == null) {
            synchronized (this.componentLock) {
                try {
                    if (this.component == null) {
                        this.component = createComponent();
                    }
                } finally {
                }
            }
        }
        return this.component;
    }
}
