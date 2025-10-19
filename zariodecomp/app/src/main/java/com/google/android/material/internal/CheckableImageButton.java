package com.google.android.material.internal;

import G1.e;
import M.S;
import Q1.a;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0716v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\internal\CheckableImageButton.smali */
public class CheckableImageButton extends C0716v implements Checkable {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f6074k = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f6075d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6076e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6077f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903591);
        this.f6076e = true;
        this.f6077f = true;
        S.h(this, new e(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6075d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f6075d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f6074k) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f3264a);
        setChecked(aVar.f2724c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2724c = this.f6075d;
        return aVar;
    }

    public void setCheckable(boolean z4) {
        if (this.f6076e != z4) {
            this.f6076e = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f6076e || this.f6075d == z4) {
            return;
        }
        this.f6075d = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z4) {
        this.f6077f = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f6077f) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6075d);
    }
}
