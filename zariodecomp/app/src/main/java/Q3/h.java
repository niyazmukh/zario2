package Q3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q3\h.smali */
public abstract class h extends a {
    public h(O3.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != O3.j.f2661a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // O3.d
    public final O3.i getContext() {
        return O3.j.f2661a;
    }
}
