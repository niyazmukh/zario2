package v1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: v1.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v1\u.1.smali */
public enum EnumC0996u implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED_ERR(9),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STATE_ERR(11),
    /* JADX INFO: Fake field, exist only in values array */
    SECURITY_ERR(18),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERR(19),
    /* JADX INFO: Fake field, exist only in values array */
    ABORT_ERR(20),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT_ERR(23),
    /* JADX INFO: Fake field, exist only in values array */
    ENCODING_ERR(27),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERR(28),
    /* JADX INFO: Fake field, exist only in values array */
    CONSTRAINT_ERR(29),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_ERR(30),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ALLOWED_ERR(35),
    /* JADX INFO: Fake field, exist only in values array */
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<EnumC0996u> CREATOR = new Y(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f10647a;

    EnumC0996u(int i) {
        this.f10647a = i;
    }

    public static EnumC0996u b(int i) throws C0995t {
        for (EnumC0996u enumC0996u : values()) {
            if (i == enumC0996u.f10647a) {
                return enumC0996u;
            }
        }
        Locale locale = Locale.US;
        throw new C0995t(B.a.i("Error code ", i, " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10647a);
    }
}
