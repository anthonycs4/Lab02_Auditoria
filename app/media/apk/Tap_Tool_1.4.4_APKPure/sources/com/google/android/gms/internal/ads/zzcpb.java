package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcpb implements zzgdq<zzase> {
    private final zzgeb<zzess> zza;
    private final zzgeb<zzcct> zzb;
    private final zzgeb<JSONObject> zzc;
    private final zzgeb<String> zzd;

    public zzcpb(zzgeb<zzess> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<JSONObject> zzgebVar3, zzgeb<String> zzgebVar4) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
        this.zzd = zzgebVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzctd) this.zza).zza();
        zzcct zza = ((zzckn) this.zzb).zza();
        JSONObject zzb = this.zzc.zzb();
        String zzb2 = this.zzd.zzb();
        boolean equals = "native".equals(zzb2);
        com.google.android.gms.ads.internal.zzs.zzc();
        return new zzase(UUID.randomUUID().toString(), zza, zzb2, zzb, false, equals);
    }
}
