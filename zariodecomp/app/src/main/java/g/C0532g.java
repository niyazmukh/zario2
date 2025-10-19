package g;

import android.os.Bundle;
import com.niyaz.zario.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l.C0708q;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\g.1.smali */
public final class C0532g implements x0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7202a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7203b;

    public C0532g(C0708q registry) {
        kotlin.jvm.internal.i.e(registry, "registry");
        this.f7203b = new LinkedHashSet();
        registry.f("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        switch (this.f7202a) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f7203b).o().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f7203b));
                return bundle2;
        }
    }

    public C0532g(MainActivity mainActivity) {
        this.f7203b = mainActivity;
    }
}
