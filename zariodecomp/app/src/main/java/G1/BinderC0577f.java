package g1;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.internal.p000authapi.zbc;

/* renamed from: g1.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\f.smali */
public final class BinderC0577f extends zbb implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f7589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0577f(g gVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f7588a = i;
        this.f7589b = gVar;
    }

    @Override // g1.j
    public void e(Status status) {
        switch (this.f7588a) {
            case 1:
                this.f7589b.setResult((g) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i5) {
        switch (i) {
            case 101:
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                zbc(status);
                break;
            case 103:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                e(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // g1.j
    public void zbc(Status status) {
        switch (this.f7588a) {
            case 0:
                this.f7589b.setResult((g) status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
