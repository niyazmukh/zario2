package m1;

import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.util.VisibleForTesting;
import i1.InterfaceC0597b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\c.smali */
public abstract class c extends AbstractC0743b implements InterfaceC0597b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC0743b abstractC0743b = (AbstractC0743b) obj;
        for (C0742a c0742a : getFieldMappings().values()) {
            if (isFieldSet(c0742a)) {
                if (!abstractC0743b.isFieldSet(c0742a) || !C.i(getFieldValue(c0742a), abstractC0743b.getFieldValue(c0742a))) {
                    return false;
                }
            } else if (abstractC0743b.isFieldSet(c0742a)) {
                return false;
            }
        }
        return true;
    }

    @Override // m1.AbstractC0743b
    @VisibleForTesting
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (C0742a c0742a : getFieldMappings().values()) {
            if (isFieldSet(c0742a)) {
                Object fieldValue = getFieldValue(c0742a);
                C.f(fieldValue);
                iHashCode = (iHashCode * 31) + fieldValue.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // m1.AbstractC0743b
    @VisibleForTesting
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
