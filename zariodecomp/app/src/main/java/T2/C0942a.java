package t2;

import W.C0160b;
import X3.l;
import Z.j;
import Z.k;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t2.1\a.smali */
public final /* synthetic */ class C0942a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0949h f10181b;

    public /* synthetic */ C0942a(C0949h c0949h, int i) {
        this.f10180a = i;
        this.f10181b = c0949h;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f10180a) {
            case 0:
                C0160b ex = (C0160b) obj;
                i.e(ex, "ex");
                Log.w(s.a(C0949h.class).b(), "CorruptionException in " + this.f10181b.f10200a + " DataStore running in process " + Process.myPid(), ex);
                return new a0.b(true);
            default:
                Context it = (Context) obj;
                i.e(it, "it");
                String sharedPreferencesName = this.f10181b.f10200a;
                LinkedHashSet keysToMigrate = Z.l.f3938a;
                i.e(sharedPreferencesName, "sharedPreferencesName");
                i.e(keysToMigrate, "keysToMigrate");
                return p1.b.B(new Y.c(it, sharedPreferencesName, Y.d.f3868a, new k(keysToMigrate, null), new j(3, 0, null)));
        }
    }
}
