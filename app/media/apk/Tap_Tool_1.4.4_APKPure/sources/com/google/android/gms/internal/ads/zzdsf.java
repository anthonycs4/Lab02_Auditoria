package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdsf implements zzdsn, zzdrr {
    private final zzdsm zza;
    private final zzdso zzb;
    private final zzdrs zzc;
    private final zzdsa zzd;
    private final zzdrq zze;
    private final String zzf;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private String zzh = "{}";
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzj = LongCompanionObject.MAX_VALUE;
    private zzdsb zzk = zzdsb.NONE;
    private zzdse zzo = zzdse.UNKNOWN;
    private final Map<String, List<zzdru>> zzg = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsf(zzdsm zzdsmVar, zzdso zzdsoVar, zzdrs zzdrsVar, Context context, zzcct zzcctVar, zzdsa zzdsaVar) {
        this.zza = zzdsmVar;
        this.zzb = zzdsoVar;
        this.zzc = zzdrsVar;
        this.zze = new zzdrq(context);
        this.zzf = zzcctVar.zza;
        this.zzd = zzdsaVar;
        com.google.android.gms.ads.internal.zzs.zzm().zza(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void zzo(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzl     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.zzl = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbfi<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzbfq.zzgj     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbfo r0 = com.google.android.gms.internal.ads.zzbba.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzs.zzm()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.zzk()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.zzs()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.zzn()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.zzt()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.zzu()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzo(boolean, boolean):void");
    }

    private final synchronized void zzp(zzdsb zzdsbVar, boolean z) {
        if (this.zzk == zzdsbVar) {
            return;
        }
        if (zzn()) {
            zzt();
        }
        this.zzk = zzdsbVar;
        if (zzn()) {
            zzs();
        }
        if (z) {
            zzu();
        }
    }

    private final synchronized JSONObject zzq() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<zzdru>> entry : this.zzg.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdru zzdruVar : entry.getValue()) {
                if (zzdruVar.zzb()) {
                    jSONArray.put(zzdruVar.zzc());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzr() {
        this.zzn = true;
        this.zzd.zza();
        this.zza.zzf(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        zzv(com.google.android.gms.ads.internal.zzs.zzg().zzl().zzF());
    }

    private final synchronized void zzs() {
        zzdsb zzdsbVar = zzdsb.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzt() {
        zzdsb zzdsbVar = zzdsb.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzc();
        }
    }

    private final void zzu() {
        com.google.android.gms.ads.internal.zzs.zzg().zzl().zzG(zzh());
    }

    private final synchronized void zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzo(jSONObject.optBoolean("isTestMode", false), false);
            zzp(zzdsb.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzh = jSONObject.optString("networkExtras", "{}");
            this.zzj = jSONObject.optLong("networkExtrasExpirationSecs", LongCompanionObject.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final void zza() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue() || !com.google.android.gms.ads.internal.zzs.zzg().zzl().zzH()) {
                String zzF = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzF();
                if (TextUtils.isEmpty(zzF)) {
                    return;
                }
                try {
                    if (new JSONObject(zzF).optBoolean("isTestMode", false)) {
                        zzr();
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            zzr();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzn
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzr()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzl
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzs()
            return
        L15:
            boolean r2 = r1.zzn()
            if (r2 != 0) goto L1e
            r1.zzt()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsf.zzb(boolean):void");
    }

    public final void zzc(boolean z) {
        if (!this.zzn && z) {
            zzr();
        }
        zzo(z, true);
    }

    public final synchronized boolean zzd() {
        return this.zzl;
    }

    public final void zze(zzdsb zzdsbVar) {
        zzp(zzdsbVar, true);
    }

    public final zzdsb zzf() {
        return this.zzk;
    }

    public final synchronized String zzg() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzn()) {
            if (this.zzj < com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() / 1000) {
                this.zzh = "{}";
                this.zzj = LongCompanionObject.MAX_VALUE;
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else if (this.zzh.equals("{}")) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                return this.zzh;
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzl);
            jSONObject.put("gesture", this.zzk);
            if (this.zzj > com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzh);
                jSONObject.put("networkExtrasExpirationSecs", this.zzj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j) {
        this.zzh = str;
        this.zzj = j;
        zzu();
    }

    public final synchronized void zzj(String str, zzdru zzdruVar) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzn()) {
            if (this.zzm >= ((Integer) zzbba.zzc().zzb(zzbfq.zzfW)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzg.containsKey(str)) {
                this.zzg.put(str, new ArrayList());
            }
            this.zzm++;
            this.zzg.get(str).add(zzdruVar);
        }
    }

    public final synchronized void zzk(zzbcx zzbcxVar, zzdse zzdseVar) {
        if (!zzn()) {
            try {
                zzbcxVar.zze(zzeuf.zzd(17, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue()) {
            try {
                zzbcxVar.zze(zzeuf.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.zze.zzi("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzo = zzdseVar;
        this.zza.zzg(zzbcxVar, new zzblq(this));
        return;
    }

    public final synchronized void zzl(String str) {
        this.zzi = str;
    }

    public final synchronized JSONObject zzm() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.zzf);
            jSONObject.put("adapters", this.zzd.zzb());
            if (this.zzj < com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis() / 1000) {
                this.zzh = "{}";
            }
            jSONObject.put("networkExtras", this.zzh);
            jSONObject.put("adSlots", zzq());
            jSONObject.put("appInfo", this.zze.zza());
            String zzd = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzd();
            if (!TextUtils.isEmpty(zzd)) {
                jSONObject.put("cld", new JSONObject(zzd));
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgk)).booleanValue() && !TextUtils.isEmpty(this.zzi)) {
                String valueOf = String.valueOf(this.zzi);
                com.google.android.gms.ads.internal.util.zze.zzd(valueOf.length() != 0 ? "Policy violation data: ".concat(valueOf) : new String("Policy violation data: "));
                jSONObject.put("policyViolations", new JSONObject(this.zzi));
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue()) {
                jSONObject.put("openAction", this.zzo);
                jSONObject.put("gesture", this.zzk);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzs.zzg().zzh(e, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized boolean zzn() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue()) {
            return this.zzl || com.google.android.gms.ads.internal.zzs.zzm().zzk();
        }
        return this.zzl;
    }
}
