package X2;

import com.niyaz.zario.data.local.AppDatabase_Impl;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X2\n.smali */
public final class n extends u0.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f3846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, AppDatabase_Impl appDatabase_Impl) {
        super(appDatabase_Impl);
        this.f3846d = oVar;
    }

    public final String m() {
        return "UPDATE OR ABORT `pending_hourly_sync` SET `id` = ?,`parentCycleId` = ?,`userId` = ?,`userEmail` = ?,`planLabel` = ?,`cycleStartTime` = ?,`hourStartTime` = ?,`hourEndTime` = ?,`packageName` = ?,`usageMs` = ?,`syncType` = ?,`attempts` = ?,`lastAttemptAt` = ?,`createdAt` = ? WHERE `id` = ?";
    }

    public final void v(z0.i iVar, Object obj) {
        Y2.f fVar = (Y2.f) obj;
        iVar.d(1, fVar.f3913a);
        Long l4 = fVar.f3914b;
        if (l4 == null) {
            iVar.f(2);
        } else {
            iVar.d(2, l4.longValue());
        }
        String str = fVar.f3915c;
        if (str == null) {
            iVar.f(3);
        } else {
            iVar.c(3, str);
        }
        String str2 = fVar.f3916d;
        if (str2 == null) {
            iVar.f(4);
        } else {
            iVar.c(4, str2);
        }
        String str3 = fVar.f3917e;
        if (str3 == null) {
            iVar.f(5);
        } else {
            iVar.c(5, str3);
        }
        iVar.d(6, fVar.f3918f);
        iVar.d(7, fVar.f3919g);
        iVar.d(8, fVar.h);
        String str4 = fVar.i;
        if (str4 == null) {
            iVar.f(9);
        } else {
            iVar.c(9, str4);
        }
        iVar.d(10, fVar.f3920j);
        Object obj2 = this.f3846d.f3851e;
        Y2.e eVar = fVar.f3921k;
        String strName = eVar != null ? eVar.name() : null;
        if (strName == null) {
            iVar.f(11);
        } else {
            iVar.c(11, strName);
        }
        iVar.d(12, fVar.f3922l);
        Long l5 = fVar.f3923m;
        if (l5 == null) {
            iVar.f(13);
        } else {
            iVar.d(13, l5.longValue());
        }
        iVar.d(14, fVar.f3924n);
        iVar.d(15, fVar.f3913a);
    }
}
