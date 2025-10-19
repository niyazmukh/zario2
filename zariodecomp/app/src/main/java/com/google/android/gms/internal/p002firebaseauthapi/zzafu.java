package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzafu.smali */
public final class zzafu {
    private static final boolean zza(int i) {
        return i >= 200 && i < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzafv<?> zzafvVar, Type type) {
        try {
            try {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    String string = sb.toString();
                    if (zza(responseCode)) {
                        zzafvVar.zza((zzafv<?>) zzaex.zza(string, type));
                    } else {
                        zzafvVar.zza((String) zzaex.zza(string, String.class));
                    }
                    httpURLConnection.disconnect();
                } catch (zzacn | IOException e5) {
                    zzafvVar.zza(e5.getMessage());
                    httpURLConnection.disconnect();
                }
            } catch (SocketTimeoutException unused) {
                zzafvVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static void zza(String str, zzafv<?> zzafvVar, Type type, zzafe zzafeVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzafeVar.zza(httpURLConnection);
            zza(httpURLConnection, zzafvVar, type);
        } catch (SocketTimeoutException unused) {
            zzafvVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafvVar.zza("<<Network Error>>");
        } catch (IOException e5) {
            zzafvVar.zza(e5.getMessage());
        }
    }

    public static void zza(String str, zzafa zzafaVar, zzafv<?> zzafvVar, Type type, zzafe zzafeVar) throws IOException {
        try {
            try {
                C.f(zzafaVar);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setDoOutput(true);
                byte[] bytes = zzafaVar.zza().getBytes(Charset.defaultCharset());
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setConnectTimeout(60000);
                zzafeVar.zza(httpURLConnection);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
                try {
                    bufferedOutputStream.write(bytes, 0, bytes.length);
                    bufferedOutputStream.close();
                    zza(httpURLConnection, zzafvVar, type);
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
                zzafvVar.zza("TIMEOUT");
            } catch (UnknownHostException unused2) {
                zzafvVar.zza("<<Network Error>>");
            }
        } catch (IOException | NullPointerException | JSONException e5) {
            zzafvVar.zza(e5.getMessage());
        }
    }
}
