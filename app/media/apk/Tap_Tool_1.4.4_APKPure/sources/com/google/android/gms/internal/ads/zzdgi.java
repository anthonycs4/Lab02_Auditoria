package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgi implements zzgdq<zzase> {
    private final zzgeb<zzcct> zza;
    private final zzgeb<String> zzb;

    public zzdgi(zzgeb<zzcct> zzgebVar, zzgeb<String> zzgebVar2) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcct zza = ((zzckn) this.zza).zza();
        com.google.android.gms.ads.internal.zzs.zzc();
        return new zzase(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
