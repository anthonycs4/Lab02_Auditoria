package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdsa {
    private final zzdro zza;
    private final zzdni zzb;
    private final Object zzc = new Object();
    private final List<zzdrz> zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsa(zzdro zzdroVar, zzdni zzdniVar) {
        this.zza = zzdroVar;
        this.zzb = zzdniVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List<zzbnj> list) {
        String zzbtyVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            for (zzbnj zzbnjVar : list) {
                List<zzdrz> list2 = this.zzd;
                String str = zzbnjVar.zza;
                zzdnh zzc = this.zzb.zzc(str);
                if (zzc == null) {
                    zzbtyVar = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                } else {
                    zzbty zzbtyVar2 = zzc.zzb;
                    zzbtyVar = zzbtyVar2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzbtyVar2.toString();
                }
                String str2 = zzbtyVar;
                list2.add(new zzdrz(str, str2, zzbnjVar.zzb ? 1 : 0, zzbnjVar.zzd, zzbnjVar.zzc));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzdry(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zze()) {
                    zzd(this.zza.zzd());
                } else {
                    zza();
                    return jSONArray;
                }
            }
            for (zzdrz zzdrzVar : this.zzd) {
                jSONArray.put(zzdrzVar.zza());
            }
            return jSONArray;
        }
    }
}
