package s3;

import L3.C0112a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\z.smali */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final y f9810b;

    /* renamed from: c, reason: collision with root package name */
    public static final M3.f f9811c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f9812d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f9813e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f9814f;

    /* renamed from: k, reason: collision with root package name */
    public static final z f9815k;

    /* renamed from: l, reason: collision with root package name */
    public static final z f9816l;

    /* renamed from: m, reason: collision with root package name */
    public static final z f9817m;

    /* renamed from: n, reason: collision with root package name */
    public static final z f9818n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ z[] f9819o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9820a;

    static {
        z zVar = new z("MOVE_TO_FOREGROUND", 0, 1, 1);
        f9813e = zVar;
        z zVar2 = new z("MOVE_TO_BACKGROUND", 1, 2, 2);
        f9814f = zVar2;
        z zVar3 = new z("USER_INTERACTION", 2, 7, new int[0]);
        z zVar4 = new z("SHORTCUT_INVOCATION", 3, 8, new int[0]);
        z zVar5 = new z("STANDBY_BUCKET_CHANGED", 4, 11, new int[0]);
        z zVar6 = new z("SCREEN_INTERACTIVE", 5, 15, new int[0]);
        z zVar7 = new z("SCREEN_NON_INTERACTIVE", 6, 16, new int[0]);
        f9815k = zVar7;
        z zVar8 = new z("KEYGUARD_SHOWN", 7, 17, new int[0]);
        f9816l = zVar8;
        z zVar9 = new z("KEYGUARD_HIDDEN", 8, 18, new int[0]);
        z zVar10 = new z("CONFIGURATION_CHANGE", 9, 5, new int[0]);
        z zVar11 = new z("FOREGROUND_SERVICE_START", 10, 19, new int[0]);
        z zVar12 = new z("FOREGROUND_SERVICE_STOP", 11, 20, new int[0]);
        z zVar13 = new z("ACTIVITY_STOPPED", 12, 23, new int[0]);
        z zVar14 = new z("DEVICE_SHUTDOWN", 13, 26, new int[0]);
        f9817m = zVar14;
        z zVar15 = new z("DEVICE_STARTUP", 14, 27, new int[0]);
        z zVar16 = new z("UNKNOWN", 15, -1, new int[0]);
        f9818n = zVar16;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9, zVar10, zVar11, zVar12, zVar13, zVar14, zVar15, zVar16};
        f9819o = zVarArr;
        R3.b bVarY = S0.f.y(zVarArr);
        f9810b = new y();
        M3.f fVar = new M3.f();
        ArrayList arrayList = new ArrayList();
        C0112a c0112a = new C0112a(bVarY, 0);
        while (c0112a.hasNext()) {
            Object next = c0112a.next();
            if (((z) next) != f9818n) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z zVar17 = (z) it.next();
            for (int i : zVar17.f9820a) {
                fVar.put(Integer.valueOf(i), zVar17);
            }
        }
        M3.f fVarB = fVar.b();
        f9811c = fVarB;
        f9812d = fVarB.keySet();
    }

    public z(String str, int i, int i5, int... iArr) {
        Object[] objArr = new Object[2];
        int[] iArr2 = {i5, 0};
        objArr[1] = iArr;
        int length = 0;
        int i6 = 0;
        while (true) {
            Object obj = objArr[i6];
            length += obj != null ? ((int[]) obj).length : 1;
            if (i6 == 1) {
                break;
            } else {
                i6++;
            }
        }
        int[] iArr3 = new int[length];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            Object obj2 = objArr[i7];
            if (obj2 != null) {
                if (i8 < i7) {
                    int i10 = i7 - i8;
                    System.arraycopy(iArr2, i8, iArr3, i9, i10);
                    i9 += i10;
                }
                int length2 = ((int[]) obj2).length;
                System.arraycopy(obj2, 0, iArr3, i9, length2);
                i9 += length2;
                i8 = i7 + 1;
            }
            if (i7 == 1) {
                break;
            } else {
                i7++;
            }
        }
        if (i8 < 2) {
            System.arraycopy(iArr2, i8, iArr3, i9, 2 - i8);
        }
        this.f9820a = iArr3;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f9819o.clone();
    }
}
