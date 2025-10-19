package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import java.util.Map;
import javax.inject.Provider;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\lifecycle\DefaultViewModelFactories_InternalFactoryFactory_Factory.smali */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements InterfaceC1060c {
    private final Provider<Map<Class<?>, Boolean>> keySetProvider;
    private final Provider<ViewModelComponentBuilder> viewModelComponentBuilderProvider;

    public DefaultViewModelFactories_InternalFactoryFactory_Factory(Provider<Map<Class<?>, Boolean>> provider, Provider<ViewModelComponentBuilder> provider2) {
        this.keySetProvider = provider;
        this.viewModelComponentBuilderProvider = provider2;
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(Provider<Map<Class<?>, Boolean>> provider, Provider<ViewModelComponentBuilder> provider2) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(provider, provider2);
    }

    public static DefaultViewModelFactories.InternalFactoryFactory newInstance(Map<Class<?>, Boolean> map, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(map, viewModelComponentBuilder);
    }

    @Override // javax.inject.Provider
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance(this.keySetProvider.get(), this.viewModelComponentBuilderProvider.get());
    }
}
