package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeai implements zzdyi<zzddu, zzeub, zzdzw> {
    private final Context zza;
    private final zzder zzb;
    private final zzcct zzc;
    private final Executor zzd;

    public zzeai(Context context, zzcct zzcctVar, zzder zzderVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcctVar;
        this.zzb = zzderVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp {
        zzdydVar.zzb.zzh(this.zza, zzeteVar.zza.zza.zzd, zzessVar.zzu.toString(), com.google.android.gms.ads.internal.util.zzbv.zzk(zzessVar.zzr), zzdydVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzddu zzb(zzete zzeteVar, zzess zzessVar, final zzdyd<zzeub, zzdzw> zzdydVar) throws zzetp, zzebr {
        zzddv zzc = this.zzb.zzc(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzddy(new zzdez(this, zzdydVar) { // from class: com.google.android.gms.internal.ads.zzeah
            private final zzeai zza;
            private final zzdyd zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzdydVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z, Context context) {
                this.zza.zzc(this.zzb, z, context);
            }
        }, null));
        zzc.zza().zzh(new zzcof(zzdydVar.zzb), this.zzd);
        zzdydVar.zzc.zzc(zzc.zzf());
        return zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzdyd zzdydVar, boolean z, Context context) throws zzdey {
        try {
            ((zzeub) zzdydVar.zzb).zzs(z);
            if (this.zzc.zzc < ((Integer) zzbba.zzc().zzb(zzbfq.zzau)).intValue()) {
                ((zzeub) zzdydVar.zzb).zzd();
            } else {
                ((zzeub) zzdydVar.zzb).zze(context);
            }
        } catch (zzetp e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Cannot show interstitial.");
            throw new zzdey(e.getCause());
        }
    }
}
