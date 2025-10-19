package z3;

import B3.B1;
import B3.C0054j1;
import g2.AbstractC0579b;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: z3.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\h.1.smali */
public final class C1084h implements InterfaceC1085i, Z, i0, W {

    /* renamed from: b, reason: collision with root package name */
    public static final C1084h f11313b = new C1084h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f11314c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11315a;

    public /* synthetic */ C1084h(int i) {
        this.f11315a = i;
    }

    @Override // z3.W
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // z3.i0
    public int b(Object obj) {
        switch (this.f11315a) {
            case 6:
                return ((N) obj).b();
            case 7:
                return ((S) obj).c();
            default:
                return ((f0) obj).c();
        }
    }

    @Override // z3.InterfaceC1085i
    public InputStream c(B1 b12) {
        switch (this.f11315a) {
            case 0:
                return b12;
            default:
                return new GZIPInputStream(b12);
        }
    }

    @Override // z3.InterfaceC1085i
    public String d() {
        switch (this.f11315a) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    @Override // z3.InterfaceC1085i
    public OutputStream e(C0054j1 c0054j1) {
        switch (this.f11315a) {
            case 0:
                return c0054j1;
            default:
                return new GZIPOutputStream(c0054j1);
        }
    }

    @Override // z3.i0
    public boolean f(Object obj) {
        switch (this.f11315a) {
            case 6:
                return ((N) obj).c();
            case 7:
                return ((S) obj).b();
            default:
                return ((f0) obj).b();
        }
    }

    @Override // z3.W
    public Object g(String str) {
        return str;
    }

    @Override // z3.Z
    public Object h(byte[] bArr) {
        int i;
        byte b5;
        switch (this.f11315a) {
            case 1:
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b6 = bArr[i5];
                    if (b6 < 32 || b6 >= 126 || (b6 == 37 && i5 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i6 = 0;
                        while (i6 < bArr.length) {
                            if (bArr[i6] == 37 && i6 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i6 + 1, 2, AbstractC0579b.f7598a), 16));
                                    i6 += 3;
                                } catch (NumberFormatException unused) {
                                }
                            }
                            byteBufferAllocate.put(bArr[i6]);
                            i6++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC0579b.f7599b);
                    }
                }
                return new String(bArr, 0);
            default:
                char c5 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return k0.f11348e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b5 = bArr[0]) >= 48 && b5 <= 57) {
                        i = (b5 - 48) * 10;
                        c5 = 1;
                    }
                    return k0.f11350g.g("Unknown code ".concat(new String(bArr, AbstractC0579b.f7598a)));
                }
                i = 0;
                byte b7 = bArr[c5];
                if (b7 >= 48 && b7 <= 57) {
                    int i7 = (b7 - 48) + i;
                    List list = k0.f11347d;
                    if (i7 < list.size()) {
                        return (k0) list.get(i7);
                    }
                }
                return k0.f11350g.g("Unknown code ".concat(new String(bArr, AbstractC0579b.f7598a)));
        }
    }

    public String toString() {
        switch (this.f11315a) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public C1084h(SSLSession sSLSession) throws SSLPeerUnverifiedException {
        this.f11315a = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e5) {
            C1072A.f11227d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e5);
        }
    }

    @Override // z3.Z
    /* renamed from: a */
    public byte[] mo0a(Object obj) {
        switch (this.f11315a) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(AbstractC0579b.f7599b);
                int i = 0;
                while (i < bytes.length) {
                    byte b5 = bytes[i];
                    if (b5 < 32 || b5 >= 126 || b5 == 37) {
                        byte[] bArr = new byte[((bytes.length - i) * 3) + i];
                        if (i != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i);
                        }
                        int i5 = i;
                        while (i < bytes.length) {
                            byte b6 = bytes[i];
                            if (b6 < 32 || b6 >= 126 || b6 == 37) {
                                bArr[i5] = 37;
                                byte[] bArr2 = f11314c;
                                bArr[i5 + 1] = bArr2[(b6 >> 4) & 15];
                                bArr[i5 + 2] = bArr2[b6 & 15];
                                i5 += 3;
                            } else {
                                bArr[i5] = b6;
                                i5++;
                            }
                            i++;
                        }
                        return Arrays.copyOf(bArr, i5);
                    }
                    i++;
                }
                return bytes;
            default:
                return ((k0) obj).f11358a.f11340b;
        }
    }
}
