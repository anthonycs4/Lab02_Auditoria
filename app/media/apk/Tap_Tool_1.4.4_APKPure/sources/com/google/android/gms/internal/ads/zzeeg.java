package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeeg extends zzbtn {
    private final String zza;
    private final zzbtl zzb;
    private final zzcde<JSONObject> zzc;
    private final JSONObject zzd;
    private boolean zze;

    public zzeeg(String str, zzbtl zzbtlVar, zzcde<JSONObject> zzcdeVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zze = false;
        this.zzc = zzcdeVar;
        this.zza = str;
        this.zzb = zzbtlVar;
        try {
            jSONObject.put("adapter_version", zzbtlVar.zzf().toString());
            jSONObject.put("sdk_version", zzbtlVar.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final synchronized void zzf(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final synchronized void zzg(zzazm zzazmVar) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", zzazmVar.zzb);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }
}
