package r0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r0.1\a.smali */
public final class C0856a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f9564a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0858c f9565b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9566c;

    /* renamed from: d, reason: collision with root package name */
    public final File f9567d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9568e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9569f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0857b[] f9570g;
    public byte[] h;

    public C0856a(AssetManager assetManager, Executor executor, InterfaceC0858c interfaceC0858c, String str, File file) {
        this.f9564a = executor;
        this.f9565b = interfaceC0858c;
        this.f9568e = str;
        this.f9567d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 33) {
            switch (i) {
                case 29:
                case 30:
                    bArr = AbstractC0859d.f9582e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = AbstractC0859d.f9581d;
                    break;
            }
        }
        this.f9566c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9565b.h();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f9564a.execute(new E2.b(this, i, serializable, 1));
    }
}
