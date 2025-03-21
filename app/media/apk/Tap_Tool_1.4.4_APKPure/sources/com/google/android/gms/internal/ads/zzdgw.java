package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgw {
    private zzbih zza;

    public zzdgw(zzdgl zzdglVar) {
        this.zza = zzdglVar;
    }

    public final synchronized zzbih zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbih zzbihVar) {
        this.zza = zzbihVar;
    }
}
