package dagger.hilt.android.internal.modules;

import android.app.Application;
import u0.v;
import y3.InterfaceC1060c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\internal\modules\ApplicationContextModule_ProvideApplicationFactory.smali */
public final class ApplicationContextModule_ProvideApplicationFactory implements InterfaceC1060c {
    private final ApplicationContextModule module;

    public ApplicationContextModule_ProvideApplicationFactory(ApplicationContextModule applicationContextModule) {
        this.module = applicationContextModule;
    }

    public static ApplicationContextModule_ProvideApplicationFactory create(ApplicationContextModule applicationContextModule) {
        return new ApplicationContextModule_ProvideApplicationFactory(applicationContextModule);
    }

    public static Application provideApplication(ApplicationContextModule applicationContextModule) {
        Application applicationProvideApplication = applicationContextModule.provideApplication();
        v.b(applicationProvideApplication);
        return applicationProvideApplication;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return provideApplication(this.module);
    }
}
