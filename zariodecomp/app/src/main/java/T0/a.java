package T0;

import android.app.Application;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\T0\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3133a = new a();

    public final String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.i.d(processName, "getProcessName()");
        return processName;
    }
}
