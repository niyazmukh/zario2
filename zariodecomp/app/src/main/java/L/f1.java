package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\f1.smali */
public final class f1 implements InterfaceC0690g0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f8574a;

    /* renamed from: b, reason: collision with root package name */
    public int f8575b;

    /* renamed from: c, reason: collision with root package name */
    public View f8576c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f8577d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f8578e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8579f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8580g;
    public CharSequence h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f8581j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f8582k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8583l;

    /* renamed from: m, reason: collision with root package name */
    public C0693i f8584m;

    /* renamed from: n, reason: collision with root package name */
    public int f8585n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f8586o;

    public final void a(int i) {
        View view;
        int i5 = this.f8575b ^ i;
        this.f8575b = i;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i & 4) != 0) {
                    b();
                }
                int i6 = this.f8575b & 4;
                Toolbar toolbar = this.f8574a;
                if (i6 != 0) {
                    Drawable drawable = this.f8579f;
                    if (drawable == null) {
                        drawable = this.f8586o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                c();
            }
            int i7 = i5 & 8;
            Toolbar toolbar2 = this.f8574a;
            if (i7 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f8576c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f8575b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f8581j);
            Toolbar toolbar = this.f8574a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f8585n);
            } else {
                toolbar.setNavigationContentDescription(this.f8581j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i = this.f8575b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f8578e) == null) {
            drawable = this.f8577d;
        }
        this.f8574a.setLogo(drawable);
    }
}
