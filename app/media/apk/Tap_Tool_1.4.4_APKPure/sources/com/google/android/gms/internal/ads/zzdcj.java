package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdcj extends zzdbe<zzdcl> implements zzdcl {
    public zzdcj(Set<zzdcx<zzdcl>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zza(final String str) {
        zzr(new zzdbd(str) { // from class: com.google.android.gms.internal.ads.zzdce
            private final String zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzdcl) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzb(final String str) {
        zzr(new zzdbd(str) { // from class: com.google.android.gms.internal.ads.zzdcf
            private final String zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzdcl) obj).zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzc(final String str, final String str2) {
        zzr(new zzdbd(str, str2) { // from class: com.google.android.gms.internal.ads.zzdcg
            private final String zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                ((zzdcl) obj).zzc(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzd() {
        zzr(zzdch.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zze() {
        zzr(zzdci.zza);
    }
}
