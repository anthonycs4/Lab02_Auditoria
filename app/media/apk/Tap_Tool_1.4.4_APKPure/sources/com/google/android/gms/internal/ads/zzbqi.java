package com.google.android.gms.internal.ads;

import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbqi<I, O> implements zzbpu<I, O> {
    private final zzbpw<O> zza;
    private final zzbpx<I> zzb;
    private final zzbpq zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqi(zzbpq zzbpqVar, String str, zzbpx<I> zzbpxVar, zzbpw<O> zzbpwVar) {
        this.zzc = zzbpqVar;
        this.zzd = str;
        this.zzb = zzbpxVar;
        this.zza = zzbpwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzbqi zzbqiVar, zzbpk zzbpkVar, zzbpr zzbprVar, Object obj, zzcde zzcdeVar) {
        try {
            com.google.android.gms.ads.internal.zzs.zzc();
            String uuid = UUID.randomUUID().toString();
            zzblo.zzp.zzb(uuid, new zzbqh(zzbqiVar, zzbpkVar, zzcdeVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbqiVar.zzb.zzb(obj));
            zzbprVar.zzr(zzbqiVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcdeVar.zzd(e);
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbpkVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfla<O> zza(I i) throws Exception {
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final zzfla<O> zzb(I i) {
        zzcde zzcdeVar = new zzcde();
        zzbpk zzb = this.zzc.zzb(null);
        zzb.zze(new zzbqf(this, zzb, i, zzcdeVar), new zzbqg(this, zzcdeVar, zzb));
        return zzcdeVar;
    }
}
