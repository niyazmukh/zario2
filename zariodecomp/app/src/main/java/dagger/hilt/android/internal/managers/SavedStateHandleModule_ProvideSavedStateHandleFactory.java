package dagger.hilt.android.internal.managers;

import androidx.lifecycle.X;
import javax.inject.Provider;
import u0.v;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\managers\SavedStateHandleModule_ProvideSavedStateHandleFactory.smali */
public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements InterfaceC1060c {
    private final Provider<SavedStateHandleHolder> savedStateHandleHolderProvider;

    public SavedStateHandleModule_ProvideSavedStateHandleFactory(Provider<SavedStateHandleHolder> provider) {
        this.savedStateHandleHolderProvider = provider;
    }

    public static SavedStateHandleModule_ProvideSavedStateHandleFactory create(Provider<SavedStateHandleHolder> provider) {
        return new SavedStateHandleModule_ProvideSavedStateHandleFactory(provider);
    }

    public static X provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        X xProvideSavedStateHandle = SavedStateHandleModule.provideSavedStateHandle(savedStateHandleHolder);
        v.b(xProvideSavedStateHandle);
        return xProvideSavedStateHandle;
    }

    @Override // javax.inject.Provider
    public X get() {
        return provideSavedStateHandle(this.savedStateHandleHolderProvider.get());
    }
}
