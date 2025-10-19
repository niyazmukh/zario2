package com.google.android.play.core.integrity;

import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\j.smali */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.j a(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new StandardIntegrityException(i, null);
    }
}
