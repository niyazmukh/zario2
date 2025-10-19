package e2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: e2.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\x.smali */
public abstract class AbstractBinderC0476x extends AbstractBinderC0463k implements y {
    @Override // e2.AbstractBinderC0463k
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i5) {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0464l.a(parcel, Bundle.CREATOR);
        AbstractC0464l.b(parcel);
        b(bundle);
        return true;
    }
}
