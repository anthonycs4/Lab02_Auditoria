package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfas extends zzfao {
    /* JADX WARN: Multi-variable type inference failed */
    public zzfas(zzfah zzfahVar, zzfah zzfahVar2, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(zzfahVar, zzfahVar2, hashSet, jSONObject, null);
    }

    private final void zzc(String str) {
        zzezk zza = zzezk.zza();
        if (zza != null) {
            for (zzeyz zzeyzVar : zza.zze()) {
                if (this.zza.contains(zzeyzVar.zzi())) {
                    zzeyzVar.zzh().zzg(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ String doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfap, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        zzc(str2);
        super.onPostExecute(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfap
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
