package com.onethousandmoons.taptool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.AdView;
import com.onethousandmoons.taptool.R;
/* loaded from: classes2.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final AdView adView;
    public final Button btnAbout;
    public final Button btnPause;
    public final Button btnReset;
    public final ImageView imageView;
    private final ConstraintLayout rootView;
    public final TextView txtInfoPanel;

    private ActivityMainBinding(ConstraintLayout constraintLayout, AdView adView, Button button, Button button2, Button button3, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.adView = adView;
        this.btnAbout = button;
        this.btnPause = button2;
        this.btnReset = button3;
        this.imageView = imageView;
        this.txtInfoPanel = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.ad_view;
        AdView adView = (AdView) ViewBindings.findChildViewById(view, R.id.ad_view);
        if (adView != null) {
            i = R.id.btnAbout;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnAbout);
            if (button != null) {
                i = R.id.btnPause;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnPause);
                if (button2 != null) {
                    i = R.id.btnReset;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btnReset);
                    if (button3 != null) {
                        i = R.id.imageView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                        if (imageView != null) {
                            i = R.id.txtInfoPanel;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txtInfoPanel);
                            if (textView != null) {
                                return new ActivityMainBinding((ConstraintLayout) view, adView, button, button2, button3, imageView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
