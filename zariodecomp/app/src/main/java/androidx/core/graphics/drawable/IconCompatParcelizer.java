package androidx.core.graphics.drawable;

import H0.a;
import H0.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\core\graphics\drawable\IconCompatParcelizer.smali */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f4365a;
        if (aVar.e(1)) {
            i = ((b) aVar).f1879e.readInt();
        }
        iconCompat.f4365a = i;
        byte[] bArr = iconCompat.f4367c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1879e;
            int i5 = parcel.readInt();
            if (i5 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i5];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4367c = bArr;
        iconCompat.f4368d = aVar.f(iconCompat.f4368d, 3);
        int i6 = iconCompat.f4369e;
        if (aVar.e(4)) {
            i6 = ((b) aVar).f1879e.readInt();
        }
        iconCompat.f4369e = i6;
        int i7 = iconCompat.f4370f;
        if (aVar.e(5)) {
            i7 = ((b) aVar).f1879e.readInt();
        }
        iconCompat.f4370f = i7;
        iconCompat.f4371g = (ColorStateList) aVar.f(iconCompat.f4371g, 6);
        String string = iconCompat.i;
        if (aVar.e(7)) {
            string = ((b) aVar).f1879e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.f4372j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f1879e.readString();
        }
        iconCompat.f4372j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f4365a) {
            case -1:
                Parcelable parcelable = iconCompat.f4368d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4366b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4368d;
                if (parcelable2 != null) {
                    iconCompat.f4366b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f4367c;
                    iconCompat.f4366b = bArr3;
                    iconCompat.f4365a = 3;
                    iconCompat.f4369e = 0;
                    iconCompat.f4370f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f4367c, Charset.forName("UTF-16"));
                iconCompat.f4366b = str;
                if (iconCompat.f4365a == 2 && iconCompat.f4372j == null) {
                    iconCompat.f4372j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4366b = iconCompat.f4367c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f4365a) {
            case -1:
                iconCompat.f4368d = (Parcelable) iconCompat.f4366b;
                break;
            case 1:
            case 5:
                iconCompat.f4368d = (Parcelable) iconCompat.f4366b;
                break;
            case 2:
                iconCompat.f4367c = ((String) iconCompat.f4366b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f4367c = (byte[]) iconCompat.f4366b;
                break;
            case 4:
            case 6:
                iconCompat.f4367c = iconCompat.f4366b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f4365a;
        if (-1 != i) {
            aVar.h(1);
            ((b) aVar).f1879e.writeInt(i);
        }
        byte[] bArr = iconCompat.f4367c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1879e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4368d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1879e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f4369e;
        if (i5 != 0) {
            aVar.h(4);
            ((b) aVar).f1879e.writeInt(i5);
        }
        int i6 = iconCompat.f4370f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f1879e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f4371g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1879e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1879e.writeString(str);
        }
        String str2 = iconCompat.f4372j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1879e.writeString(str2);
        }
    }
}
