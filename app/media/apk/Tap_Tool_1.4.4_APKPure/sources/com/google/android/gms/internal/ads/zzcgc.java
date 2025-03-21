package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcgc implements zzaqe {
    private final zzaqe zza;
    private final long zzb;
    private final zzaqe zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgc(zzaqe zzaqeVar, int i, zzaqe zzaqeVar2) {
        this.zza = zzaqeVar;
        this.zzb = i;
        this.zzc = zzaqeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zzb = this.zza.zzb(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zzb;
            this.zzd = j3;
            i3 = zzb;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zzb2 = this.zzc.zzb(bArr, i + i3, i2 - i3);
            this.zzd += zzb2;
            return i3 + zzb2;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaqe
    public final long zza(zzaqg zzaqgVar) throws IOException {
        zzaqg zzaqgVar2;
        this.zze = zzaqgVar.zza;
        long j = zzaqgVar.zzc;
        long j2 = this.zzb;
        zzaqg zzaqgVar3 = null;
        if (j >= j2) {
            zzaqgVar2 = null;
        } else {
            long j3 = zzaqgVar.zzd;
            zzaqgVar2 = new zzaqg(zzaqgVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzaqgVar.zzd;
        if (j4 == -1 || zzaqgVar.zzc + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzaqgVar.zzc);
            long j5 = zzaqgVar.zzd;
            zzaqgVar3 = new zzaqg(zzaqgVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzaqgVar.zzc + j5) - this.zzb) : -1L, null, 0);
        }
        long zza = zzaqgVar2 != null ? this.zza.zza(zzaqgVar2) : 0L;
        long zza2 = zzaqgVar3 != null ? this.zzc.zza(zzaqgVar3) : 0L;
        this.zzd = zzaqgVar.zzc;
        if (zza2 == -1) {
            return -1L;
        }
        return zza + zza2;
    }
}
