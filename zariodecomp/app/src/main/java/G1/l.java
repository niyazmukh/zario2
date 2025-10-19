package g1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import f1.C0491a;
import k1.C0657a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\l.smali */
public final class l extends zbb {

    /* renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f7595a;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f7595a = revocationBoundService;
    }

    public final void a() throws PackageManager.NameNotFoundException {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = this.f7595a;
        K2.c cVarA = p1.c.a(revocationBoundService);
        cVarA.getClass();
        try {
            appOpsManager = (AppOpsManager) ((Context) cVarA.b).getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        try {
            PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            h1.i iVarX = h1.i.x(revocationBoundService);
            iVarX.getClass();
            if (packageInfo != null) {
                if (h1.i.B(packageInfo, false)) {
                    return;
                }
                if (h1.i.B(packageInfo, true)) {
                    Context context = (Context) iVarX.f7641b;
                    try {
                        if (!h1.h.f7636c) {
                            try {
                                PackageInfo packageInfo2 = ((Context) p1.c.a(context).b).getPackageManager().getPackageInfo("com.google.android.gms", 134217792);
                                h1.i.x(context);
                                if (packageInfo2 == null || h1.i.B(packageInfo2, false) || !h1.i.B(packageInfo2, true)) {
                                    h1.h.f7635b = false;
                                } else {
                                    h1.h.f7635b = true;
                                }
                                h1.h.f7636c = true;
                            } catch (PackageManager.NameNotFoundException e5) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e5);
                                h1.h.f7636c = true;
                            }
                        }
                        if (h1.h.f7635b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    } catch (Throwable th) {
                        h1.h.f7636c = true;
                        throw th;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
        }
        throw new SecurityException(B.a.i("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i5) throws PackageManager.NameNotFoundException {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        RevocationBoundService revocationBoundService = this.f7595a;
        if (i == 1) {
            a();
            C0573b c0573bA = C0573b.a(revocationBoundService);
            GoogleSignInAccount googleSignInAccountB = c0573bA.b();
            GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.f5501o;
            if (googleSignInAccountB != null) {
                googleSignInOptionsC = c0573bA.c();
            }
            GoogleSignInOptions googleSignInOptions = googleSignInOptionsC;
            C.f(googleSignInOptions);
            C0491a c0491a = new C0491a(this.f7595a, null, Z0.b.f3943b, googleSignInOptions, new com.google.android.gms.common.api.k(new G2.e(), Looper.getMainLooper()));
            if (googleSignInAccountB != null) {
                o oVarAsGoogleApiClient = c0491a.asGoogleApiClient();
                Context applicationContext = c0491a.getApplicationContext();
                boolean z4 = c0491a.c() == 3;
                h.f7591a.a("Revoking access", new Object[0]);
                String strE = C0573b.a(applicationContext).e("refreshToken");
                h.a(applicationContext);
                if (!z4) {
                    basePendingResultDoWrite2 = ((G) oVarAsGoogleApiClient).f5573b.doWrite((com.google.android.gms.common.api.l) new g(oVarAsGoogleApiClient, 1));
                } else if (strE == null) {
                    C0657a c0657a = RunnableC0574c.f7576c;
                    Status status = new Status(4, null, null, null);
                    C.a("Status code must not be SUCCESS", !status.c());
                    basePendingResultDoWrite2 = new x(status);
                    basePendingResultDoWrite2.setResult((BasePendingResult) status);
                } else {
                    RunnableC0574c runnableC0574c = new RunnableC0574c(strE);
                    new Thread(runnableC0574c).start();
                    basePendingResultDoWrite2 = runnableC0574c.f7578b;
                }
                J3.c cVar = new J3.c();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                basePendingResultDoWrite2.addStatusListener(new com.google.android.gms.common.internal.x(basePendingResultDoWrite2, taskCompletionSource, cVar));
                taskCompletionSource.getTask();
            } else {
                o oVarAsGoogleApiClient2 = c0491a.asGoogleApiClient();
                Context applicationContext2 = c0491a.getApplicationContext();
                boolean z5 = c0491a.c() == 3;
                h.f7591a.a("Signing out", new Object[0]);
                h.a(applicationContext2);
                if (z5) {
                    Status status2 = Status.f5530e;
                    basePendingResultDoWrite = new v(oVarAsGoogleApiClient2);
                    basePendingResultDoWrite.setResult((BasePendingResult) status2);
                } else {
                    basePendingResultDoWrite = ((G) oVarAsGoogleApiClient2).f5573b.doWrite((com.google.android.gms.common.api.l) new g(oVarAsGoogleApiClient2, 0));
                }
                J3.c cVar2 = new J3.c();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                basePendingResultDoWrite.addStatusListener(new com.google.android.gms.common.internal.x(basePendingResultDoWrite, taskCompletionSource2, cVar2));
                taskCompletionSource2.getTask();
            }
        } else {
            if (i != 2) {
                return false;
            }
            a();
            i.F(revocationBoundService).G();
        }
        return true;
    }
}
