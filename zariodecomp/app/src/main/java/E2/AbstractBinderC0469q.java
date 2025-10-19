package e2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: e2.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\q.smali */
public abstract class AbstractBinderC0469q extends AbstractBinderC0463k implements InterfaceC0470r {
    @Override // e2.AbstractBinderC0463k
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i == 2) {
            Bundle bundle = (Bundle) AbstractC0464l.a(parcel, Bundle.CREATOR);
            AbstractC0464l.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Bundle bundle2 = (Bundle) AbstractC0464l.a(parcel, Bundle.CREATOR);
            AbstractC0464l.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Bundle bundle3 = (Bundle) AbstractC0464l.a(parcel, Bundle.CREATOR);
            AbstractC0464l.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) AbstractC0464l.a(parcel, Bundle.CREATOR);
        AbstractC0464l.b(parcel);
        b(bundle4);
        return true;
    }
}
