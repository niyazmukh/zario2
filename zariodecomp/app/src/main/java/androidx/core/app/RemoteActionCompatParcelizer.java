package androidx.core.app;

import H0.a;
import H0.b;
import H0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\core\app\RemoteActionCompatParcelizer.smali */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f4358a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f4358a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f4359b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1879e);
        }
        remoteActionCompat.f4359b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4360c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1879e);
        }
        remoteActionCompat.f4360c = charSequence2;
        remoteActionCompat.f4361d = (PendingIntent) aVar.f(remoteActionCompat.f4361d, 4);
        boolean z4 = remoteActionCompat.f4362e;
        if (aVar.e(5)) {
            z4 = ((b) aVar).f1879e.readInt() != 0;
        }
        remoteActionCompat.f4362e = z4;
        boolean z5 = remoteActionCompat.f4363f;
        if (aVar.e(6)) {
            z5 = ((b) aVar).f1879e.readInt() != 0;
        }
        remoteActionCompat.f4363f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4358a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4359b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f1879e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4360c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4361d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f4362e;
        aVar.h(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f4363f;
        aVar.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
