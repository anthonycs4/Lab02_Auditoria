package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzccg;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzq extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzz zzb;

    public zzq(Context context, zzp zzpVar, zzz zzzVar) {
        super(context);
        this.zzb = zzzVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        imageButton.setImageResource(17301527);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbay.zza();
        int zzs = zzccg.zzs(context, zzpVar.zza);
        zzbay.zza();
        int zzs2 = zzccg.zzs(context, 0);
        zzbay.zza();
        int zzs3 = zzccg.zzs(context, zzpVar.zzb);
        zzbay.zza();
        imageButton.setPadding(zzs, zzs2, zzs3, zzccg.zzs(context, zzpVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbay.zza();
        int zzs4 = zzccg.zzs(context, zzpVar.zzd + zzpVar.zza + zzpVar.zzb);
        zzbay.zza();
        addView(imageButton, new FrameLayout.LayoutParams(zzs4, zzccg.zzs(context, zzpVar.zzd + zzpVar.zzc), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzz zzzVar = this.zzb;
        if (zzzVar != null) {
            zzzVar.zzd();
        }
    }

    public final void zza(boolean z) {
        if (z) {
            this.zza.setVisibility(8);
        } else {
            this.zza.setVisibility(0);
        }
    }
}
