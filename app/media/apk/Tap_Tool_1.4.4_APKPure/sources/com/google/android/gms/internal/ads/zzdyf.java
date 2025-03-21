package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdyf {
    private zzesv zzc = null;
    private zzess zzd = null;
    private final Map<String, zzbab> zzb = Collections.synchronizedMap(new HashMap());
    private final List<zzbab> zza = Collections.synchronizedList(new ArrayList());

    public final void zza(zzesv zzesvVar) {
        this.zzc = zzesvVar;
    }

    public final void zzb(zzess zzessVar) {
        String str = zzessVar.zzv;
        if (this.zzb.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzessVar.zzu.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzessVar.zzu.getString(next));
            } catch (JSONException unused) {
            }
        }
        zzbab zzbabVar = new zzbab(zzessVar.zzD, 0L, null, bundle);
        this.zza.add(zzbabVar);
        this.zzb.put(str, zzbabVar);
    }

    public final void zzc(zzess zzessVar, long j, zzazm zzazmVar) {
        String str = zzessVar.zzv;
        if (this.zzb.containsKey(str)) {
            if (this.zzd == null) {
                this.zzd = zzessVar;
            }
            zzbab zzbabVar = this.zzb.get(str);
            zzbabVar.zzb = j;
            zzbabVar.zzc = zzazmVar;
        }
    }

    public final zzcwa zzd() {
        return new zzcwa(this.zzd, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, this, this.zzc);
    }

    public final List<zzbab> zze() {
        return this.zza;
    }
}
