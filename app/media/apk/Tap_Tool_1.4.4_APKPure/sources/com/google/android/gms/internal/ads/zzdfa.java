package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdfa implements zzcxt, com.google.android.gms.ads.internal.overlay.zzo {
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcib zzc;
    private final zzess zzd;
    private final zzcct zze;
    private final zzavq zzf;

    public zzdfa(Context context, zzcib zzcibVar, zzess zzessVar, zzcct zzcctVar, zzavq zzavqVar) {
        this.zzb = context;
        this.zzc = zzcibVar;
        this.zzd = zzessVar;
        this.zze = zzcctVar;
        this.zzf = zzavqVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        zzbvk zzbvkVar;
        zzbvk zzbvkVar2;
        zzbvj zzbvjVar;
        if ((this.zzf == zzavq.REWARD_BASED_VIDEO_AD || this.zzf == zzavq.INTERSTITIAL || this.zzf == zzavq.APP_OPEN) && this.zzd.zzN && this.zzc != null && com.google.android.gms.ads.internal.zzs.zzr().zza(this.zzb)) {
            zzcct zzcctVar = this.zze;
            int i = zzcctVar.zzb;
            int i2 = zzcctVar.zzc;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String zza = this.zzd.zzP.zza();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdn)).booleanValue()) {
                if (this.zzd.zzP.zzb() == 1) {
                    zzbvjVar = zzbvj.VIDEO;
                    zzbvkVar2 = zzbvk.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzd.zzS == 2) {
                        zzbvkVar = zzbvk.UNSPECIFIED;
                    } else {
                        zzbvkVar = zzbvk.BEGIN_TO_RENDER;
                    }
                    zzbvkVar2 = zzbvkVar;
                    zzbvjVar = zzbvj.HTML_DISPLAY;
                }
                this.zza = com.google.android.gms.ads.internal.zzs.zzr().zzf(sb2, this.zzc.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", zza, zzbvkVar2, zzbvjVar, this.zzd.zzag);
            } else {
                this.zza = com.google.android.gms.ads.internal.zzs.zzr().zzd(sb2, this.zzc.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", zza);
            }
            if (this.zza != null) {
                com.google.android.gms.ads.internal.zzs.zzr().zzj(this.zza, (View) this.zzc);
                this.zzc.zzak(this.zza);
                com.google.android.gms.ads.internal.zzs.zzr().zzh(this.zza);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdq)).booleanValue()) {
                    this.zzc.zze("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzcib zzcibVar;
        if (this.zza == null || (zzcibVar = this.zzc) == null) {
            return;
        }
        zzcibVar.zze("onSdkImpression", new ArrayMap());
    }
}
