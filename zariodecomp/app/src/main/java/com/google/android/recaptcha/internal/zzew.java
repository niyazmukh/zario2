package com.google.android.recaptcha.internal;

import N2.AbstractC0156x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzew.smali */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() throws zzbd {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e5) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e5.getMessage());
        } catch (IOException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e6.getMessage());
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e7.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbd {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e5) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e5.getMessage());
        } catch (IOException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e6.getMessage());
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e7.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) throws IOException, zzbd {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            InputStream inputStreamZzf = zzf();
            i.e(inputStreamZzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamZzf.available()));
            AbstractC0156x.m(inputStreamZzf, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.d(byteArray, "toByteArray(...)");
            if (byteArray.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object objZzb = zzoiVar.zzD().zzb(byteArray);
                i.c(objZzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) objZzb;
            } catch (Exception e5) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e5.getMessage());
            }
        } catch (Exception e6) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e6.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() throws IOException, zzbd {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e5) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e5.getMessage());
        } catch (IOException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e6.getMessage());
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e7.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) throws IOException, zzbd {
        try {
            zzg().write(bArr);
        } catch (zzbd e5) {
            throw e5;
        } catch (IOException e6) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e6.getMessage());
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e7.getMessage());
        }
    }
}
