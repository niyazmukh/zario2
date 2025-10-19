package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\material\timepicker\TimePickerView.smali */
class TimePickerView extends ConstraintLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f6220u = 0;

    /* renamed from: t, reason: collision with root package name */
    public final Chip f6221t;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g gVar = new g(this);
        LayoutInflater.from(context).inflate(2131427409, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131231016);
        materialButtonToggleGroup.f5885c.add(new f(this));
        Chip chip = (Chip) findViewById(2131231021);
        Chip chip2 = (Chip) findViewById(2131231018);
        this.f6221t = chip2;
        i iVar = new i(new GestureDetector(getContext(), new h(this)));
        chip.setOnTouchListener(iVar);
        chip2.setOnTouchListener(iVar);
        chip.setTag(2131231165, 12);
        chip2.setTag(2131231165, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f6221t.sendAccessibilityEvent(8);
        }
    }
}
