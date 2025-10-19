package g1;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0342d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\g.smali */
public final class g extends AbstractC0342d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, int i) {
        super(Z0.b.f3943b, oVar);
        this.f7590a = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        int i = this.f7590a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0342d
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f7590a) {
            case 0:
                C0576e c0576e = (C0576e) bVar;
                k kVar = (k) c0576e.getService();
                BinderC0577f binderC0577f = new BinderC0577f(this, 0);
                Parcel parcelZba = kVar.zba();
                zbc.zbd(parcelZba, binderC0577f);
                zbc.zbc(parcelZba, c0576e.f7587a);
                kVar.zbb(102, parcelZba);
                break;
            default:
                C0576e c0576e2 = (C0576e) bVar;
                k kVar2 = (k) c0576e2.getService();
                BinderC0577f binderC0577f2 = new BinderC0577f(this, 1);
                Parcel parcelZba2 = kVar2.zba();
                zbc.zbd(parcelZba2, binderC0577f2);
                zbc.zbc(parcelZba2, c0576e2.f7587a);
                kVar2.zbb(103, parcelZba2);
                break;
        }
    }
}
