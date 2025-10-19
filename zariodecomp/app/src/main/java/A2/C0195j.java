package a2;

import S0.n;
import android.os.Handler;
import android.os.Message;

/* renamed from: a2.j, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a2.1\j.smali */
public final class C0195j implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f4105a;

    public C0195j(n nVar) {
        this.f4105a = nVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        n nVar = this.f4105a;
        C0196k c0196k = (C0196k) message.obj;
        synchronized (nVar.f2872a) {
            if (((C0196k) nVar.f2874c) == c0196k || ((C0196k) nVar.f2875d) == c0196k) {
                nVar.b(c0196k, 2);
            }
        }
        return true;
    }
}
