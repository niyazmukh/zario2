package a0;

import X3.l;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a0.1\a.smali */
public final class C0184a extends j implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0184a f4016a = new C0184a(1);

    @Override // X3.l
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            i.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i = 0;
            for (byte b5 : bArr) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b5));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
            i.d(strValueOf, "toString(...)");
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f4022a + " = " + strValueOf;
    }
}
