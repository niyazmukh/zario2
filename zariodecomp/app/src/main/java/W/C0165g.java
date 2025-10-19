package W;

import a.AbstractC0183a;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: W.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\g.1.smali */
public final class C0165g extends Q3.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public int f3601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y.c f3602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165g(Y.c cVar, O3.d dVar) {
        super(1, dVar);
        this.f3602b = cVar;
    }

    @Override // Q3.a
    public final O3.d create(O3.d dVar) {
        return new C0165g(this.f3602b, dVar);
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        return ((C0165g) create((O3.d) obj)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        P3.a aVar = P3.a.f2678a;
        int i = this.f3601a;
        K3.k kVar = K3.k.f2288a;
        if (i == 0) {
            AbstractC0183a.m0(obj);
            this.f3601a = 1;
            Y.c cVar = this.f3602b;
            SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f3866e.getValue()).edit();
            Set set = cVar.f3867f;
            if (set == null) {
                editorEdit.clear();
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    editorEdit.remove((String) it.next());
                }
            }
            if (!editorEdit.commit()) {
                throw new IOException("Unable to delete migrated keys from SharedPreferences.");
            }
            if (((SharedPreferences) cVar.f3866e.getValue()).getAll().isEmpty() && (context = cVar.f3864c) != null && (str = cVar.f3865d) != null) {
                Y.a.a(context, str);
            }
            if (set != null) {
                set.clear();
            }
            if (kVar == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0183a.m0(obj);
        }
        return kVar;
    }
}
