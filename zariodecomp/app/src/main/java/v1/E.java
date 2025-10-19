package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\E.smali */
public final class E implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    E EF5;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ E[] f10570a = {new E("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<E> CREATOR = new O(13);

    public static E b(String str) throws D {
        for (E e5 : values()) {
            e5.getClass();
            if (str.equals("public-key")) {
                return e5;
            }
        }
        throw new D(B.a.l("PublicKeyCredentialType ", str, " not supported"));
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f10570a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
