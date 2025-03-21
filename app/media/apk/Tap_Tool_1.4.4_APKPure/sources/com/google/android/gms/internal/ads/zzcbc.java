package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbc {
    private final Map<String, zzcba> zza = new HashMap();
    private final List<zzcbb> zzb = new ArrayList();
    private final Context zzc;
    private final zzbzz zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbc(Context context, zzbzz zzbzzVar) {
        this.zzc = context;
        this.zzd = zzbzzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(zzcbb zzcbbVar) {
        this.zzb.add(zzcbbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if ("__default__".equals(str)) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        } else {
            sharedPreferences = this.zzc.getSharedPreferences(str, 0);
        }
        zzcba zzcbaVar = new zzcba(this, str);
        this.zza.put(str, zzcbaVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzcbaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }
}
