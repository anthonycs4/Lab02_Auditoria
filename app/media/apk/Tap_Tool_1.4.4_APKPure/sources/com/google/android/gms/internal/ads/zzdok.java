package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdok implements zzcyy, zzcxt, zzcwk, zzcwz, zzazi, zzdbb {
    private final zzavg zza;
    private boolean zzb = false;

    public zzdok(zzavg zzavgVar, @Nullable zzeqp zzeqpVar) {
        this.zza = zzavgVar;
        zzavgVar.zzb(zzavi.AD_REQUEST);
        if (zzeqpVar != null) {
            zzavgVar.zzb(zzavi.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzb(zzavi.AD_FIRST_CLICK);
            this.zzb = true;
            return;
        }
        this.zza.zzb(zzavi.AD_SUBSEQUENT_CLICK);
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        switch (zzazmVar.zza) {
            case 1:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zza.zzb(zzavi.AD_FAILED_TO_LOAD);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        this.zza.zzb(zzavi.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final synchronized void zzbz() {
        this.zza.zzb(zzavi.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzk(final zzawd zzawdVar) {
        this.zza.zzc(new zzavf(zzawdVar) { // from class: com.google.android.gms.internal.ads.zzdoh
            private final zzawd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzawdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzavf
            public final void zza(zzawz zzawzVar) {
                zzawzVar.zzk(this.zza);
            }
        });
        this.zza.zzb(zzavi.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzl(final zzawd zzawdVar) {
        this.zza.zzc(new zzavf(zzawdVar) { // from class: com.google.android.gms.internal.ads.zzdoi
            private final zzawd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzawdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzavf
            public final void zza(zzawz zzawzVar) {
                zzawzVar.zzk(this.zza);
            }
        });
        this.zza.zzb(zzavi.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzm(final zzawd zzawdVar) {
        this.zza.zzc(new zzavf(zzawdVar) { // from class: com.google.android.gms.internal.ads.zzdoj
            private final zzawd zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzawdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzavf
            public final void zza(zzawz zzawzVar) {
                zzawzVar.zzk(this.zza);
            }
        });
        this.zza.zzb(zzavi.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzn(boolean z) {
        zzavi zzaviVar;
        zzavg zzavgVar = this.zza;
        if (z) {
            zzaviVar = zzavi.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
        } else {
            zzaviVar = zzavi.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
        }
        zzavgVar.zzb(zzaviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzo(boolean z) {
        zzavi zzaviVar;
        zzavg zzavgVar = this.zza;
        if (z) {
            zzaviVar = zzavi.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
        } else {
            zzaviVar = zzavi.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
        }
        zzavgVar.zzb(zzaviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzp() {
        this.zza.zzb(zzavi.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(final zzete zzeteVar) {
        this.zza.zzc(new zzavf(zzeteVar) { // from class: com.google.android.gms.internal.ads.zzdog
            private final zzete zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzeteVar;
            }

            @Override // com.google.android.gms.internal.ads.zzavf
            public final void zza(zzawz zzawzVar) {
                zzete zzeteVar2 = this.zza;
                zzavr zzau = zzawzVar.zzg().zzau();
                zzawl zzau2 = zzawzVar.zzg().zza().zzau();
                zzau2.zza(zzeteVar2.zzb.zzb.zzb);
                zzau.zzb(zzau2);
                zzawzVar.zzh(zzau);
            }
        });
    }
}
