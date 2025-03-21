package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmm<P> {
    private final P zza;
    private final byte[] zzb;
    private final zzfte zzc;
    private final zzfui zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmm(P p, byte[] bArr, zzfte zzfteVar, zzfui zzfuiVar, int i) {
        this.zza = p;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = zzfteVar;
        this.zzd = zzfuiVar;
    }

    public final P zza() {
        return this.zza;
    }

    public final zzfte zzb() {
        return this.zzc;
    }

    public final zzfui zzc() {
        return this.zzd;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
