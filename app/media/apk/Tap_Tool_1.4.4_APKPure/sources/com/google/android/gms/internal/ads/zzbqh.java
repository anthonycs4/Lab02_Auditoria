package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbqh implements zzbmc {
    final /* synthetic */ zzbqi zza;
    private final zzbpk zzb;
    private final zzcde zzc;

    public zzbqh(zzbqi zzbqiVar, zzbpk zzbpkVar, zzcde zzcdeVar) {
        this.zza = zzbqiVar;
        this.zzb = zzbpkVar;
        this.zzc = zzcdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zza(JSONObject jSONObject) {
        zzbpk zzbpkVar;
        zzbpw zzbpwVar;
        try {
            try {
                zzcde zzcdeVar = this.zzc;
                zzbpwVar = this.zza.zza;
                zzcdeVar.zzc(zzbpwVar.zza(jSONObject));
                zzbpkVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbpkVar = this.zzb;
            } catch (JSONException e) {
                this.zzc.zzd(e);
                zzbpkVar = this.zzb;
            }
            zzbpkVar.zza();
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzb(String str) {
        zzbpk zzbpkVar;
        try {
            if (str == null) {
                this.zzc.zzd(new zzbpt());
            } else {
                this.zzc.zzd(new zzbpt(str));
            }
            zzbpkVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbpkVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
        zzbpkVar.zza();
    }
}
