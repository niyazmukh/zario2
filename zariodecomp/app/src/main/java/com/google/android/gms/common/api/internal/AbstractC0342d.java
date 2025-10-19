package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\d.1.smali */
public abstract class AbstractC0342d extends BasePendingResult implements InterfaceC0343e {
    private final com.google.android.gms.common.api.i mApi;
    private final com.google.android.gms.common.api.c mClientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0342d(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        com.google.android.gms.common.internal.C.g(oVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.C.g(iVar, "Api must not be null");
        this.mClientKey = iVar.f5540b;
        this.mApi = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.mApi;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.mClientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.s sVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e5) {
            setFailedResult(new Status(8, e5.getLocalizedMessage(), null, null));
            throw e5;
        } catch (RemoteException e6) {
            setFailedResult(new Status(8, e6.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.C.a("Failed result must not be success", !status.c());
        com.google.android.gms.common.api.s sVarCreateFailedResult = createFailedResult(status);
        setResult((AbstractC0342d) sVarCreateFailedResult);
        onSetFailedResult(sVarCreateFailedResult);
    }
}
