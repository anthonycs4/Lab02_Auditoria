package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwa implements zzdcl {
    private final String zzc;
    private final zzexv zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzs.zzg().zzl();

    public zzdwa(String str, zzexv zzexvVar) {
        this.zzc = str;
        this.zzd = zzexvVar;
    }

    private final zzexu zzf(String str) {
        String str2 = this.zze.zzB() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zzc;
        zzexu zza = zzexu.zza(str);
        zza.zzc("tms", Long.toString(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime(), 10));
        zza.zzc("tid", str2);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zza(String str) {
        zzexv zzexvVar = this.zzd;
        zzexu zzf = zzf("adapter_init_started");
        zzf.zzc("ancn", str);
        zzexvVar.zza(zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzb(String str) {
        zzexv zzexvVar = this.zzd;
        zzexu zzf = zzf("adapter_init_finished");
        zzf.zzc("ancn", str);
        zzexvVar.zza(zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzc(String str, String str2) {
        zzexv zzexvVar = this.zzd;
        zzexu zzf = zzf("adapter_init_finished");
        zzf.zzc("ancn", str);
        zzf.zzc("rqe", str2);
        zzexvVar.zza(zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zzd() {
        if (this.zza) {
            return;
        }
        this.zzd.zza(zzf("init_started"));
        this.zza = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zza(zzf("init_finished"));
        this.zzb = true;
    }
}
