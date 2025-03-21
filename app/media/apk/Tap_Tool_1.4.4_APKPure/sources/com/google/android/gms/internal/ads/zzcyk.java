package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcyk extends zzdbe<com.google.android.gms.ads.internal.overlay.zzo> implements com.google.android.gms.ads.internal.overlay.zzo {
    public zzcyk(Set<zzdcx<com.google.android.gms.ads.internal.overlay.zzo>> set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbB() {
        zzr(zzcyg.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        zzr(zzcyh.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbD(final int i) {
        zzr(new zzdbd(i) { // from class: com.google.android.gms.internal.ads.zzcyf
            private final int zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = i;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbD(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbT() {
        zzr(zzcyi.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby() {
        zzr(zzcyj.zza);
    }
}
