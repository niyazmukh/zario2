package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import c1.s;
import kotlin.jvm.internal.i;

/* renamed from: d.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d.1\h.smali */
public final class C0441h implements Parcelable {
    public static final Parcelable.Creator<C0441h> CREATOR = new s(21);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f6779a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f6780b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6782d;

    public C0441h(IntentSender intentSender, Intent intent, int i, int i5) {
        this.f6779a = intentSender;
        this.f6780b = intent;
        this.f6781c = i;
        this.f6782d = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        i.e(dest, "dest");
        dest.writeParcelable(this.f6779a, i);
        dest.writeParcelable(this.f6780b, i);
        dest.writeInt(this.f6781c);
        dest.writeInt(this.f6782d);
    }
}
