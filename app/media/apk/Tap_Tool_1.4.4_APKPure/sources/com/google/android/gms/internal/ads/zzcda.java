package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcda implements zzfko<Object> {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcda(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzs.zzg().zzg(th, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzb(Object obj) {
    }
}
