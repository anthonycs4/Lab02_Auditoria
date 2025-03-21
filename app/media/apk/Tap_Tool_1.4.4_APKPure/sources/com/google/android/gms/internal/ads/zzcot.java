package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcot implements zzbpx<zzcow> {
    private final Context zza;
    private final zzase zzb;
    private final PowerManager zzc;

    public zzcot(Context context, zzase zzaseVar) {
        this.zza = context;
        this.zzb = zzaseVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* renamed from: zza */
    public final JSONObject zzb(zzcow zzcowVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzash zzashVar = zzcowVar.zzf;
        if (zzashVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzc() != null) {
            boolean z = zzashVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzc()).put("timestamp", zzcowVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzd()).put("isMraid", false);
            boolean z2 = zzcowVar.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcowVar.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.zzc.isInteractive();
            } else {
                isScreenOn = this.zzc.isScreenOn();
            }
            put2.put("isScreenOn", isScreenOn).put("appMuted", com.google.android.gms.ads.internal.zzs.zzh().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzs.zzh().zzb()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzad.zze(this.zza.getApplicationContext()));
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdS)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzashVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzashVar.zzc.top).put("bottom", zzashVar.zzc.bottom).put("left", zzashVar.zzc.left).put("right", zzashVar.zzc.right)).put("adBox", new JSONObject().put("top", zzashVar.zzd.top).put("bottom", zzashVar.zzd.bottom).put("left", zzashVar.zzd.left).put("right", zzashVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzashVar.zze.top).put("bottom", zzashVar.zze.bottom).put("left", zzashVar.zze.left).put("right", zzashVar.zze.right)).put("globalVisibleBoxVisible", zzashVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzashVar.zzg.top).put("bottom", zzashVar.zzg.bottom).put("left", zzashVar.zzg.left).put("right", zzashVar.zzg.right)).put("localVisibleBoxVisible", zzashVar.zzh).put("hitBox", new JSONObject().put("top", zzashVar.zzi.top).put("bottom", zzashVar.zzi.bottom).put("left", zzashVar.zzi.left).put("right", zzashVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcowVar.zza);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaT)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzashVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcowVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
