package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbs.smali */
public interface zbs extends IInterface {
    void zbb(Status status, Credential credential);

    void zbc(Status status);

    void zbd(Status status, String str);
}
