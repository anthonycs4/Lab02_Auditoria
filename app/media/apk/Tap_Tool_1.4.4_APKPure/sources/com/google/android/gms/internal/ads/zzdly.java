package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdly implements zzbme {
    private final zzcxm zza;
    private final zzbyh zzb;
    private final String zzc;
    private final String zzd;

    public zzdly(zzcxm zzcxmVar, zzess zzessVar) {
        this.zza = zzcxmVar;
        this.zzb = zzessVar.zzl;
        this.zzc = zzessVar.zzj;
        this.zzd = zzessVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    @ParametersAreNonnullByDefault
    public final void zzb(zzbyh zzbyhVar) {
        int i;
        String str;
        zzbyh zzbyhVar2 = this.zzb;
        if (zzbyhVar2 != null) {
            zzbyhVar = zzbyhVar2;
        }
        if (zzbyhVar != null) {
            str = zzbyhVar.zza;
            i = zzbyhVar.zzb;
        } else {
            i = 1;
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.zza.zze(new zzbxs(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzc() {
        this.zza.zzf();
    }
}
