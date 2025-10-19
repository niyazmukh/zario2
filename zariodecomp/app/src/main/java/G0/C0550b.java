package g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0236o;
import java.util.ArrayList;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\b.1.smali */
public final class C0550b implements Parcelable {
    public static final Parcelable.Creator<C0550b> CREATOR = new c1.s(24);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f7432a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7433b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7434c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7435d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7436e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7437f;

    /* renamed from: k, reason: collision with root package name */
    public final int f7438k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7439l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f7440m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7441n;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f7442o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f7443p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f7444q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7445r;

    public C0550b(C0549a c0549a) {
        int size = c0549a.f7414a.size();
        this.f7432a = new int[size * 6];
        if (!c0549a.f7420g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f7433b = new ArrayList(size);
        this.f7434c = new int[size];
        this.f7435d = new int[size];
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Q q5 = (Q) c0549a.f7414a.get(i5);
            int i6 = i + 1;
            this.f7432a[i] = q5.f7388a;
            ArrayList arrayList = this.f7433b;
            AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = q5.f7389b;
            arrayList.add(abstractComponentCallbacksC0567t != null ? abstractComponentCallbacksC0567t.f7531e : null);
            int[] iArr = this.f7432a;
            iArr[i6] = q5.f7390c ? 1 : 0;
            iArr[i + 2] = q5.f7391d;
            iArr[i + 3] = q5.f7392e;
            int i7 = i + 5;
            iArr[i + 4] = q5.f7393f;
            i += 6;
            iArr[i7] = q5.f7394g;
            this.f7434c[i5] = q5.h.ordinal();
            this.f7435d[i5] = q5.i.ordinal();
        }
        this.f7436e = c0549a.f7419f;
        this.f7437f = c0549a.i;
        this.f7438k = c0549a.f7430s;
        this.f7439l = c0549a.f7421j;
        this.f7440m = c0549a.f7422k;
        this.f7441n = c0549a.f7423l;
        this.f7442o = c0549a.f7424m;
        this.f7443p = c0549a.f7425n;
        this.f7444q = c0549a.f7426o;
        this.f7445r = c0549a.f7427p;
    }

    public final void b(C0549a c0549a) {
        int i = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f7432a;
            boolean z4 = true;
            if (i >= iArr.length) {
                c0549a.f7419f = this.f7436e;
                c0549a.i = this.f7437f;
                c0549a.f7420g = true;
                c0549a.f7421j = this.f7439l;
                c0549a.f7422k = this.f7440m;
                c0549a.f7423l = this.f7441n;
                c0549a.f7424m = this.f7442o;
                c0549a.f7425n = this.f7443p;
                c0549a.f7426o = this.f7444q;
                c0549a.f7427p = this.f7445r;
                return;
            }
            Q q5 = new Q();
            int i6 = i + 1;
            q5.f7388a = iArr[i];
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Instantiate " + c0549a + " op #" + i5 + " base fragment #" + iArr[i6]);
            }
            q5.h = EnumC0236o.values()[this.f7434c[i5]];
            q5.i = EnumC0236o.values()[this.f7435d[i5]];
            int i7 = i + 2;
            if (iArr[i6] == 0) {
                z4 = false;
            }
            q5.f7390c = z4;
            int i8 = iArr[i7];
            q5.f7391d = i8;
            int i9 = iArr[i + 3];
            q5.f7392e = i9;
            int i10 = i + 5;
            int i11 = iArr[i + 4];
            q5.f7393f = i11;
            i += 6;
            int i12 = iArr[i10];
            q5.f7394g = i12;
            c0549a.f7415b = i8;
            c0549a.f7416c = i9;
            c0549a.f7417d = i11;
            c0549a.f7418e = i12;
            c0549a.b(q5);
            i5++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7432a);
        parcel.writeStringList(this.f7433b);
        parcel.writeIntArray(this.f7434c);
        parcel.writeIntArray(this.f7435d);
        parcel.writeInt(this.f7436e);
        parcel.writeString(this.f7437f);
        parcel.writeInt(this.f7438k);
        parcel.writeInt(this.f7439l);
        TextUtils.writeToParcel(this.f7440m, parcel, 0);
        parcel.writeInt(this.f7441n);
        TextUtils.writeToParcel(this.f7442o, parcel, 0);
        parcel.writeStringList(this.f7443p);
        parcel.writeStringList(this.f7444q);
        parcel.writeInt(this.f7445r ? 1 : 0);
    }

    public C0550b(Parcel parcel) {
        this.f7432a = parcel.createIntArray();
        this.f7433b = parcel.createStringArrayList();
        this.f7434c = parcel.createIntArray();
        this.f7435d = parcel.createIntArray();
        this.f7436e = parcel.readInt();
        this.f7437f = parcel.readString();
        this.f7438k = parcel.readInt();
        this.f7439l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f7440m = (CharSequence) creator.createFromParcel(parcel);
        this.f7441n = parcel.readInt();
        this.f7442o = (CharSequence) creator.createFromParcel(parcel);
        this.f7443p = parcel.createStringArrayList();
        this.f7444q = parcel.createStringArrayList();
        this.f7445r = parcel.readInt() != 0;
    }
}
