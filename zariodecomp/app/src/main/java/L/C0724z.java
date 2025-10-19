package l;

import A2.C0009i;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import f.AbstractC0489a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: l.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\z.1.smali */
public class C0724z implements X {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8716d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8717a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8718b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8719c;

    public C0724z(AbsSeekBar absSeekBar) {
        this.f8717a = 0;
        this.f8718b = absSeekBar;
    }

    @Override // l.X
    public void a(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // l.X
    public void b(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    public KeyListener c(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((S0.e) ((h1.i) this.f8719c).f7641b).getClass();
        if (keyListener instanceof e0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e0.e(keyListener);
    }

    public void d(AttributeSet attributeSet, int i) {
        switch (this.f8717a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f8718b;
                C0009i c0009iY = C0009i.Y(absSeekBar.getContext(), attributeSet, f8716d, i);
                Drawable drawableJ = c0009iY.J(0);
                if (drawableJ != null) {
                    if (drawableJ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableJ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable drawableG = g(animationDrawable.getFrame(i5), true);
                            drawableG.setLevel(10000);
                            animationDrawable2.addFrame(drawableG, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableJ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableJ);
                }
                Drawable drawableJ2 = c0009iY.J(1);
                if (drawableJ2 != null) {
                    absSeekBar.setProgressDrawable(g(drawableJ2, false));
                }
                c0009iY.e0();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f8718b).getContext().obtainStyledAttributes(attributeSet, AbstractC0489a.i, i, 0);
                try {
                    boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    f(z4);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public e0.b e(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        h1.i iVar = (h1.i) this.f8719c;
        if (inputConnection == null) {
            iVar.getClass();
            inputConnection2 = null;
        } else {
            S0.e eVar = (S0.e) iVar.f7641b;
            eVar.getClass();
            if (!(inputConnection instanceof e0.b)) {
                inputConnection = new e0.b((EditText) eVar.f2851a, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (e0.b) inputConnection2;
    }

    public void f(boolean z4) {
        e0.i iVar = (e0.i) ((S0.e) ((h1.i) this.f8719c).f7641b).f2852b;
        if (iVar.f6839c != z4) {
            if (iVar.f6838b != null) {
                c0.i iVarA = c0.i.a();
                e0.h hVar = iVar.f6838b;
                iVarA.getClass();
                r1.d.m(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = iVarA.f5357a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    iVarA.f5358b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f6839c = z4;
            if (z4) {
                e0.i.a(iVar.f6837a, c0.i.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable g(Drawable drawable, boolean z4) {
        if (drawable instanceof E.h) {
            ((E.i) ((E.h) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = g(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                    layerDrawable2.setLayerGravity(i5, layerDrawable.getLayerGravity(i5));
                    layerDrawable2.setLayerWidth(i5, layerDrawable.getLayerWidth(i5));
                    layerDrawable2.setLayerHeight(i5, layerDrawable.getLayerHeight(i5));
                    layerDrawable2.setLayerInsetLeft(i5, layerDrawable.getLayerInsetLeft(i5));
                    layerDrawable2.setLayerInsetRight(i5, layerDrawable.getLayerInsetRight(i5));
                    layerDrawable2.setLayerInsetTop(i5, layerDrawable.getLayerInsetTop(i5));
                    layerDrawable2.setLayerInsetBottom(i5, layerDrawable.getLayerInsetBottom(i5));
                    layerDrawable2.setLayerInsetStart(i5, layerDrawable.getLayerInsetStart(i5));
                    layerDrawable2.setLayerInsetEnd(i5, layerDrawable.getLayerInsetEnd(i5));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f8719c) == null) {
                    this.f8719c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0724z(EditText editText) {
        this.f8717a = 1;
        this.f8718b = editText;
        this.f8719c = new h1.i(editText);
    }

    public C0724z(Y y4) {
        this.f8717a = 2;
        this.f8719c = y4;
        this.f8717a = 2;
        this.f8718b = y4;
    }
}
