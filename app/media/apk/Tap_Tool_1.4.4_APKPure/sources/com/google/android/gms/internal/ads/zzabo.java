package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzabo extends zzzm implements zzabg {
    private final zzkd zza;
    private final zzkc zzb;
    private final zzaee zzc;
    private final zzaba zzd;
    private final zzoz zze;
    private final int zzf;
    private boolean zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private zzafp zzk;
    private final zzaet zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabo(zzkd zzkdVar, zzaee zzaeeVar, zzaba zzabaVar, zzoz zzozVar, zzaet zzaetVar, int i, byte[] bArr) {
        zzkc zzkcVar = zzkdVar.zzb;
        Objects.requireNonNull(zzkcVar);
        this.zzb = zzkcVar;
        this.zza = zzkdVar;
        this.zzc = zzaeeVar;
        this.zzd = zzabaVar;
        this.zze = zzozVar;
        this.zzl = zzaetVar;
        this.zzf = i;
        this.zzg = true;
        this.zzh = -9223372036854775807L;
    }

    private final void zzu() {
        long j = this.zzh;
        boolean z = this.zzi;
        boolean z2 = this.zzj;
        zzkd zzkdVar = this.zza;
        zzacb zzacbVar = new zzacb(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, null, zzkdVar, z2 ? zzkdVar.zzc : null);
        zze(this.zzg ? new zzabl(this, zzacbVar) : zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaah zzB(zzaaj zzaajVar, zzaek zzaekVar, long j) {
        zzaef zza = this.zzc.zza();
        zzafp zzafpVar = this.zzk;
        if (zzafpVar != null) {
            zza.zzb(zzafpVar);
        }
        Uri uri = this.zzb.zza;
        zzabb zza2 = this.zzd.zza();
        zzoz zzozVar = this.zze;
        zzou zzh = zzh(zzaajVar);
        zzaet zzaetVar = this.zzl;
        zzaas zzf = zzf(zzaajVar);
        String str = this.zzb.zzf;
        return new zzabk(uri, zza, zza2, zzozVar, zzh, zzaetVar, zzf, this, zzaekVar, null, this.zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    protected final void zza(zzafp zzafpVar) {
        this.zzk = zzafpVar;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzb(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzh;
        }
        if (!this.zzg && this.zzh == j && this.zzi == z && this.zzj == z2) {
            return;
        }
        this.zzh = j;
        this.zzi = z;
        this.zzj = z2;
        this.zzg = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzkd zzy() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final void zzz(zzaah zzaahVar) {
        ((zzabk) zzaahVar).zzj();
    }
}
