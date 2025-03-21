package com.onethousandmoons.taptool.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.onethousandmoons.taptool.R;
/* loaded from: classes2.dex */
public final class AboutBinding implements ViewBinding {
    public final TextView copyright;
    public final TextView developer;
    public final TextView iconLicense;
    public final ImageView imageView2;
    private final ConstraintLayout rootView;
    public final TextView title;
    public final TextView website;

    private AboutBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.copyright = textView;
        this.developer = textView2;
        this.iconLicense = textView3;
        this.imageView2 = imageView;
        this.title = textView4;
        this.website = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.about, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AboutBinding bind(View view) {
        int i = R.id.copyright;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.copyright);
        if (textView != null) {
            i = R.id.developer;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.developer);
            if (textView2 != null) {
                i = R.id.icon_license;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.icon_license);
                if (textView3 != null) {
                    i = R.id.imageView2;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
                    if (imageView != null) {
                        i = R.id.title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView4 != null) {
                            i = R.id.website;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.website);
                            if (textView5 != null) {
                                return new AboutBinding((ConstraintLayout) view, textView, textView2, textView3, imageView, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
