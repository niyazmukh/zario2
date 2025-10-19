package z2;

import A.k;
import A.z;
import O3.f;
import V2.n;
import W.d0;
import X3.l;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.CancellationSignal;
import android.util.Log;
import android.view.View;
import b3.C0295T;
import com.niyaz.zario.MainActivity;
import f4.C0497b0;
import f4.C0516n;
import f4.E;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;
import u0.AbstractC0967h;
import u0.C0959G;
import u0.C0965f;
import u0.C0966g;
import u0.o;
import u0.x;
import x0.InterfaceC1033d;

/* renamed from: z2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z2.1\b.smali */
public final class C1071b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f11219b;

    public /* synthetic */ C1071b(c cVar, int i) {
        this.f11218a = i;
        this.f11219b = cVar;
    }

    public static k a(Context context, String str, String str2, PendingIntent pendingIntent) {
        k kVar = new k(context, "minutes_evaluation_alerts");
        kVar.f23o.icon = 2131623936;
        kVar.f15e = k.b(str);
        kVar.f16f = k.b(str2);
        S0.c cVar = new S0.c(1);
        cVar.f2848c = k.b(str2);
        kVar.d(cVar);
        kVar.h = 1;
        kVar.c(true);
        kVar.f17g = pendingIntent;
        return kVar;
    }

    public static PendingIntent b(Context context, l lVar) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        lVar.invoke(intent);
        ArrayList arrayList = new ArrayList();
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(context.getPackageManager());
        }
        if (component != null) {
            int size = arrayList.size();
            try {
                Intent intentA = A.c.a(context, component);
                while (intentA != null) {
                    arrayList.add(size, intentA);
                    intentA = A.c.a(context, intentA.getComponent());
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e5);
            }
        }
        arrayList.add(intent);
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return z.a(context, 0, intentArr, 201326592, null);
    }

    public static void c(Context context) {
        Object systemService = context.getSystemService("notification");
        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel("minutes_evaluation_alerts") == null) {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            NotificationChannel notificationChannel = new NotificationChannel("minutes_evaluation_alerts", context.getString(2131886442), 4);
            notificationChannel.setDescription(context.getString(2131886441));
            notificationChannel.setSound(RingtoneManager.getDefaultUri(2), audioAttributesBuild);
            notificationChannel.setVibrationPattern(new long[]{0, 250, 250, 250});
            notificationChannel.enableVibration(true);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
            Log.i("NotificationUtils", "Created notification channel with enhanced configuration");
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("minutes_evaluation_alerts");
        if (notificationChannel2 != null && notificationChannel2.getImportance() == 0) {
            Log.w("NotificationUtils", "⚠️ Notification channel importance downgraded by user - notifications will not show");
            return;
        }
        if (notificationChannel2 == null || notificationChannel2.getImportance() >= 4) {
            return;
        }
        Log.w("NotificationUtils", "⚠️ Notification channel importance reduced to " + notificationChannel2.getImportance() + " - may affect visibility");
    }

    public static final Object d(x xVar, Callable callable, O3.d dVar) {
        if (xVar.l() && xVar.g().i().o()) {
            return callable.call();
        }
        C0959G c0959g = (C0959G) dVar.getContext().get(C0959G.f10383c);
        return E.B(c0959g != null ? c0959g.f10384a : AbstractC0967h.e(xVar), new C0965f(callable, null), dVar);
    }

    public static final Object e(x xVar, boolean z4, CancellationSignal cancellationSignal, Callable callable, O3.d dVar) {
        if (xVar.l() && xVar.g().i().o()) {
            return callable.call();
        }
        C0959G c0959g = (C0959G) dVar.getContext().get(C0959G.f10383c);
        f fVarE = c0959g != null ? c0959g.f10384a : z4 ? AbstractC0967h.e(xVar) : AbstractC0967h.d(xVar);
        C0516n c0516n = new C0516n(1, p1.b.x(dVar));
        c0516n.s();
        c0516n.u(new d0(3, cancellationSignal, E.t(C0497b0.f7048a, fVarE, null, new C0966g(callable, c0516n, null), 2)));
        Object objR = c0516n.r();
        P3.a aVar = P3.a.f2678a;
        return objR;
    }

    public static final int f(Cursor c5, String str) {
        i.e(c5, "c");
        int columnIndex = c5.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c5.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int g(Cursor c5, String str) {
        String strX0;
        i.e(c5, "c");
        int iF = f(c5, str);
        if (iF >= 0) {
            return iF;
        }
        try {
            String[] columnNames = c5.getColumnNames();
            i.d(columnNames, "c.columnNames");
            strX0 = L3.i.x0(columnNames, null, null, null, 63);
        } catch (Exception e5) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e5);
            strX0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strX0);
    }

    public static void h(Context context, n nVar, long j5) {
        String string;
        c(context);
        Object systemService = context.getSystemService("notification");
        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        PendingIntent pendingIntentB = b(context, new C0295T(3));
        if (j5 > 0) {
            string = "You used " + AbstractC0967h.b(context, j5) + " (goal: " + AbstractC0967h.b(context, nVar.f3447a) + "). Tap to provide feedback.";
        } else {
            string = context.getString(2131886443);
            i.b(string);
        }
        String string2 = context.getString(2131886444);
        i.d(string2, "getString(...)");
        Notification notificationA = a(context, string2, string, pendingIntentB).a();
        i.d(notificationA, "build(...)");
        notificationManager.notify(2003, notificationA);
        Log.i("NotificationUtils", "Posted evaluation cycle completed notification with wakelock");
    }

    public static void i(Context context, n nVar, long j5, int i) {
        c(context);
        Object systemService = context.getSystemService("notification");
        i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        PendingIntent pendingIntentB = b(context, new C0295T(4));
        String string = context.getString(2131886451, nVar.f3449c, AbstractC0967h.b(context, j5), AbstractC0967h.b(context, nVar.f3447a), Integer.valueOf(i));
        i.d(string, "getString(...)");
        String string2 = context.getString(2131886452, Integer.valueOf(i));
        i.d(string2, "getString(...)");
        Notification notificationA = a(context, string2, string, pendingIntentB).a();
        i.d(notificationA, "build(...)");
        ((NotificationManager) systemService).notify(2001, notificationA);
        Log.i("NotificationUtils", "Posted usage threshold notification (" + i + "%) with wakelock");
    }

    public static final void j(View view, InterfaceC1033d interfaceC1033d) {
        i.e(view, "<this>");
        view.setTag(2131231337, interfaceC1033d);
    }

    public final void k(double d5) {
        switch (this.f11218a) {
            case 0:
                e eVar = this.f11219b.f11220a;
                long jDoubleToLongBits = Double.doubleToLongBits(d5);
                long j5 = jDoubleToLongBits ^ (jDoubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
                int iB = o.b(64 - Long.numberOfLeadingZeros(j5), 8, RoundingMode.UP);
                eVar.a(iB + 1);
                byte[] bArr = eVar.f11225a;
                int i = eVar.f11226b;
                int i5 = i + 1;
                eVar.f11226b = i5;
                bArr[i] = (byte) iB;
                int i6 = i5 + iB;
                while (true) {
                    i6--;
                    int i7 = eVar.f11226b;
                    if (i6 < i7) {
                        eVar.f11226b = i7 + iB;
                        break;
                    } else {
                        eVar.f11225a[i6] = (byte) (255 & j5);
                        j5 >>>= 8;
                    }
                }
            default:
                e eVar2 = this.f11219b.f11220a;
                long jDoubleToLongBits2 = Double.doubleToLongBits(d5);
                long j6 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 < 0 ? -1L : Long.MIN_VALUE);
                int iB2 = o.b(64 - Long.numberOfLeadingZeros(j6), 8, RoundingMode.UP);
                eVar2.a(iB2 + 1);
                byte[] bArr2 = eVar2.f11225a;
                int i8 = eVar2.f11226b;
                int i9 = i8 + 1;
                eVar2.f11226b = i9;
                bArr2[i8] = (byte) (~iB2);
                int i10 = i9 + iB2;
                while (true) {
                    i10--;
                    int i11 = eVar2.f11226b;
                    if (i10 < i11) {
                        eVar2.f11226b = i11 + iB2;
                        break;
                    } else {
                        eVar2.f11225a[i10] = (byte) (~(255 & j6));
                        j6 >>>= 8;
                    }
                }
        }
    }

    public final void l() {
        switch (this.f11218a) {
            case 0:
                e eVar = this.f11219b.f11220a;
                eVar.d((byte) -1);
                eVar.d((byte) -1);
                break;
            default:
                e eVar2 = this.f11219b.f11220a;
                eVar2.e((byte) -1);
                eVar2.e((byte) -1);
                break;
        }
    }

    public final void m(long j5) {
        switch (this.f11218a) {
            case 0:
                this.f11219b.f11220a.f(j5);
                break;
            default:
                this.f11219b.f11220a.f(~j5);
                break;
        }
    }

    public final void n(String str) {
        switch (this.f11218a) {
            case 0:
                e eVar = this.f11219b.f11220a;
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt < 128) {
                        eVar.b((byte) cCharAt);
                    } else if (cCharAt < 2048) {
                        eVar.b((byte) ((cCharAt >>> 6) | 960));
                        eVar.b((byte) ((cCharAt & '?') | 128));
                    } else if (cCharAt < 55296 || 57343 < cCharAt) {
                        eVar.b((byte) ((cCharAt >>> '\f') | 480));
                        eVar.b((byte) (((cCharAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((cCharAt & '?') | 128));
                    } else {
                        int iCodePointAt = Character.codePointAt(str, i);
                        i++;
                        eVar.b((byte) ((iCodePointAt >>> 18) | 240));
                        eVar.b((byte) (((iCodePointAt >>> 12) & 63) | 128));
                        eVar.b((byte) (((iCodePointAt >>> 6) & 63) | 128));
                        eVar.b((byte) ((iCodePointAt & 63) | 128));
                    }
                    i++;
                }
                eVar.d((byte) 0);
                eVar.d((byte) 1);
                break;
            default:
                e eVar2 = this.f11219b.f11220a;
                int length2 = str.length();
                int i5 = 0;
                while (i5 < length2) {
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 < 128) {
                        eVar2.c((byte) cCharAt2);
                    } else if (cCharAt2 < 2048) {
                        eVar2.c((byte) ((cCharAt2 >>> 6) | 960));
                        eVar2.c((byte) ((cCharAt2 & '?') | 128));
                    } else if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                        eVar2.c((byte) ((cCharAt2 >>> '\f') | 480));
                        eVar2.c((byte) (((cCharAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((cCharAt2 & '?') | 128));
                    } else {
                        int iCodePointAt2 = Character.codePointAt(str, i5);
                        i5++;
                        eVar2.c((byte) ((iCodePointAt2 >>> 18) | 240));
                        eVar2.c((byte) (((iCodePointAt2 >>> 12) & 63) | 128));
                        eVar2.c((byte) (((iCodePointAt2 >>> 6) & 63) | 128));
                        eVar2.c((byte) ((iCodePointAt2 & 63) | 128));
                    }
                    i5++;
                }
                eVar2.e((byte) 0);
                eVar2.e((byte) 1);
                break;
        }
    }
}
