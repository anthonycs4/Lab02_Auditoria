package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbqq<I, O> implements zzfjz<I, O> {
    private final zzbpw<O> zza;
    private final zzbpx<I> zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfla<zzbpr> zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqq(zzfla<zzbpr> zzflaVar, String str, zzbpx<I> zzbpxVar, zzbpw<O> zzbpwVar) {
        this.zzd = zzflaVar;
        this.zzb = zzbpxVar;
        this.zza = zzbpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final zzfla<O> zza(I i) throws Exception {
        return zzb(i);
    }

    public final zzfla<O> zzb(final I i) {
        return zzfks.zzi(this.zzd, new zzfjz(this, i) { // from class: com.google.android.gms.internal.ads.zzbqo
            private final zzbqq zza;
            private final Object zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = i;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzc(this.zzb, (zzbpr) obj);
            }
        }, zzccz.zzf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzc(Object obj, zzbpr zzbprVar) throws Exception {
        zzcde zzcdeVar = new zzcde();
        com.google.android.gms.ads.internal.zzs.zzc();
        String uuid = UUID.randomUUID().toString();
        zzblo.zzp.zzb(uuid, new zzbqp(this, zzcdeVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbprVar.zzr(this.zzc, jSONObject);
        return zzcdeVar;
    }
}
