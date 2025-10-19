package o0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0236o;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\k.1.smali */
public final class C0788k implements Parcelable {
    public static final Parcelable.Creator<C0788k> CREATOR = new g1.m(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f9080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9081b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9082c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f9083d;

    public C0788k(C0787j entry) {
        kotlin.jvm.internal.i.e(entry, "entry");
        this.f9080a = entry.f9073f;
        this.f9081b = entry.f9069b.f9147l;
        this.f9082c = entry.c();
        Bundle bundle = new Bundle();
        this.f9083d = bundle;
        entry.f9076m.i(bundle);
    }

    public final C0787j b(Context context, x xVar, EnumC0236o hostLifecycleState, r rVar) {
        kotlin.jvm.internal.i.e(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f9082c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String id = this.f9080a;
        kotlin.jvm.internal.i.e(id, "id");
        return new C0787j(context, xVar, bundle2, hostLifecycleState, rVar, id, this.f9083d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.i.e(parcel, "parcel");
        parcel.writeString(this.f9080a);
        parcel.writeInt(this.f9081b);
        parcel.writeBundle(this.f9082c);
        parcel.writeBundle(this.f9083d);
    }

    public C0788k(Parcel inParcel) {
        kotlin.jvm.internal.i.e(inParcel, "inParcel");
        String string = inParcel.readString();
        kotlin.jvm.internal.i.b(string);
        this.f9080a = string;
        this.f9081b = inParcel.readInt();
        this.f9082c = inParcel.readBundle(C0788k.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(C0788k.class.getClassLoader());
        kotlin.jvm.internal.i.b(bundle);
        this.f9083d = bundle;
    }
}
