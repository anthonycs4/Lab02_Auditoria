package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcyx extends zzdbe<zzcyy> implements zzcyy {
    public zzcyx(Set<zzdcx<zzcyy>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(final zzbxf zzbxfVar) {
        zzr(new zzdbd(zzbxfVar) { // from class: com.google.android.gms.internal.ads.zzcyv
            private final zzbxf zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbxfVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcyy) obj).zzj(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(final zzete zzeteVar) {
        zzr(new zzdbd(zzeteVar) { // from class: com.google.android.gms.internal.ads.zzcyw
            private final zzete zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzeteVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcyy) obj).zzq(this.zza);
            }
        });
    }
}
