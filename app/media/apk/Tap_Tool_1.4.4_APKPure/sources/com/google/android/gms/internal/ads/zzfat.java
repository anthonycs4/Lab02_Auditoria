package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfat extends zzfao {
    /* JADX WARN: Multi-variable type inference failed */
    public zzfat(zzfah zzfahVar, zzfah zzfahVar2, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(zzfahVar, zzfahVar2, hashSet, jSONObject, null);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        if (zzfab.zzi(this.zzb, this.zzd.zzd())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfap, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfap
    public final void zza(String str) {
        zzezk zza;
        if (!TextUtils.isEmpty(str) && (zza = zzezk.zza()) != null) {
            for (zzeyz zzeyzVar : zza.zze()) {
                if (this.zza.contains(zzeyzVar.zzi())) {
                    zzeyzVar.zzh().zzf(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
