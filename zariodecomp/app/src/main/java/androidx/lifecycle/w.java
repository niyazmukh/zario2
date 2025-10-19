package androidx.lifecycle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\lifecycle\w.1.smali */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0236o f4667a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0239t f4668b;

    public final void a(InterfaceC0241v interfaceC0241v, n nVar) {
        EnumC0236o enumC0236oA = nVar.a();
        EnumC0236o state1 = this.f4667a;
        kotlin.jvm.internal.i.e(state1, "state1");
        if (enumC0236oA.compareTo(state1) < 0) {
            state1 = enumC0236oA;
        }
        this.f4667a = state1;
        this.f4668b.onStateChanged(interfaceC0241v, nVar);
        this.f4667a = enumC0236oA;
    }
}
