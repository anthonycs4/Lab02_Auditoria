package com.google.android.gms.internal.ads;

import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdtk implements zzgdq<String> {
    public static zzdtk zza() {
        zzdtk zzdtkVar;
        zzdtkVar = zzdtj.zza;
        return zzdtkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzs.zzc();
        String uuid = UUID.randomUUID().toString();
        zzgdw.zzb(uuid);
        return uuid;
    }
}
