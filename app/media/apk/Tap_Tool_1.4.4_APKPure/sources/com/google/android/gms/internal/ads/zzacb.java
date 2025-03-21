package com.google.android.gms.internal.ads;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzacb extends zzlq {
    private static final Object zzc = new Object();
    private static final zzkd zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzkd zzh;
    private final zzkb zzi;

    static {
        zzjw zzjwVar = new zzjw();
        zzjwVar.zza("SinglePeriodTimeline");
        zzjwVar.zzb(Uri.EMPTY);
        zzd = zzjwVar.zzc();
    }

    public zzacb(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, zzkd zzkdVar, zzkb zzkbVar) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        this.zzh = zzkdVar;
        this.zzi = zzkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzlp zze(int i, zzlp zzlpVar, long j) {
        zzafs.zzc(i, 0, 1);
        zzlpVar.zza(zzlp.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzlpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final zzln zzg(int i, zzln zzlnVar, boolean z) {
        zzafs.zzc(i, 0, 1);
        zzlnVar.zza(null, z ? zzc : null, 0, this.zze, 0L);
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzh(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final Object zzi(int i) {
        zzafs.zzc(i, 0, 1);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzr() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final int zzs() {
        return 1;
    }
}
