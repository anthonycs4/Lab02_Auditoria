package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzbzn implements zzfko<Void> {
    final /* synthetic */ zzfla zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzn(zzbzo zzbzoVar, zzfla zzflaVar) {
        this.zza = zzflaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        List list;
        list = zzbzo.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(Void r2) {
        List list;
        list = zzbzo.zzc;
        list.remove(this.zza);
    }
}
