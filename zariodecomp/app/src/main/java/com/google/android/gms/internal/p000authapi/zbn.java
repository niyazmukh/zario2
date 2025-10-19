package com.google.android.gms.internal.p000authapi;

import Z0.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.C;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbn.smali */
public final class zbn {
    public static PendingIntent zba(Context context, a aVar, HintRequest hintRequest, String str) {
        C.g(context, "context must not be null");
        C.g(hintRequest, "request must not be null");
        if (TextUtils.isEmpty(str)) {
            str = zbbj.zba();
        } else {
            C.f(str);
        }
        Intent intentPutExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", str);
        Parcel parcelObtain = Parcel.obtain();
        hintRequest.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intentPutExtra.putExtra("com.google.android.gms.credentials.HintRequest", bArrMarshall);
        return PendingIntent.getActivity(context, 2000, intentPutExtra, zbbk.zba | 134217728);
    }
}
