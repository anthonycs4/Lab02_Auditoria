package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbfj {
    private final Collection<zzbfi<?>> zza = new ArrayList();
    private final Collection<zzbfi<String>> zzb = new ArrayList();
    private final Collection<zzbfi<String>> zzc = new ArrayList();

    public final void zza(zzbfi zzbfiVar) {
        this.zza.add(zzbfiVar);
    }

    public final void zzb(zzbfi<String> zzbfiVar) {
        this.zzb.add(zzbfiVar);
    }

    public final void zzc(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbfi<?> zzbfiVar : this.zza) {
            if (zzbfiVar.zzm() == 1) {
                zzbfiVar.zzb(editor, zzbfiVar.zzc(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzccn.zzf("Flag Json is null.");
        }
    }

    public final List<String> zzd() {
        ArrayList arrayList = new ArrayList();
        for (zzbfi<String> zzbfiVar : this.zzb) {
            String str = (String) zzbba.zzc().zzb(zzbfiVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbfr.zza());
        return arrayList;
    }

    public final List<String> zze() {
        List<String> zzd = zzd();
        for (zzbfi<String> zzbfiVar : this.zzc) {
            String str = (String) zzbba.zzc().zzb(zzbfiVar);
            if (!TextUtils.isEmpty(str)) {
                zzd.add(str);
            }
        }
        zzd.addAll(zzbfr.zzb());
        return zzd;
    }
}
