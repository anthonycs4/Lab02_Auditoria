package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdru implements zzcwk, zzcyy, zzcxx {
    private final zzdsf zza;
    private final String zzb;
    private int zzc = 0;
    private zzdrt zzd = zzdrt.AD_REQUESTED;
    private zzcwa zze;
    private zzazm zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdru(zzdsf zzdsfVar, zzetk zzetkVar) {
        this.zza = zzdsfVar;
        this.zzb = zzetkVar.zzf;
    }

    private static JSONObject zzd(zzcwa zzcwaVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcwaVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzcwaVar.zzc());
        jSONObject.put("responseId", zzcwaVar.zzf());
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgl)).booleanValue()) {
            String zzd = zzcwaVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                String valueOf = String.valueOf(zzd);
                com.google.android.gms.ads.internal.util.zze.zzd(valueOf.length() != 0 ? "Bidding data: ".concat(valueOf) : new String("Bidding data: "));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<zzbab> zzg = zzcwaVar.zzg();
        if (zzg != null) {
            for (zzbab zzbabVar : zzg) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", zzbabVar.zza);
                jSONObject2.put("latencyMillis", zzbabVar.zzb);
                zzazm zzazmVar = zzbabVar.zzc;
                jSONObject2.put("error", zzazmVar == null ? null : zze(zzazmVar));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zze(zzazm zzazmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzazmVar.zzc);
        jSONObject.put("errorCode", zzazmVar.zza);
        jSONObject.put("errorDescription", zzazmVar.zzb);
        zzazm zzazmVar2 = zzazmVar.zzd;
        jSONObject.put("underlyingError", zzazmVar2 == null ? null : zze(zzazmVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final void zza(zzcsn zzcsnVar) {
        this.zze = zzcsnVar.zzm();
        this.zzd = zzdrt.AD_LOADED;
    }

    public final boolean zzb() {
        return this.zzd != zzdrt.AD_REQUESTED;
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        this.zzd = zzdrt.AD_LOAD_FAILED;
        this.zzf = zzazmVar;
    }

    public final JSONObject zzc() throws JSONException {
        String str;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zzd);
        switch (this.zzc) {
            case 1:
                str = "BANNER";
                break;
            case 2:
                str = "INTERSTITIAL";
                break;
            case 3:
                str = "NATIVE_EXPRESS";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "REWARDED";
                break;
            case 6:
                str = "APP_OPEN_AD";
                break;
            case 7:
                str = "REWARDED_INTERSTITIAL";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        jSONObject.put("format", str);
        zzcwa zzcwaVar = this.zze;
        JSONObject jSONObject2 = null;
        if (zzcwaVar != null) {
            jSONObject2 = zzd(zzcwaVar);
        } else {
            zzazm zzazmVar = this.zzf;
            if (zzazmVar != null && (iBinder = zzazmVar.zze) != null) {
                zzcwa zzcwaVar2 = (zzcwa) iBinder;
                jSONObject2 = zzd(zzcwaVar2);
                List<zzbab> zzg = zzcwaVar2.zzg();
                if (zzg != null && zzg.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zze(this.zzf));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
        this.zza.zzj(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
        if (zzeteVar.zzb.zza.isEmpty()) {
            return;
        }
        this.zzc = zzeteVar.zzb.zza.get(0).zzb;
    }
}
