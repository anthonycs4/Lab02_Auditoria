package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdrn extends zzbnm {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcde zzd;
    final /* synthetic */ zzdro zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrn(zzdro zzdroVar, Object obj, String str, long j, zzcde zzcdeVar) {
        this.zze = zzdroVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzcdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zze() {
        zzdpw zzdpwVar;
        zzdcj zzdcjVar;
        synchronized (this.zza) {
            this.zze.zzu(this.zzb, true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (int) (com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zzc));
            zzdpwVar = this.zze.zzl;
            zzdpwVar.zzb(this.zzb);
            zzdcjVar = this.zze.zzo;
            zzdcjVar.zzb(this.zzb);
            this.zzd.zzc(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zzf(String str) {
        zzdpw zzdpwVar;
        zzdcj zzdcjVar;
        synchronized (this.zza) {
            this.zze.zzu(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zzc));
            zzdpwVar = this.zze.zzl;
            zzdpwVar.zzc(this.zzb, "error");
            zzdcjVar = this.zze.zzo;
            zzdcjVar.zzc(this.zzb, "error");
            this.zzd.zzc(false);
        }
    }
}
