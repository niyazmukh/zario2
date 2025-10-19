package u0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\u.smali */
public final class u extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f10443a;

    public u(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f10443a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        m callback = (m) iInterface;
        kotlin.jvm.internal.i.e(callback, "callback");
        kotlin.jvm.internal.i.e(cookie, "cookie");
        this.f10443a.f4799b.remove((Integer) cookie);
    }
}
