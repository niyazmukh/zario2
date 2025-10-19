package androidx.credentials.playservices;

import A2.C0004d;
import F1.h;
import R.c;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import c1.l;
import c1.r;
import c1.t;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p000authapi.zbaw;
import com.google.android.gms.internal.p000authapi.zbbg;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.i;
import s1.AbstractC0865a;
import t0.C0908O;
import u1.a;
import v1.C0999y;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\credentials\playservices\HiddenActivity.smali */
public class HiddenActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4402c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f4403a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4404b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(f.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i5, Intent intent) {
        super.onActivityResult(i, i5, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f4403a;
        if (resultReceiver != null) {
            resultReceiver.send(i5, bundle);
        }
        this.f4404b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 2;
        final int i5 = 3;
        final int i6 = 1;
        super.onCreate(bundle);
        final int i7 = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f4403a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f4404b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f4404b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        c1.f fVar = (c1.f) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((fVar != null ? new zbbg((Activity) this, new t()).beginSignIn(fVar).addOnSuccessListener(new C0004d(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 0), 11)).addOnFailureListener(new OnFailureListener(this) { // from class: R.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f2818b;

                            {
                                this.f2818b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e5) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f2818b;
                                switch (i5) {
                                    case 0:
                                        int i8 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f4403a;
                                        i.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                        break;
                                    case 1:
                                        int i9 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f4403a;
                                        i.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                        break;
                                    case 2:
                                        int i10 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f4403a;
                                        i.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                        break;
                                    default:
                                        int i11 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f4403a;
                                        i.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        C0999y c0999y = (C0999y) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (c0999y != null) {
                            int i8 = AbstractC0865a.f9668a;
                            d dVar = e.i;
                            G2.e eVar = new G2.e();
                            Looper mainLooper = getMainLooper();
                            C.g(mainLooper, "Looper must not be null.");
                            a aVar = new a(this, this, a.f10478a, dVar, new k(eVar, mainLooper));
                            h hVarA = AbstractC0359w.a();
                            hVarA.f1683d = new C0908O(aVar, c0999y);
                            hVarA.f1681b = 5407;
                            taskAddOnFailureListener = aVar.doRead(hVarA.a()).addOnSuccessListener(new C0004d(new c(this, intExtra, 2), 8)).addOnFailureListener(new OnFailureListener(this) { // from class: R.b

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f2818b;

                                {
                                    this.f2818b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception e5) {
                                    String str = "CREATE_UNKNOWN";
                                    String str2 = "GET_NO_CREDENTIALS";
                                    HiddenActivity this$0 = this.f2818b;
                                    switch (i7) {
                                        case 0:
                                            int i82 = HiddenActivity.f4402c;
                                            i.e(this$0, "this$0");
                                            i.e(e5, "e");
                                            if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver2 = this$0.f4403a;
                                            i.b(resultReceiver2);
                                            this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                            break;
                                        case 1:
                                            int i9 = HiddenActivity.f4402c;
                                            i.e(this$0, "this$0");
                                            i.e(e5, "e");
                                            if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                                str = "CREATE_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver3 = this$0.f4403a;
                                            i.b(resultReceiver3);
                                            this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                            break;
                                        case 2:
                                            int i10 = HiddenActivity.f4402c;
                                            i.e(this$0, "this$0");
                                            i.e(e5, "e");
                                            if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver4 = this$0.f4403a;
                                            i.b(resultReceiver4);
                                            this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                            break;
                                        default:
                                            int i11 = HiddenActivity.f4402c;
                                            i.e(this$0, "this$0");
                                            i.e(e5, "e");
                                            if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                                str2 = "GET_INTERRUPTED";
                                            }
                                            ResultReceiver resultReceiver5 = this$0.f4403a;
                                            i.b(resultReceiver5);
                                            this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (taskAddOnFailureListener == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        l lVar = (l) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((lVar != null ? new zbaw((Activity) this, new r()).savePassword(lVar).addOnSuccessListener(new C0004d(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 1), 9)).addOnFailureListener(new OnFailureListener(this) { // from class: R.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f2818b;

                            {
                                this.f2818b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e5) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f2818b;
                                switch (i6) {
                                    case 0:
                                        int i82 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f4403a;
                                        i.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                        break;
                                    case 1:
                                        int i9 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f4403a;
                                        i.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                        break;
                                    case 2:
                                        int i10 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f4403a;
                                        i.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                        break;
                                    default:
                                        int i11 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f4403a;
                                        i.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        c1.j jVar = (c1.j) getIntent().getParcelableExtra("REQUEST_TYPE");
                        if ((jVar != null ? new zbbg((Activity) this, new t()).getSignInIntent(jVar).addOnSuccessListener(new C0004d(new c(this, getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1), 3), 10)).addOnFailureListener(new OnFailureListener(this) { // from class: R.b

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ HiddenActivity f2818b;

                            {
                                this.f2818b = this;
                            }

                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(Exception e5) {
                                String str = "CREATE_UNKNOWN";
                                String str2 = "GET_NO_CREDENTIALS";
                                HiddenActivity this$0 = this.f2818b;
                                switch (i) {
                                    case 0:
                                        int i82 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver2 = this$0.f4403a;
                                        i.b(resultReceiver2);
                                        this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e5.getMessage());
                                        break;
                                    case 1:
                                        int i9 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str = "CREATE_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver3 = this$0.f4403a;
                                        i.b(resultReceiver3);
                                        this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e5.getMessage());
                                        break;
                                    case 2:
                                        int i10 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver4 = this$0.f4403a;
                                        i.b(resultReceiver4);
                                        this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e5.getMessage());
                                        break;
                                    default:
                                        int i11 = HiddenActivity.f4402c;
                                        i.e(this$0, "this$0");
                                        i.e(e5, "e");
                                        if ((e5 instanceof j) && S.a.f2842a.contains(Integer.valueOf(((j) e5).getStatusCode()))) {
                                            str2 = "GET_INTERRUPTED";
                                        }
                                        ResultReceiver resultReceiver5 = this$0.f4403a;
                                        i.b(resultReceiver5);
                                        this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e5.getMessage());
                                        break;
                                }
                            }
                        }) : null) == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        i.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f4404b);
        super.onSaveInstanceState(outState);
    }
}
