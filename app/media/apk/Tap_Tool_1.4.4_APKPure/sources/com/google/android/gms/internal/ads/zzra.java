package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzra implements zzpj {
    private final zzqe zza;
    private final int zzb;
    private final zzpy zzc = new zzpy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzra(zzqe zzqeVar, int i, zzqz zzqzVar) {
        this.zza = zzqeVar;
        this.zzb = i;
    }

    private final long zzc(zzps zzpsVar) throws IOException {
        while (zzpsVar.zzm() < zzpsVar.zzo() - 6 && !zzpz.zzb(zzpsVar, this.zza, this.zzb, this.zzc)) {
            ((zzpo) zzpsVar).zzj(1, false);
        }
        if (zzpsVar.zzm() >= zzpsVar.zzo() - 6) {
            ((zzpo) zzpsVar).zzj((int) (zzpsVar.zzo() - zzpsVar.zzm()), false);
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzpi zza(zzps zzpsVar, long j) throws IOException {
        long zzn = zzpsVar.zzn();
        long zzc = zzc(zzpsVar);
        long zzm = zzpsVar.zzm();
        ((zzpo) zzpsVar).zzj(Math.max(6, this.zza.zzc), false);
        long zzc2 = zzc(zzpsVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzpi.zzb(zzc2, zzpsVar.zzm()) : zzpi.zza(zzc, zzn) : zzpi.zzc(zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final void zzb() {
    }
}
