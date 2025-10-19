package d;

import b.C0250g;
import e.C0447a;
import java.util.HashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d.1\e.smali */
public final class e extends AbstractC0437c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0250g f6773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S0.f f6774d;

    public /* synthetic */ e(C0250g c0250g, String str, S0.f fVar, int i) {
        this.f6771a = i;
        this.f6773c = c0250g;
        this.f6772b = str;
        this.f6774d = fVar;
    }

    @Override // d.AbstractC0437c
    public final void a(Object obj) {
        switch (this.f6771a) {
            case 0:
                C0250g c0250g = this.f6773c;
                HashMap map = c0250g.f4889b;
                String str = this.f6772b;
                Integer num = (Integer) map.get(str);
                C0447a c0447a = (C0447a) this.f6774d;
                if (num == null) {
                    throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0447a + " and input android.permission.POST_NOTIFICATIONS. You must ensure the ActivityResultLauncher is registered before calling launch().");
                }
                c0250g.f4891d.add(str);
                try {
                    c0250g.b(num.intValue(), c0447a, "android.permission.POST_NOTIFICATIONS");
                    return;
                } catch (Exception e5) {
                    c0250g.f4891d.remove(str);
                    throw e5;
                }
            default:
                C0250g c0250g2 = this.f6773c;
                HashMap map2 = c0250g2.f4889b;
                String str2 = this.f6772b;
                Integer num2 = (Integer) map2.get(str2);
                S0.f fVar = this.f6774d;
                if (num2 != null) {
                    c0250g2.f4891d.add(str2);
                    try {
                        c0250g2.b(num2.intValue(), fVar, obj);
                        return;
                    } catch (Exception e6) {
                        c0250g2.f4891d.remove(str2);
                        throw e6;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + fVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public void b() {
        this.f6773c.e(this.f6772b);
    }
}
