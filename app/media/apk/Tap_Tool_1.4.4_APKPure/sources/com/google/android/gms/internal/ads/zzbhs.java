package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbhs extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzb;

    public zzbhs(Context context, zzbhr zzbhrVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzbhrVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbhrVar.zze());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.zzs.zze();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbhrVar.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbhrVar.zzb());
            textView.setTextColor(zzbhrVar.zzf());
            textView.setTextSize(zzbhrVar.zzg());
            zzbay.zza();
            int zzs = zzccg.zzs(context, 4);
            zzbay.zza();
            textView.setPadding(zzs, 0, zzccg.zzs(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzbhu> zzd = zzbhrVar.zzd();
        if (zzd == null || zzd.size() <= 1) {
            if (zzd.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zzd.get(0).zzb()));
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Error while getting drawable.", e);
                }
            }
        } else {
            this.zzb = new AnimationDrawable();
            for (zzbhu zzbhuVar : zzd) {
                try {
                    this.zzb.addFrame((Drawable) ObjectWrapper.unwrap(zzbhuVar.zzb()), zzbhrVar.zzh());
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Error while getting drawable.", e2);
                }
            }
            com.google.android.gms.ads.internal.zzs.zze();
            imageView.setBackground(this.zzb);
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
