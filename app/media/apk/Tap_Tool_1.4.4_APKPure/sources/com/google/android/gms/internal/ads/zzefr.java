package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefr {
    private final zzdhk zza;
    private final zzefe zzb;
    private final zzcwk zzc;

    public zzefr(zzdhk zzdhkVar, zzexv zzexvVar) {
        this.zza = zzdhkVar;
        final zzefe zzefeVar = new zzefe(zzexvVar);
        this.zzb = zzefeVar;
        final zzboe zze = zzdhkVar.zze();
        this.zzc = new zzcwk(zzefeVar, zze) { // from class: com.google.android.gms.internal.ads.zzefq
            private final zzefe zza;
            private final zzboe zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzefeVar;
                this.zzb = zze;
            }

            @Override // com.google.android.gms.internal.ads.zzcwk
            public final void zzbM(zzazm zzazmVar) {
                zzefe zzefeVar2 = this.zza;
                zzboe zzboeVar = this.zzb;
                zzefeVar2.zzbM(zzazmVar);
                if (zzboeVar != null) {
                    try {
                        zzboeVar.zzg(zzazmVar);
                    } catch (RemoteException e) {
                        zzccn.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzboeVar != null) {
                    try {
                        zzboeVar.zzf(zzazmVar.zza);
                    } catch (RemoteException e2) {
                        zzccn.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final void zza(zzbbh zzbbhVar) {
        this.zzb.zzn(zzbbhVar);
    }

    public final zzdfi zzb() {
        return new zzdfi(this.zza, this.zzb.zzl());
    }

    public final zzefe zzc() {
        return this.zzb;
    }

    public final zzcxt zzd() {
        return this.zzb;
    }

    public final zzcwk zze() {
        return this.zzc;
    }
}
