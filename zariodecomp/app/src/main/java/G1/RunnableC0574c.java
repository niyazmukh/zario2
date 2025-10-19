package g1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.C;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import k1.C0657a;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\c.smali */
public final class RunnableC0574c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0657a f7576c = new C0657a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f7577a;

    /* renamed from: b, reason: collision with root package name */
    public final v f7578b;

    public RunnableC0574c(String str) {
        C.d(str);
        this.f7577a = str;
        this.f7578b = new v(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        C0657a c0657a = f7576c;
        Status status = Status.f5532k;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f7577a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f5530e;
            } else {
                c0657a.c("Unable to revoke access!", new Object[0]);
            }
            c0657a.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e5) {
            c0657a.c("IOException when revoking access: ".concat(String.valueOf(e5.toString())), new Object[0]);
        } catch (Exception e6) {
            c0657a.c("Exception when revoking access: ".concat(String.valueOf(e6.toString())), new Object[0]);
        }
        this.f7578b.setResult((v) status);
    }
}
