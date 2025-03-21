package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlt {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcin zzc;
    private final Context zzd;
    private final zzdpn zze;
    private final zzexv zzf;
    private final Executor zzg;
    private final zzfb zzh;
    private final zzcct zzi;
    private final zzdxo zzk;
    private final zzeyn zzl;
    private zzfla<zzcib> zzm;
    private final zzdlo zza = new zzdlo(null);
    private final zzbmd zzj = new zzbmd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlt(zzdlr zzdlrVar) {
        this.zzd = zzdlr.zza(zzdlrVar);
        this.zzg = zzdlr.zzb(zzdlrVar);
        this.zzh = zzdlr.zzc(zzdlrVar);
        this.zzi = zzdlr.zzd(zzdlrVar);
        this.zzb = zzdlr.zze(zzdlrVar);
        this.zzc = zzdlr.zzf(zzdlrVar);
        this.zzk = zzdlr.zzg(zzdlrVar);
        this.zzl = zzdlr.zzh(zzdlrVar);
        this.zze = zzdlr.zzi(zzdlrVar);
        this.zzf = zzdlr.zzj(zzdlrVar);
    }

    public final synchronized void zza() {
        zzfla<zzcib> zzj = zzfks.zzj(zzcin.zzb(this.zzd, this.zzi, (String) zzbba.zzc().zzb(zzbfq.zzbZ), this.zzh, this.zzb), new zzfei(this) { // from class: com.google.android.gms.internal.ads.zzdlh
            private final zzdlt zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                zzcib zzcibVar = (zzcib) obj;
                this.zza.zzj(zzcibVar);
                return zzcibVar;
            }
        }, this.zzg);
        this.zzm = zzj;
        zzcdc.zza(zzj, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        zzfla<zzcib> zzflaVar = this.zzm;
        if (zzflaVar == null) {
            return;
        }
        zzfks.zzp(zzflaVar, new zzdlj(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized zzfla<JSONObject> zzc(final String str, final JSONObject jSONObject) {
        zzfla<zzcib> zzflaVar = this.zzm;
        if (zzflaVar == null) {
            return zzfks.zza(null);
        }
        return zzfks.zzi(zzflaVar, new zzfjz(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.zzdli
            private final zzdlt zza;
            private final String zzb;
            private final JSONObject zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
                this.zzc = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zzi(this.zzb, this.zzc, (zzcib) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zzd(String str, zzblp<Object> zzblpVar) {
        zzfla<zzcib> zzflaVar = this.zzm;
        if (zzflaVar == null) {
            return;
        }
        zzfks.zzp(zzflaVar, new zzdlk(this, str, zzblpVar), this.zzg);
    }

    public final synchronized void zze(String str, zzblp<Object> zzblpVar) {
        zzfla<zzcib> zzflaVar = this.zzm;
        if (zzflaVar == null) {
            return;
        }
        zzfks.zzp(zzflaVar, new zzdll(this, str, zzblpVar), this.zzg);
    }

    public final synchronized void zzf(String str, Map<String, ?> map) {
        zzfla<zzcib> zzflaVar = this.zzm;
        if (zzflaVar == null) {
            return;
        }
        zzfks.zzp(zzflaVar, new zzdlm(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzg(zzess zzessVar, zzesv zzesvVar) {
        zzfla<zzcib> zzflaVar = this.zzm;
        if (zzflaVar == null) {
            return;
        }
        zzfks.zzp(zzflaVar, new zzdln(this, zzessVar, zzesvVar), this.zzg);
    }

    public final <T> void zzh(WeakReference<T> weakReference, String str, zzblp<T> zzblpVar) {
        zzd(str, new zzdls(this, weakReference, str, zzblpVar, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzi(String str, JSONObject jSONObject, zzcib zzcibVar) throws Exception {
        return this.zzj.zzc(zzcibVar, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcib zzj(zzcib zzcibVar) {
        zzcibVar.zzab("/result", this.zzj);
        zzcjp zzR = zzcibVar.zzR();
        zzdlo zzdloVar = this.zza;
        zzR.zzM(null, zzdloVar, zzdloVar, zzdloVar, zzdloVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null);
        return zzcibVar;
    }
}
