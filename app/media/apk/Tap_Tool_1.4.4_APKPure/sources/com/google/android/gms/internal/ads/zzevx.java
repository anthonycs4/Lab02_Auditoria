package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcsn;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzevx<AdT extends zzcsn> {
    private final zzevq zza;
    private final zzfla<zzevo<AdT>> zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzevx(final zzeuv zzeuvVar, final zzevp<AdT> zzevpVar, final zzevq zzevqVar) {
        this.zza = zzevqVar;
        this.zzb = zzfks.zzg(zzfks.zzi(zzevpVar.zza(zzevqVar), new zzfjz(this, zzevpVar, zzeuvVar, zzevqVar) { // from class: com.google.android.gms.internal.ads.zzevu
            private final zzevx zza;
            private final zzevp zzb;
            private final zzeuv zzc;
            private final zzevq zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzevpVar;
                this.zzc = zzeuvVar;
                this.zzd = zzevqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzd(this.zzb, this.zzc, this.zzd, (zzeve) obj);
            }
        }, zzevqVar.zza()), Exception.class, new zzfjz(this, zzevpVar) { // from class: com.google.android.gms.internal.ads.zzevv
            private final zzevx zza;
            private final zzevp zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzevpVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzc(this.zzb, (Exception) obj);
            }
        }, zzevqVar.zza());
    }

    public final synchronized void zza(zzfko<Void> zzfkoVar) {
        zzfks.zzp(zzfks.zzi(this.zzb, zzevw.zza, this.zza.zza()), zzfkoVar, this.zza.zza());
    }

    public final synchronized zzfla<zzevo<AdT>> zzb(zzevq zzevqVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zzb() != null && zzevqVar.zzb() != null && this.zza.zzb().equals(zzevqVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(zzevp zzevpVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzd(zzevp zzevpVar, zzeuv zzeuvVar, zzevq zzevqVar, zzeve zzeveVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzevpVar.zzb(zzeveVar);
            if (!this.zzc) {
                zzeuvVar.zzb(zzevqVar.zzb(), zzeveVar);
                return zzfks.zza(null);
            }
            return zzfks.zza(new zzevo(zzeveVar, zzevqVar));
        }
    }
}
