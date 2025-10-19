package p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o2.C0796B;
import o2.D;
import o2.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\e.smali */
public final class e extends o2.o {
    public static final Parcelable.Creator<e> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public zzahv f9328a;

    /* renamed from: b, reason: collision with root package name */
    public c f9329b;

    /* renamed from: c, reason: collision with root package name */
    public String f9330c;

    /* renamed from: d, reason: collision with root package name */
    public String f9331d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9332e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f9333f;

    /* renamed from: k, reason: collision with root package name */
    public String f9334k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f9335l;

    /* renamed from: m, reason: collision with root package name */
    public f f9336m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9337n;

    /* renamed from: o, reason: collision with root package name */
    public H f9338o;

    /* renamed from: p, reason: collision with root package name */
    public m f9339p;

    /* renamed from: q, reason: collision with root package name */
    public List f9340q;

    public e(l2.f fVar, ArrayList arrayList) {
        C.f(fVar);
        fVar.a();
        this.f9330c = fVar.f8772b;
        this.f9331d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f9334k = "2";
        e(arrayList);
    }

    @Override // o2.D
    public final String b() {
        return this.f9329b.f9321b;
    }

    @Override // o2.o
    public final String c() {
        Map map;
        zzahv zzahvVar = this.f9328a;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) l.a(this.f9328a.zzc()).f9221b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // o2.o
    public final boolean d() {
        String str;
        Boolean bool = this.f9335l;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.f9328a;
            if (zzahvVar != null) {
                Map map = (Map) l.a(zzahvVar.zzc()).f9221b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z4 = true;
            if (this.f9332e.size() > 1 || (str != null && str.equals("custom"))) {
                z4 = false;
            }
            this.f9335l = Boolean.valueOf(z4);
        }
        return this.f9335l.booleanValue();
    }

    @Override // o2.o
    public final synchronized e e(ArrayList arrayList) {
        try {
            C.f(arrayList);
            this.f9332e = new ArrayList(arrayList.size());
            this.f9333f = new ArrayList(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                D d5 = (D) arrayList.get(i);
                if (d5.b().equals("firebase")) {
                    this.f9329b = (c) d5;
                } else {
                    this.f9333f.add(d5.b());
                }
                this.f9332e.add((c) d5);
            }
            if (this.f9329b == null) {
                this.f9329b = (c) this.f9332e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // o2.o
    public final void f(ArrayList arrayList) {
        m mVar;
        if (arrayList.isEmpty()) {
            mVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o2.t tVar = (o2.t) it.next();
                if (tVar instanceof o2.y) {
                    arrayList2.add((o2.y) tVar);
                } else if (tVar instanceof C0796B) {
                    arrayList3.add((C0796B) tVar);
                }
            }
            mVar = new m(arrayList2, arrayList3);
        }
        this.f9339p = mVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.m0(parcel, 1, this.f9328a, i, false);
        S0.f.m0(parcel, 2, this.f9329b, i, false);
        S0.f.n0(parcel, 3, this.f9330c, false);
        S0.f.n0(parcel, 4, this.f9331d, false);
        S0.f.r0(parcel, 5, this.f9332e, false);
        S0.f.p0(parcel, 6, this.f9333f);
        S0.f.n0(parcel, 7, this.f9334k, false);
        boolean zD = d();
        S0.f.u0(parcel, 8, 4);
        parcel.writeInt(zD ? 1 : 0);
        S0.f.m0(parcel, 9, this.f9336m, i, false);
        boolean z4 = this.f9337n;
        S0.f.u0(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        S0.f.m0(parcel, 11, this.f9338o, i, false);
        S0.f.m0(parcel, 12, this.f9339p, i, false);
        S0.f.r0(parcel, 13, this.f9340q, false);
        S0.f.w0(iV0, parcel);
    }
}
