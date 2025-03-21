package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcwj extends zzdbe<zzcwk> implements zzcwk {
    public zzcwj(Set<zzdcx<zzcwk>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(final zzazm zzazmVar) {
        zzr(new zzdbd(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzcwi
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcwk) obj).zzbM(this.zza);
            }
        });
    }
}
