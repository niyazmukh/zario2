package C;

import A2.C0009i;
import B3.C0043g;
import B3.J;
import E2.AbstractC0101c;
import M.M;
import M.S;
import N2.AbstractC0156x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.common.api.internal.AbstractC0350l;
import com.google.android.gms.internal.common.zzg;
import f.AbstractC0489a;
import h2.C0593b;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import l.AbstractC0692h0;
import l.r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1045a;

    /* renamed from: b, reason: collision with root package name */
    public int f1046b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1047c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1048d;

    public d(int i, byte b5) {
        this.f1045a = i;
        switch (i) {
            case 4:
                this.f1047c = Collections.synchronizedMap(new q.b());
                this.f1046b = 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        if (r5 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        if (r5 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fd, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        r1 = 0;
        r3 = new android.graphics.LinearGradient(r11, r27, r26, r25, (int[]) r0.f2935b, (float[]) r0.f2936c, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0217, code lost:
    
        r1 = 0;
        r3 = new android.graphics.SweepGradient(r22, r23, (int[]) r0.f2935b, (float[]) r0.f2936c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022a, code lost:
    
        r9 = r22;
        r15 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
    
        if (r24 <= 0.0f) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0237, code lost:
    
        if (r5 == 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023a, code lost:
    
        if (r5 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023c, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0241, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0244, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0247, code lost:
    
        r3 = new android.graphics.RadialGradient(r9, r15, r24, (int[]) r0.f2935b, (float[]) r0.f2936c, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0264, code lost:
    
        return new C.d(r3, (android.content.res.ColorStateList) null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x026c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
    
        if (r14.size() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:
    
        r0 = new S0.v(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d8, code lost:
    
        if (r0 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (r19 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        r0 = new S0.v(r6, r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r0 = new S0.v(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
    
        if (r8 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        if (r8 == 2) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C.d c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.c(android.content.res.Resources, int, android.content.res.Resources$Theme):C.d");
    }

    public static d f(String str) throws ProtocolException, NumberFormatException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        D3.l lVar = D3.l.HTTP_1_0;
        if (zStartsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                lVar = D3.l.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i5 = i + 3;
        if (str.length() < i5) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i6 = Integer.parseInt(str.substring(i, i5));
            if (str.length() <= i5) {
                strSubstring = "";
            } else {
                if (str.charAt(i5) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new d(lVar, i6, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public void a() {
        D3.b bVar;
        ImageView imageView = (ImageView) this.f1047c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0692h0.a(drawable);
        }
        if (drawable == null || (bVar = (D3.b) this.f1048d) == null) {
            return;
        }
        r.e(drawable, bVar, imageView.getDrawableState());
    }

    public h2.n b() {
        h2.f fVar = (h2.f) this.f1048d;
        if (fVar != null) {
            throw fVar.a();
        }
        h2.n nVarB = h2.n.b(this.f1046b, (Object[]) this.f1047c, this);
        h2.f fVar2 = (h2.f) this.f1048d;
        if (fVar2 == null) {
            return nVarB;
        }
        throw fVar2.a();
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f1047c) == null && (colorStateList = (ColorStateList) this.f1048d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1047c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0489a.f6967f;
        C0009i c0009iY = C0009i.Y(context, attributeSet, iArr, i);
        Context context2 = imageView.getContext();
        WeakHashMap weakHashMap = S.f2363a;
        M.d(imageView, context2, iArr, attributeSet, (TypedArray) c0009iY.f205c, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0009iY.f205c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = r1.d.B(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0692h0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Q.f.c(imageView, c0009iY.F(2));
            }
            if (typedArray.hasValue(3)) {
                Q.f.d(imageView, AbstractC0692h0.b(typedArray.getInt(3, -1), null));
            }
            c0009iY.e0();
        } catch (Throwable th) {
            c0009iY.e0();
            throw th;
        }
    }

    public void g(Object obj, Object obj2) {
        int i = (this.f1046b + 1) * 2;
        Object[] objArr = (Object[]) this.f1047c;
        if (i > objArr.length) {
            this.f1047c = Arrays.copyOf(objArr, C0593b.e(objArr.length, i));
        }
        AbstractC0156x.g(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1047c;
        int i5 = this.f1046b;
        int i6 = i5 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f1046b = i5 + 1;
    }

    public void h(String str, AbstractC0350l abstractC0350l) {
        Map map = (Map) this.f1047c;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(str, abstractC0350l);
        if (this.f1046b > 0) {
            new zzg(Looper.getMainLooper()).post(new J(this, abstractC0350l, str));
        }
    }

    public void i(Bundle bundle) {
        this.f1046b = 1;
        this.f1048d = bundle;
        for (Map.Entry entry : ((Map) this.f1047c).entrySet()) {
            ((AbstractC0350l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f1047c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC0350l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public String toString() {
        switch (this.f1045a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(((D3.l) this.f1047c) == D3.l.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f1046b);
                String str = (String) this.f1048d;
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.f1047c);
                sb2.append("://");
                int i = -1;
                if (((String) this.f1048d).indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append((String) this.f1048d);
                    sb2.append(']');
                } else {
                    sb2.append((String) this.f1048d);
                }
                int i5 = this.f1046b;
                if (i5 == -1) {
                    String str2 = (String) this.f1047c;
                    i5 = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
                }
                String str3 = (String) this.f1047c;
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (i5 != i) {
                    sb2.append(':');
                    sb2.append(i5);
                }
                return sb2.toString();
        }
    }

    public d(D3.l lVar, int i, String str) {
        this.f1045a = 1;
        this.f1047c = lVar;
        this.f1046b = i;
        this.f1048d = str;
    }

    public d(ImageView imageView) {
        this.f1045a = 6;
        this.f1046b = 0;
        this.f1047c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f1045a = 0;
        this.f1047c = shader;
        this.f1048d = colorStateList;
        this.f1046b = i;
    }

    public d(AbstractC0101c abstractC0101c, C0043g c0043g) {
        this.f1045a = 2;
        this.f1048d = abstractC0101c;
        this.f1046b = 0;
        this.f1047c = c0043g;
    }

    public d(int i, int i5) {
        this.f1045a = i5;
        switch (i5) {
            case 7:
                this.f1046b = i;
                this.f1047c = new HashSet();
                this.f1048d = new ArrayList();
                break;
            default:
                this.f1047c = new Object[i * 2];
                this.f1046b = 0;
                break;
        }
    }
}
