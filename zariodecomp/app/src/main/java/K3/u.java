package k3;

import android.content.Context;
import androidx.lifecycle.a0;
import androidx.lifecycle.f0;
import f4.E;
import i4.C;
import i4.I;
import i4.r;
import i4.x;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\u.smali */
public final class u extends f0 {

    /* renamed from: k, reason: collision with root package name */
    public static final long f8354k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f8355l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f8356m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final X2.a f8357a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.o f8358b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.l f8359c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8360d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneId f8361e;

    /* renamed from: f, reason: collision with root package name */
    public final DateTimeFormatter f8362f;

    /* renamed from: g, reason: collision with root package name */
    public final I f8363g;
    public final x h;
    public List i;

    /* renamed from: j, reason: collision with root package name */
    public C0666g f8364j;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f8354k = timeUnit.toMillis(1L);
        f8355l = timeUnit.toMillis(1L);
    }

    public u(X2.a dao, e3.o userSessionRepository, U2.l usageStatsRepository, Context appContext) {
        kotlin.jvm.internal.i.e(dao, "dao");
        kotlin.jvm.internal.i.e(userSessionRepository, "userSessionRepository");
        kotlin.jvm.internal.i.e(usageStatsRepository, "usageStatsRepository");
        kotlin.jvm.internal.i.e(appContext, "appContext");
        this.f8357a = dao;
        this.f8358b = userSessionRepository;
        this.f8359c = usageStatsRepository;
        this.f8360d = appContext;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        kotlin.jvm.internal.i.d(zoneIdSystemDefault, "systemDefault(...)");
        this.f8361e = zoneIdSystemDefault;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.getDefault());
        kotlin.jvm.internal.i.d(dateTimeFormatterOfPattern, "ofPattern(...)");
        this.f8362f = dateTimeFormatterOfPattern;
        C.b(null);
        I iB = C.b(e());
        this.f8363g = iB;
        this.h = new x(iB);
        this.i = L3.s.f2351a;
        this.f8364j = new C0666g(f(), L3.t.f2352a);
        new Z.j(3, 1, null);
        new i4.q((O3.d) null, this);
        int i = r.f7949a;
        h4.a aVar = h4.a.f7766a;
        E.t(a0.h(this), null, null, new n(null, this), 3);
        E.t(a0.h(this), null, null, new p(null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c9 A[EDGE_INSN: B:132:0x01c9->B:78:0x01c9 BREAK  A[LOOP:0: B:73:0x019e->B:134:0x019e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b A[LOOP:2: B:92:0x0245->B:94:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(k3.u r45, k3.C0667h r46, O3.d r47) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.u.b(k3.u, k3.h, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(k3.u r10, V2.o r11, Q3.c r12) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof k3.s
            if (r0 == 0) goto L16
            r0 = r12
            k3.s r0 = (k3.s) r0
            int r1 = r0.f8350e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8350e = r1
            goto L1b
        L16:
            k3.s r0 = new k3.s
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f8348c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f8350e
            r3 = 6
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 != r5) goto L35
            java.time.LocalDate r10 = r0.f8347b
            k3.u r11 = r0.f8346a
            a.AbstractC0183a.m0(r12)
            r9 = r12
            r12 = r10
            r10 = r11
            r11 = r9
            goto L6f
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            a.AbstractC0183a.m0(r12)
            java.time.ZoneId r12 = r10.f8361e
            java.time.LocalDate r12 = java.time.LocalDate.now(r12)
            if (r11 != 0) goto L58
            k3.i r1 = new k3.i
            java.time.LocalDate r10 = r12.minusDays(r3)
            java.lang.String r11 = "minusDays(...)"
            kotlin.jvm.internal.i.d(r10, r11)
            r1.<init>(r10, r12)
            goto Ldf
        L58:
            m4.e r2 = f4.N.f7027a
            m4.d r2 = m4.d.f8928c
            k3.t r7 = new k3.t
            r7.<init>(r11, r10, r6)
            r0.f8346a = r10
            r0.f8347b = r12
            r0.f8350e = r5
            java.lang.Object r11 = f4.E.B(r2, r7, r0)
            if (r11 != r1) goto L6f
            goto Ldf
        L6f:
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto Lb2
            java.util.Iterator r11 = r11.iterator()
            boolean r0 = r11.hasNext()
            if (r0 != 0) goto L7e
            goto Lb2
        L7e:
            java.lang.Object r0 = r11.next()
            Y2.b r0 = (Y2.b) r0
            long r1 = r0.h
            long r5 = r0.i
            long r0 = java.lang.Math.min(r1, r5)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
        L91:
            r6 = r2
        L92:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r11.next()
            Y2.b r0 = (Y2.b) r0
            long r1 = r0.h
            long r7 = r0.i
            long r0 = java.lang.Math.min(r1, r7)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            int r0 = r6.compareTo(r2)
            if (r0 <= 0) goto L92
            goto L91
        Lb2:
            if (r6 == 0) goto Lc8
            long r0 = r6.longValue()
            java.time.Instant r11 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r10 = r10.f8361e
            java.time.ZonedDateTime r10 = r11.atZone(r10)
            java.time.LocalDate r10 = r10.toLocalDate()
            if (r10 != 0) goto Lc9
        Lc8:
            r10 = r12
        Lc9:
            java.time.LocalDate r10 = r10.minusDays(r3)
            boolean r11 = r10.isAfter(r12)
            if (r11 == 0) goto Ld4
            r10 = r12
        Ld4:
            k3.i r1 = new k3.i
            kotlin.jvm.internal.i.b(r10)
            kotlin.jvm.internal.i.b(r12)
            r1.<init>(r10, r12)
        Ldf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.u.c(k3.u, V2.o, Q3.c):java.lang.Object");
    }

    public static C0667h d(C0667h c0667h, C0668i c0668i) {
        LocalDate localDate = c0668i.f8318a;
        LocalDate localDate2 = c0667h.f8316a;
        if (localDate2.isBefore(localDate)) {
            localDate2 = c0668i.f8318a;
        }
        LocalDate localDate3 = c0668i.f8319b;
        LocalDate localDate4 = c0667h.f8317b;
        if (!localDate4.isAfter(localDate3)) {
            localDate3 = localDate4;
        }
        return localDate2.isAfter(localDate3) ? new C0667h(localDate3, localDate2) : new C0667h(localDate2, localDate3);
    }

    public static ArrayList f() {
        ArrayList arrayList = new ArrayList(24);
        for (int i = 0; i < 24; i++) {
            arrayList.add(new C0669j(i, 0L));
        }
        return arrayList;
    }

    public final C0671l e() {
        LocalDate localDateNow = LocalDate.now(this.f8361e);
        kotlin.jvm.internal.i.b(localDateNow);
        C0667h c0667h = new C0667h(localDateNow, localDateNow);
        LocalDate localDateMinusDays = localDateNow.minusDays(6L);
        kotlin.jvm.internal.i.d(localDateMinusDays, "minusDays(...)");
        return new C0671l(false, L3.s.f2351a, f(), c0667h, new C0668i(localDateMinusDays, localDateNow), g(c0667h), true, 0L, L3.u.f2353a, 0L);
    }

    public final String g(C0667h c0667h) {
        LocalDate localDate = c0667h.f8316a;
        LocalDate localDate2 = c0667h.f8317b;
        boolean zA = kotlin.jvm.internal.i.a(localDate, localDate2);
        Context context = this.f8360d;
        DateTimeFormatter dateTimeFormatter = this.f8362f;
        if (zA) {
            String string = context.getString(2131886298, localDate.format(dateTimeFormatter));
            kotlin.jvm.internal.i.b(string);
            return string;
        }
        String string2 = context.getString(2131886297, localDate.format(dateTimeFormatter), localDate2.format(dateTimeFormatter));
        kotlin.jvm.internal.i.b(string2);
        return string2;
    }
}
