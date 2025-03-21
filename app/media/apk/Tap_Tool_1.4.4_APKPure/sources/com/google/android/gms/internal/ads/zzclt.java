package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzclt {
    private zzckc zza;
    private zzcmm zzb;
    private zzexp zzc;
    private zzcmx zzd;
    private zzeug zze;

    private zzclt() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzclt(zzckz zzckzVar) {
    }

    public final zzclt zza(zzckc zzckcVar) {
        this.zza = zzckcVar;
        return this;
    }

    public final zzclt zzb(zzcmm zzcmmVar) {
        this.zzb = zzcmmVar;
        return this;
    }

    public final zzcjz zzc() {
        zzgdw.zzc(this.zza, zzckc.class);
        zzgdw.zzc(this.zzb, zzcmm.class);
        if (this.zzc == null) {
            this.zzc = new zzexp();
        }
        if (this.zzd == null) {
            this.zzd = new zzcmx();
        }
        if (this.zze == null) {
            this.zze = new zzeug();
        }
        return new zzcmk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }
}
