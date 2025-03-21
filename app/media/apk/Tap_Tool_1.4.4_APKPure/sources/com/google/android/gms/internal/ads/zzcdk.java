package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcdk implements zzfko {
    final /* synthetic */ zzcdi zza;
    final /* synthetic */ zzcdg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdk(zzcdl zzcdlVar, zzcdi zzcdiVar, zzcdg zzcdgVar) {
        this.zza = zzcdiVar;
        this.zzb = zzcdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}
