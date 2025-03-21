package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcxm extends zzdbe<zzcwh> {
    public zzcxm(Set<zzdcx<zzcwh>> set) {
        super(set);
    }

    public final void zza() {
        zzr(zzcxg.zza);
    }

    public final void zzb() {
        zzr(zzcxh.zza);
    }

    public final void zzc() {
        zzr(zzcxi.zza);
    }

    public final void zzd() {
        zzr(zzcxj.zza);
    }

    public final void zze(final zzbxv zzbxvVar, final String str, final String str2) {
        zzr(new zzdbd(zzbxvVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzcxk
            private final zzbxv zza;
            private final String zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbxvVar;
                this.zzb = str;
                this.zzc = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcwh) obj).zzf(this.zza, this.zzb, this.zzc);
            }
        });
    }

    public final void zzf() {
        zzr(zzcxl.zza);
    }
}
