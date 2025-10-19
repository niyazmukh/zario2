package g;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import n0.C0762a;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g\c.1.smali */
public final class HandlerC0528c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7169a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f7170b;

    public /* synthetic */ HandlerC0528c() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        p1.b[] bVarArr;
        switch (this.f7169a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f7170b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C0762a c0762a = (C0762a) this.f7170b;
                do {
                    synchronized (c0762a.f8966b) {
                        try {
                            size = c0762a.f8968d.size();
                            if (size <= 0) {
                                return;
                            }
                            bVarArr = new p1.b[size];
                            c0762a.f8968d.toArray(bVarArr);
                            c0762a.f8968d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (size <= 0);
                p1.b bVar = bVarArr[0];
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0528c(C0762a c0762a, Looper looper) {
        super(looper);
        this.f7170b = c0762a;
    }
}
