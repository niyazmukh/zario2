package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzas.smali */
final class zzas<K, V> extends zzal<K, V> {
    private static final zzal<Object, Object> zza = new zzas(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    private zzas(Object obj, Object[] objArr, int i) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.zzb
            java.lang.Object[] r1 = r7.zzc
            int r7 = r7.zzd
            r2 = 0
            if (r8 != 0) goto Lc
        L9:
            r7 = r2
            goto L9c
        Lc:
            r3 = 1
            if (r7 != r3) goto L22
            r7 = 0
            r7 = r1[r7]
            java.util.Objects.requireNonNull(r7)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L9
            r7 = r1[r3]
            java.util.Objects.requireNonNull(r7)
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r7 = r0 instanceof byte[]
            if (r7 == 0) goto L50
            r7 = r0
            byte[] r7 = (byte[]) r7
            int r0 = r7.length
            int r4 = r0 + (-1)
            int r0 = r8.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L37:
            r0 = r0 & r4
            r5 = r7[r0]
            r6 = 255(0xff, float:3.57E-43)
            r5 = r5 & r6
            if (r5 != r6) goto L40
            goto L9
        L40:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L4d
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L4d:
            int r0 = r0 + 1
            goto L37
        L50:
            boolean r7 = r0 instanceof short[]
            if (r7 == 0) goto L7c
            r7 = r0
            short[] r7 = (short[]) r7
            int r0 = r7.length
            int r4 = r0 + (-1)
            int r0 = r8.hashCode()
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r0)
        L62:
            r0 = r0 & r4
            short r5 = r7[r0]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L6c
            goto L9
        L6c:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L79
            r7 = r5 ^ 1
            r7 = r1[r7]
            goto L9c
        L79:
            int r0 = r0 + 1
            goto L62
        L7c:
            int[] r0 = (int[]) r0
            int r7 = r0.length
            int r7 = r7 - r3
            int r4 = r8.hashCode()
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzad.zza(r4)
        L88:
            r4 = r4 & r7
            r5 = r0[r4]
            r6 = -1
            if (r5 != r6) goto L90
            goto L9
        L90:
            r6 = r1[r5]
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto La0
            r7 = r5 ^ 1
            r7 = r1[r7]
        L9c:
            if (r7 != 0) goto L9f
            return r2
        L9f:
            return r7
        La0:
            int r4 = r4 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzas.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzag<V> zza() {
        return new zzaw(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<Map.Entry<K, V>> zzb() {
        return new zzar(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return new zzat(this, new zzaw(this.zzc, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    public final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static <K, V> zzas<K, V> zza(int i, Object[] objArr, zzao<K, V> zzaoVar) {
        int iHighestOneBit;
        short[] sArr;
        char c5;
        char c6;
        int i5 = i;
        Object[] objArrCopyOf = objArr;
        if (i5 == 0) {
            return (zzas) zza;
        }
        Object zzanVar = null;
        int i6 = 1;
        if (i5 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzae.zza(obj, obj2);
            return new zzas<>(null, objArrCopyOf, 1);
        }
        zzu.zzb(i5, objArrCopyOf.length >> 1);
        int iMax = Math.max(i5, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            zzu.zza(iMax < 1073741824, "collection too large");
        }
        if (i5 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzae.zza(obj3, obj4);
            c5 = 1;
            c6 = 2;
        } else {
            int i7 = iHighestOneBit - 1;
            char c7 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i8 * 2;
                    int i11 = i9 * 2;
                    Object obj5 = objArrCopyOf[i10];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i10 ^ i6];
                    Objects.requireNonNull(obj6);
                    zzae.zza(obj5, obj6);
                    int iZza = zzad.zza(obj5.hashCode());
                    while (true) {
                        int i12 = iZza & i7;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i11;
                            if (i9 < i8) {
                                objArrCopyOf[i11] = obj5;
                                objArrCopyOf[i11 ^ 1] = obj6;
                            }
                            i9++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i13])) {
                                int i14 = i13 ^ 1;
                                Object obj7 = objArrCopyOf[i14];
                                Objects.requireNonNull(obj7);
                                zzanVar = new zzan(obj5, obj6, obj7);
                                objArrCopyOf[i14] = obj6;
                                break;
                            }
                            iZza = i12 + 1;
                        }
                    }
                    i8++;
                    i6 = 1;
                }
                if (i9 == i5) {
                    zzanVar = bArr;
                    c6 = 2;
                    c5 = 1;
                } else {
                    zzanVar = new Object[]{bArr, Integer.valueOf(i9), zzanVar};
                    c6 = 2;
                    c5 = 1;
                }
            } else {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i16 * 2;
                        int i18 = i15 * 2;
                        Object obj8 = objArrCopyOf[i17];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArrCopyOf[i17 ^ 1];
                        Objects.requireNonNull(obj9);
                        zzae.zza(obj8, obj9);
                        int iZza2 = zzad.zza(obj8.hashCode());
                        while (true) {
                            int i19 = iZza2 & i7;
                            int i20 = sArr[i19] & 65535;
                            if (i20 == 65535) {
                                sArr[i19] = (short) i18;
                                if (i15 < i16) {
                                    objArrCopyOf[i18] = obj8;
                                    objArrCopyOf[i18 ^ 1] = obj9;
                                }
                                i15++;
                            } else {
                                if (obj8.equals(objArrCopyOf[i20])) {
                                    int i21 = i20 ^ 1;
                                    Object obj10 = objArrCopyOf[i21];
                                    Objects.requireNonNull(obj10);
                                    zzanVar = new zzan(obj8, obj9, obj10);
                                    objArrCopyOf[i21] = obj9;
                                    break;
                                }
                                iZza2 = i19 + 1;
                            }
                        }
                    }
                    if (i15 != i5) {
                        c6 = 2;
                        zzanVar = new Object[]{sArr, Integer.valueOf(i15), zzanVar};
                        c5 = 1;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < i5) {
                        int i24 = i22 * 2;
                        int i25 = i23 * 2;
                        Object obj11 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj11);
                        Object obj12 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj12);
                        zzae.zza(obj11, obj12);
                        int iZza3 = zzad.zza(obj11.hashCode());
                        while (true) {
                            int i26 = iZza3 & i7;
                            ?? r15 = sArr[i26];
                            if (r15 == c7) {
                                sArr[i26] = i25;
                                if (i23 < i22) {
                                    objArrCopyOf[i25] = obj11;
                                    objArrCopyOf[i25 ^ 1] = obj12;
                                }
                                i23++;
                            } else {
                                if (obj11.equals(objArrCopyOf[r15])) {
                                    int i27 = r15 ^ 1;
                                    Object obj13 = objArrCopyOf[i27];
                                    Objects.requireNonNull(obj13);
                                    zzanVar = new zzan(obj11, obj12, obj13);
                                    objArrCopyOf[i27] = obj12;
                                    break;
                                }
                                iZza3 = i26 + 1;
                                c7 = 65535;
                            }
                        }
                        i22++;
                        c7 = 65535;
                    }
                    if (i23 != i5) {
                        c5 = 1;
                        c6 = 2;
                        zzanVar = new Object[]{sArr, Integer.valueOf(i23), zzanVar};
                    }
                }
                zzanVar = sArr;
                c6 = 2;
                c5 = 1;
            }
        }
        boolean z4 = zzanVar instanceof Object[];
        Object obj14 = zzanVar;
        if (z4) {
            Object[] objArr2 = (Object[]) zzanVar;
            zzan zzanVar2 = (zzan) objArr2[c6];
            if (zzaoVar == null) {
                throw zzanVar2.zza();
            }
            zzaoVar.zza = zzanVar2;
            Object obj15 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c5]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
            obj14 = obj15;
            i5 = iIntValue;
        }
        return new zzas<>(obj14, objArrCopyOf, i5);
    }
}
