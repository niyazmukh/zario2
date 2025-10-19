package g0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.EnumC0236o;
import b.AbstractActivityC0255l;
import b.C0248e;
import b.C0249f;
import l.C0708q;

/* renamed from: g0.w, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\w.1.smali */
public abstract class AbstractActivityC0570w extends AbstractActivityC0255l {

    /* renamed from: y, reason: collision with root package name */
    public boolean f7559y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7560z;

    /* renamed from: w, reason: collision with root package name */
    public final h1.i f7557w = new h1.i(new C0569v(this), 15);

    /* renamed from: x, reason: collision with root package name */
    public final C0242x f7558x = new C0242x(this);

    /* renamed from: A, reason: collision with root package name */
    public boolean f7556A = true;

    public AbstractActivityC0570w() {
        ((C0708q) this.f4906e.f88c).f("android:support:lifecycle", new C0248e(this, 1));
        final int i = 0;
        d(new L.a(this) { // from class: g0.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0570w f7550b;

            {
                this.f7550b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        this.f7550b.f7557w.y();
                        break;
                    default:
                        this.f7550b.f7557w.y();
                        break;
                }
            }
        });
        final int i5 = 1;
        this.f4915r.add(new L.a(this) { // from class: g0.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0570w f7550b;

            {
                this.f7550b = this;
            }

            @Override // L.a
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        this.f7550b.f7557w.y();
                        break;
                    default:
                        this.f7550b.f7557w.y();
                        break;
                }
            }
        });
        f(new C0249f(this, 1));
    }

    public static boolean n(C0542J c0542j) {
        EnumC0236o enumC0236o = EnumC0236o.f4660c;
        boolean zN = false;
        for (AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t : c0542j.f7331c.h()) {
            if (abstractComponentCallbacksC0567t != null) {
                C0569v c0569v = abstractComponentCallbacksC0567t.f7546x;
                if ((c0569v == null ? null : c0569v.f7555e) != null) {
                    zN |= n(abstractComponentCallbacksC0567t.m());
                }
                S s4 = abstractComponentCallbacksC0567t.f7521S;
                EnumC0236o enumC0236o2 = EnumC0236o.f4661d;
                if (s4 != null) {
                    s4.d();
                    if (s4.f7399e.f4672d.compareTo(enumC0236o2) >= 0) {
                        abstractComponentCallbacksC0567t.f7521S.f7399e.g(enumC0236o);
                        zN = true;
                    }
                }
                if (abstractComponentCallbacksC0567t.f7520R.f4672d.compareTo(enumC0236o2) >= 0) {
                    abstractComponentCallbacksC0567t.f7520R.g(enumC0236o);
                    zN = true;
                }
            }
        }
        return zN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r4 = this;
            r0 = 0
            super.dump(r5, r6, r7, r8)
            if (r8 == 0) goto L5f
            int r1 = r8.length
            if (r1 <= 0) goto L5f
            r1 = r8[r0]
            r1.getClass()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -645125871: goto L44;
                case 100470631: goto L39;
                case 472614934: goto L2e;
                case 1159329357: goto L23;
                case 1455016274: goto L18;
                default: goto L16;
            }
        L16:
            r0 = r2
            goto L4d
        L18:
            java.lang.String r0 = "--autofill"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L16
        L21:
            r0 = 4
            goto L4d
        L23:
            java.lang.String r0 = "--contentcapture"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2c
            goto L16
        L2c:
            r0 = 3
            goto L4d
        L2e:
            java.lang.String r0 = "--list-dumpables"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L37
            goto L16
        L37:
            r0 = 2
            goto L4d
        L39:
            java.lang.String r0 = "--dump-dumpable"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L42
            goto L16
        L42:
            r0 = 1
            goto L4d
        L44:
            java.lang.String r3 = "--translation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4d
            goto L16
        L4d:
            switch(r0) {
                case 0: goto L58;
                case 1: goto L51;
                case 2: goto L51;
                case 3: goto L5e;
                case 4: goto L5e;
                default: goto L50;
            }
        L50:
            goto L5f
        L51:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L5f
            goto L5e
        L58:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L5f
        L5e:
            return
        L5f:
            r7.print(r5)
            java.lang.String r0 = "Local FragmentActivity "
            r7.print(r0)
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " State:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.print(r0)
            java.lang.String r1 = "mCreated="
            r7.print(r1)
            boolean r1 = r4.f7559y
            r7.print(r1)
            java.lang.String r1 = " mResumed="
            r7.print(r1)
            boolean r1 = r4.f7560z
            r7.print(r1)
            java.lang.String r1 = " mStopped="
            r7.print(r1)
            boolean r1 = r4.f7556A
            r7.print(r1)
            android.app.Application r1 = r4.getApplication()
            if (r1 == 0) goto Lbb
            S0.v r1 = new S0.v
            androidx.lifecycle.m0 r2 = r4.e()
            r1.<init>(r4, r2)
            r1.a(r0, r7)
        Lbb:
            h1.i r4 = r4.f7557w
            java.lang.Object r4 = r4.f7641b
            g0.v r4 = (g0.C0569v) r4
            g0.J r4 = r4.f7554d
            r4.u(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.AbstractActivityC0570w.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final C0542J m() {
        return ((C0569v) this.f7557w.f7641b).f7554d;
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public void onActivityResult(int i, int i5, Intent intent) {
        this.f7557w.y();
        super.onActivityResult(i, i5, intent);
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7558x.d(androidx.lifecycle.n.ON_CREATE);
        C0542J c0542j = ((C0569v) this.f7557w.f7641b).f7554d;
        c0542j.f7321F = false;
        c0542j.G = false;
        c0542j.f7327M.f7368f = false;
        c0542j.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0569v) this.f7557w.f7641b).f7554d.f7334f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0569v) this.f7557w.f7641b).f7554d.k();
        this.f7558x.d(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0569v) this.f7557w.f7641b).f7554d.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f7560z = false;
        ((C0569v) this.f7557w.f7641b).f7554d.t(5);
        this.f7558x.d(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f7558x.d(androidx.lifecycle.n.ON_RESUME);
        C0542J c0542j = ((C0569v) this.f7557w.f7641b).f7554d;
        c0542j.f7321F = false;
        c0542j.G = false;
        c0542j.f7327M.f7368f = false;
        c0542j.t(7);
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f7557w.y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        h1.i iVar = this.f7557w;
        iVar.y();
        super.onResume();
        this.f7560z = true;
        ((C0569v) iVar.f7641b).f7554d.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        h1.i iVar = this.f7557w;
        iVar.y();
        super.onStart();
        this.f7556A = false;
        boolean z4 = this.f7559y;
        C0569v c0569v = (C0569v) iVar.f7641b;
        if (!z4) {
            this.f7559y = true;
            C0542J c0542j = c0569v.f7554d;
            c0542j.f7321F = false;
            c0542j.G = false;
            c0542j.f7327M.f7368f = false;
            c0542j.t(4);
        }
        c0569v.f7554d.x(true);
        this.f7558x.d(androidx.lifecycle.n.ON_START);
        C0542J c0542j2 = c0569v.f7554d;
        c0542j2.f7321F = false;
        c0542j2.G = false;
        c0542j2.f7327M.f7368f = false;
        c0542j2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f7557w.y();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f7556A = true;
        while (n(m())) {
        }
        C0542J c0542j = ((C0569v) this.f7557w.f7641b).f7554d;
        c0542j.G = true;
        c0542j.f7327M.f7368f = true;
        c0542j.t(4);
        this.f7558x.d(androidx.lifecycle.n.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0569v) this.f7557w.f7641b).f7554d.f7334f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
