package u1;

import S0.f;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u1.1\b.smali */
public final class BinderC0970b extends zzq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10479a;

    public BinderC0970b(TaskCompletionSource taskCompletionSource) {
        this.f10479a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        f.X(status, pendingIntent, this.f10479a);
    }
}
