package com.google.android.gms.common.internal;

import N2.AbstractC0156x;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import h1.C0588a;
import h1.C0590c;
import h1.C0591d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p1.AbstractC0820a;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\f.1.smali */
public abstract class AbstractC0368f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile AbstractC0820a zzB;
    private C0588a zzC;
    private boolean zzD;
    private volatile K zzE;
    P zza;
    final Handler zzb;
    protected InterfaceC0366d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC0374l zzn;
    private final h1.e zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC0377o zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private H zzu;
    private int zzv;
    private final InterfaceC0364b zzw;
    private final InterfaceC0365c zzx;
    private final int zzy;
    private final String zzz;
    private static final C0590c[] zze = new C0590c[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public AbstractC0368f(Context context, Looper looper, O o5, int i, r rVar, r rVar2, String str) {
        C0591d c0591d = C0591d.f7631d;
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        C.g(context, "Context must not be null");
        this.zzl = context;
        C.g(looper, "Looper must not be null");
        this.zzm = looper;
        C.g(o5, "Supervisor must not be null");
        this.zzn = o5;
        this.zzo = c0591d;
        this.zzb = new F(this, looper);
        this.zzy = i;
        this.zzw = rVar;
        this.zzx = rVar2;
        this.zzz = str;
    }

    public final void a(int i, IInterface iInterface) {
        P p5;
        C.b((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    H h = this.zzu;
                    if (h != null) {
                        AbstractC0374l abstractC0374l = this.zzn;
                        String str = this.zza.f5693a;
                        C.f(str);
                        String str2 = this.zza.f5694b;
                        zza();
                        abstractC0374l.b(str, str2, h, this.zza.f5695c);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    H h5 = this.zzu;
                    if (h5 != null && (p5 = this.zza) != null) {
                        String str3 = p5.f5693a;
                        String str4 = p5.f5694b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        AbstractC0374l abstractC0374l2 = this.zzn;
                        String str5 = this.zza.f5693a;
                        C.f(str5);
                        String str6 = this.zza.f5694b;
                        zza();
                        abstractC0374l2.b(str5, str6, h5, this.zza.f5695c);
                        this.zzd.incrementAndGet();
                    }
                    H h6 = new H(this, this.zzd.get());
                    this.zzu = h6;
                    P p6 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new P(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new P(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = p6;
                    if (p6.f5695c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f5693a)));
                    }
                    AbstractC0374l abstractC0374l3 = this.zzn;
                    String str7 = this.zza.f5693a;
                    C.f(str7);
                    C0588a c0588aA = abstractC0374l3.a(new L(str7, this.zza.f5694b, this.zza.f5695c), h6, zza(), getBindServiceExecutor());
                    if (!(c0588aA.f7621b == 0)) {
                        P p7 = this.zza;
                        String str8 = p7.f5693a;
                        String str9 = p7.f5694b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        Log.w("GmsClient", sb2.toString());
                        int i5 = c0588aA.f7621b;
                        if (i5 == -1) {
                            i5 = 16;
                        }
                        if (c0588aA.f7622c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, c0588aA.f7622c);
                        }
                        zzb(i5, bundle, this.zzd.get());
                    }
                } else if (i == 4) {
                    C.f(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() throws PackageManager.NameNotFoundException {
        int iC = this.zzo.c(this.zzl, getMinApkVersion());
        if (iC == 0) {
            connect(new r(this));
        } else {
            a(1, null);
            triggerNotAvailable(new r(this), iC, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC0366d interfaceC0366d) {
        C.g(interfaceC0366d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0366d;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    A a5 = (A) arrayList.get(i);
                    synchronized (a5) {
                        a5.f5655a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        InterfaceC0377o interfaceC0377o;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC0377o = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC0377o == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((B) interfaceC0377o).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j5 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j5));
            StringBuilder sb = new StringBuilder(String.valueOf(j5).length() + 1 + String.valueOf(str2).length());
            sb.append(j5);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i5 = this.zzf;
            if (i5 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i5 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i5 != 3) {
                printWriter.append((CharSequence) String.valueOf(i5));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j6 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j6));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 1 + String.valueOf(str3).length());
            sb2.append(j6);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC0156x.N(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j7 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j7));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 1 + String.valueOf(str4).length());
            sb3.append(j7);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public abstract Account getAccount();

    public C0590c[] getApiFeatures() {
        return zze;
    }

    public AbstractC0820a getAttributionSourceWrapper() {
        return null;
    }

    public final C0590c[] getAvailableFeatures() {
        K k5 = this.zzE;
        if (k5 == null) {
            return null;
        }
        return k5.f5675b;
    }

    public abstract Executor getBindServiceExecutor();

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        P p5;
        if (!isConnected() || (p5 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return p5.f5694b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(InterfaceC0375m interfaceC0375m, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i = this.zzy;
        int i5 = h1.e.f7632a;
        Scope[] scopeArr = C0372j.f5713s;
        Bundle bundle = new Bundle();
        C0590c[] c0590cArr = C0372j.f5714t;
        C0372j c0372j = new C0372j(6, i, i5, null, null, scopeArr, bundle, null, c0590cArr, c0590cArr, true, 0, false, str);
        c0372j.f5718d = this.zzl.getPackageName();
        c0372j.f5721k = getServiceRequestExtraArgs;
        if (set != null) {
            c0372j.f5720f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c0372j.f5722l = account;
            if (interfaceC0375m != null) {
                c0372j.f5719e = interfaceC0375m.asBinder();
            }
        } else if (requiresAccount()) {
            c0372j.f5722l = getAccount();
        }
        c0372j.f5723m = zze;
        c0372j.f5724n = getApiFeatures();
        if (usesClientTelemetry()) {
            c0372j.f5727q = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        InterfaceC0377o interfaceC0377o = this.zzr;
                        if (interfaceC0377o != null) {
                            ((B) interfaceC0377o).a(new G(this, this.zzd.get()), c0372j);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } finally {
                    }
                }
            } catch (DeadObjectException e5) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
                triggerConnectionSuspended(3);
            } catch (SecurityException e6) {
                throw e6;
            }
        } catch (RemoteException | RuntimeException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public abstract Set getScopes();

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                C.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC0377o interfaceC0377o = this.zzr;
                if (interfaceC0377o == null) {
                    return null;
                }
                return ((B) interfaceC0377o).asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C0371i getTelemetryConfiguration() {
        K k5 = this.zzE;
        if (k5 == null) {
            return null;
        }
        return k5.f5677d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z4;
        synchronized (this.zzp) {
            z4 = this.zzv == 4;
        }
        return z4;
    }

    public boolean isConnecting() {
        boolean z4;
        synchronized (this.zzp) {
            int i = this.zzv;
            z4 = true;
            if (i != 2 && i != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(C0588a c0588a) {
        this.zzi = c0588a.f7621b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i5) {
        I i6 = new I(this, i, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i5, -1, i6));
    }

    public void onUserSignOut(InterfaceC0367e interfaceC0367e) {
        h1.i iVar = (h1.i) interfaceC0367e;
        ((com.google.android.gms.common.api.internal.D) iVar.f7641b).f5563o.f5638n.post(new B3.N(iVar, 23));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(AbstractC0820a abstractC0820a) {
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        int i5 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i5, i));
    }

    public void triggerNotAvailable(InterfaceC0366d interfaceC0366d, int i, PendingIntent pendingIntent) {
        C.g(interfaceC0366d, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0366d;
        int i5 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i5, i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i, Bundle bundle, int i5) {
        J j5 = new J(this, i, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i5, -1, j5));
    }

    public final void zzc(K k5) {
        this.zzE = k5;
        if (usesClientTelemetry()) {
            C0371i c0371i = k5.f5677d;
            r rVarB = r.b();
            C0380s c0380s = c0371i == null ? null : c0371i.f5707a;
            synchronized (rVarB) {
                if (c0380s == null) {
                    c0380s = r.f5745c;
                } else {
                    C0380s c0380s2 = (C0380s) rVarB.f5746a;
                    if (c0380s2 == null || c0380s2.f5747a < c0380s.f5747a) {
                    }
                }
                rVarB.f5746a = c0380s;
            }
        }
    }

    public final /* synthetic */ void zzd(int i, IInterface iInterface) {
        a(i, null);
    }

    public final /* synthetic */ boolean zze(int i, int i5, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                a(i5, iInterface);
                return true;
            } finally {
            }
        }
    }

    public final /* synthetic */ void zzf(int i) {
        int i5;
        int i6;
        synchronized (this.zzp) {
            i5 = this.zzv;
        }
        if (i5 == 3) {
            this.zzD = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i6, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() throws ClassNotFoundException {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(InterfaceC0377o interfaceC0377o) {
        this.zzr = interfaceC0377o;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ InterfaceC0364b zzk() {
        return this.zzw;
    }

    public final /* synthetic */ InterfaceC0365c zzl() {
        return this.zzx;
    }

    public final /* synthetic */ C0588a zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(C0588a c0588a) {
        this.zzC = c0588a;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
