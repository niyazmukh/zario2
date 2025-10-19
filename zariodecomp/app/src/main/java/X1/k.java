package X1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\k.smali */
public final class k extends r1.d {
    public final void y(w wVar, float f2, float f3) {
        wVar.d(0.0f, f3 * f2, 180.0f, 90.0f);
        float f5 = f3 * 2.0f * f2;
        s sVar = new s(0.0f, 0.0f, f5, f5);
        sVar.f3804f = 180.0f;
        sVar.f3805g = 90.0f;
        wVar.f3817g.add(sVar);
        q qVar = new q(sVar);
        wVar.a(180.0f);
        wVar.h.add(qVar);
        wVar.f3815e = 270.0f;
        float f6 = (0.0f + f5) * 0.5f;
        float f7 = (f5 - 0.0f) / 2.0f;
        double d5 = 270.0f;
        wVar.f3813c = (((float) Math.cos(Math.toRadians(d5))) * f7) + f6;
        wVar.f3814d = (f7 * ((float) Math.sin(Math.toRadians(d5)))) + f6;
    }
}
