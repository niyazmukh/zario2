package m1;

import N2.AbstractC0156x;
import N2.n0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C;
import g1.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o1.AbstractC0794a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\d.smali */
public final class d extends c {
    public static final Parcelable.Creator<d> CREATOR = new m(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f8840a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f8841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8842c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8843d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8844e;

    /* renamed from: f, reason: collision with root package name */
    public int f8845f;

    /* renamed from: k, reason: collision with root package name */
    public int f8846k;

    public d(int i, Parcel parcel, h hVar) {
        this.f8840a = i;
        C.f(parcel);
        this.f8841b = parcel;
        this.f8842c = 2;
        this.f8843d = hVar;
        this.f8844e = hVar == null ? null : hVar.f8855c;
        this.f8845f = 2;
    }

    public static void f(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((C0742a) entry.getValue()).f8835k, entry);
        }
        sb.append('{');
        int iH0 = AbstractC0156x.h0(parcel);
        boolean z4 = false;
        while (parcel.dataPosition() < iH0) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
            if (entry2 != null) {
                if (z4) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                C0742a c0742a = (C0742a) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                l1.a aVar = c0742a.f8839o;
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArrCreateBooleanArray = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArrCreateDoubleArray = null;
                float[] fArrCreateFloatArray = null;
                long[] jArrCreateLongArray = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcelObtain = null;
                int i5 = c0742a.f8832d;
                if (aVar != null) {
                    switch (i5) {
                        case 0:
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, Integer.valueOf(AbstractC0156x.X(i, parcel))));
                            break;
                        case 1:
                            int iC0 = AbstractC0156x.c0(i, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iC0 != 0) {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iC0);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, bigInteger2));
                            break;
                        case 2:
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, Long.valueOf(AbstractC0156x.a0(i, parcel))));
                            break;
                        case 3:
                            AbstractC0156x.i0(parcel, i, 4);
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            AbstractC0156x.i0(parcel, i, 8);
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, AbstractC0156x.n(i, parcel)));
                            break;
                        case 6:
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, Boolean.valueOf(AbstractC0156x.V(i, parcel))));
                            break;
                        case 7:
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, AbstractC0156x.u(i, parcel)));
                            break;
                        case 8:
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, AbstractC0156x.p(i, parcel)));
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            Bundle bundleO = AbstractC0156x.o(i, parcel);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleO.keySet()) {
                                String string = bundleO.getString(str2);
                                C.f(string);
                                map2.put(str2, string);
                            }
                            h(sb, c0742a, AbstractC0743b.zaD(c0742a, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(B.a.g(i5, "Unknown field out type = "));
                    }
                } else {
                    boolean z5 = c0742a.f8833e;
                    String str3 = c0742a.f8837m;
                    if (z5) {
                        sb.append("[");
                        switch (i5) {
                            case 0:
                                int[] iArrR = AbstractC0156x.r(i, parcel);
                                int length = iArrR.length;
                                for (int i6 = 0; i6 < length; i6++) {
                                    if (i6 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(iArrR[i6]);
                                }
                                break;
                            case 1:
                                int iC02 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition2 = parcel.dataPosition();
                                if (iC02 != 0) {
                                    int i7 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[i7];
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        bigIntegerArr[i8] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(iDataPosition2 + iC02);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i9 = 0; i9 < length2; i9++) {
                                    if (i9 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigIntegerArr[i9]);
                                }
                                break;
                            case 2:
                                int iC03 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition3 = parcel.dataPosition();
                                if (iC03 != 0) {
                                    jArrCreateLongArray = parcel.createLongArray();
                                    parcel.setDataPosition(iDataPosition3 + iC03);
                                }
                                int length3 = jArrCreateLongArray.length;
                                for (int i10 = 0; i10 < length3; i10++) {
                                    if (i10 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(jArrCreateLongArray[i10]);
                                }
                                break;
                            case 3:
                                int iC04 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition4 = parcel.dataPosition();
                                if (iC04 != 0) {
                                    fArrCreateFloatArray = parcel.createFloatArray();
                                    parcel.setDataPosition(iDataPosition4 + iC04);
                                }
                                int length4 = fArrCreateFloatArray.length;
                                for (int i11 = 0; i11 < length4; i11++) {
                                    if (i11 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(fArrCreateFloatArray[i11]);
                                }
                                break;
                            case 4:
                                int iC05 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition5 = parcel.dataPosition();
                                if (iC05 != 0) {
                                    dArrCreateDoubleArray = parcel.createDoubleArray();
                                    parcel.setDataPosition(iDataPosition5 + iC05);
                                }
                                int length5 = dArrCreateDoubleArray.length;
                                for (int i12 = 0; i12 < length5; i12++) {
                                    if (i12 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(dArrCreateDoubleArray[i12]);
                                }
                                break;
                            case 5:
                                int iC06 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition6 = parcel.dataPosition();
                                if (iC06 != 0) {
                                    int i13 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[i13];
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        bigDecimalArr[i14] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(iDataPosition6 + iC06);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i15 = 0; i15 < length6; i15++) {
                                    if (i15 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(bigDecimalArr[i15]);
                                }
                                break;
                            case 6:
                                int iC07 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition7 = parcel.dataPosition();
                                if (iC07 != 0) {
                                    zArrCreateBooleanArray = parcel.createBooleanArray();
                                    parcel.setDataPosition(iDataPosition7 + iC07);
                                }
                                int length7 = zArrCreateBooleanArray.length;
                                for (int i16 = 0; i16 < length7; i16++) {
                                    if (i16 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(zArrCreateBooleanArray[i16]);
                                }
                                break;
                            case 7:
                                String[] strArrV = AbstractC0156x.v(i, parcel);
                                int length8 = strArrV.length;
                                for (int i17 = 0; i17 < length8; i17++) {
                                    if (i17 != 0) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(strArrV[i17]);
                                    sb.append("\"");
                                }
                                break;
                            case 8:
                            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int iC08 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition8 = parcel.dataPosition();
                                if (iC08 != 0) {
                                    int i18 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[i18];
                                    for (int i19 = 0; i19 < i18; i19++) {
                                        int i20 = parcel.readInt();
                                        if (i20 != 0) {
                                            int iDataPosition9 = parcel.dataPosition();
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            parcelObtain2.appendFrom(parcel, iDataPosition9, i20);
                                            parcelArr2[i19] = parcelObtain2;
                                            parcel.setDataPosition(iDataPosition9 + i20);
                                        } else {
                                            parcelArr2[i19] = null;
                                        }
                                    }
                                    parcel.setDataPosition(iDataPosition8 + iC08);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i21 = 0; i21 < length9; i21++) {
                                    if (i21 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArr[i21].setDataPosition(0);
                                    C.f(str3);
                                    C.f(c0742a.f8838n);
                                    Map map3 = (Map) c0742a.f8838n.f8854b.get(str3);
                                    C.f(map3);
                                    f(sb, map3, parcelArr[i21]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb.append("]");
                    } else {
                        switch (i5) {
                            case 0:
                                sb.append(AbstractC0156x.X(i, parcel));
                                break;
                            case 1:
                                int iC09 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition10 = parcel.dataPosition();
                                if (iC09 != 0) {
                                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(iDataPosition10 + iC09);
                                    bigInteger = new BigInteger(bArrCreateByteArray2);
                                }
                                sb.append(bigInteger);
                                break;
                            case 2:
                                sb.append(AbstractC0156x.a0(i, parcel));
                                break;
                            case 3:
                                AbstractC0156x.i0(parcel, i, 4);
                                sb.append(parcel.readFloat());
                                break;
                            case 4:
                                AbstractC0156x.i0(parcel, i, 8);
                                sb.append(parcel.readDouble());
                                break;
                            case 5:
                                sb.append(AbstractC0156x.n(i, parcel));
                                break;
                            case 6:
                                sb.append(AbstractC0156x.V(i, parcel));
                                break;
                            case 7:
                                String strU = AbstractC0156x.u(i, parcel);
                                sb.append("\"");
                                sb.append(o1.b.a(strU));
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] bArrP = AbstractC0156x.p(i, parcel);
                                sb.append("\"");
                                sb.append(bArrP != null ? Base64.encodeToString(bArrP, 0) : null);
                                sb.append("\"");
                                break;
                            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                byte[] bArrP2 = AbstractC0156x.p(i, parcel);
                                sb.append("\"");
                                sb.append(bArrP2 != null ? Base64.encodeToString(bArrP2, 10) : null);
                                sb.append("\"");
                                break;
                            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                Bundle bundleO2 = AbstractC0156x.o(i, parcel);
                                Set<String> setKeySet = bundleO2.keySet();
                                sb.append("{");
                                boolean z6 = true;
                                for (String str4 : setKeySet) {
                                    if (!z6) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\":\"");
                                    sb.append(o1.b.a(bundleO2.getString(str4)));
                                    sb.append("\"");
                                    z6 = false;
                                }
                                sb.append("}");
                                break;
                            case 11:
                                int iC010 = AbstractC0156x.c0(i, parcel);
                                int iDataPosition11 = parcel.dataPosition();
                                if (iC010 != 0) {
                                    parcelObtain = Parcel.obtain();
                                    parcelObtain.appendFrom(parcel, iDataPosition11, iC010);
                                    parcel.setDataPosition(iDataPosition11 + iC010);
                                }
                                parcelObtain.setDataPosition(0);
                                C.f(str3);
                                C.f(c0742a.f8838n);
                                Map map4 = (Map) c0742a.f8838n.f8854b.get(str3);
                                C.f(map4);
                                f(sb, map4, parcelObtain);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z4 = true;
            }
        }
        if (parcel.dataPosition() != iH0) {
            throw new B0.c(B.a.g(iH0, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void g(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C.f(obj);
                sb.append(o1.b.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                return;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                return;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                C.f(obj);
                AbstractC0794a.d(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(B.a.g(i, "Unknown type = "));
        }
    }

    public static final void h(StringBuilder sb, C0742a c0742a, Object obj) {
        boolean z4 = c0742a.f8831c;
        int i = c0742a.f8830b;
        if (!z4) {
            g(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 != 0) {
                sb.append(",");
            }
            g(sb, i, arrayList.get(i5));
        }
        sb.append("]");
    }

    @Override // m1.AbstractC0743b
    public final void addConcreteTypeArrayInternal(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        ArrayList arrayList2 = new ArrayList();
        C.f(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((d) ((AbstractC0743b) arrayList.get(i))).d());
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i6 = 0; i6 < size2; i6++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i6);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void addConcreteTypeInternal(C0742a c0742a, String str, AbstractC0743b abstractC0743b) {
        e(c0742a);
        Parcel parcelD = ((d) abstractC0743b).d();
        Parcel parcel = this.f8841b;
        int i = c0742a.f8835k;
        if (parcelD == null) {
            S0.f.u0(parcel, i, 0);
            return;
        }
        int iV0 = S0.f.v0(i, parcel);
        parcel.appendFrom(parcelD, 0, parcelD.dataSize());
        S0.f.w0(iV0, parcel);
    }

    public final Parcel d() {
        int i = this.f8845f;
        Parcel parcel = this.f8841b;
        if (i == 0) {
            int iV0 = S0.f.v0(20293, parcel);
            this.f8846k = iV0;
            S0.f.w0(iV0, parcel);
            this.f8845f = 2;
        } else if (i == 1) {
            S0.f.w0(this.f8846k, parcel);
            this.f8845f = 2;
        }
        return parcel;
    }

    public final void e(C0742a c0742a) {
        if (c0742a.f8835k == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f8841b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.f8845f;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f8846k = S0.f.v0(20293, parcel);
            this.f8845f = 1;
        }
    }

    @Override // m1.AbstractC0743b
    public final Map getFieldMappings() {
        h hVar = this.f8843d;
        if (hVar == null) {
            return null;
        }
        String str = this.f8844e;
        C.f(str);
        return (Map) hVar.f8854b.get(str);
    }

    @Override // m1.c, m1.AbstractC0743b
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // m1.c, m1.AbstractC0743b
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // m1.AbstractC0743b
    public final void setBooleanInternal(C0742a c0742a, String str, boolean z4) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        S0.f.u0(parcel, c0742a.f8835k, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    @Override // m1.AbstractC0743b
    public final void setDecodedBytesInternal(C0742a c0742a, String str, byte[] bArr) {
        e(c0742a);
        S0.f.g0(this.f8841b, c0742a.f8835k, bArr, true);
    }

    @Override // m1.AbstractC0743b
    public final void setIntegerInternal(C0742a c0742a, String str, int i) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        S0.f.u0(parcel, c0742a.f8835k, 4);
        parcel.writeInt(i);
    }

    @Override // m1.AbstractC0743b
    public final void setLongInternal(C0742a c0742a, String str, long j5) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        S0.f.u0(parcel, c0742a.f8835k, 8);
        parcel.writeLong(j5);
    }

    @Override // m1.AbstractC0743b
    public final void setStringInternal(C0742a c0742a, String str, String str2) {
        e(c0742a);
        S0.f.n0(this.f8841b, c0742a.f8835k, str2, true);
    }

    @Override // m1.AbstractC0743b
    public final void setStringMapInternal(C0742a c0742a, String str, Map map) {
        e(c0742a);
        Bundle bundle = new Bundle();
        C.f(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        S0.f.f0(this.f8841b, c0742a.f8835k, bundle, true);
    }

    @Override // m1.AbstractC0743b
    public final void setStringsInternal(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        S0.f.o0(this.f8841b, c0742a.f8835k, strArr, true);
    }

    @Override // m1.AbstractC0743b
    public final String toString() {
        h hVar = this.f8843d;
        C.g(hVar, "Cannot convert to JSON on client side.");
        Parcel parcelD = d();
        parcelD.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.f8844e;
        C.f(str);
        Map map = (Map) hVar.f8854b.get(str);
        C.f(map);
        f(sb, map, parcelD);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = S0.f.v0(20293, parcel);
        S0.f.u0(parcel, 1, 4);
        parcel.writeInt(this.f8840a);
        Parcel parcelD = d();
        if (parcelD != null) {
            int iV02 = S0.f.v0(2, parcel);
            parcel.appendFrom(parcelD, 0, parcelD.dataSize());
            S0.f.w0(iV02, parcel);
        }
        S0.f.m0(parcel, 3, this.f8842c != 0 ? this.f8843d : null, i, false);
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zab(C0742a c0742a, String str, BigDecimal bigDecimal) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        int i = c0742a.f8835k;
        if (bigDecimal == null) {
            S0.f.u0(parcel, i, 0);
            return;
        }
        int iV0 = S0.f.v0(i, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zad(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeByteArray(bigDecimalArr[i6].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i6].scale());
        }
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zaf(C0742a c0742a, String str, BigInteger bigInteger) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        int i = c0742a.f8835k;
        if (bigInteger == null) {
            S0.f.u0(parcel, i, 0);
            return;
        }
        int iV0 = S0.f.v0(i, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zah(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeByteArray(bigIntegerArr[i6].toByteArray());
        }
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zak(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        parcel.writeBooleanArray(zArr);
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zan(C0742a c0742a, String str, double d5) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        S0.f.u0(parcel, c0742a.f8835k, 8);
        parcel.writeDouble(d5);
    }

    @Override // m1.AbstractC0743b
    public final void zap(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        parcel.writeDoubleArray(dArr);
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zar(C0742a c0742a, String str, float f2) {
        e(c0742a);
        Parcel parcel = this.f8841b;
        S0.f.u0(parcel, c0742a.f8835k, 4);
        parcel.writeFloat(f2);
    }

    @Override // m1.AbstractC0743b
    public final void zat(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        parcel.writeFloatArray(fArr);
        S0.f.w0(iV0, parcel);
    }

    @Override // m1.AbstractC0743b
    public final void zaw(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        S0.f.i0(this.f8841b, c0742a.f8835k, iArr, true);
    }

    @Override // m1.AbstractC0743b
    public final void zaz(C0742a c0742a, String str, ArrayList arrayList) {
        e(c0742a);
        C.f(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        int i5 = c0742a.f8835k;
        Parcel parcel = this.f8841b;
        int iV0 = S0.f.v0(i5, parcel);
        parcel.writeLongArray(jArr);
        S0.f.w0(iV0, parcel);
    }
}
