package u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u.1\f.smali */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f10299a;

    /* renamed from: d, reason: collision with root package name */
    public c f10302d;

    /* renamed from: e, reason: collision with root package name */
    public c f10303e;

    /* renamed from: f, reason: collision with root package name */
    public c f10304f;

    /* renamed from: g, reason: collision with root package name */
    public c f10305g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f10306j;

    /* renamed from: k, reason: collision with root package name */
    public int f10307k;

    /* renamed from: q, reason: collision with root package name */
    public int f10313q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f10314r;

    /* renamed from: b, reason: collision with root package name */
    public d f10300b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f10301c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f10308l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f10309m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f10310n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f10311o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f10312p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i5) {
        this.f10314r = gVar;
        this.h = 0;
        this.i = 0;
        this.f10306j = 0;
        this.f10307k = 0;
        this.f10313q = 0;
        this.f10299a = i;
        this.f10302d = cVar;
        this.f10303e = cVar2;
        this.f10304f = cVar3;
        this.f10305g = cVar4;
        this.h = gVar.f10332j0;
        this.i = gVar.f10328f0;
        this.f10306j = gVar.f10333k0;
        this.f10307k = gVar.f10329g0;
        this.f10313q = i5;
    }

    public final void a(d dVar) {
        int i = this.f10299a;
        g gVar = this.f10314r;
        if (i == 0) {
            int iD = gVar.D(dVar, this.f10313q);
            if (dVar.f10262c0[0] == 3) {
                this.f10312p++;
                iD = 0;
            }
            this.f10308l = iD + (dVar.f10253V != 8 ? gVar.f10317C0 : 0) + this.f10308l;
            int iC = gVar.C(dVar, this.f10313q);
            if (this.f10300b == null || this.f10301c < iC) {
                this.f10300b = dVar;
                this.f10301c = iC;
                this.f10309m = iC;
            }
        } else {
            int iD2 = gVar.D(dVar, this.f10313q);
            int iC2 = gVar.C(dVar, this.f10313q);
            if (dVar.f10262c0[1] == 3) {
                this.f10312p++;
                iC2 = 0;
            }
            this.f10309m = iC2 + (dVar.f10253V != 8 ? gVar.f10318D0 : 0) + this.f10309m;
            if (this.f10300b == null || this.f10301c < iD2) {
                this.f10300b = dVar;
                this.f10301c = iD2;
                this.f10308l = iD2;
            }
        }
        this.f10311o++;
    }

    public final void b(int i, boolean z4, boolean z5) {
        g gVar;
        int i5;
        d dVar;
        char c5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = this.f10311o;
        int i11 = 0;
        while (true) {
            gVar = this.f10314r;
            if (i11 >= i10 || (i9 = this.f10310n + i11) >= gVar.f10327O0) {
                break;
            }
            d dVar2 = gVar.f10326N0[i9];
            if (dVar2 != null) {
                dVar2.t();
            }
            i11++;
        }
        if (i10 == 0 || this.f10300b == null) {
            return;
        }
        boolean z6 = z5 && i == 0;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = this.f10310n + (z4 ? (i10 - 1) - i14 : i14);
            if (i15 >= gVar.f10327O0) {
                break;
            }
            if (gVar.f10326N0[i15].f10253V == 0) {
                if (i12 == -1) {
                    i12 = i14;
                }
                i13 = i14;
            }
        }
        if (this.f10299a != 0) {
            d dVar3 = this.f10300b;
            dVar3.X = gVar.f10339q0;
            int i16 = this.h;
            if (i > 0) {
                i16 += gVar.f10317C0;
            }
            c cVar = dVar3.f10281x;
            c cVar2 = dVar3.f10283z;
            if (z4) {
                cVar2.a(this.f10304f, i16);
                if (z5) {
                    cVar.a(this.f10302d, this.f10306j);
                }
                if (i > 0) {
                    this.f10304f.f10227b.f10281x.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f10302d, i16);
                if (z5) {
                    cVar2.a(this.f10304f, this.f10306j);
                }
                if (i > 0) {
                    this.f10302d.f10227b.f10283z.a(cVar, 0);
                }
            }
            int i17 = 0;
            d dVar4 = null;
            while (i17 < i10) {
                int i18 = this.f10310n + i17;
                if (i18 >= gVar.f10327O0) {
                    return;
                }
                d dVar5 = gVar.f10326N0[i18];
                if (i17 == 0) {
                    dVar5.e(dVar5.f10282y, this.f10303e, this.i);
                    int i19 = gVar.f10340r0;
                    float f2 = gVar.f10346x0;
                    if (this.f10310n == 0) {
                        int i20 = gVar.f10342t0;
                        i5 = -1;
                        if (i20 != -1) {
                            f2 = gVar.f10348z0;
                        }
                        i19 = i20;
                        dVar5.f10255Y = i19;
                        dVar5.f10251T = f2;
                    } else {
                        i5 = -1;
                    }
                    if (z5 && (i20 = gVar.f10344v0) != i5) {
                        f2 = gVar.f10316B0;
                        i19 = i20;
                    }
                    dVar5.f10255Y = i19;
                    dVar5.f10251T = f2;
                }
                if (i17 == i10 - 1) {
                    dVar5.e(dVar5.f10233A, this.f10305g, this.f10307k);
                }
                if (dVar4 != null) {
                    c cVar3 = dVar5.f10282y;
                    int i21 = gVar.f10318D0;
                    c cVar4 = dVar4.f10233A;
                    cVar3.a(cVar4, i21);
                    c cVar5 = dVar5.f10282y;
                    if (i17 == i12) {
                        int i22 = this.i;
                        if (cVar5.f()) {
                            cVar5.f10231f = i22;
                        }
                    }
                    cVar4.a(cVar5, 0);
                    if (i17 == i13 + 1) {
                        int i23 = this.f10307k;
                        if (cVar4.f()) {
                            cVar4.f10231f = i23;
                        }
                    }
                }
                if (dVar5 != dVar3) {
                    if (z4) {
                        int i24 = gVar.E0;
                        if (i24 == 0) {
                            dVar5.f10283z.a(cVar2, 0);
                        } else if (i24 == 1) {
                            dVar5.f10281x.a(cVar, 0);
                        } else if (i24 == 2) {
                            dVar5.f10281x.a(cVar, 0);
                            dVar5.f10283z.a(cVar2, 0);
                        }
                    } else {
                        int i25 = gVar.E0;
                        if (i25 == 0) {
                            dVar5.f10281x.a(cVar, 0);
                        } else if (i25 == 1) {
                            dVar5.f10283z.a(cVar2, 0);
                        } else if (i25 == 2) {
                            if (z6) {
                                dVar5.f10281x.a(this.f10302d, this.h);
                                dVar5.f10283z.a(this.f10304f, this.f10306j);
                            } else {
                                dVar5.f10281x.a(cVar, 0);
                                dVar5.f10283z.a(cVar2, 0);
                            }
                        }
                    }
                }
                i17++;
                dVar4 = dVar5;
            }
            return;
        }
        d dVar6 = this.f10300b;
        dVar6.f10255Y = gVar.f10340r0;
        int i26 = this.i;
        if (i > 0) {
            i26 += gVar.f10318D0;
        }
        c cVar6 = this.f10303e;
        c cVar7 = dVar6.f10282y;
        cVar7.a(cVar6, i26);
        c cVar8 = dVar6.f10233A;
        if (z5) {
            cVar8.a(this.f10305g, this.f10307k);
        }
        if (i > 0) {
            this.f10303e.f10227b.f10233A.a(cVar7, 0);
        }
        if (gVar.f10319F0 != 3 || dVar6.f10280w) {
            dVar = dVar6;
        } else {
            for (int i27 = 0; i27 < i10; i27++) {
                int i28 = this.f10310n + (z4 ? (i10 - 1) - i27 : i27);
                if (i28 >= gVar.f10327O0) {
                    break;
                }
                dVar = gVar.f10326N0[i28];
                if (dVar.f10280w) {
                    break;
                }
            }
            dVar = dVar6;
        }
        int i29 = 0;
        d dVar7 = null;
        while (i29 < i10) {
            int i30 = z4 ? (i10 - 1) - i29 : i29;
            int i31 = this.f10310n + i30;
            if (i31 >= gVar.f10327O0) {
                return;
            }
            d dVar8 = gVar.f10326N0[i31];
            if (i29 == 0) {
                dVar8.e(dVar8.f10281x, this.f10302d, this.h);
            }
            if (i30 == 0) {
                int i32 = gVar.f10339q0;
                float f3 = gVar.f10345w0;
                if (this.f10310n == 0) {
                    int i33 = gVar.f10341s0;
                    i6 = i32;
                    i7 = -1;
                    if (i33 != -1) {
                        f3 = gVar.f10347y0;
                    }
                    i8 = i33;
                    dVar8.X = i8;
                    dVar8.f10250S = f3;
                } else {
                    i6 = i32;
                    i7 = -1;
                }
                if (!z5 || (i33 = gVar.f10343u0) == i7) {
                    i8 = i6;
                    dVar8.X = i8;
                    dVar8.f10250S = f3;
                } else {
                    f3 = gVar.f10315A0;
                    i8 = i33;
                    dVar8.X = i8;
                    dVar8.f10250S = f3;
                }
            }
            if (i29 == i10 - 1) {
                dVar8.e(dVar8.f10283z, this.f10304f, this.f10306j);
            }
            if (dVar7 != null) {
                c cVar9 = dVar8.f10281x;
                int i34 = gVar.f10317C0;
                c cVar10 = dVar7.f10283z;
                cVar9.a(cVar10, i34);
                c cVar11 = dVar8.f10281x;
                if (i29 == i12) {
                    int i35 = this.h;
                    if (cVar11.f()) {
                        cVar11.f10231f = i35;
                    }
                }
                cVar10.a(cVar11, 0);
                if (i29 == i13 + 1) {
                    int i36 = this.f10306j;
                    if (cVar10.f()) {
                        cVar10.f10231f = i36;
                    }
                }
            }
            if (dVar8 != dVar6) {
                int i37 = gVar.f10319F0;
                c5 = 3;
                if (i37 == 3 && dVar.f10280w && dVar8 != dVar && dVar8.f10280w) {
                    dVar8.f10234B.a(dVar.f10234B, 0);
                } else if (i37 == 0) {
                    dVar8.f10282y.a(cVar7, 0);
                } else if (i37 == 1) {
                    dVar8.f10233A.a(cVar8, 0);
                } else if (z6) {
                    dVar8.f10282y.a(this.f10303e, this.i);
                    dVar8.f10233A.a(this.f10305g, this.f10307k);
                } else {
                    dVar8.f10282y.a(cVar7, 0);
                    dVar8.f10233A.a(cVar8, 0);
                }
            } else {
                c5 = 3;
            }
            i29++;
            dVar7 = dVar8;
        }
    }

    public final int c() {
        return this.f10299a == 1 ? this.f10309m - this.f10314r.f10318D0 : this.f10309m;
    }

    public final int d() {
        return this.f10299a == 0 ? this.f10308l - this.f10314r.f10317C0 : this.f10308l;
    }

    public final void e(int i) {
        g gVar;
        int i5;
        int i6 = this.f10312p;
        if (i6 == 0) {
            return;
        }
        int i7 = this.f10311o;
        int i8 = i / i6;
        int i9 = 0;
        while (true) {
            gVar = this.f10314r;
            if (i9 >= i7 || (i5 = this.f10310n + i9) >= gVar.f10327O0) {
                break;
            }
            d dVar = gVar.f10326N0[i5];
            if (this.f10299a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f10262c0;
                    if (iArr[0] == 3 && dVar.f10267j == 0) {
                        gVar.E(1, i8, iArr[1], dVar.i(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f10262c0;
                if (iArr2[1] == 3 && dVar.f10268k == 0) {
                    gVar.E(iArr2[0], dVar.l(), 1, i8, dVar);
                }
            }
            i9++;
        }
        this.f10308l = 0;
        this.f10309m = 0;
        this.f10300b = null;
        this.f10301c = 0;
        int i10 = this.f10311o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f10310n + i11;
            if (i12 >= gVar.f10327O0) {
                return;
            }
            d dVar2 = gVar.f10326N0[i12];
            if (this.f10299a == 0) {
                int iL = dVar2.l();
                int i13 = gVar.f10317C0;
                if (dVar2.f10253V == 8) {
                    i13 = 0;
                }
                this.f10308l = iL + i13 + this.f10308l;
                int iC = gVar.C(dVar2, this.f10313q);
                if (this.f10300b == null || this.f10301c < iC) {
                    this.f10300b = dVar2;
                    this.f10301c = iC;
                    this.f10309m = iC;
                }
            } else {
                int iD = gVar.D(dVar2, this.f10313q);
                int iC2 = gVar.C(dVar2, this.f10313q);
                int i14 = gVar.f10318D0;
                if (dVar2.f10253V == 8) {
                    i14 = 0;
                }
                this.f10309m = iC2 + i14 + this.f10309m;
                if (this.f10300b == null || this.f10301c < iD) {
                    this.f10300b = dVar2;
                    this.f10301c = iD;
                    this.f10308l = iD;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i5, int i6, int i7, int i8, int i9) {
        this.f10299a = i;
        this.f10302d = cVar;
        this.f10303e = cVar2;
        this.f10304f = cVar3;
        this.f10305g = cVar4;
        this.h = i5;
        this.i = i6;
        this.f10306j = i7;
        this.f10307k = i8;
        this.f10313q = i9;
    }
}
