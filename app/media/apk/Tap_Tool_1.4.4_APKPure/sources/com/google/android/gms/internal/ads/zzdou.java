package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdou implements zzgdq<Set<zzdcx<zzexm>>> {
    private final zzgeb<String> zza;
    private final zzgeb<Context> zzb;
    private final zzgeb<Executor> zzc;
    private final zzgeb<Map<zzexf, zzdow>> zzd;

    public zzdou(zzgeb<String> zzgebVar, zzgeb<Context> zzgebVar2, zzgeb<Executor> zzgebVar3, zzgeb<Map<zzexf, zzdow>> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzenf) this.zza).zza();
        Context zza2 = ((zzcke) this.zzb).zza();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        Map zzb = ((zzgdu) this.zzd).zzb();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzde)).booleanValue()) {
            zzavg zzavgVar = new zzavg(new zzavm(zza2));
            zzavgVar.zzc(new zzavf(zza) { // from class: com.google.android.gms.internal.ads.zzdov
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zza;
                }

                @Override // com.google.android.gms.internal.ads.zzavf
                public final void zza(zzawz zzawzVar) {
                    zzawzVar.zzb(this.zza);
                }
            });
            emptySet = Collections.singleton(new zzdcx(new zzdox(zzavgVar, zzb), zzflbVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgdw.zzb(emptySet);
        return emptySet;
    }
}
