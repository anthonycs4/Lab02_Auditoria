package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzexk extends zzdbe<zzexm> implements zzexe<zzexf> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzexk(Set<zzdcx<zzexm>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final void zza(final zzewr<zzexf, ?> zzewrVar) {
        zzr(new zzdbd(zzewrVar) { // from class: com.google.android.gms.internal.ads.zzexg
            private final zzewr zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                zzewr zzewrVar2 = this.zza;
                ((zzexm) obj).zzbO((zzexf) zzewrVar2.zza(), zzewrVar2.zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final void zzb(final zzewr<zzexf, ?> zzewrVar) {
        zzr(new zzdbd(zzewrVar) { // from class: com.google.android.gms.internal.ads.zzexh
            private final zzewr zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                zzewr zzewrVar2 = this.zza;
                ((zzexm) obj).zzbP((zzexf) zzewrVar2.zza(), zzewrVar2.zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final void zzc(final zzewr<zzexf, ?> zzewrVar, final Throwable th) {
        zzr(new zzdbd(zzewrVar, th) { // from class: com.google.android.gms.internal.ads.zzexi
            private final zzewr zza;
            private final Throwable zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewrVar;
                this.zzb = th;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                zzewr zzewrVar2 = this.zza;
                Throwable th2 = this.zzb;
                ((zzexm) obj).zzbQ((zzexf) zzewrVar2.zza(), zzewrVar2.zzb(), th2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final void zzd(final zzewr<zzexf, ?> zzewrVar) {
        zzr(new zzdbd(zzewrVar) { // from class: com.google.android.gms.internal.ads.zzexj
            private final zzewr zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzewrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdbd
            public final void zza(Object obj) {
                zzewr zzewrVar2 = this.zza;
                ((zzexm) obj).zzbR((zzexf) zzewrVar2.zza(), zzewrVar2.zzb());
            }
        });
    }
}
