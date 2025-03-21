package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzfko;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzq implements zzfko<zzaf> {
    final /* synthetic */ zzcbg zza;
    final /* synthetic */ zzt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(zzt zztVar, zzcbg zzcbgVar) {
        this.zzb = zztVar;
        this.zza = zzcbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        try {
            zzcbg zzcbgVar = this.zza;
            String valueOf = String.valueOf(th.getMessage());
            zzcbgVar.zzb(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzaf zzafVar) {
        zzb zzbVar;
        zzaf zzafVar2 = zzafVar;
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfc)).booleanValue()) {
            try {
                this.zza.zzb("QueryInfo generation has been disabled.");
                return;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("QueryInfo generation has been disabled.");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zze.zzf(sb.toString());
                return;
            }
        }
        try {
            if (zzafVar2 != null) {
                try {
                    String optString = new JSONObject(zzafVar2.zzb).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    if (TextUtils.isEmpty(optString)) {
                        com.google.android.gms.ads.internal.util.zze.zzi("The request ID is empty in request JSON.");
                        this.zza.zzb("Internal error: request ID is empty in request JSON.");
                        return;
                    }
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeZ)).booleanValue()) {
                        zzbVar = this.zzb.zzp;
                        zzbVar.zza(optString, zzafVar2.zzb);
                    }
                    this.zza.zzc(zzafVar2.zza, zzafVar2.zzb, zzafVar2.zzc);
                    return;
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Failed to create JSON object from the request string.");
                    zzcbg zzcbgVar = this.zza;
                    String valueOf2 = String.valueOf(e2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb2.append("Internal error for request JSON: ");
                    sb2.append(valueOf2);
                    zzcbgVar.zzb(sb2.toString());
                    return;
                }
            }
            this.zza.zzc(null, null, null);
        } catch (RemoteException e3) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e3);
        }
    }
}
