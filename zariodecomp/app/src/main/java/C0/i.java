package c0;

import B3.RunnableC0040f;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q.C0826c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\c0.1\i.smali */
public final class i {
    public static final Object i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile i f5356j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f5357a;

    /* renamed from: b, reason: collision with root package name */
    public final C0826c f5358b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5359c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f5360d;

    /* renamed from: e, reason: collision with root package name */
    public final e f5361e;

    /* renamed from: f, reason: collision with root package name */
    public final h f5362f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5363g;
    public final c h;

    public i(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5357a = reentrantReadWriteLock;
        this.f5359c = 3;
        h hVar = (h) qVar.f5354b;
        this.f5362f = hVar;
        int i5 = qVar.f5353a;
        this.f5363g = i5;
        this.h = (c) qVar.f5355c;
        this.f5360d = new Handler(Looper.getMainLooper());
        this.f5358b = new C0826c(0);
        e eVar = new e(this);
        this.f5361e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i5 == 0) {
            try {
                this.f5359c = 0;
            } catch (Throwable th) {
                this.f5357a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (i) {
            try {
                iVar = f5356j;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public final int b() {
        this.f5357a.readLock().lock();
        try {
            return this.f5359c;
        } finally {
            this.f5357a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f5363g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f5357a.writeLock().lock();
        try {
            if (this.f5359c == 0) {
                return;
            }
            this.f5359c = 0;
            this.f5357a.writeLock().unlock();
            e eVar = this.f5361e;
            i iVar = eVar.f5350a;
            try {
                iVar.f5362f.a(new d(eVar));
            } catch (Throwable th) {
                iVar.d(th);
            }
        } finally {
            this.f5357a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5357a.writeLock().lock();
        try {
            this.f5359c = 2;
            arrayList.addAll(this.f5358b);
            this.f5358b.clear();
            this.f5357a.writeLock().unlock();
            this.f5360d.post(new RunnableC0040f(arrayList, this.f5359c, th));
        } catch (Throwable th2) {
            this.f5357a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(CharSequence charSequence, int i5, int i6) {
        int iCharCount;
        u[] uVarArr;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        r1.d.k("start should be <= than end", i5 <= i6);
        v vVar = null;
        if (charSequence == null) {
            return null;
        }
        r1.d.k("start should be < than charSequence length", i5 <= charSequence.length());
        r1.d.k("end should be < than charSequence length", i6 <= charSequence.length());
        if (charSequence.length() == 0 || i5 == i6) {
            return charSequence;
        }
        S0.c cVar = this.f5361e.f5351b;
        cVar.getClass();
        boolean z4 = charSequence instanceof t;
        if (z4) {
            ((t) charSequence).a();
        }
        if (z4) {
            vVar = new v((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    vVar = new v((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i5 - 1, i6 + 1, u.class) <= i6) {
                    vVar = new v(charSequence);
                }
            } finally {
                if (z4) {
                    ((t) charSequence).b();
                }
            }
        }
        if (vVar != null && (uVarArr = (u[]) vVar.f5397b.getSpans(i5, i6, u.class)) != null && uVarArr.length > 0) {
            for (u uVar : uVarArr) {
                int spanStart = vVar.f5397b.getSpanStart(uVar);
                int spanEnd = vVar.f5397b.getSpanEnd(uVar);
                if (spanStart != i6) {
                    vVar.removeSpan(uVar);
                }
                i5 = Math.min(spanStart, i5);
                i6 = Math.max(spanEnd, i6);
            }
        }
        if (i5 != i6 && i5 < charSequence.length()) {
            o oVar = new o((r) ((S0.i) cVar.f2847b).f2860c);
            int iCodePointAt = Character.codePointAt(charSequence, i5);
            int i7 = 0;
            v vVar2 = vVar;
            loop1: while (true) {
                iCharCount = i5;
                while (i5 < i6 && i7 < Integer.MAX_VALUE) {
                    int iA = oVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                        if (iCharCount < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        }
                        i5 = iCharCount;
                    } else if (iA == 2) {
                        i5 += Character.charCount(iCodePointAt);
                        if (i5 < i6) {
                            iCodePointAt = Character.codePointAt(charSequence, i5);
                        }
                    } else if (iA == 3) {
                        if (!cVar.e(charSequence, iCharCount, i5, oVar.f5376d.f5388b)) {
                            if (vVar2 == null) {
                                vVar2 = new v((Spannable) new SpannableString(charSequence));
                            }
                            vVar2.setSpan(new u(oVar.f5376d.f5388b), iCharCount, i5, 33);
                            i7++;
                        }
                    }
                }
                break loop1;
            }
            if (oVar.f5373a == 2 && oVar.f5375c.f5388b != null && ((oVar.f5378f > 1 || oVar.c()) && i7 < Integer.MAX_VALUE && !cVar.e(charSequence, iCharCount, i5, oVar.f5375c.f5388b))) {
                if (vVar2 == null) {
                    vVar2 = new v(charSequence);
                }
                vVar2.setSpan(new u(oVar.f5375c.f5388b), iCharCount, i5, 33);
            }
            if (vVar2 != null) {
                Spannable spannable = vVar2.f5397b;
                if (z4) {
                    ((t) charSequence).b();
                }
                return spannable;
            }
            if (!z4) {
                return charSequence;
            }
        } else if (!z4) {
            return charSequence;
        }
        return charSequence;
    }

    public final void f(g gVar) {
        r1.d.m(gVar, "initCallback cannot be null");
        this.f5357a.writeLock().lock();
        try {
            if (this.f5359c == 1 || this.f5359c == 2) {
                this.f5360d.post(new RunnableC0040f(Arrays.asList(gVar), this.f5359c, (Throwable) null));
            } else {
                this.f5358b.add(gVar);
            }
            this.f5357a.writeLock().unlock();
        } catch (Throwable th) {
            this.f5357a.writeLock().unlock();
            throw th;
        }
    }
}
