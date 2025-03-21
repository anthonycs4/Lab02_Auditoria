package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzdfz implements zzdhh {
    private final Context zza;
    private final zzdhk zzb;
    private final JSONObject zzc;
    private final zzdlt zzd;
    private final zzdgz zze;
    private final zzfb zzf;
    private final zzcwx zzg;
    private final zzcwf zzh;
    private final zzess zzi;
    private final zzcct zzj;
    private final zzetk zzk;
    private final zzcox zzl;
    private final zzdib zzm;
    private final Clock zzn;
    private final zzdcz zzo;
    private final zzeyn zzp;
    private boolean zzr;
    private zzbcp zzy;
    private boolean zzq = false;
    private boolean zzs = false;
    private boolean zzt = false;
    private Point zzu = new Point();
    private Point zzv = new Point();
    private long zzw = 0;
    private long zzx = 0;

    public zzdfz(Context context, zzdhk zzdhkVar, JSONObject jSONObject, zzdlt zzdltVar, zzdgz zzdgzVar, zzfb zzfbVar, zzcwx zzcwxVar, zzcwf zzcwfVar, zzess zzessVar, zzcct zzcctVar, zzetk zzetkVar, zzcox zzcoxVar, zzdib zzdibVar, Clock clock, zzdcz zzdczVar, zzeyn zzeynVar) {
        this.zza = context;
        this.zzb = zzdhkVar;
        this.zzc = jSONObject;
        this.zzd = zzdltVar;
        this.zze = zzdgzVar;
        this.zzf = zzfbVar;
        this.zzg = zzcwxVar;
        this.zzh = zzcwfVar;
        this.zzi = zzessVar;
        this.zzj = zzcctVar;
        this.zzk = zzetkVar;
        this.zzl = zzcoxVar;
        this.zzm = zzdibVar;
        this.zzn = clock;
        this.zzo = zzdczVar;
        this.zzp = zzeynVar;
    }

    private final String zzA(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int zzv = this.zze.zzv();
        if (zzv != 1) {
            if (zzv != 2) {
                if (zzv != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzB() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzC(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbT)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzs.zzc();
            DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzr.zzy((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzbay.zza().zza(context, zzy.widthPixels));
                jSONObject7.put("height", zzbay.zza().zza(context, zzy.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfH)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdfx(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdfw(this, null));
            }
            this.zzd.zzd("/nativeImpression", new zzdfy(this, null));
            zzcdc.zza(this.zzd.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzq) {
                return true;
            }
            this.zzq = com.google.android.gms.ads.internal.zzs.zzm().zzg(this.zza, this.zzj.zza, this.zzi.zzB.toString(), this.zzk.zzf);
            return true;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final boolean zzz(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzu = new Point();
        this.zzv = new Point();
        if (!this.zzr) {
            this.zzo.zza(view);
            this.zzr = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzl.zzi(this);
        boolean zza = com.google.android.gms.ads.internal.util.zzby.zza(this.zzj.zzc);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (zza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (zza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzb(View view, Map<String, WeakReference<View>> map) {
        this.zzu = new Point();
        this.zzv = new Point();
        if (view != null) {
            this.zzo.zzb(view);
        }
        this.zzr = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzc(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject zze = com.google.android.gms.ads.internal.util.zzby.zze(this.zza, map, map2, view2);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzby.zzb(this.zza, view2);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzby.zzc(view2);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzby.zzd(this.zza, view2);
        String zzA = zzA(view, map);
        zzi(true == ((Boolean) zzbba.zzc().zzb(zzbfq.zzbU)).booleanValue() ? view2 : view, zzb, zze, zzc, zzd, zzA, com.google.android.gms.ads.internal.util.zzby.zzf(zzA, this.zza, this.zzv, this.zzu), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.zze.zzd("Click data is null. No click is reported.");
        } else if (!zzz("click_reporting")) {
            com.google.android.gms.ads.internal.util.zze.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.zzs.zzc().zzg(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzf(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzt) {
            com.google.android.gms.ads.internal.util.zze.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!zzB()) {
            com.google.android.gms.ads.internal.util.zze.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            JSONObject zze = com.google.android.gms.ads.internal.util.zzby.zze(this.zza, map, map2, view);
            JSONObject zzb = com.google.android.gms.ads.internal.util.zzby.zzb(this.zza, view);
            JSONObject zzc = com.google.android.gms.ads.internal.util.zzby.zzc(view);
            JSONObject zzd = com.google.android.gms.ads.internal.util.zzby.zzd(this.zza, view);
            String zzA = zzA(null, map);
            zzi(view, zzb, zze, zzc, zzd, zzA, com.google.android.gms.ads.internal.util.zzby.zzf(zzA, this.zza, this.zzv, this.zzu), null, z, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzg() {
        this.zzt = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzh() {
        return zzB();
    }

    protected final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzg(this.zze.zzQ()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzv());
            jSONObject8.put("view_aware_api_used", z);
            zzbhy zzbhyVar = this.zzk.zzi;
            jSONObject8.put("custom_mute_requested", zzbhyVar != null && zzbhyVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzC().isEmpty() || this.zze.zzD() == null) ? false : true);
            if (this.zzm.zzb() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzn.currentTimeMillis());
            if (this.zzt && zzB()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzg(this.zze.zzQ()) != null);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzb().zzg(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcO)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfL)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfM)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzn.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzw);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzx);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcdc.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        this.zzu = com.google.android.gms.ads.internal.util.zzby.zzh(motionEvent, view2);
        long currentTimeMillis = this.zzn.currentTimeMillis();
        this.zzx = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzw = currentTimeMillis;
            this.zzv = this.zzu;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzu.x, this.zzu.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.zze.zzd("Touch event data is null. No touch event is reported.");
        } else if (!zzz("touch_reporting")) {
            com.google.android.gms.ads.internal.util.zze.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.zzf.zzb().zze((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final JSONObject zzl(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject zze = com.google.android.gms.ads.internal.util.zzby.zze(this.zza, map, map2, view);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzby.zzb(this.zza, view);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzby.zzc(view);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzby.zzd(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            return jSONObject;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzm() {
        zzC(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzn(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.zze.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdib zzdibVar = this.zzm;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdibVar);
        view.setClickable(true);
        zzdibVar.zzc = new WeakReference<>(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzo(zzbka zzbkaVar) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.zze.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzm.zza(zzbkaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzp() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzm.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzr(zzbcp zzbcpVar) {
        this.zzy = zzbcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzs() {
        try {
            zzbcp zzbcpVar = this.zzy;
            if (zzbcpVar != null) {
                zzbcpVar.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzt(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String zzi;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzby.zze(this.zza, map, map2, view);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzby.zzb(this.zza, view);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzby.zzc(view);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzby.zzd(this.zza, view);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbT)).booleanValue()) {
            try {
                zzi = this.zzf.zzb().zzi(this.zza, view, null);
            } catch (Exception unused) {
                com.google.android.gms.ads.internal.util.zze.zzf("Exception getting data.");
            }
            zzC(zzb, zze, zzc, zzd, zzi, null, com.google.android.gms.ads.internal.util.zzby.zzi(this.zza, this.zzi));
        }
        zzi = null;
        zzC(zzb, zze, zzc, zzd, zzi, null, com.google.android.gms.ads.internal.util.zzby.zzi(this.zza, this.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzu() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcdc.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzv(Bundle bundle) {
        if (!zzz("impression_reporting")) {
            com.google.android.gms.ads.internal.util.zze.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzC(null, null, null, null, null, com.google.android.gms.ads.internal.zzs.zzc().zzg(bundle, null), false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzw() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzq(zzbct zzbctVar) {
        try {
            if (this.zzs) {
                return;
            }
            if (zzbctVar == null && this.zze.zzD() != null) {
                this.zzs = true;
                this.zzp.zzb(this.zze.zzD().zzf());
                zzs();
                return;
            }
            this.zzs = true;
            this.zzp.zzb(zzbctVar.zzf());
            zzs();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }
}
