package F1;

import M0.i;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import b.C0250g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d.C0439f;
import d.InterfaceC0436b;
import java.io.Serializable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F1\b.smali */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1664a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1665b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1666c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1667d;

    public /* synthetic */ b(Object obj, int i, Object obj2, int i5) {
        this.f1664a = i5;
        this.f1667d = obj;
        this.f1665b = i;
        this.f1666c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1664a) {
            case 0:
                ((BottomSheetBehavior) this.f1667d).E((View) this.f1666c, this.f1665b, false);
                break;
            case 1:
                ((i) this.f1666c).a((Intent) this.f1667d, this.f1665b);
                break;
            case 2:
                ((SystemForegroundService) this.f1667d).f4871e.notify(this.f1665b, (Notification) this.f1666c);
                break;
            case 3:
                Serializable serializable = (Serializable) ((g1.i) this.f1666c).f7594b;
                C0250g c0250g = (C0250g) this.f1667d;
                String str = (String) c0250g.f4888a.get(Integer.valueOf(this.f1665b));
                if (str != null) {
                    C0439f c0439f = (C0439f) c0250g.f4892e.get(str);
                    if (c0439f == null) {
                        c0250g.f4894g.remove(str);
                        c0250g.f4893f.put(str, serializable);
                        break;
                    } else {
                        InterfaceC0436b interfaceC0436b = c0439f.f6775a;
                        if (c0250g.f4891d.remove(str)) {
                            interfaceC0436b.j(serializable);
                            break;
                        }
                    }
                }
                break;
            case 4:
                ((C0250g) this.f1667d).a(this.f1665b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1666c));
                break;
            default:
                ((TextView) this.f1666c).setTypeface((Typeface) this.f1667d, this.f1665b);
                break;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, int i5) {
        this.f1664a = i5;
        this.f1666c = obj;
        this.f1667d = obj2;
        this.f1665b = i;
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1664a = 0;
        this.f1667d = bottomSheetBehavior;
        this.f1666c = view;
        this.f1665b = i;
    }
}
