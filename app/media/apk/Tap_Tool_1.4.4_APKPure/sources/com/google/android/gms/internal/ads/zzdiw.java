package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzdiw implements zzdhh {
    private final zzbrt zza;
    private final zzcwx zzb;
    private final zzcwf zzc;
    private final Context zzd;
    private final zzess zze;
    private final zzcct zzf;
    private final zzetk zzg;
    private boolean zzh = false;
    private boolean zzi = false;
    private boolean zzj = true;
    private final zzbrp zzk;
    private final zzbrq zzl;

    public zzdiw(zzbrp zzbrpVar, zzbrq zzbrqVar, zzbrt zzbrtVar, zzcwx zzcwxVar, zzcwf zzcwfVar, Context context, zzess zzessVar, zzcct zzcctVar, zzetk zzetkVar, byte[] bArr) {
        this.zzk = zzbrpVar;
        this.zzl = zzbrqVar;
        this.zza = zzbrtVar;
        this.zzb = zzcwxVar;
        this.zzc = zzcwfVar;
        this.zzd = context;
        this.zze = zzessVar;
        this.zzf = zzcctVar;
        this.zzg = zzetkVar;
    }

    private final void zzi(View view) {
        try {
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar == null || zzbrtVar.zzu()) {
                zzbrp zzbrpVar = this.zzk;
                if (zzbrpVar == null || zzbrpVar.zzq()) {
                    zzbrq zzbrqVar = this.zzl;
                    if (zzbrqVar == null || zzbrqVar.zzo()) {
                        return;
                    }
                    this.zzl.zzl(ObjectWrapper.wrap(view));
                    this.zzc.onAdClicked();
                    return;
                }
                this.zzk.zzn(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                return;
            }
            this.zza.zzw(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call handleClick", e);
        }
    }

    private static final HashMap<String, View> zzx(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzq;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zze.zzae;
            boolean z = true;
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbb)).booleanValue() && jSONObject.length() != 0) {
                Map<String, WeakReference<View>> hashMap = map == null ? new HashMap<>() : map;
                Map<String, WeakReference<View>> hashMap2 = map2 == null ? new HashMap<>() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbc)).booleanValue() && next.equals("3010")) {
                                zzbrt zzbrtVar = this.zza;
                                Object obj2 = null;
                                if (zzbrtVar != null) {
                                    try {
                                        zzq = zzbrtVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbrp zzbrpVar = this.zzk;
                                    if (zzbrpVar != null) {
                                        zzq = zzbrpVar.zzw();
                                    } else {
                                        zzbrq zzbrqVar = this.zzl;
                                        zzq = zzbrqVar != null ? zzbrqVar.zzu() : null;
                                    }
                                }
                                if (zzq != null) {
                                    obj2 = ObjectWrapper.unwrap(zzq);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbv.zza(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzs.zzc();
                                ClassLoader classLoader = this.zzd.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzj = z;
            HashMap<String, View> zzx = zzx(map);
            HashMap<String, View> zzx2 = zzx(map2);
            zzbrt zzbrtVar2 = this.zza;
            if (zzbrtVar2 != null) {
                zzbrtVar2.zzx(wrap, ObjectWrapper.wrap(zzx), ObjectWrapper.wrap(zzx2));
                return;
            }
            zzbrp zzbrpVar2 = this.zzk;
            if (zzbrpVar2 != null) {
                zzbrpVar2.zzy(wrap, ObjectWrapper.wrap(zzx), ObjectWrapper.wrap(zzx2));
                this.zzk.zzo(wrap);
                return;
            }
            zzbrq zzbrqVar2 = this.zzl;
            if (zzbrqVar2 != null) {
                zzbrqVar2.zzw(wrap, ObjectWrapper.wrap(zzx), ObjectWrapper.wrap(zzx2));
                this.zzl.zzm(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzb(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbrt zzbrtVar = this.zza;
            if (zzbrtVar != null) {
                zzbrtVar.zzy(wrap);
                return;
            }
            zzbrp zzbrpVar = this.zzk;
            if (zzbrpVar != null) {
                zzbrpVar.zzs(wrap);
                return;
            }
            zzbrq zzbrqVar = this.zzl;
            if (zzbrqVar != null) {
                zzbrqVar.zzq(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzc(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzi && this.zze.zzG) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzf(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zze.zzG) {
            com.google.android.gms.ads.internal.util.zze.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzi(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzg() {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzh() {
        return this.zze.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final JSONObject zzl(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzn(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzo(zzbka zzbkaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzq(zzbct zzbctVar) {
        com.google.android.gms.ads.internal.util.zze.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzr(zzbcp zzbcpVar) {
        com.google.android.gms.ads.internal.util.zze.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzs() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzt(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzh) {
                this.zzh = com.google.android.gms.ads.internal.zzs.zzm().zzg(this.zzd, this.zzf.zza, this.zze.zzB.toString(), this.zzg.zzf);
            }
            if (this.zzj) {
                zzbrt zzbrtVar = this.zza;
                if (zzbrtVar != null && !zzbrtVar.zzt()) {
                    this.zza.zzv();
                    this.zzb.zza();
                    return;
                }
                zzbrp zzbrpVar = this.zzk;
                if (zzbrpVar != null && !zzbrpVar.zzp()) {
                    this.zzk.zzm();
                    this.zzb.zza();
                    return;
                }
                zzbrq zzbrqVar = this.zzl;
                if (zzbrqVar == null || zzbrqVar.zzn()) {
                    return;
                }
                this.zzl.zzk();
                this.zzb.zza();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final boolean zzv(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzw() {
    }
}
