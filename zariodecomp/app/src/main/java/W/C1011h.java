package w;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w.1\h.smali */
public final class C1011h {

    /* renamed from: a, reason: collision with root package name */
    public int f10775a;

    /* renamed from: b, reason: collision with root package name */
    public final C1014k f10776b;

    /* renamed from: c, reason: collision with root package name */
    public final C1013j f10777c;

    /* renamed from: d, reason: collision with root package name */
    public final C1012i f10778d;

    /* renamed from: e, reason: collision with root package name */
    public final C1015l f10779e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f10780f;

    public C1011h() {
        C1014k c1014k = new C1014k();
        c1014k.f10844a = 0;
        c1014k.f10845b = 0;
        c1014k.f10846c = 1.0f;
        c1014k.f10847d = Float.NaN;
        this.f10776b = c1014k;
        C1013j c1013j = new C1013j();
        c1013j.f10840a = -1;
        c1013j.f10841b = -1;
        c1013j.f10842c = Float.NaN;
        c1013j.f10843d = Float.NaN;
        this.f10777c = c1013j;
        C1012i c1012i = new C1012i();
        c1012i.f10806a = false;
        c1012i.f10812d = -1;
        c1012i.f10814e = -1;
        c1012i.f10816f = -1.0f;
        c1012i.f10818g = -1;
        c1012i.h = -1;
        c1012i.i = -1;
        c1012i.f10822j = -1;
        c1012i.f10823k = -1;
        c1012i.f10824l = -1;
        c1012i.f10825m = -1;
        c1012i.f10826n = -1;
        c1012i.f10827o = -1;
        c1012i.f10828p = -1;
        c1012i.f10829q = -1;
        c1012i.f10830r = -1;
        c1012i.f10831s = -1;
        c1012i.f10832t = 0.5f;
        c1012i.f10833u = 0.5f;
        c1012i.f10834v = null;
        c1012i.f10835w = -1;
        c1012i.f10836x = 0;
        c1012i.f10837y = 0.0f;
        c1012i.f10838z = -1;
        c1012i.f10782A = -1;
        c1012i.f10783B = -1;
        c1012i.f10784C = -1;
        c1012i.f10785D = -1;
        c1012i.f10786E = -1;
        c1012i.f10787F = -1;
        c1012i.G = -1;
        c1012i.f10788H = -1;
        c1012i.f10789I = -1;
        c1012i.f10790J = -1;
        c1012i.f10791K = -1;
        c1012i.f10792L = -1;
        c1012i.f10793M = -1;
        c1012i.f10794N = -1;
        c1012i.f10795O = -1.0f;
        c1012i.f10796P = -1.0f;
        c1012i.f10797Q = 0;
        c1012i.f10798R = 0;
        c1012i.f10799S = 0;
        c1012i.f10800T = 0;
        c1012i.f10801U = -1;
        c1012i.f10802V = -1;
        c1012i.f10803W = -1;
        c1012i.X = -1;
        c1012i.f10804Y = 1.0f;
        c1012i.f10805Z = 1.0f;
        c1012i.f10807a0 = -1;
        c1012i.f10809b0 = 0;
        c1012i.f10811c0 = -1;
        c1012i.f10819g0 = false;
        c1012i.f10820h0 = false;
        c1012i.f10821i0 = true;
        this.f10778d = c1012i;
        C1015l c1015l = new C1015l();
        c1015l.f10849a = 0.0f;
        c1015l.f10850b = 0.0f;
        c1015l.f10851c = 0.0f;
        c1015l.f10852d = 1.0f;
        c1015l.f10853e = 1.0f;
        c1015l.f10854f = Float.NaN;
        c1015l.f10855g = Float.NaN;
        c1015l.h = 0.0f;
        c1015l.i = 0.0f;
        c1015l.f10856j = 0.0f;
        c1015l.f10857k = false;
        c1015l.f10858l = 0.0f;
        this.f10779e = c1015l;
        this.f10780f = new HashMap();
    }

    public final void a(C1008e c1008e) {
        C1012i c1012i = this.f10778d;
        c1008e.f10734d = c1012i.f10818g;
        c1008e.f10736e = c1012i.h;
        c1008e.f10738f = c1012i.i;
        c1008e.f10740g = c1012i.f10822j;
        c1008e.h = c1012i.f10823k;
        c1008e.i = c1012i.f10824l;
        c1008e.f10744j = c1012i.f10825m;
        c1008e.f10746k = c1012i.f10826n;
        c1008e.f10748l = c1012i.f10827o;
        c1008e.f10752p = c1012i.f10828p;
        c1008e.f10753q = c1012i.f10829q;
        c1008e.f10754r = c1012i.f10830r;
        c1008e.f10755s = c1012i.f10831s;
        ((ViewGroup.MarginLayoutParams) c1008e).leftMargin = c1012i.f10784C;
        ((ViewGroup.MarginLayoutParams) c1008e).rightMargin = c1012i.f10785D;
        ((ViewGroup.MarginLayoutParams) c1008e).topMargin = c1012i.f10786E;
        ((ViewGroup.MarginLayoutParams) c1008e).bottomMargin = c1012i.f10787F;
        c1008e.f10760x = c1012i.f10794N;
        c1008e.f10761y = c1012i.f10793M;
        c1008e.f10757u = c1012i.f10790J;
        c1008e.f10759w = c1012i.f10792L;
        c1008e.f10762z = c1012i.f10832t;
        c1008e.f10704A = c1012i.f10833u;
        c1008e.f10749m = c1012i.f10835w;
        c1008e.f10750n = c1012i.f10836x;
        c1008e.f10751o = c1012i.f10837y;
        c1008e.f10705B = c1012i.f10834v;
        c1008e.f10718P = c1012i.f10838z;
        c1008e.f10719Q = c1012i.f10782A;
        c1008e.f10708E = c1012i.f10795O;
        c1008e.f10707D = c1012i.f10796P;
        c1008e.G = c1012i.f10798R;
        c1008e.f10709F = c1012i.f10797Q;
        c1008e.f10721S = c1012i.f10819g0;
        c1008e.f10722T = c1012i.f10820h0;
        c1008e.f10710H = c1012i.f10799S;
        c1008e.f10711I = c1012i.f10800T;
        c1008e.f10714L = c1012i.f10801U;
        c1008e.f10715M = c1012i.f10802V;
        c1008e.f10712J = c1012i.f10803W;
        c1008e.f10713K = c1012i.X;
        c1008e.f10716N = c1012i.f10804Y;
        c1008e.f10717O = c1012i.f10805Z;
        c1008e.f10720R = c1012i.f10783B;
        c1008e.f10732c = c1012i.f10816f;
        c1008e.f10728a = c1012i.f10812d;
        c1008e.f10730b = c1012i.f10814e;
        ((ViewGroup.MarginLayoutParams) c1008e).width = c1012i.f10808b;
        ((ViewGroup.MarginLayoutParams) c1008e).height = c1012i.f10810c;
        String str = c1012i.f10817f0;
        if (str != null) {
            c1008e.f10723U = str;
        }
        c1008e.setMarginStart(c1012i.f10788H);
        c1008e.setMarginEnd(c1012i.G);
        c1008e.a();
    }

    public final Object clone() {
        C1011h c1011h = new C1011h();
        C1012i c1012i = c1011h.f10778d;
        c1012i.getClass();
        C1012i c1012i2 = this.f10778d;
        c1012i.f10806a = c1012i2.f10806a;
        c1012i.f10808b = c1012i2.f10808b;
        c1012i.f10810c = c1012i2.f10810c;
        c1012i.f10812d = c1012i2.f10812d;
        c1012i.f10814e = c1012i2.f10814e;
        c1012i.f10816f = c1012i2.f10816f;
        c1012i.f10818g = c1012i2.f10818g;
        c1012i.h = c1012i2.h;
        c1012i.i = c1012i2.i;
        c1012i.f10822j = c1012i2.f10822j;
        c1012i.f10823k = c1012i2.f10823k;
        c1012i.f10824l = c1012i2.f10824l;
        c1012i.f10825m = c1012i2.f10825m;
        c1012i.f10826n = c1012i2.f10826n;
        c1012i.f10827o = c1012i2.f10827o;
        c1012i.f10828p = c1012i2.f10828p;
        c1012i.f10829q = c1012i2.f10829q;
        c1012i.f10830r = c1012i2.f10830r;
        c1012i.f10831s = c1012i2.f10831s;
        c1012i.f10832t = c1012i2.f10832t;
        c1012i.f10833u = c1012i2.f10833u;
        c1012i.f10834v = c1012i2.f10834v;
        c1012i.f10835w = c1012i2.f10835w;
        c1012i.f10836x = c1012i2.f10836x;
        c1012i.f10837y = c1012i2.f10837y;
        c1012i.f10838z = c1012i2.f10838z;
        c1012i.f10782A = c1012i2.f10782A;
        c1012i.f10783B = c1012i2.f10783B;
        c1012i.f10784C = c1012i2.f10784C;
        c1012i.f10785D = c1012i2.f10785D;
        c1012i.f10786E = c1012i2.f10786E;
        c1012i.f10787F = c1012i2.f10787F;
        c1012i.G = c1012i2.G;
        c1012i.f10788H = c1012i2.f10788H;
        c1012i.f10789I = c1012i2.f10789I;
        c1012i.f10790J = c1012i2.f10790J;
        c1012i.f10791K = c1012i2.f10791K;
        c1012i.f10792L = c1012i2.f10792L;
        c1012i.f10793M = c1012i2.f10793M;
        c1012i.f10794N = c1012i2.f10794N;
        c1012i.f10795O = c1012i2.f10795O;
        c1012i.f10796P = c1012i2.f10796P;
        c1012i.f10797Q = c1012i2.f10797Q;
        c1012i.f10798R = c1012i2.f10798R;
        c1012i.f10799S = c1012i2.f10799S;
        c1012i.f10800T = c1012i2.f10800T;
        c1012i.f10801U = c1012i2.f10801U;
        c1012i.f10802V = c1012i2.f10802V;
        c1012i.f10803W = c1012i2.f10803W;
        c1012i.X = c1012i2.X;
        c1012i.f10804Y = c1012i2.f10804Y;
        c1012i.f10805Z = c1012i2.f10805Z;
        c1012i.f10807a0 = c1012i2.f10807a0;
        c1012i.f10809b0 = c1012i2.f10809b0;
        c1012i.f10811c0 = c1012i2.f10811c0;
        c1012i.f10817f0 = c1012i2.f10817f0;
        int[] iArr = c1012i2.f10813d0;
        if (iArr != null) {
            c1012i.f10813d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            c1012i.f10813d0 = null;
        }
        c1012i.f10815e0 = c1012i2.f10815e0;
        c1012i.f10819g0 = c1012i2.f10819g0;
        c1012i.f10820h0 = c1012i2.f10820h0;
        c1012i.f10821i0 = c1012i2.f10821i0;
        C1013j c1013j = c1011h.f10777c;
        c1013j.getClass();
        C1013j c1013j2 = this.f10777c;
        c1013j2.getClass();
        c1013j.f10840a = c1013j2.f10840a;
        c1013j.f10841b = c1013j2.f10841b;
        c1013j.f10843d = c1013j2.f10843d;
        c1013j.f10842c = c1013j2.f10842c;
        C1014k c1014k = c1011h.f10776b;
        C1014k c1014k2 = this.f10776b;
        c1014k.f10844a = c1014k2.f10844a;
        c1014k.f10846c = c1014k2.f10846c;
        c1014k.f10847d = c1014k2.f10847d;
        c1014k.f10845b = c1014k2.f10845b;
        C1015l c1015l = c1011h.f10779e;
        c1015l.getClass();
        C1015l c1015l2 = this.f10779e;
        c1015l2.getClass();
        c1015l.f10849a = c1015l2.f10849a;
        c1015l.f10850b = c1015l2.f10850b;
        c1015l.f10851c = c1015l2.f10851c;
        c1015l.f10852d = c1015l2.f10852d;
        c1015l.f10853e = c1015l2.f10853e;
        c1015l.f10854f = c1015l2.f10854f;
        c1015l.f10855g = c1015l2.f10855g;
        c1015l.h = c1015l2.h;
        c1015l.i = c1015l2.i;
        c1015l.f10856j = c1015l2.f10856j;
        c1015l.f10857k = c1015l2.f10857k;
        c1015l.f10858l = c1015l2.f10858l;
        c1011h.f10775a = this.f10775a;
        return c1011h;
    }
}
