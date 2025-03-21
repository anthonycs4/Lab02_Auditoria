package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.internal.util.zzac;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzk extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzk(zzl zzlVar, zzf zzfVar) {
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Bitmap zza = com.google.android.gms.ads.internal.zzs.zzv().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (zza != null) {
            zzac zze = com.google.android.gms.ads.internal.zzs.zze();
            zzl zzlVar = this.zza;
            Activity activity = zzlVar.zzb;
            com.google.android.gms.ads.internal.zzj zzjVar = zzlVar.zzc.zzo;
            final Drawable zzd = zze.zzd(activity, zza, zzjVar.zzd, zzjVar.zze);
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, zzd) { // from class: com.google.android.gms.ads.internal.overlay.zzj
                private final zzk zza;
                private final Drawable zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzd;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzk zzkVar = this.zza;
                    zzkVar.zza.zzb.getWindow().setBackgroundDrawable(this.zzb);
                }
            });
        }
    }
}
