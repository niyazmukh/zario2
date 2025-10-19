package E3;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import q4.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\c.smali */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final i f1542b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1541a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public b[] f1545e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f1546f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f1547g = 0;
    public int h = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1543c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f1544d = 4096;

    public c(f fVar) {
        this.f1542b = new i(fVar);
    }

    public final int a(int i) {
        int i5;
        int i6 = 0;
        if (i > 0) {
            int length = this.f1545e.length;
            while (true) {
                length--;
                i5 = this.f1546f;
                if (length < i5 || i <= 0) {
                    break;
                }
                int i7 = this.f1545e[length].f1540c;
                i -= i7;
                this.h -= i7;
                this.f1547g--;
                i6++;
            }
            b[] bVarArr = this.f1545e;
            System.arraycopy(bVarArr, i5 + 1, bVarArr, i5 + 1 + i6, this.f1547g);
            this.f1546f += i6;
        }
        return i6;
    }

    public final q4.f b(int i) throws IOException {
        if (i >= 0) {
            b[] bVarArr = e.f1554b;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f1538a;
            }
        }
        int length = this.f1546f + 1 + (i - e.f1554b.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f1545e;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f1538a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f1541a.add(bVar);
        int i = this.f1544d;
        int i5 = bVar.f1540c;
        if (i5 > i) {
            Arrays.fill(this.f1545e, (Object) null);
            this.f1546f = this.f1545e.length - 1;
            this.f1547g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i5) - i);
        int i6 = this.f1547g + 1;
        b[] bVarArr = this.f1545e;
        if (i6 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f1546f = this.f1545e.length - 1;
            this.f1545e = bVarArr2;
        }
        int i7 = this.f1546f;
        this.f1546f = i7 - 1;
        this.f1545e[i7] = bVar;
        this.f1547g++;
        this.h += i5;
    }

    public final q4.f d() throws EOFException {
        int i;
        i iVar = this.f1542b;
        byte bA = iVar.a();
        int i5 = bA & 255;
        boolean z4 = (bA & 128) == 128;
        int iE = e(i5, 127);
        if (!z4) {
            return iVar.e(iE);
        }
        l lVar = l.f1575d;
        long j5 = iE;
        iVar.l(j5);
        byte[] bArrM = iVar.f9525b.m(j5);
        lVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k kVar = lVar.f1576a;
        k kVar2 = kVar;
        int i6 = 0;
        int i7 = 0;
        for (byte b5 : bArrM) {
            i6 = (i6 << 8) | (b5 & 255);
            i7 += 8;
            while (i7 >= 8) {
                kVar2 = ((k[]) kVar2.f1572c)[(i6 >>> (i7 - 8)) & 255];
                if (((k[]) kVar2.f1572c) == null) {
                    byteArrayOutputStream.write(kVar2.f1570a);
                    i7 -= kVar2.f1571b;
                    kVar2 = kVar;
                } else {
                    i7 -= 8;
                }
            }
        }
        while (i7 > 0) {
            k kVar3 = ((k[]) kVar2.f1572c)[(i6 << (8 - i7)) & 255];
            if (((k[]) kVar3.f1572c) != null || (i = kVar3.f1571b) > i7) {
                break;
            }
            byteArrayOutputStream.write(kVar3.f1570a);
            i7 -= i;
            kVar2 = kVar;
        }
        return q4.f.f(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i, int i5) throws EOFException {
        int i6 = i & i5;
        if (i6 < i5) {
            return i6;
        }
        int i7 = 0;
        while (true) {
            byte bA = this.f1542b.a();
            int i8 = bA & 255;
            if ((bA & 128) == 0) {
                return i5 + (i8 << i7);
            }
            i5 += (bA & 127) << i7;
            i7 += 7;
        }
    }
}
