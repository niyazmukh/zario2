package a1;

import D0.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.Map;
import m1.C0742a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a1.1\d.smali */
public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new k(9);

    /* renamed from: k, reason: collision with root package name */
    public static final q.b f4038k;

    /* renamed from: a, reason: collision with root package name */
    public final int f4039a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4040b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4041c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4042d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4043e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f4044f;

    static {
        q.b bVar = new q.b();
        f4038k = bVar;
        bVar.put("registered", C0742a.c(2, "registered"));
        bVar.put("in_progress", C0742a.c(3, "in_progress"));
        bVar.put("success", C0742a.c(4, "success"));
        bVar.put("failed", C0742a.c(5, "failed"));
        bVar.put("escrowed", C0742a.c(6, "escrowed"));
    }

    public d(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f4039a = i;
        this.f4040b = arrayList;
        this.f4041c = arrayList2;
        this.f4042d = arrayList3;
        this.f4043e = arrayList4;
        this.f4044f = arrayList5;
    }

    @Override // m1.AbstractC0743b
    public final Map getFieldMappings() {
        return f4038k;
    }

    @Override // m1.AbstractC0743b
    public final Object getFieldValue(C0742a c0742a) {
        switch (c0742a.f8835k) {
            case 1:
                return Integer.valueOf(this.f4039a);
            case 2:
                return this.f4040b;
            case 3:
                return this.f4041c;
            case 4:
                return this.f4042d;
            case 5:
                return this.f4043e;
            case 6:
                return this.f4044f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0742a.f8835k);
        }
    }

    @Override // m1.AbstractC0743b
    public final boolean isFieldSet(C0742a c0742a) {
        return true;
    }

    @Override // m1.AbstractC0743b
    public final void setStringsInternal(C0742a c0742a, String str, ArrayList arrayList) {
        int i = c0742a.f8835k;
        if (i == 2) {
            this.f4040b = arrayList;
            return;
        }
        if (i == 3) {
            this.f4041c = arrayList;
            return;
        }
        if (i == 4) {
            this.f4042d = arrayList;
        } else if (i == 5) {
            this.f4043e = arrayList;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
            }
            this.f4044f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f4039a);
        S0.f.p0(parcel, 2, this.f4040b);
        S0.f.p0(parcel, 3, this.f4041c);
        S0.f.p0(parcel, 4, this.f4042d);
        S0.f.p0(parcel, 5, this.f4043e);
        S0.f.p0(parcel, 6, this.f4044f);
        S0.f.w0(iV0, parcel);
    }
}
