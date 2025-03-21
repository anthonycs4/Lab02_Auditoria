package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdua extends zzbxa {
    final /* synthetic */ zzdub zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdua(zzdub zzdubVar) {
        this.zza = zzdubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzf(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zza.zza.zzd(new com.google.android.gms.ads.internal.util.zzba(zzbbVar.zza, zzbbVar.zzb));
    }
}
