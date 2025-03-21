package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyw {
    private final zzezd zza;
    private final zzezd zzb;
    private final zzeza zzc;
    private final zzezc zzd;

    private zzeyw(zzeza zzezaVar, zzezc zzezcVar, zzezd zzezdVar, zzezd zzezdVar2, boolean z) {
        this.zzc = zzezaVar;
        this.zzd = zzezcVar;
        this.zza = zzezdVar;
        if (zzezdVar2 == null) {
            this.zzb = zzezd.NONE;
        } else {
            this.zzb = zzezdVar2;
        }
    }

    public static zzeyw zza(zzeza zzezaVar, zzezc zzezcVar, zzezd zzezdVar, zzezd zzezdVar2, boolean z) {
        zzfad.zza(zzezcVar, "ImpressionType is null");
        zzfad.zza(zzezdVar, "Impression owner is null");
        zzfad.zzc(zzezdVar, zzezaVar, zzezcVar);
        return new zzeyw(zzezaVar, zzezcVar, zzezdVar, zzezdVar2, true);
    }

    @Deprecated
    public static zzeyw zzb(zzezd zzezdVar, zzezd zzezdVar2, boolean z) {
        zzfad.zza(zzezdVar, "Impression owner is null");
        zzfad.zzc(zzezdVar, null, null);
        return new zzeyw(null, null, zzezdVar, zzezdVar2, true);
    }

    public final JSONObject zzc() {
        JSONObject jSONObject = new JSONObject();
        zzfab.zzc(jSONObject, "impressionOwner", this.zza);
        if (this.zzc == null || this.zzd == null) {
            zzfab.zzc(jSONObject, "videoEventsOwner", this.zzb);
        } else {
            zzfab.zzc(jSONObject, "mediaEventsOwner", this.zzb);
            zzfab.zzc(jSONObject, "creativeType", this.zzc);
            zzfab.zzc(jSONObject, "impressionType", this.zzd);
        }
        zzfab.zzc(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
