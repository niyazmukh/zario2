package M;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: M.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\e.1.smali */
public final class C0120e implements InterfaceC0119d, InterfaceC0121f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2379a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2380b;

    /* renamed from: c, reason: collision with root package name */
    public int f2381c;

    /* renamed from: d, reason: collision with root package name */
    public int f2382d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2383e;

    /* renamed from: f, reason: collision with root package name */
    public Cloneable f2384f;

    public /* synthetic */ C0120e() {
        this.f2379a = 0;
    }

    public void a(u0 u0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((i0) it.next()).f2396a.c() & 8) != 0) {
                ((View) this.f2383e).setTranslationY(B1.a.c(this.f2382d, 0, r3.f2396a.b()));
                return;
            }
        }
    }

    @Override // M.InterfaceC0121f
    public int b() {
        return this.f2381c;
    }

    @Override // M.InterfaceC0119d
    public C0122g build() {
        return new C0122g(new C0120e(this));
    }

    @Override // M.InterfaceC0121f
    public ClipData e() {
        return (ClipData) this.f2380b;
    }

    @Override // M.InterfaceC0121f
    public int g() {
        return this.f2382d;
    }

    @Override // M.InterfaceC0119d
    public void h(Bundle bundle) {
        this.f2384f = bundle;
    }

    @Override // M.InterfaceC0121f
    public ContentInfo i() {
        return null;
    }

    @Override // M.InterfaceC0119d
    public void k(Uri uri) {
        this.f2383e = uri;
    }

    @Override // M.InterfaceC0119d
    public void s(int i) {
        this.f2382d = i;
    }

    public String toString() {
        String str;
        switch (this.f2379a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f2380b).getDescription());
                sb.append(", source=");
                int i = this.f2381c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i5 = this.f2382d;
                sb.append((i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5));
                Uri uri = (Uri) this.f2383e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return B.a.m(sb, ((Bundle) this.f2384f) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0120e(View view) {
        this.f2379a = 2;
        this.f2384f = new int[2];
        this.f2383e = view;
    }

    public C0120e(C0120e c0120e) {
        this.f2379a = 1;
        ClipData clipData = (ClipData) c0120e.f2380b;
        clipData.getClass();
        this.f2380b = clipData;
        int i = c0120e.f2381c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f2381c = i;
            int i5 = c0120e.f2382d;
            if ((i5 & 1) == i5) {
                this.f2382d = i5;
                this.f2383e = (Uri) c0120e.f2383e;
                this.f2384f = (Bundle) c0120e.f2384f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
