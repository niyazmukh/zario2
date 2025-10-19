package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zau;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\H.smali */
public final class H extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f5574a;

    /* renamed from: b, reason: collision with root package name */
    public final C0362z f5575b;

    public H(C0362z c0362z) {
        this.f5575b = c0362z;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            C0362z c0362z = this.f5575b;
            A a5 = (A) ((Y) c0362z.f5648b).f5609c;
            a5.f5543b.set(null);
            zau zauVar = a5.f5547f.f5638n;
            zauVar.sendMessage(zauVar.obtainMessage(3));
            AlertDialog alertDialog = (AlertDialog) c0362z.f5647a;
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            synchronized (this) {
                try {
                    Context context2 = this.f5574a;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f5574a = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
