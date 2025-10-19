package com.google.protobuf;

/* renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\p0.1.smali */
public final class C0418p0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0388a f6565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6566b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f6567c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6568d;

    public C0418p0(AbstractC0388a abstractC0388a, String str, Object[] objArr) {
        this.f6565a = abstractC0388a;
        this.f6566b = str;
        this.f6567c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6568d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f6568d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final AbstractC0388a a() {
        return this.f6565a;
    }

    public final Object[] b() {
        return this.f6567c;
    }

    public final String c() {
        return this.f6566b;
    }

    public final int d() {
        int i = this.f6568d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
