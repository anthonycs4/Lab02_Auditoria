package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdvk implements zzfko<ParcelFileDescriptor> {
    final /* synthetic */ zzbxb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvk(zzdvo zzdvoVar, zzbxb zzbxbVar) {
        this.zza = zzbxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        try {
            this.zza.zzf(com.google.android.gms.ads.internal.util.zzbb.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zza.zze(parcelFileDescriptor);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
