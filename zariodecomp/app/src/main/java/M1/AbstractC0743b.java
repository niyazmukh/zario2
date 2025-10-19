package m1;

import N2.n0;
import android.util.Base64;
import com.google.android.gms.common.internal.C;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o1.AbstractC0794a;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m1.1\b.smali */
public abstract class AbstractC0743b {
    public static final void c(StringBuilder sb, C0742a c0742a, Object obj) {
        int i = c0742a.f8830b;
        if (i == 11) {
            Class cls = c0742a.f8836l;
            C.f(cls);
            sb.append(((AbstractC0743b) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(o1.b.a((String) obj));
            sb.append("\"");
        }
    }

    public static final Object zaD(C0742a c0742a, Object obj) {
        l1.a aVar = c0742a.f8839o;
        if (aVar == null) {
            return obj;
        }
        String str = (String) aVar.f8756c.get(((Integer) obj).intValue());
        return (str == null && aVar.f8755b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public <T extends AbstractC0743b> void addConcreteTypeArrayInternal(C0742a c0742a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC0743b> void addConcreteTypeInternal(C0742a c0742a, String str, T t4) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0742a c0742a, Object obj) {
        String str = c0742a.f8834f;
        l1.a aVar = c0742a.f8839o;
        C.f(aVar);
        HashMap map = aVar.f8755b;
        Integer num = (Integer) map.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) map.get("gms_unknown");
        }
        C.f(num2);
        int i = c0742a.f8832d;
        switch (i) {
            case 0:
                setIntegerInternal(c0742a, str, num2.intValue());
                return;
            case 1:
                zaf(c0742a, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(c0742a, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(B.a.g(i, "Unsupported type for conversion: "));
            case 4:
                zan(c0742a, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(c0742a, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(c0742a, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(c0742a, str, (String) num2);
                return;
            case 8:
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                setDecodedBytesInternal(c0742a, str, (byte[]) num2);
                return;
        }
    }

    public abstract Map<String, C0742a> getFieldMappings();

    public Object getFieldValue(C0742a c0742a) {
        String str = c0742a.f8834f;
        if (c0742a.f8836l == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + c0742a.f8834f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(C0742a c0742a) {
        if (c0742a.f8832d != 11) {
            return isPrimitiveFieldSet(c0742a.f8834f);
        }
        if (c0742a.f8833e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(C0742a c0742a, String str, boolean z4) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(C0742a c0742a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(C0742a c0742a, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(C0742a c0742a, String str, long j5) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(C0742a c0742a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(C0742a c0742a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(C0742a c0742a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, C0742a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            C0742a c0742a = fieldMappings.get(str);
            if (isFieldSet(c0742a)) {
                Object objZaD = zaD(c0742a, getFieldValue(c0742a));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objZaD != null) {
                    switch (c0742a.f8832d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objZaD, 0));
                            sb.append("\"");
                            break;
                        case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objZaD, 10));
                            sb.append("\"");
                            break;
                        case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            AbstractC0794a.d(sb, (HashMap) objZaD);
                            break;
                        default:
                            if (c0742a.f8831c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        c(sb, c0742a, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            } else {
                                c(sb, c0742a, objZaD);
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(C0742a c0742a, String str) {
        if (c0742a.f8839o != null) {
            b(c0742a, str);
        } else {
            setStringInternal(c0742a, c0742a.f8834f, str);
        }
    }

    public final void zaB(C0742a c0742a, Map map) {
        if (c0742a.f8839o != null) {
            b(c0742a, map);
        } else {
            setStringMapInternal(c0742a, c0742a.f8834f, map);
        }
    }

    public final void zaC(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            setStringsInternal(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public final void zaa(C0742a c0742a, BigDecimal bigDecimal) {
        if (c0742a.f8839o != null) {
            b(c0742a, bigDecimal);
        } else {
            zab(c0742a, c0742a.f8834f, bigDecimal);
        }
    }

    public void zab(C0742a c0742a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zad(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zad(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0742a c0742a, BigInteger bigInteger) {
        if (c0742a.f8839o != null) {
            b(c0742a, bigInteger);
        } else {
            zaf(c0742a, c0742a.f8834f, bigInteger);
        }
    }

    public void zaf(C0742a c0742a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zah(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zah(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0742a c0742a, boolean z4) {
        if (c0742a.f8839o != null) {
            b(c0742a, Boolean.valueOf(z4));
        } else {
            setBooleanInternal(c0742a, c0742a.f8834f, z4);
        }
    }

    public final void zaj(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zak(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zak(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0742a c0742a, byte[] bArr) {
        if (c0742a.f8839o != null) {
            b(c0742a, bArr);
        } else {
            setDecodedBytesInternal(c0742a, c0742a.f8834f, bArr);
        }
    }

    public final void zam(C0742a c0742a, double d5) {
        if (c0742a.f8839o != null) {
            b(c0742a, Double.valueOf(d5));
        } else {
            zan(c0742a, c0742a.f8834f, d5);
        }
    }

    public void zan(C0742a c0742a, String str, double d5) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zap(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zap(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0742a c0742a, float f2) {
        if (c0742a.f8839o != null) {
            b(c0742a, Float.valueOf(f2));
        } else {
            zar(c0742a, c0742a.f8834f, f2);
        }
    }

    public void zar(C0742a c0742a, String str, float f2) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zat(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zat(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0742a c0742a, int i) {
        if (c0742a.f8839o != null) {
            b(c0742a, Integer.valueOf(i));
        } else {
            setIntegerInternal(c0742a, c0742a.f8834f, i);
        }
    }

    public final void zav(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zaw(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zaw(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0742a c0742a, long j5) {
        if (c0742a.f8839o != null) {
            b(c0742a, Long.valueOf(j5));
        } else {
            setLongInternal(c0742a, c0742a.f8834f, j5);
        }
    }

    public final void zay(C0742a c0742a, ArrayList arrayList) {
        if (c0742a.f8839o != null) {
            b(c0742a, arrayList);
        } else {
            zaz(c0742a, c0742a.f8834f, arrayList);
        }
    }

    public void zaz(C0742a c0742a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
