package androidx.core.graphics.drawable;

import E.d;
import E.f;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\core\graphics\drawable\IconCompat.smali */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4364k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f4366b;

    /* renamed from: j, reason: collision with root package name */
    public String f4372j;

    /* renamed from: a, reason: collision with root package name */
    public int f4365a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4367c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4368d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f4369e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f4370f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4371g = null;
    public PorterDuff.Mode h = f4364k;
    public String i = null;

    public static IconCompat a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4367c = null;
        iconCompat.f4368d = null;
        iconCompat.f4370f = 0;
        iconCompat.f4371g = null;
        iconCompat.h = f4364k;
        iconCompat.i = null;
        iconCompat.f4365a = 2;
        iconCompat.f4369e = i;
        iconCompat.f4366b = "";
        iconCompat.f4372j = "";
        return iconCompat;
    }

    public final int b() {
        int i = this.f4365a;
        if (i == -1) {
            return f.a(this.f4366b);
        }
        if (i == 2) {
            return this.f4369e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri c() {
        int i = this.f4365a;
        if (i == -1) {
            return d.a(this.f4366b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f4366b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f4365a == -1) {
            return String.valueOf(this.f4366b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4365a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f4365a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4366b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4366b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4372j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4369e);
                if (this.f4370f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4370f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f4366b);
                break;
        }
        if (this.f4371g != null) {
            sb.append(" tint=");
            sb.append(this.f4371g);
        }
        if (this.h != f4364k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
