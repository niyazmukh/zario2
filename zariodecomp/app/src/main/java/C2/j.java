package C2;

import E2.G;
import android.util.Base64;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.protobuf.AbstractC0409l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.AbstractC0653c;
import s2.AbstractC0869c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C2\j.smali */
public final class j implements K3.c, q2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1091a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1092b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1093c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1094d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1095e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1096f;

    public /* synthetic */ j(int i) {
        this.f1091a = i;
    }

    @Override // q2.d
    public Object a(G g3) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((q2.q) this.f1092b, (q2.q) this.f1093c, (q2.q) this.f1094d, (q2.q) this.f1095e, (q2.q) this.f1096f, g3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X3.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X3.a, kotlin.jvm.internal.j] */
    @Override // K3.c
    public Object getValue() {
        f0 f0Var = (f0) this.f1096f;
        if (f0Var != null) {
            return f0Var;
        }
        l0 l0Var = new l0((m0) ((kotlin.jvm.internal.j) this.f1093c).invoke(), (i0) ((X3.a) this.f1094d).invoke(), (AbstractC0653c) ((kotlin.jvm.internal.j) this.f1095e).invoke());
        Class clsA = ((kotlin.jvm.internal.d) this.f1092b).a();
        kotlin.jvm.internal.i.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        f0 f0VarA = l0Var.a(clsA);
        this.f1096f = f0VarA;
        return f0VarA;
    }

    public String toString() {
        switch (this.f1091a) {
            case 2:
                return "RemoteEvent{snapshotVersion=" + ((B2.o) this.f1093c) + ", targetChanges=" + ((Map) this.f1092b) + ", targetMismatches=" + ((Map) this.f1094d) + ", documentUpdates=" + ((Map) this.f1095e) + ", resolvedLimboDocuments=" + ((Set) this.f1096f) + '}';
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f1092b) + ", mProviderPackage: " + ((String) this.f1093c) + ", mQuery: " + ((String) this.f1094d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f1095e;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i5 = 0; i5 < list2.size(); i5++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(kotlin.jvm.internal.d dVar, X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f1091a = 4;
        this.f1092b = dVar;
        this.f1093c = (kotlin.jvm.internal.j) aVar;
        this.f1094d = aVar2;
        this.f1095e = (kotlin.jvm.internal.j) aVar3;
    }

    public j(i iVar, B2.o oVar, ArrayList arrayList, AbstractC0409l abstractC0409l, AbstractC0869c abstractC0869c) {
        this.f1091a = 0;
        this.f1092b = iVar;
        this.f1093c = oVar;
        this.f1094d = arrayList;
        this.f1095e = abstractC0409l;
        this.f1096f = abstractC0869c;
    }

    public j(B2.o oVar, Map map, Map map2, Map map3, Set set) {
        this.f1091a = 2;
        this.f1093c = oVar;
        this.f1092b = map;
        this.f1094d = map2;
        this.f1095e = map3;
        this.f1096f = set;
    }

    public j(String str, String str2, String str3, List list) {
        this.f1091a = 3;
        str.getClass();
        this.f1092b = str;
        str2.getClass();
        this.f1093c = str2;
        this.f1094d = str3;
        list.getClass();
        this.f1095e = list;
        this.f1096f = str + "-" + str2 + "-" + str3;
    }
}
