package P;

import A2.C0004d;
import K2.c;
import M.C0120e;
import M.InterfaceC0119d;
import M.S;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import g1.i;
import l.C0713t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P\b.smali */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0004d f2662a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, C0004d c0004d) {
        super(inputConnection, false);
        this.f2662a = c0004d;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0119d iVar;
        i iVar2 = inputContentInfo == null ? null : new i(new c(inputContentInfo, 10), 10);
        C0004d c0004d = this.f2662a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((c) iVar2.f7594b).b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((c) iVar2.f7594b).b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e5) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((c) iVar2.f7594b).b).getDescription();
        c cVar = (c) iVar2.f7594b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) cVar.b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new h1.i(clipData, 2);
        } else {
            C0120e c0120e = new C0120e();
            c0120e.f2380b = clipData;
            c0120e.f2381c = 2;
            iVar = c0120e;
        }
        iVar.k(((InputContentInfo) cVar.b).getLinkUri());
        iVar.h(bundle2);
        if (S.e((C0713t) c0004d.f177b, iVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
