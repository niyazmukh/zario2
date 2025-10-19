package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\d.smali */
public final class C0618d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f7971f;

    /* renamed from: a, reason: collision with root package name */
    public int f7972a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f7973b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f7974c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f7975d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f7976e;

    public C0618d(Context context, int i) {
        super(context);
        this.f7972a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f7976e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f7975d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f7975d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f7973b == null) {
            this.f7973b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7973b.setTo(theme);
            }
        }
        this.f7973b.applyStyle(this.f7972a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f7976e
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f7975d
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = j.C0618d.f7971f
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            j.C0618d.f7971f = r1
        L16:
            android.content.res.Configuration r1 = j.C0618d.f7971f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f7975d
            android.content.Context r0 = j.c.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f7976e = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f7976e = r0
        L32:
            android.content.res.Resources r3 = r3.f7976e
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0618d.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7974c == null) {
            this.f7974c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7974c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f7973b;
        if (theme != null) {
            return theme;
        }
        if (this.f7972a == 0) {
            this.f7972a = 2131952153;
        }
        b();
        return this.f7973b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f7972a != i) {
            this.f7972a = i;
            b();
        }
    }
}
