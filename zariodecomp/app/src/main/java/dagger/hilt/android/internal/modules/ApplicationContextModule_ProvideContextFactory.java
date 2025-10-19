package dagger.hilt.android.internal.modules;

import android.content.Context;
import u0.v;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\modules\ApplicationContextModule_ProvideContextFactory.smali */
public final class ApplicationContextModule_ProvideContextFactory implements InterfaceC1060c {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideContextFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideContextFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideContextFactory(applicationContextModule);
    }

    public static Context provideContext(ApplicationContextModule applicationContextModule) {
        Context contextProvideContext = applicationContextModule.provideContext();
        v.b(contextProvideContext);
        return contextProvideContext;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
