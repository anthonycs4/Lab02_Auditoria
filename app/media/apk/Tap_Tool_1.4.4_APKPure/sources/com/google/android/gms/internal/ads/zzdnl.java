package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdnl {
    private final zzdni zza;
    private final AtomicReference<zzbre> zzb = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnl(zzdni zzdniVar) {
        this.zza = zzdniVar;
    }

    private final zzbre zze() throws RemoteException {
        zzbre zzbreVar = this.zzb.get();
        if (zzbreVar != null) {
            return zzbreVar;
        }
        com.google.android.gms.ads.internal.util.zze.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final void zza(zzbre zzbreVar) {
        this.zzb.compareAndSet(null, zzbreVar);
    }

    public final zzeub zzb(String str, JSONObject jSONObject) throws zzetp {
        zzbrh zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbsd(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zzb = new zzbsd(new AdUrlAdapter());
            } else if (!"com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbre zze = zze();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zze.zzc(string)) {
                            zzb = zze.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zze.zzd(string)) {
                            zzb = zze.zzb(string);
                        } else {
                            zzb = zze.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzg("Invalid custom event.", e);
                    }
                }
                zzb = zze.zzb(str);
            } else {
                zzb = new zzbsd(new zzbuc());
            }
            zzeub zzeubVar = new zzeub(zzb);
            this.zza.zza(str, zzeubVar);
            return zzeubVar;
        } catch (Throwable th) {
            throw new zzetp(th);
        }
    }

    public final zzbtl zzc(String str) throws RemoteException {
        zzbtl zzf = zze().zzf(str);
        this.zza.zzb(str, zzf);
        return zzf;
    }

    public final boolean zzd() {
        return this.zzb.get() != null;
    }
}
