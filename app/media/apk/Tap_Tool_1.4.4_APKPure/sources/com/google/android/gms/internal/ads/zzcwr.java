package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcwr extends zzdbe<zzcwv> implements zzcwl {
    public zzcwr(Set<zzdcx<zzcwv>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zza(final zzazm zzazmVar) {
        zzr(new zzdbd(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzcwp
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcwv) obj).zzi(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzc(zzdey zzdeyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzd() {
        zzr(zzcwq.zza);
    }
}
