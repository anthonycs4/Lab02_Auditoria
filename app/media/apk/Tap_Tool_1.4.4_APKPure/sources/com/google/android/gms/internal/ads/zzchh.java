package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzchh implements zzaef {
    private final zzaef zza;
    private final long zzb;
    private final zzaef zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchh(zzaef zzaefVar, int i, zzaef zzaefVar2) {
        this.zza = zzaefVar;
        this.zzb = i;
        this.zzc = zzaefVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            this.zzd += zza2;
            return i3 + zza2;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb(zzafp zzafpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws IOException {
        zzaej zzaejVar2;
        this.zze = zzaejVar.zza;
        long j = zzaejVar.zzf;
        long j2 = this.zzb;
        zzaej zzaejVar3 = null;
        if (j >= j2) {
            zzaejVar2 = null;
        } else {
            long j3 = zzaejVar.zzg;
            zzaejVar2 = new zzaej(zzaejVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzaejVar.zzg;
        if (j4 == -1 || zzaejVar.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzaejVar.zzf);
            long j5 = zzaejVar.zzg;
            zzaejVar3 = new zzaej(zzaejVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzaejVar.zzf + j5) - this.zzb) : -1L, null, 0);
        }
        long zzc = zzaejVar2 != null ? this.zza.zzc(zzaejVar2) : 0L;
        long zzc2 = zzaejVar3 != null ? this.zzc.zzc(zzaejVar3) : 0L;
        this.zzd = zzaejVar.zzf;
        if (zzc == -1 || zzc2 == -1) {
            return -1L;
        }
        return zzc + zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Map<String, List<String>> zze() {
        return zzfhd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() throws IOException {
        this.zza.zzf();
        this.zzc.zzf();
    }
}
