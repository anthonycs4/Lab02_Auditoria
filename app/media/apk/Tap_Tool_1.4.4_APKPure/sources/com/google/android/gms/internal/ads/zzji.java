package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzji {
    public zzks zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzji(zzks zzksVar) {
        this.zza = zzksVar;
    }

    public final void zza(int i) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(zzks zzksVar) {
        this.zzg |= this.zza != zzksVar;
        this.zza = zzksVar;
    }

    public final void zzc(int i) {
        if (this.zzc && this.zzd != 5) {
            zzafs.zza(i == 5);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i;
    }

    public final void zzd(int i) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i;
    }
}
