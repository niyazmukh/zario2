package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import kotlin.jvm.internal.e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzex.smali */
public final class zzex {
    private final zzfm zza;

    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) throws ProtocolException, zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e5) {
            throw e5;
        } catch (Exception e6) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e6.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i, e eVar) {
        this.zza = new zzfm();
    }
}
