package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfcs implements zzfbe {
    private final Object zza;
    private final zzfct zzb;
    private final zzfde zzc;
    private final zzfbb zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfcs(Object obj, zzfct zzfctVar, zzfde zzfdeVar, zzfbb zzfbbVar) {
        this.zza = obj;
        this.zzb = zzfctVar;
        this.zzc = zzfdeVar;
        this.zzd = zzfbbVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzdu zza = zzdv.zza();
        zza.zzc(zzdj.DG);
        zza.zza(zzfxj.zzt(bArr));
        return Base64.encodeToString(zza.zzah().zzao(), 11);
    }

    private final synchronized byte[] zzj(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzd(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final synchronized String zza(Context context, String str) {
        Map<String, Object> zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", null);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzd;
        zzd = this.zzc.zzd();
        zzd.put("f", "c");
        zzd.put("ctx", context);
        zzd.put("cs", str2);
        zzd.put("aid", null);
        zzd.put("view", view);
        zzd.put("act", activity);
        return zzi(zzj(null, zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfbe
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfdc {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzc(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfdc(2005, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfct zze() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzf() throws zzfdc {
        try {
        } catch (Exception e) {
            throw new zzfdc(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfdc {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzc(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzfdc(2003, e);
        }
    }

    public final synchronized int zzh() throws zzfdc {
        try {
        } catch (Exception e) {
            throw new zzfdc(2006, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }
}
