package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzadz extends zzady {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzadz(byte[] bArr) {
        super(false);
        zzafs.zza(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.zza, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzi(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) throws IOException {
        this.zzb = zzaejVar.zza;
        zzg(zzaejVar);
        long j = zzaejVar.zzf;
        int length = this.zza.length;
        if (j <= length) {
            int i = (int) j;
            this.zzc = i;
            int i2 = length - i;
            this.zzd = i2;
            long j2 = zzaejVar.zzg;
            if (j2 != -1) {
                this.zzd = (int) Math.min(i2, j2);
            }
            this.zze = true;
            zzh(zzaejVar);
            long j3 = zzaejVar.zzg;
            return j3 != -1 ? j3 : this.zzd;
        }
        throw new zzaeg(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() {
        if (this.zze) {
            this.zze = false;
            zzj();
        }
        this.zzb = null;
    }
}
