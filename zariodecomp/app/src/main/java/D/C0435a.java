package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c1.s;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d.1\a.smali */
public final class C0435a implements Parcelable {
    public static final Parcelable.Creator<C0435a> CREATOR = new s(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f6765a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6766b;

    public C0435a(Intent intent, int i) {
        this.f6765a = i;
        this.f6766b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f6765a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f6766b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6765a);
        Intent intent = this.f6766b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0435a(Parcel parcel) {
        this.f6765a = parcel.readInt();
        this.f6766b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
