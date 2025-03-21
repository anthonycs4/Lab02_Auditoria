package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhx;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private zzbhv zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzbhx zzf;

    public MediaView(Context context) {
        super(context);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzbhx zzbhxVar = this.zzf;
        if (zzbhxVar != null) {
            zzbhxVar.zza(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzb = true;
        this.zza = mediaContent;
        zzbhv zzbhvVar = this.zzc;
        if (zzbhvVar != null) {
            zzbhvVar.zza(mediaContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzbhv zzbhvVar) {
        this.zzc = zzbhvVar;
        if (this.zzb) {
            zzbhvVar.zza(this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzb(zzbhx zzbhxVar) {
        this.zzf = zzbhxVar;
        if (this.zze) {
            zzbhxVar.zza(this.zzd);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
