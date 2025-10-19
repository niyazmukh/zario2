package dagger.hilt.android.internal.lifecycle;

import androidx.lifecycle.i0;
import b.AbstractActivityC0255l;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.internal.Preconditions;
import g0.AbstractComponentCallbacksC0567t;
import java.util.Map;
import javax.inject.Inject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\DefaultViewModelFactories.smali */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\DefaultViewModelFactories$ActivityEntryPoint.smali */
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @InstallIn({ActivityComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\DefaultViewModelFactories$ActivityModule.smali */
    public interface ActivityModule {
        @HiltViewModelMap.KeySet
        Map<Class<?>, Boolean> viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\DefaultViewModelFactories$FragmentEntryPoint.smali */
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\DefaultViewModelFactories$InternalFactoryFactory.smali */
    public static final class InternalFactoryFactory {
        private final Map<Class<?>, Boolean> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        @Inject
        public InternalFactoryFactory(@HiltViewModelMap.KeySet Map<Class<?>, Boolean> map, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.keySet = map;
            this.viewModelComponentBuilder = viewModelComponentBuilder;
        }

        private i0 getHiltViewModelFactory(i0 i0Var) {
            return new HiltViewModelFactory(this.keySet, (i0) Preconditions.checkNotNull(i0Var), this.viewModelComponentBuilder);
        }

        public i0 fromActivity(AbstractActivityC0255l abstractActivityC0255l, i0 i0Var) {
            return getHiltViewModelFactory(i0Var);
        }

        public i0 fromFragment(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, i0 i0Var) {
            return getHiltViewModelFactory(i0Var);
        }
    }

    private DefaultViewModelFactories() {
    }

    public static i0 getActivityFactory(AbstractActivityC0255l abstractActivityC0255l, i0 i0Var) {
        return ((ActivityEntryPoint) EntryPoints.get(abstractActivityC0255l, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(abstractActivityC0255l, i0Var);
    }

    public static i0 getFragmentFactory(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, i0 i0Var) {
        return ((FragmentEntryPoint) EntryPoints.get(abstractComponentCallbacksC0567t, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(abstractComponentCallbacksC0567t, i0Var);
    }
}
