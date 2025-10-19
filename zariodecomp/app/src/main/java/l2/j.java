package l2;

import S0.l;
import S0.v;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l2\j.smali */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f8783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8784b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8785c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8786d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8787e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8788f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8789g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = o1.c.f9164a;
        C.h("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f8784b = str;
        this.f8783a = str2;
        this.f8785c = str3;
        this.f8786d = str4;
        this.f8787e = str5;
        this.f8788f = str6;
        this.f8789g = str7;
    }

    public static j a(Context context) {
        v vVar = new v(context);
        String strC = vVar.c("google_app_id");
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return new j(strC, vVar.c("google_api_key"), vVar.c("firebase_database_url"), vVar.c("ga_trackingId"), vVar.c("gcm_defaultSenderId"), vVar.c("google_storage_bucket"), vVar.c("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C.i(this.f8784b, jVar.f8784b) && C.i(this.f8783a, jVar.f8783a) && C.i(this.f8785c, jVar.f8785c) && C.i(this.f8786d, jVar.f8786d) && C.i(this.f8787e, jVar.f8787e) && C.i(this.f8788f, jVar.f8788f) && C.i(this.f8789g, jVar.f8789g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8784b, this.f8783a, this.f8785c, this.f8786d, this.f8787e, this.f8788f, this.f8789g});
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.c(this.f8784b, "applicationId");
        lVar.c(this.f8783a, "apiKey");
        lVar.c(this.f8785c, "databaseUrl");
        lVar.c(this.f8787e, "gcmSenderId");
        lVar.c(this.f8788f, "storageBucket");
        lVar.c(this.f8789g, "projectId");
        return lVar.toString();
    }
}
