package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzetu {
    private final zzess zza;
    private final zzesv zzb;
    private final zzdxo zzc;
    private final zzeyn zzd;

    public zzetu(zzdxo zzdxoVar, zzeyn zzeynVar, zzess zzessVar, zzesv zzesvVar) {
        this.zza = zzessVar;
        this.zzb = zzesvVar;
        this.zzc = zzdxoVar;
        this.zzd = zzeynVar;
    }

    public final void zza(List<String> list) {
        for (String str : list) {
            zzc(str, 2);
        }
    }

    public final void zzb(List<String> list, int i) {
        for (String str : list) {
            zzc(str, i);
        }
    }

    public final void zzc(String str, int i) {
        if (!this.zza.zzad) {
            this.zzd.zzb(str);
            return;
        }
        this.zzc.zze(new zzdxq(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis(), this.zzb.zzb, str, i));
    }
}
