package androidx.credentials.playservices;

import R.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\credentials\playservices\CredentialProviderMetadataHolder.smali */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final a f4401a = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f4401a;
    }
}
