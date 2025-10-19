package u0;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import y0.InterfaceC1043b;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\i.smali */
public final class C0968i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10410b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1043b f10411c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.i f10412d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10413e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10414f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10415g;
    public final Executor h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10416j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10417k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f10418l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f10419m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f10420n;

    public C0968i(Context context, String str, InterfaceC1043b interfaceC1043b, h1.i migrationContainer, ArrayList arrayList, boolean z4, int i, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z6, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.i.e(migrationContainer, "migrationContainer");
        B.a.r(i, "journalMode");
        kotlin.jvm.internal.i.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.i.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.i.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.i.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f10409a = context;
        this.f10410b = str;
        this.f10411c = interfaceC1043b;
        this.f10412d = migrationContainer;
        this.f10413e = arrayList;
        this.f10414f = z4;
        this.f10415g = i;
        this.h = queryExecutor;
        this.i = transactionExecutor;
        this.f10416j = z5;
        this.f10417k = z6;
        this.f10418l = linkedHashSet;
        this.f10419m = typeConverters;
        this.f10420n = autoMigrationSpecs;
    }
}
