package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdar extends zzdbe<zzajc> implements zzbks {
    public zzdar(Set<zzdcx<zzajc>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbks
    public final synchronized void zzbL(final String str, final String str2) {
        zzr(new zzdbd(str, str2) { // from class: com.google.android.gms.internal.ads.zzdaq
            private final String zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzajc) obj).zza(this.zza, this.zzb);
            }
        });
    }
}
