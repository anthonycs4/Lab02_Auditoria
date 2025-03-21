package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzddj extends zzdbe<zzbme> implements zzbme {
    public zzddj(Set<zzdcx<zzbme>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final synchronized void zza() {
        zzr(zzddg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(final zzbyh zzbyhVar) {
        zzr(new zzdbd(zzbyhVar) { // from class: com.google.android.gms.internal.ads.zzddh
            private final zzbyh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbyhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzbme) obj).zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzc() {
        zzr(zzddi.zza);
    }
}
