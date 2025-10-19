package B3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: B3.q0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\q0.1.smali */
public abstract class AbstractC0073q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f946a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f947b;

    public AbstractC0073q0() {
        this.f946a = 0;
        this.f947b = Collections.newSetFromMap(new IdentityHashMap());
    }

    public abstract void a();

    public abstract void b();

    public void c(Object obj, boolean z4) {
        Set set = (Set) this.f947b;
        int size = set.size();
        if (z4) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }

    public String toString() {
        switch (this.f946a) {
            case 1:
                return (String) this.f947b;
            default:
                return super.toString();
        }
    }

    public AbstractC0073q0(String str) {
        this.f946a = 1;
        this.f947b = str;
    }
}
