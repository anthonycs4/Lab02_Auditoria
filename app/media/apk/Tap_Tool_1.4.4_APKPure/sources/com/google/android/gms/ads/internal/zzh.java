package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfbb;
import com.google.android.gms.internal.ads.zzfci;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzh implements zzfci {
    final /* synthetic */ zzi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final void zza(int i, long j) {
        zzfbb zzfbbVar;
        zzfbbVar = this.zza.zzi;
        zzfbbVar.zzc(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final void zzb(int i, long j, String str) {
        zzfbb zzfbbVar;
        zzfbbVar = this.zza.zzi;
        zzfbbVar.zzg(i, System.currentTimeMillis() - j, str);
    }
}
