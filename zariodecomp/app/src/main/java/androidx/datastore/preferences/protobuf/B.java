package androidx.datastore.preferences.protobuf;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\B.smali */
public final class B {
    public static void a(Object obj, long j5) {
        AbstractC0199b abstractC0199b = (AbstractC0199b) ((InterfaceC0219w) i0.f4510b.h(obj, j5));
        if (abstractC0199b.f4477a) {
            abstractC0199b.f4477a = false;
        }
    }

    public static InterfaceC0219w b(Object obj, long j5) {
        InterfaceC0219w interfaceC0219w = (InterfaceC0219w) i0.f4510b.h(obj, j5);
        if (((AbstractC0199b) interfaceC0219w).f4477a) {
            return interfaceC0219w;
        }
        T t4 = (T) interfaceC0219w;
        int i = t4.f4453c;
        T tH = t4.h(i == 0 ? 10 : i * 2);
        i0.o(obj, j5, tH);
        return tH;
    }
}
