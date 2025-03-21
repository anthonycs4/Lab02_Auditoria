package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcyn extends zzdbe<zzcyp> implements zzcwz, zzcye {
    private final zzess zzb;
    private final AtomicBoolean zzc;

    public zzcyn(Set<zzdcx<zzcyp>> set, zzess zzessVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzessVar;
    }

    private final void zzc() {
        zzazz zzazzVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzff)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzazzVar = this.zzb.zzZ) != null && zzazzVar.zza == 3) {
            zzr(new zzdbd(this) { // from class: com.google.android.gms.internal.ads.zzcym
                private final zzcyn zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdbd
                public final void zza(Object obj) {
                    this.zza.zza((zzcyp) obj);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzK() {
        if (this.zzb.zzb == 1) {
            zzc();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcyp zzcypVar) throws Exception {
        zzcypVar.zzk(this.zzb.zzZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6) {
            zzc();
        }
    }
}
