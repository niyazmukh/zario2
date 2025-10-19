package B3;

import z3.AbstractC1098w;
import z3.EnumC1087k;

/* renamed from: B3.s1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\s1.1.smali */
public final class C0078s1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1098w f966a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC1087k f967b;

    /* renamed from: c, reason: collision with root package name */
    public final C0071p1 f968c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f969d;

    public C0078s1(AbstractC1098w abstractC1098w, C0071p1 c0071p1) {
        EnumC1087k enumC1087k = EnumC1087k.f11344d;
        this.f969d = false;
        this.f966a = abstractC1098w;
        this.f967b = enumC1087k;
        this.f968c = c0071p1;
    }

    public static void a(C0078s1 c0078s1, EnumC1087k enumC1087k) {
        c0078s1.f967b = enumC1087k;
        if (enumC1087k == EnumC1087k.f11342b || enumC1087k == EnumC1087k.f11343c) {
            c0078s1.f969d = true;
        } else if (enumC1087k == EnumC1087k.f11344d) {
            c0078s1.f969d = false;
        }
    }
}
