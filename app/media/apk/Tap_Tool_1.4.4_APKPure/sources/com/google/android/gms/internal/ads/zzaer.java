package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaer implements zzaee {
    private zzafp zzb;
    private String zzc;
    private boolean zzf;
    private final zzafa zza = new zzafa();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzaer zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzaer zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzaer zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzaer zze(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzaer zzf(zzafp zzafpVar) {
        this.zzb = zzafpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaee
    /* renamed from: zzg */
    public final zzaes zza() {
        zzaes zzaesVar = new zzaes(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzafp zzafpVar = this.zzb;
        if (zzafpVar != null) {
            zzaesVar.zzb(zzafpVar);
        }
        return zzaesVar;
    }
}
