package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcws extends zzdbe<zzcwl> implements zzcwl {
    public zzcws(zzcwr zzcwrVar, Set<zzdcx<zzcwl>> set, Executor executor) {
        super(set);
        zzh(zzcwrVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zza(final zzazm zzazmVar) {
        zzr(new zzdbd(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzcwm
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcwl) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzc(final zzdey zzdeyVar) {
        zzr(new zzdbd(zzdeyVar) { // from class: com.google.android.gms.internal.ads.zzcwn
            private final zzdey zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzdeyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcwl) obj).zzc(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzd() {
        zzr(zzcwo.zza);
    }
}
