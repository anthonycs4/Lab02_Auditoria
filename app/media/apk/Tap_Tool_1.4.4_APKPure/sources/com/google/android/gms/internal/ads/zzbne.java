package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbne implements zzfjz<zzbnc, ParcelFileDescriptor> {
    final /* synthetic */ zzbmw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbne(zzbni zzbniVar, zzbmw zzbmwVar) {
        this.zza = zzbmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final /* bridge */ /* synthetic */ zzfla<ParcelFileDescriptor> zza(zzbnc zzbncVar) throws Exception {
        zzcde zzcdeVar = new zzcde();
        zzbncVar.zze(this.zza, new zzbnd(this, zzcdeVar));
        return zzcdeVar;
    }
}
