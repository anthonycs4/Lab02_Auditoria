package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwn implements zzpr {
    public static final zzpx zza = zzwj.zza;
    private zzpu zzb;
    private zzqq zzc;
    private zzwl zzd;
    private int zze = -1;
    private long zzf = -1;

    @Override // com.google.android.gms.internal.ads.zzpr
    public final boolean zzd(zzps zzpsVar) throws IOException {
        return zzwq.zza(zzpsVar) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zze(zzpu zzpuVar) {
        this.zzb = zzpuVar;
        this.zzc = zzpuVar.zzbi(0, 1);
        zzpuVar.zzbj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r15 != 65534) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzf(com.google.android.gms.internal.ads.zzps r14, com.google.android.gms.internal.ads.zzqj r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwn.zzf(com.google.android.gms.internal.ads.zzps, com.google.android.gms.internal.ads.zzqj):int");
    }

    @Override // com.google.android.gms.internal.ads.zzpr
    public final void zzg(long j, long j2) {
        zzwl zzwlVar = this.zzd;
        if (zzwlVar != null) {
            zzwlVar.zza(j2);
        }
    }
}
