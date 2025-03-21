package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdvo extends zzbww {
    private final Context zza;
    private final Executor zzb;
    private final zzbxq zzc;
    private final zzcnm zzd;
    private final HashMap<String, zzdvl> zze;
    private final zzbxr zzf;
    private final zzdvt zzg;

    /* JADX WARN: Multi-variable type inference failed */
    public zzdvo(Context context, Context context2, Executor executor, zzbxr zzbxrVar, zzcnm zzcnmVar, zzbxq zzbxqVar, HashMap<String, zzdvl> hashMap, zzdvt zzdvtVar) {
        zzbfq.zza(context);
        this.zza = context;
        this.zzb = context2;
        this.zzf = executor;
        this.zzc = zzcnmVar;
        this.zzd = zzbxrVar;
        this.zze = zzbxqVar;
        this.zzg = hashMap;
    }

    private static zzfla<JSONObject> zzl(zzbxf zzbxfVar, zzexl zzexlVar, final zzelv zzelvVar) {
        zzfjz zzfjzVar = new zzfjz(zzelvVar) { // from class: com.google.android.gms.internal.ads.zzdvc
            private final zzelv zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzelvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zza().zza(com.google.android.gms.ads.internal.zzs.zzc().zzh((Bundle) obj));
            }
        };
        return zzexlVar.zza(zzexf.GMS_SIGNALS, zzfks.zza(zzbxfVar.zza)).zzc(zzfjzVar).zzb(zzdvd.zza).zzi();
    }

    private static zzfla<zzbxi> zzm(zzfla<JSONObject> zzflaVar, zzexl zzexlVar, zzbqe zzbqeVar) {
        return zzexlVar.zza(zzexf.BUILD_URL, zzflaVar).zzc(zzbqeVar.zza("AFMA_getAdDictionary", zzbqb.zza, zzdve.zza)).zzi();
    }

    private final void zzn(zzfla<InputStream> zzflaVar, zzbxb zzbxbVar) {
        zzfks.zzp(zzfks.zzi(zzflaVar, new zzfjz(this) { // from class: com.google.android.gms.internal.ads.zzdvi
            private final zzdvo zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return zzfks.zza(zzeue.zza((InputStream) obj));
            }
        }, zzccz.zza), new zzdvk(this, zzbxbVar), zzccz.zzf);
    }

    public final zzfla<InputStream> zzb(zzbxf zzbxfVar, int i) {
        zzbqe zza = com.google.android.gms.ads.internal.zzs.zzp().zza(this.zza, zzcct.zza());
        zzelv zzA = this.zzd.zzA(zzbxfVar, i);
        zzbpu zza2 = zza.zza("google.afma.response.normalize", zzdvn.zzd, zzbqb.zzb);
        zzdvv zzdvvVar = new zzdvv(zzbxfVar.zzg);
        zzdvs zzdvsVar = new zzdvs(this.zza, zzbxfVar.zzb.zza, this.zzf, i, null);
        zzexl zzc = zzA.zzc();
        zzdvl zzdvlVar = null;
        if (!zzbhh.zza.zze().booleanValue()) {
            String str = zzbxfVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            String str2 = zzbxfVar.zzj;
            if (str2 != null && !str2.isEmpty()) {
                zzdvl remove = this.zze.remove(zzbxfVar.zzj);
                if (remove == null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
                } else {
                    zzdvlVar = remove;
                }
            }
        }
        if (zzdvlVar == null) {
            final zzfla<JSONObject> zzl = zzl(zzbxfVar, zzc, zzA);
            final zzfla<zzbxi> zzm = zzm(zzl, zzc, zza);
            final zzewr zzi = zzc.zzb(zzexf.HTTP, zzm, zzl).zza(new Callable(zzl, zzm) { // from class: com.google.android.gms.internal.ads.zzduz
                private final zzfla zza;
                private final zzfla zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzl;
                    this.zzb = zzm;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdvu((JSONObject) this.zza.get(), (zzbxi) this.zzb.get());
                }
            }).zzb(zzdvvVar).zzb(zzdvsVar).zzi();
            return zzc.zzb(zzexf.PRE_PROCESS, zzl, zzm, zzi).zza(new Callable(zzi, zzl, zzm) { // from class: com.google.android.gms.internal.ads.zzdva
                private final zzfla zza;
                private final zzfla zzb;
                private final zzfla zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzi;
                    this.zzb = zzl;
                    this.zzc = zzm;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdvn((zzdvr) this.zza.get(), (JSONObject) this.zzb.get(), (zzbxi) this.zzc.get());
                }
            }).zzc(zza2).zzi();
        }
        final zzewr zzi2 = zzc.zza(zzexf.HTTP, zzfks.zza(new zzdvu(zzdvlVar.zzb, zzdvlVar.zza))).zzb(zzdvvVar).zzb(zzdvsVar).zzi();
        final zzfla<?> zza3 = zzfks.zza(zzdvlVar);
        return zzc.zzb(zzexf.PRE_PROCESS, zzi2, zza3).zza(new Callable(zzi2, zza3) { // from class: com.google.android.gms.internal.ads.zzdvb
            private final zzfla zza;
            private final zzfla zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzi2;
                this.zzb = zza3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfla zzflaVar = this.zza;
                zzfla zzflaVar2 = this.zzb;
                return new zzdvn((zzdvr) zzflaVar.get(), ((zzdvl) zzflaVar2.get()).zzb, ((zzdvl) zzflaVar2.get()).zza);
            }
        }).zzc(zza2).zzi();
    }

    public final zzfla<InputStream> zzc(zzbxf zzbxfVar, int i) {
        if (!zzbhh.zza.zze().booleanValue()) {
            return zzfks.zzc(new Exception("Split request is disabled."));
        }
        zzevc zzevcVar = zzbxfVar.zzi;
        if (zzevcVar == null) {
            return zzfks.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzevcVar.zzc == 0 || zzevcVar.zzd == 0) {
            return zzfks.zzc(new Exception("Caching is disabled."));
        }
        zzbqe zza = com.google.android.gms.ads.internal.zzs.zzp().zza(this.zza, zzcct.zza());
        zzelv zzA = this.zzd.zzA(zzbxfVar, i);
        zzexl zzc = zzA.zzc();
        final zzfla<JSONObject> zzl = zzl(zzbxfVar, zzc, zzA);
        final zzfla<zzbxi> zzm = zzm(zzl, zzc, zza);
        return zzc.zzb(zzexf.GET_URL_AND_CACHE_KEY, zzl, zzm).zza(new Callable(this, zzm, zzl) { // from class: com.google.android.gms.internal.ads.zzdvg
            private final zzdvo zza;
            private final zzfla zzb;
            private final zzfla zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzm;
                this.zzc = zzl;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(this.zzb, this.zzc);
            }
        }).zzi();
    }

    public final zzfla<InputStream> zzd(String str) {
        if (!zzbhh.zza.zze().booleanValue()) {
            return zzfks.zzc(new Exception("Split request is disabled."));
        }
        zzdvj zzdvjVar = new zzdvj(this);
        if (this.zze.remove(str) == null) {
            String valueOf = String.valueOf(str);
            return zzfks.zzc(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
        }
        return zzfks.zza(zzdvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zze(zzbxf zzbxfVar, zzbxb zzbxbVar) {
        zzfla<InputStream> zzb = zzb(zzbxfVar, Binder.getCallingUid());
        zzn(zzb, zzbxbVar);
        zzb.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdvf
            private final zzdvo zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzf(zzbxf zzbxfVar, zzbxb zzbxbVar) {
        zzn(zzi(zzbxfVar, Binder.getCallingUid()), zzbxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzg(zzbxf zzbxfVar, zzbxb zzbxbVar) {
        zzn(zzc(zzbxfVar, Binder.getCallingUid()), zzbxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzh(String str, zzbxb zzbxbVar) {
        zzn(zzd(str), zzbxbVar);
    }

    public final zzfla<InputStream> zzi(zzbxf zzbxfVar, int i) {
        zzbqe zza = com.google.android.gms.ads.internal.zzs.zzp().zza(this.zza, zzcct.zza());
        if (!zzbhm.zza.zze().booleanValue()) {
            return zzfks.zzc(new Exception("Signal collection disabled."));
        }
        zzelv zzA = this.zzd.zzA(zzbxfVar, i);
        final zzelg<JSONObject> zzb = zzA.zzb();
        return zzA.zzc().zza(zzexf.GET_SIGNALS, zzfks.zza(zzbxfVar.zza)).zzc(new zzfjz(zzb) { // from class: com.google.android.gms.internal.ads.zzdvh
            private final zzelg zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
            }

            @Override // com.google.android.gms.internal.ads.zzfjz
            public final zzfla zza(Object obj) {
                return this.zza.zza(com.google.android.gms.ads.internal.zzs.zzc().zzh((Bundle) obj));
            }
        }).zzj(zzexf.JS_SIGNALS).zzc(zza.zza("google.afma.request.getSignals", zzbqb.zza, zzbqb.zzb)).zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzj(zzfla zzflaVar, zzfla zzflaVar2) throws Exception {
        String zzi = ((zzbxi) zzflaVar.get()).zzi();
        this.zze.put(zzi, new zzdvl((zzbxi) zzflaVar.get(), (JSONObject) zzflaVar2.get()));
        return new ByteArrayInputStream(zzi.getBytes(zzfeg.zzc));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        zzcdc.zza(this.zzc.zza(), "persistFlags");
    }
}
