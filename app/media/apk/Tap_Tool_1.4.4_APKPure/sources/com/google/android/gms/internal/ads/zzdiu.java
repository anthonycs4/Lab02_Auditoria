package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdiu implements zzcwz {
    private final zzdgz zza;
    private final zzdhe zzb;

    public zzdiu(zzdgz zzdgzVar, zzdhe zzdheVar) {
        this.zza = zzdgzVar;
        this.zzb = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        if (this.zza.zzU() == null) {
            return;
        }
        zzcib zzT = this.zza.zzT();
        zzcib zzR = this.zza.zzR();
        if (zzT == null) {
            zzT = zzR != null ? zzR : null;
        }
        if (!this.zzb.zzd() || zzT == null) {
            return;
        }
        zzT.zze("onSdkImpression", new ArrayMap());
    }
}
