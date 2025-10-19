package dagger.hilt.android.internal.lifecycle;

import X3.l;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import javax.inject.Provider;
import k0.AbstractC0653c;
import k0.InterfaceC0652b;
import x0.InterfaceC1033d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\HiltViewModelFactory.smali */
public final class HiltViewModelFactory implements i0 {
    public static final InterfaceC0652b CREATION_CALLBACK_KEY = new InterfaceC0652b() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.1
    };
    private final i0 delegateFactory;
    private final i0 hiltViewModelFactory;
    private final Map<Class<?>, Boolean> hiltViewModelKeys;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\HiltViewModelFactory$ActivityCreatorEntryPoint.smali */
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder getViewModelComponentBuilder();

        @HiltViewModelMap.KeySet
        Map<Class<?>, Boolean> getViewModelKeys();
    }

    @EntryPoint
    @InstallIn({ViewModelComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\HiltViewModelFactory$ViewModelFactoriesEntryPoint.smali */
    public interface ViewModelFactoriesEntryPoint {
        @HiltViewModelAssistedMap
        Map<Class<?>, Object> getHiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<Class<?>, Provider<f0>> getHiltViewModelMap();
    }

    @InstallIn({ViewModelComponent.class})
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\HiltViewModelFactory$ViewModelModule.smali */
    public interface ViewModelModule {
        @HiltViewModelAssistedMap
        Map<Class<?>, Object> hiltViewModelAssistedMap();

        @HiltViewModelMap
        Map<Class<?>, f0> hiltViewModelMap();
    }

    public HiltViewModelFactory(Map<Class<?>, Boolean> map, i0 i0Var, final ViewModelComponentBuilder viewModelComponentBuilder) {
        this.hiltViewModelKeys = map;
        this.delegateFactory = i0Var;
        this.hiltViewModelFactory = new i0() { // from class: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.2
            private <T extends f0> T createViewModel(ViewModelComponent viewModelComponent, Class<T> cls, AbstractC0653c abstractC0653c) {
                Provider<f0> provider = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelMap().get(cls);
                l lVar = (l) abstractC0653c.a(HiltViewModelFactory.CREATION_CALLBACK_KEY);
                Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.get(viewModelComponent, ViewModelFactoriesEntryPoint.class)).getHiltViewModelAssistedMap().get(cls);
                if (obj == null) {
                    if (lVar != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (provider != null) {
                        return (T) provider.get();
                    }
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                if (provider != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (lVar != null) {
                    return (T) lVar.invoke(obj);
                }
                throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }

            @Override // androidx.lifecycle.i0
            public /* bridge */ /* synthetic */ f0 create(Class cls) {
                super.create(cls);
                throw null;
            }

            @Override // androidx.lifecycle.i0
            public <T extends f0> T create(Class<T> cls, AbstractC0653c abstractC0653c) throws IOException {
                final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
                T t4 = (T) createViewModel(viewModelComponentBuilder.savedStateHandle(a0.d(abstractC0653c)).viewModelLifecycle(retainedLifecycleImpl).build(), cls, abstractC0653c);
                t4.addCloseable(new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.a
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        retainedLifecycleImpl.dispatchOnCleared();
                    }
                });
                return t4;
            }
        };
    }

    public static i0 createInternal(Activity activity, InterfaceC1033d interfaceC1033d, Bundle bundle, i0 i0Var) {
        return createInternal(activity, i0Var);
    }

    @Override // androidx.lifecycle.i0
    public <T extends f0> T create(Class<T> cls, AbstractC0653c abstractC0653c) {
        return this.hiltViewModelKeys.containsKey(cls) ? (T) this.hiltViewModelFactory.create(cls, abstractC0653c) : (T) this.delegateFactory.create(cls, abstractC0653c);
    }

    public static i0 createInternal(Activity activity, i0 i0Var) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.get(activity, ActivityCreatorEntryPoint.class);
        return new HiltViewModelFactory(activityCreatorEntryPoint.getViewModelKeys(), i0Var, activityCreatorEntryPoint.getViewModelComponentBuilder());
    }

    @Override // androidx.lifecycle.i0
    public <T extends f0> T create(Class<T> cls) {
        if (this.hiltViewModelKeys.containsKey(cls)) {
            return (T) this.hiltViewModelFactory.create(cls);
        }
        return (T) this.delegateFactory.create(cls);
    }
}
