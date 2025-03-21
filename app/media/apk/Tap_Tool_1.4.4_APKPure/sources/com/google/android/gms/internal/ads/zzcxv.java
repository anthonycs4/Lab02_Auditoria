package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcxv extends zzdbe<zzcxx> implements zzcxx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxv(Set<zzdcx<zzcxx>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final void zza(final zzcsn zzcsnVar) {
        zzr(new zzdbd(zzcsnVar) { // from class: com.google.android.gms.internal.ads.zzcxu
            private final zzcsn zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcsnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzcxx) obj).zza(this.zza);
            }
        });
    }
}
