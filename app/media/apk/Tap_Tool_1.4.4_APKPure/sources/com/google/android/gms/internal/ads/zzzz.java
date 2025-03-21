package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzzz implements zzaef {
    private final zzaef zza;
    private final int zzb;
    private final zzzy zzc;
    private final byte[] zzd;
    private int zze;

    public zzzz(zzaef zzaefVar, int i, zzzy zzzyVar) {
        zzafs.zza(i > 0);
        this.zza = zzaefVar;
        this.zzb = i;
        this.zzc = zzzyVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaec
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            int i4 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i5 = (this.zzd[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int zza = this.zza.zza(bArr2, i4, i6);
                        if (zza != -1) {
                            i4 += zza;
                            i6 -= zza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new zzahd(bArr2, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i, Math.min(i3, i2));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zzc(zzaej zzaejVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Uri zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final Map<String, List<String>> zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb(zzafp zzafpVar) {
        Objects.requireNonNull(zzafpVar);
        this.zza.zzb(zzafpVar);
    }
}
