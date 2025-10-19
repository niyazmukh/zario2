package z3;

import g2.AbstractC0579b;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\a0.smali */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f11274c = Logger.getLogger(a0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final C1084h f11275d = new C1084h(8);

    /* renamed from: e, reason: collision with root package name */
    public static final i2.c f11276e;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f11277a;

    /* renamed from: b, reason: collision with root package name */
    public int f11278b;

    static {
        i2.c cVar = i2.e.f7837c;
        if (cVar.f7839b != null) {
            cVar = new i2.c(cVar.f7838a, (Character) null);
        }
        f11276e = cVar;
    }

    public final void a(X x3) {
        if (this.f11278b == 0) {
            return;
        }
        int i = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f11278b;
            if (i >= i6) {
                Arrays.fill(this.f11277a, i5 * 2, i6 * 2, (Object) null);
                this.f11278b = i5;
                return;
            }
            if (!Arrays.equals(x3.f11270b, e(i))) {
                byte[] bArrE = e(i);
                Object[] objArr = this.f11277a;
                int i7 = i5 * 2;
                objArr[i7] = bArrE;
                Object obj = objArr[(i * 2) + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr != null ? objArr.length : 0);
                }
                this.f11277a[i7 + 1] = obj;
                i5++;
            }
            i++;
        }
    }

    public final void b(int i) {
        Object[] objArr = new Object[i];
        int i5 = this.f11278b;
        if (i5 != 0) {
            System.arraycopy(this.f11277a, 0, objArr, 0, i5 * 2);
        }
        this.f11277a = objArr;
    }

    public final Object c(X x3) {
        for (int i = this.f11278b - 1; i >= 0; i--) {
            if (Arrays.equals(x3.f11270b, e(i))) {
                Object obj = this.f11277a[(i * 2) + 1];
                if (obj instanceof byte[]) {
                    return x3.a((byte[]) obj);
                }
                obj.getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public final void d(a0 a0Var) {
        int i = a0Var.f11278b;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.f11277a;
        int length = objArr != null ? objArr.length : 0;
        int i5 = this.f11278b;
        int i6 = length - (i5 * 2);
        if (i5 == 0 || i6 < i * 2) {
            b((i * 2) + (i5 * 2));
        }
        System.arraycopy(a0Var.f11277a, 0, this.f11277a, this.f11278b * 2, a0Var.f11278b * 2);
        this.f11278b += a0Var.f11278b;
    }

    public final byte[] e(int i) {
        return (byte[]) this.f11277a[i * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(z3.X r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            S0.f.l(r5, r0)
            java.lang.String r0 = "value"
            S0.f.l(r6, r0)
            int r0 = r4.f11278b
            int r1 = r0 * 2
            if (r1 == 0) goto L19
            java.lang.Object[] r2 = r4.f11277a
            if (r2 == 0) goto L16
            int r2 = r2.length
            goto L17
        L16:
            r2 = 0
        L17:
            if (r1 != r2) goto L24
        L19:
            int r0 = r0 * 4
            r1 = 8
            int r0 = java.lang.Math.max(r0, r1)
            r4.b(r0)
        L24:
            int r0 = r4.f11278b
            java.lang.Object[] r1 = r4.f11277a
            int r2 = r0 * 2
            byte[] r3 = r5.f11270b
            r1[r2] = r3
            byte[] r5 = r5.b(r6)
            java.lang.Object[] r6 = r4.f11277a
            int r0 = r0 * 2
            int r0 = r0 + 1
            r6[r0] = r5
            int r5 = r4.f11278b
            int r5 = r5 + 1
            r4.f11278b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a0.f(z3.X, java.lang.Object):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f11278b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrE = e(i);
            Charset charset = AbstractC0579b.f7598a;
            String str = new String(bArrE, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f11277a[(i * 2) + 1];
                if (!(obj instanceof byte[])) {
                    B.a.p(obj);
                    throw null;
                }
                sb.append(f11276e.c((byte[]) obj));
            } else {
                Object obj2 = this.f11277a[(i * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    B.a.p(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
