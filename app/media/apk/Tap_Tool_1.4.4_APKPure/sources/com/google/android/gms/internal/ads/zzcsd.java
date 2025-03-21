package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcsd implements zzcxt, zzcwz {
    private final Context zza;
    private final zzcib zzb;
    private final zzess zzc;
    private final zzcct zzd;
    private IObjectWrapper zze;
    private boolean zzf;

    public zzcsd(Context context, zzcib zzcibVar, zzess zzessVar, zzcct zzcctVar) {
        this.zza = context;
        this.zzb = zzcibVar;
        this.zzc = zzessVar;
        this.zzd = zzcctVar;
    }

    private final synchronized void zzc() {
        zzbvj zzbvjVar;
        zzbvk zzbvkVar;
        if (this.zzc.zzN) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzs.zzr().zza(this.zza)) {
                zzcct zzcctVar = this.zzd;
                int i = zzcctVar.zzb;
                int i2 = zzcctVar.zzc;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                String zza = this.zzc.zzP.zza();
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdn)).booleanValue()) {
                    if (this.zzc.zzP.zzb() == 1) {
                        zzbvjVar = zzbvj.VIDEO;
                        zzbvkVar = zzbvk.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzbvjVar = zzbvj.HTML_DISPLAY;
                        if (this.zzc.zze == 1) {
                            zzbvkVar = zzbvk.ONE_PIXEL;
                        } else {
                            zzbvkVar = zzbvk.BEGIN_TO_RENDER;
                        }
                    }
                    this.zze = com.google.android.gms.ads.internal.zzs.zzr().zzf(sb2, this.zzb.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", zza, zzbvkVar, zzbvjVar, this.zzc.zzag);
                } else {
                    this.zze = com.google.android.gms.ads.internal.zzs.zzr().zzd(sb2, this.zzb.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", zza);
                }
                zzcib zzcibVar = this.zzb;
                if (this.zze != null) {
                    com.google.android.gms.ads.internal.zzs.zzr().zzj(this.zze, (View) zzcibVar);
                    this.zzb.zzak(this.zze);
                    com.google.android.gms.ads.internal.zzs.zzr().zzh(this.zze);
                    this.zzf = true;
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdq)).booleanValue()) {
                        this.zzb.zze("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final synchronized void zzbN() {
        if (this.zzf) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final synchronized void zzbz() {
        zzcib zzcibVar;
        if (!this.zzf) {
            zzc();
        }
        if (!this.zzc.zzN || this.zze == null || (zzcibVar = this.zzb) == null) {
            return;
        }
        zzcibVar.zze("onSdkImpression", new ArrayMap());
    }
}
