package b2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: b2.B, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b2.1\B.1.smali */
public final class C0261B extends U.b {
    public static final Parcelable.Creator<C0261B> CREATOR = new F1.f(5);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4992c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4993d;

    public C0261B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4992c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4993d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f4992c) + "}";
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f4992c, parcel, i);
        parcel.writeInt(this.f4993d ? 1 : 0);
    }
}
