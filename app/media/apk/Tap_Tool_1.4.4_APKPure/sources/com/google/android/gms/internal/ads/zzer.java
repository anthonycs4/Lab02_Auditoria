package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzer implements zzfci {
    final /* synthetic */ zzfbb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzer(zzfbb zzfbbVar) {
        this.zza = zzfbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final void zza(int i, long j) {
        this.zza.zzc(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final void zzb(int i, long j, String str) {
        this.zza.zzg(i, System.currentTimeMillis() - j, str);
    }
}
