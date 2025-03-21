package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.Key;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzbun {
    private final zzcib zza;
    private final String zzb;

    public zzbun(zzcib zzcibVar, String str) {
        this.zza = zzcibVar;
        this.zzb = str;
    }

    public final void zzf(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcib zzcibVar = this.zza;
            if (zzcibVar != null) {
                zzcibVar.zzd("onError", put);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzg(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzh(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzj(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void zzk(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(Key.ROTATION, i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while obtaining screen information.", e);
        }
    }
}
