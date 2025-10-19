package u;

import java.util.ArrayList;
import v.C0973b;
import w.C1009f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u.1\g.smali */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public float f10315A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f10316B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f10317C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f10318D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f10319F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f10320G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f10321H0;
    public int I0;

    /* renamed from: J0, reason: collision with root package name */
    public ArrayList f10322J0;

    /* renamed from: K0, reason: collision with root package name */
    public d[] f10323K0;

    /* renamed from: L0, reason: collision with root package name */
    public d[] f10324L0;

    /* renamed from: M0, reason: collision with root package name */
    public int[] f10325M0;

    /* renamed from: N0, reason: collision with root package name */
    public d[] f10326N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f10327O0;

    /* renamed from: f0, reason: collision with root package name */
    public int f10328f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f10329g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f10330h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f10331i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f10332j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f10333k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f10334l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f10335m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f10336n0;

    /* renamed from: o0, reason: collision with root package name */
    public C0973b f10337o0;

    /* renamed from: p0, reason: collision with root package name */
    public C1009f f10338p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f10339q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f10340r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f10341s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f10342t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f10343u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f10344v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f10345w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f10346x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f10347y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f10348z0;

    @Override // u.i
    public final void B() {
        for (int i = 0; i < this.f10355e0; i++) {
            d dVar = this.f10354d0[i];
        }
    }

    public final int C(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f10262c0;
        if (iArr[1] == 3) {
            int i5 = dVar.f10268k;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (dVar.f10275r * i);
                if (i6 != dVar.i()) {
                    E(iArr[0], dVar.l(), 1, i6, dVar);
                }
                return i6;
            }
            if (i5 == 1) {
                return dVar.i();
            }
            if (i5 == 3) {
                return (int) ((dVar.l() * dVar.f10243L) + 0.5f);
            }
        }
        return dVar.i();
    }

    public final int D(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f10262c0;
        if (iArr[0] == 3) {
            int i5 = dVar.f10267j;
            if (i5 == 0) {
                return 0;
            }
            if (i5 == 2) {
                int i6 = (int) (dVar.f10272o * i);
                if (i6 != dVar.l()) {
                    E(1, i6, iArr[1], dVar.i(), dVar);
                }
                return i6;
            }
            if (i5 == 1) {
                return dVar.l();
            }
            if (i5 == 3) {
                return (int) ((dVar.i() * dVar.f10243L) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final void E(int i, int i5, int i6, int i7, d dVar) {
        C1009f c1009f;
        d dVar2;
        while (true) {
            c1009f = this.f10338p0;
            if (c1009f != null || (dVar2 = this.f10240I) == null) {
                break;
            } else {
                this.f10338p0 = ((e) dVar2).f10287g0;
            }
        }
        C0973b c0973b = this.f10337o0;
        c0973b.f10513a = i;
        c0973b.f10514b = i6;
        c0973b.f10515c = i5;
        c0973b.f10516d = i7;
        c1009f.a(dVar, c0973b);
        dVar.y(c0973b.f10517e);
        dVar.v(c0973b.f10518f);
        dVar.f10280w = c0973b.h;
        int i8 = c0973b.f10519g;
        dVar.f10247P = i8;
        dVar.f10280w = i8 > 0;
    }

    @Override // u.d
    public final void a(t.e eVar) {
        d dVar;
        super.a(eVar);
        d dVar2 = this.f10240I;
        boolean z4 = dVar2 != null ? ((e) dVar2).f10288h0 : false;
        int i = this.f10320G0;
        ArrayList arrayList = this.f10322J0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    ((f) arrayList.get(i5)).b(i5, z4, i5 == size + (-1));
                    i5++;
                }
            } else if (i == 2 && this.f10325M0 != null && this.f10324L0 != null && this.f10323K0 != null) {
                for (int i6 = 0; i6 < this.f10327O0; i6++) {
                    this.f10326N0[i6].t();
                }
                int[] iArr = this.f10325M0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                d dVar3 = null;
                for (int i9 = 0; i9 < i7; i9++) {
                    d dVar4 = this.f10324L0[z4 ? (i7 - i9) - 1 : i9];
                    if (dVar4 != null && dVar4.f10253V != 8) {
                        c cVar = dVar4.f10281x;
                        if (i9 == 0) {
                            dVar4.e(cVar, this.f10281x, this.f10332j0);
                            dVar4.X = this.f10339q0;
                            dVar4.f10250S = this.f10345w0;
                        }
                        if (i9 == i7 - 1) {
                            dVar4.e(dVar4.f10283z, this.f10283z, this.f10333k0);
                        }
                        if (i9 > 0) {
                            dVar4.e(cVar, dVar3.f10283z, this.f10317C0);
                            dVar3.e(dVar3.f10283z, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                }
                for (int i10 = 0; i10 < i8; i10++) {
                    d dVar5 = this.f10323K0[i10];
                    if (dVar5 != null && dVar5.f10253V != 8) {
                        c cVar2 = dVar5.f10282y;
                        if (i10 == 0) {
                            dVar5.e(cVar2, this.f10282y, this.f10328f0);
                            dVar5.f10255Y = this.f10340r0;
                            dVar5.f10251T = this.f10346x0;
                        }
                        if (i10 == i8 - 1) {
                            dVar5.e(dVar5.f10233A, this.f10233A, this.f10329g0);
                        }
                        if (i10 > 0) {
                            dVar5.e(cVar2, dVar3.f10233A, this.f10318D0);
                            dVar3.e(dVar3.f10233A, cVar2, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i11 = 0; i11 < i7; i11++) {
                    for (int i12 = 0; i12 < i8; i12++) {
                        int i13 = (i12 * i7) + i11;
                        if (this.I0 == 1) {
                            i13 = (i11 * i8) + i12;
                        }
                        d[] dVarArr = this.f10326N0;
                        if (i13 < dVarArr.length && (dVar = dVarArr[i13]) != null && dVar.f10253V != 8) {
                            d dVar6 = this.f10324L0[i11];
                            d dVar7 = this.f10323K0[i12];
                            if (dVar != dVar6) {
                                dVar.e(dVar.f10281x, dVar6.f10281x, 0);
                                dVar.e(dVar.f10283z, dVar6.f10283z, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.e(dVar.f10282y, dVar7.f10282y, 0);
                                dVar.e(dVar.f10233A, dVar7.f10233A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z4, true);
        }
        this.f10334l0 = false;
    }
}
