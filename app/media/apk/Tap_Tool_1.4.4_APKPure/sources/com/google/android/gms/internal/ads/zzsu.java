package com.google.android.gms.internal.ads;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzsu implements zzss {
    private final int zza;
    private final int zzb;
    private final zzahd zzc;

    public zzsu(zzsp zzspVar, zzjq zzjqVar) {
        zzahd zzahdVar = zzspVar.zza;
        this.zzc = zzahdVar;
        zzahdVar.zzh(12);
        int zzB = zzahdVar.zzB();
        if ("audio/raw".equals(zzjqVar.zzl)) {
            int zzR = zzaht.zzR(zzjqVar.zzA, zzjqVar.zzy);
            if (zzB == 0 || zzB % zzR != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(zzR);
                sb.append(", stsz sample size: ");
                sb.append(zzB);
                Log.w("AtomParsers", sb.toString());
                zzB = zzR;
            }
        }
        this.zza = zzB == 0 ? -1 : zzB;
        this.zzb = zzahdVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzB() : i;
    }
}
