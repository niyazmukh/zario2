package q4;

import a.AbstractC0183a;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q4\f.smali */
public class f implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final f f9516d = new f(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9517a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f9518b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f9519c;

    public f(byte[] data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f9517a = data;
    }

    public static final f f(byte... data) {
        kotlin.jvm.internal.i.e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(this, size)");
        return new f(bArrCopyOf);
    }

    public String a() {
        byte[] map = a.f9507a;
        byte[] bArr = this.f9517a;
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i5 = 0;
        while (i < length) {
            byte b5 = bArr[i];
            int i6 = i + 2;
            byte b6 = bArr[i + 1];
            i += 3;
            byte b7 = bArr[i6];
            bArr2[i5] = map[(b5 & 255) >> 2];
            bArr2[i5 + 1] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr2[i5 + 2] = map[((b6 & 15) << 2) | ((b7 & 255) >> 6)];
            i5 += 4;
            bArr2[i7] = map[b7 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b8 = bArr[i];
            bArr2[i5] = map[(b8 & 255) >> 2];
            bArr2[i5 + 1] = map[(b8 & 3) << 4];
            bArr2[i5 + 2] = 61;
            bArr2[i5 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i + 1;
            byte b9 = bArr[i];
            byte b10 = bArr[i8];
            bArr2[i5] = map[(b9 & 255) >> 2];
            bArr2[i5 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            bArr2[i5 + 2] = map[(b10 & 15) << 2];
            bArr2[i5 + 3] = 61;
        }
        return new String(bArr2, e4.a.a);
    }

    public int b() {
        return this.f9517a.length;
    }

    public String c() {
        byte[] bArr = this.f9517a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b5 : bArr) {
            int i5 = i + 1;
            char[] cArr2 = r4.b.f9665a;
            cArr[i] = cArr2[(b5 >> 4) & 15];
            i += 2;
            cArr[i5] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            q4.f r10 = (q4.f) r10
            java.lang.String r0 = "other"
            kotlin.jvm.internal.i.e(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L30
            byte r7 = r9.e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.e(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 >= r8) goto L2e
        L2c:
            r3 = r6
            goto L36
        L2e:
            r3 = r5
            goto L36
        L30:
            if (r0 != r1) goto L33
            goto L36
        L33:
            if (r0 >= r1) goto L2e
            goto L2c
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.f.compareTo(java.lang.Object):int");
    }

    public byte[] d() {
        return this.f9517a;
    }

    public byte e(int i) {
        return this.f9517a[i];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int iB = fVar.b();
            byte[] bArr = this.f9517a;
            if (iB == bArr.length && fVar.g(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i, byte[] other, int i5, int i6) {
        kotlin.jvm.internal.i.e(other, "other");
        if (i >= 0) {
            byte[] bArr = this.f9517a;
            if (i <= bArr.length - i6 && i5 >= 0 && i5 <= other.length - i6 && r1.d.g(bArr, i, other, i5, i6)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(f other, int i) {
        kotlin.jvm.internal.i.e(other, "other");
        return other.g(0, this.f9517a, 0, i);
    }

    public int hashCode() {
        int i = this.f9518b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f9517a);
        this.f9518b = iHashCode;
        return iHashCode;
    }

    public f i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f9517a;
            if (i >= bArr.length) {
                return this;
            }
            byte b5 = bArr[i];
            if (b5 >= 65 && b5 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b5 + 32);
                for (int i5 = i + 1; i5 < bArrCopyOf.length; i5++) {
                    byte b6 = bArrCopyOf[i5];
                    if (b6 >= 65 && b6 <= 90) {
                        bArrCopyOf[i5] = (byte) (b6 + 32);
                    }
                }
                return new f(bArrCopyOf);
            }
            i++;
        }
    }

    public byte[] j() {
        byte[] bArr = this.f9517a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.i.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final String k() {
        String str = this.f9519c;
        if (str != null) {
            return str;
        }
        byte[] bArrD = d();
        kotlin.jvm.internal.i.e(bArrD, "<this>");
        String str2 = new String(bArrD, e4.a.a);
        this.f9519c = str2;
        return str2;
    }

    public void l(d buffer, int i) {
        kotlin.jvm.internal.i.e(buffer, "buffer");
        buffer.t(this.f9517a, 0, i);
    }

    public String toString() {
        byte b5;
        int i;
        f fVar = this;
        byte[] bArr = fVar.f9517a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            byte b6 = bArr[i5];
            if (b6 >= 0) {
                int i8 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b6 != 10 && b6 != 13 && ((b6 >= 0 && b6 < 32) || (127 <= b6 && b6 < 160))) || b6 == 65533) {
                    break;
                }
                i6 += b6 < 65536 ? 1 : 2;
                i5++;
                while (true) {
                    i7 = i8;
                    if (i5 < length && (b5 = bArr[i5]) >= 0) {
                        i5++;
                        i8 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (127 <= b5 && b5 < 160))) || b5 == 65533) {
                            break loop0;
                        }
                        i6 += b5 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b6 >> 5) == -2) {
                int i9 = i5 + 1;
                if (length > i9) {
                    byte b7 = bArr[i9];
                    if ((b7 & 192) == 128) {
                        int i10 = (b7 ^ 3968) ^ (b6 << 6);
                        if (i10 >= 128) {
                            i = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                break;
                            }
                            i6 += i10 < 65536 ? 1 : 2;
                            i5 += 2;
                            i7 = i;
                        } else if (i7 != 64) {
                            break;
                        }
                    } else if (i7 != 64) {
                        break;
                    }
                } else if (i7 != 64) {
                    break;
                }
            } else if ((b6 >> 4) == -2) {
                int i11 = i5 + 2;
                if (length > i11) {
                    byte b8 = bArr[i5 + 1];
                    if ((b8 & 192) == 128) {
                        byte b9 = bArr[i11];
                        if ((b9 & 192) == 128) {
                            int i12 = ((b9 ^ (-123008)) ^ (b8 << 6)) ^ (b6 << 12);
                            if (i12 < 2048) {
                                if (i7 != 64) {
                                    break;
                                }
                            } else if (55296 > i12 || i12 >= 57344) {
                                i = i7 + 1;
                                if (i7 == 64) {
                                    break;
                                }
                                if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                    break;
                                }
                                i6 += i12 < 65536 ? 1 : 2;
                                i5 += 3;
                                i7 = i;
                            } else if (i7 != 64) {
                                break;
                            }
                        } else if (i7 != 64) {
                            break;
                        }
                    } else if (i7 != 64) {
                        break;
                    }
                } else if (i7 != 64) {
                    break;
                }
            } else if ((b6 >> 3) == -2) {
                int i13 = i5 + 3;
                if (length > i13) {
                    byte b10 = bArr[i5 + 1];
                    if ((b10 & 192) == 128) {
                        byte b11 = bArr[i5 + 2];
                        if ((b11 & 192) == 128) {
                            byte b12 = bArr[i13];
                            if ((b12 & 192) == 128) {
                                int i14 = (((b12 ^ 3678080) ^ (b11 << 6)) ^ (b10 << 12)) ^ (b6 << 18);
                                if (i14 > 1114111) {
                                    if (i7 != 64) {
                                        break;
                                    }
                                } else if (55296 > i14 || i14 >= 57344) {
                                    if (i14 >= 65536) {
                                        i = i7 + 1;
                                        if (i7 == 64) {
                                            break;
                                        }
                                        if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                                            break;
                                        }
                                        i6 += i14 < 65536 ? 1 : 2;
                                        i5 += 4;
                                        i7 = i;
                                    } else if (i7 != 64) {
                                        break;
                                    }
                                } else if (i7 != 64) {
                                    break;
                                }
                            } else if (i7 != 64) {
                                break;
                            }
                        } else if (i7 != 64) {
                            break;
                        }
                    } else if (i7 != 64) {
                        break;
                    }
                } else if (i7 != 64) {
                    break;
                }
            } else if (i7 != 64) {
                break;
            }
        }
        i6 = -1;
        if (i6 != -1) {
            String strK = k();
            String strSubstring = strK.substring(0, i6);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strV0 = e4.m.v0(e4.m.v0(e4.m.v0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i6 >= strK.length()) {
                return "[text=" + strV0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strV0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 != bArr.length) {
            AbstractC0183a.t(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            kotlin.jvm.internal.i.d(bArrCopyOfRange, "copyOfRange(...)");
            fVar = new f(bArrCopyOfRange);
        }
        sb.append(fVar.c());
        sb.append("…]");
        return sb.toString();
    }
}
