package C3;

import B3.p2;
import g2.AbstractC0579b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C3\y.smali */
public abstract class y {
    static {
        Logger.getLogger(y.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            E3.b bVar = (E3.b) it.next();
            int i5 = i + 1;
            bArr[i] = bVar.f1538a.j();
            i += 2;
            bArr[i5] = bVar.f1539b.j();
        }
        Logger logger = p2.f944a;
        int i6 = 0;
        while (i6 < size) {
            byte[] bArr2 = bArr[i6];
            int i7 = i6 + 1;
            byte[] bArr3 = bArr[i7];
            byte[] bArr4 = p2.f945b;
            if (p2.a(bArr2, bArr4)) {
                for (byte b5 : bArr3) {
                    if (b5 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i8 = 0; i8 < i6; i8++) {
                            arrayList2.add(bArr[i8]);
                        }
                        while (i6 < size) {
                            byte[] bArr5 = bArr[i6];
                            byte[] bArr6 = bArr[i6 + 1];
                            if (p2.a(bArr5, bArr4)) {
                                int i9 = 0;
                                for (int i10 = 0; i10 <= bArr6.length; i10++) {
                                    if (i10 == bArr6.length || bArr6[i10] == 44) {
                                        byte[] bArrA = i2.e.f7837c.a(new String(bArr6, i9, i10 - i9, AbstractC0579b.f7598a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrA);
                                        i9 = i10 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i6 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i7] = i2.e.f7837c.a(new String(bArr3, AbstractC0579b.f7598a));
            }
            i6 += 2;
        }
        return bArr;
    }
}
