package A;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\k.smali */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f17g;
    public int h;

    /* renamed from: j, reason: collision with root package name */
    public S0.c f18j;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f20l;

    /* renamed from: m, reason: collision with root package name */
    public String f21m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f22n;

    /* renamed from: o, reason: collision with root package name */
    public final Notification f23o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f24p;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f13c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14d = new ArrayList();
    public final boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19k = false;

    public k(Context context, String str) {
        Notification notification = new Notification();
        this.f23o = notification;
        this.f11a = context;
        this.f21m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.f24p = new ArrayList();
        this.f22n = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        int i;
        int i5;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder builderA = s.a(this.f11a, this.f21m);
        Notification notification = this.f23o;
        int i6 = 0;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f15e).setContentText(this.f16f).setContentInfo(null).setContentIntent(this.f17g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        q.b(builderA, (Icon) null);
        l.b(l.d(l.c(builderA, (CharSequence) null), false), this.h);
        Iterator it = this.f12b.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.f5b == null && (i5 = iVar.f8e) != 0) {
                iVar.f5b = IconCompat.a(i5);
            }
            IconCompat iconCompat = iVar.f5b;
            Notification.Action.Builder builderA2 = q.a(iconCompat != null ? E.d.c(iconCompat, null) : null, iVar.f9f, iVar.f10g);
            Bundle bundle3 = iVar.f4a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z4 = iVar.f6c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z4);
            int i7 = Build.VERSION.SDK_INT;
            r.a(builderA2, z4);
            bundle4.putInt("android.support.action.semanticAction", 0);
            t.b(builderA2, 0);
            u.c(builderA2, false);
            if (i7 >= 31) {
                v.a(builderA2, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", iVar.f7d);
            o.b(builderA2, bundle4);
            o.a(builderA, o.d(builderA2));
        }
        Bundle bundle5 = this.f20l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        m.a(builderA, this.i);
        o.i(builderA, this.f19k);
        o.g(builderA, null);
        o.j(builderA, null);
        o.h(builderA, false);
        p.b(builderA, null);
        p.c(builderA, 0);
        p.f(builderA, 0);
        p.d(builderA, null);
        p.e(builderA, notification.sound, notification.audioAttributes);
        ArrayList arrayList = this.f24p;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                p.a(builderA, (String) it2.next());
            }
        }
        ArrayList arrayList2 = this.f14d;
        if (arrayList2.size() > 0) {
            if (this.f20l == null) {
                this.f20l = new Bundle();
            }
            Bundle bundle6 = this.f20l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList2.size()) {
                String string = Integer.toString(i8);
                i iVar2 = (i) arrayList2.get(i8);
                Bundle bundle9 = new Bundle();
                if (iVar2.f5b == null && (i = iVar2.f8e) != 0) {
                    iVar2.f5b = IconCompat.a(i);
                }
                IconCompat iconCompat2 = iVar2.f5b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.b() : i6);
                bundle9.putCharSequence("title", iVar2.f9f);
                bundle9.putParcelable("actionIntent", iVar2.f10g);
                Bundle bundle10 = iVar2.f4a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", iVar2.f6c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", iVar2.f7d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(string, bundle9);
                i8++;
                i6 = 0;
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f20l == null) {
                this.f20l = new Bundle();
            }
            this.f20l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        }
        n.a(builderA, this.f20l);
        r.e(builderA, null);
        s.b(builderA, 0);
        s.e(builderA, null);
        s.f(builderA, null);
        s.g(builderA, 0L);
        s.d(builderA, 0);
        if (!TextUtils.isEmpty(this.f21m)) {
            builderA.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it3 = this.f13c.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        u.a(builderA, this.f22n);
        u.b(builderA, null);
        S0.c cVar = this.f18j;
        if (cVar != null) {
            j.a(j.c(j.b(builderA), null), (CharSequence) cVar.f2848c);
        }
        Notification notificationA = l.a(builderA);
        if (cVar != null) {
            this.f18j.getClass();
        }
        if (cVar != null && (bundle = notificationA.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationA;
    }

    public final void c(boolean z4) {
        Notification notification = this.f23o;
        if (z4) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(S0.c cVar) {
        if (this.f18j != cVar) {
            this.f18j = cVar;
            if (((k) cVar.f2847b) != this) {
                cVar.f2847b = this;
                d(cVar);
            }
        }
    }
}
