package f1;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f1.1\c.smali */
public final /* synthetic */ class C0493c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0493c f6996b = new C0493c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6997a;

    public /* synthetic */ C0493c(int i) {
        this.f6997a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6997a) {
        }
        return ((Scope) obj).f5529b.compareTo(((Scope) obj2).f5529b);
    }
}
