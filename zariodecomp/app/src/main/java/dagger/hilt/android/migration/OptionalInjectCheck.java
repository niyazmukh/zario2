package dagger.hilt.android.migration;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.view.View;
import b.AbstractActivityC0255l;
import dagger.hilt.android.internal.migration.InjectedByHilt;
import dagger.hilt.internal.Preconditions;
import g0.AbstractComponentCallbacksC0567t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\migration\OptionalInjectCheck.smali */
public final class OptionalInjectCheck {
    private OptionalInjectCheck() {
    }

    private static boolean check(Object obj) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkArgument(obj instanceof InjectedByHilt, "'%s' is not an optionally injected android entry point. Check that you have annotated the class with both @AndroidEntryPoint and @OptionalInject.", obj.getClass());
        return ((InjectedByHilt) obj).wasInjectedByHilt();
    }

    public static boolean wasInjectedByHilt(AbstractActivityC0255l abstractActivityC0255l) {
        return check(abstractActivityC0255l);
    }

    public static boolean wasInjectedByHilt(BroadcastReceiver broadcastReceiver) {
        return check(broadcastReceiver);
    }

    public static boolean wasInjectedByHilt(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        return check(abstractComponentCallbacksC0567t);
    }

    public static boolean wasInjectedByHilt(Service service) {
        return check(service);
    }

    public static boolean wasInjectedByHilt(View view) {
        return check(view);
    }
}
