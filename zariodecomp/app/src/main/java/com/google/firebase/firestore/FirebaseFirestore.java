package com.google.firebase.firestore;

import A2.C0004d;
import A2.C0009i;
import A2.G;
import B2.f;
import E2.k;
import E2.n;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g1.i;
import java.util.ArrayList;
import q2.o;
import w2.F;
import w2.q;
import w2.r;
import x2.C1035a;
import x2.C1037c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\firestore\FirebaseFirestore.smali */
public class FirebaseFirestore {

    /* renamed from: a, reason: collision with root package name */
    public final n f6397a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6398b;

    /* renamed from: c, reason: collision with root package name */
    public final f f6399c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6400d;

    /* renamed from: e, reason: collision with root package name */
    public final C1037c f6401e;

    /* renamed from: f, reason: collision with root package name */
    public final C1035a f6402f;

    /* renamed from: g, reason: collision with root package name */
    public final i f6403g;
    public r h;
    public final C0009i i;

    /* renamed from: j, reason: collision with root package name */
    public final k f6404j;

    public FirebaseFirestore(Context context, f fVar, String str, C1037c c1037c, C1035a c1035a, n nVar, k kVar) {
        context.getClass();
        this.f6398b = context;
        this.f6399c = fVar;
        this.f6403g = new i(fVar, 28);
        str.getClass();
        this.f6400d = str;
        this.f6401e = c1037c;
        this.f6402f = c1035a;
        this.f6397a = nVar;
        this.i = new C0009i(new C0004d(this, 16));
        this.f6404j = kVar;
        q qVar = new q();
        qVar.f10956f = false;
        qVar.f10951a = "firestore.googleapis.com";
        qVar.f10952b = true;
        qVar.f10953c = true;
        qVar.f10954d = 104857600L;
        this.h = qVar.a();
    }

    public static FirebaseFirestore a(Context context, l2.f fVar, o oVar, o oVar2, k kVar) {
        fVar.a();
        String str = fVar.f8773c.f8789g;
        if (str == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        f fVar2 = new f(str, "(default)");
        C1037c c1037c = new C1037c(oVar);
        C1035a c1035a = new C1035a();
        oVar2.a(new C0004d(c1035a, 17));
        fVar.a();
        return new FirebaseFirestore(context, fVar2, fVar.f8772b, c1037c, c1035a, new n(14), kVar);
    }

    @Keep
    public static void setClientLanguage(String str) {
        E2.q.f1481j = str;
    }

    public final Task b(F f2) {
        Task taskD;
        this.i.B();
        G g3 = new G();
        g3.f88c = new ArrayList();
        g3.f86a = false;
        g3.f87b = this;
        f2.a(g3);
        if (g3.f86a) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
        g3.f86a = true;
        if (((ArrayList) g3.f88c).isEmpty()) {
            return Tasks.forResult(null);
        }
        C0009i c0009i = ((FirebaseFirestore) g3.f87b).i;
        synchronized (c0009i) {
            c0009i.B();
            taskD = ((y2.o) c0009i.f205c).d((ArrayList) g3.f88c);
        }
        return taskD;
    }
}
