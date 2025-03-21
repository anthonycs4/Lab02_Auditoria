package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdro {
    private final Context zzf;
    private final WeakReference<Context> zzg;
    private final zzdnl zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdpw zzl;
    private final zzcct zzm;
    private final zzdcj zzo;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcde<Boolean> zze = new zzcde<>();
    private final Map<String, zzbnj> zzn = new ConcurrentHashMap();
    private boolean zzp = true;
    private final long zzd = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();

    public zzdro(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzdnl zzdnlVar, ScheduledExecutorService scheduledExecutorService, zzdpw zzdpwVar, zzcct zzcctVar, zzdcj zzdcjVar) {
        this.zzh = zzdnlVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdpwVar;
        this.zzm = zzcctVar;
        this.zzo = zzdcjVar;
        zzu("com.google.android.gms.ads.MobileAds", false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzl(zzdro zzdroVar, boolean z) {
        zzdroVar.zzc = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(final zzdro zzdroVar, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final zzcde zzcdeVar = new zzcde();
                zzfla zzh = zzfks.zzh(zzcdeVar, ((Long) zzbba.zzc().zzb(zzbfq.zzbh)).longValue(), TimeUnit.SECONDS, zzdroVar.zzk);
                zzdroVar.zzl.zza(next);
                zzdroVar.zzo.zza(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
                Iterator<String> it = keys;
                zzh.zze(new Runnable(zzdroVar, obj, zzcdeVar, next, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzdrh
                    private final zzdro zza;
                    private final Object zzb;
                    private final zzcde zzc;
                    private final String zzd;
                    private final long zze;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzdroVar;
                        this.zzb = obj;
                        this.zzc = zzcdeVar;
                        this.zzd = next;
                        this.zze = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
                    }
                }, zzdroVar.zzi);
                arrayList.add(zzh);
                final zzdrn zzdrnVar = new zzdrn(zzdroVar, obj, next, elapsedRealtime, zzcdeVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                                }
                            }
                            arrayList2.add(new zzbnt(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdroVar.zzu(next, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
                try {
                    try {
                        final zzeub zzb = zzdroVar.zzh.zzb(next, new JSONObject());
                        zzdroVar.zzj.execute(new Runnable(zzdroVar, zzb, zzdrnVar, arrayList2, next) { // from class: com.google.android.gms.internal.ads.zzdrj
                            private final zzdro zza;
                            private final zzeub zzb;
                            private final zzbnn zzc;
                            private final List zzd;
                            private final String zze;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = zzdroVar;
                                this.zzb = zzb;
                                this.zzc = zzdrnVar;
                                this.zzd = arrayList2;
                                this.zze = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzf(this.zzb, this.zzc, this.zzd, this.zze);
                            }
                        });
                    } catch (RemoteException e) {
                        zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                } catch (zzetp unused2) {
                    zzdrnVar.zzf("Failed to create Adapter.");
                }
                keys = it;
            }
            zzfks.zzm(arrayList).zza(new Callable(zzdroVar) { // from class: com.google.android.gms.internal.ads.zzdri
                private final zzdro zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzdroVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.zza.zzg();
                    return null;
                }
            }, zzdroVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
        }
    }

    private final synchronized zzfla<String> zzt() {
        String zzd = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzd();
        if (TextUtils.isEmpty(zzd)) {
            final zzcde zzcdeVar = new zzcde();
            com.google.android.gms.ads.internal.zzs.zzg().zzl().zzo(new Runnable(this, zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzdrf
                private final zzdro zza;
                private final zzcde zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzcdeVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(this.zzb);
                }
            });
            return zzcdeVar;
        }
        return zzfks.zza(zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbnj(str, z, i, str2));
    }

    public final void zza() {
        this.zzp = false;
    }

    public final void zzb(final zzbnq zzbnqVar) {
        this.zze.zze(new Runnable(this, zzbnqVar) { // from class: com.google.android.gms.internal.ads.zzdrd
            private final zzdro zza;
            private final zzbnq zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbnqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdro zzdroVar = this.zza;
                try {
                    this.zzb.zzb(zzdroVar.zzd());
                } catch (RemoteException e) {
                    zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!zzbhg.zza.zze().booleanValue()) {
            if (this.zzm.zzc >= ((Integer) zzbba.zzc().zzb(zzbfq.zzbg)).intValue() && this.zzp) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzd();
                    this.zzo.zzd();
                    this.zze.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdre
                        private final zzdro zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzk();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfla<String> zzt = zzt();
                    this.zzk.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdrg
                        private final zzdro zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzi();
                        }
                    }, ((Long) zzbba.zzc().zzb(zzbfq.zzbi)).longValue(), TimeUnit.SECONDS);
                    zzfks.zzp(zzt, new zzdrm(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzu("com.google.android.gms.ads.MobileAds", true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final List<zzbnj> zzd() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbnj zzbnjVar = this.zzn.get(str);
            arrayList.add(new zzbnj(str, zzbnjVar.zzb, zzbnjVar.zzc, zzbnjVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzeub zzeubVar, zzbnn zzbnnVar, List list, String str) {
        try {
            try {
                Context context = this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzeubVar.zzy(context, zzbnnVar, list);
            } catch (zzetp unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                zzbnnVar.zzf(sb.toString());
            }
        } catch (RemoteException e) {
            zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzg() throws Exception {
        this.zze.zzc(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Object obj, zzcde zzcdeVar, String str, long j) {
        synchronized (obj) {
            if (!zzcdeVar.isDone()) {
                zzu(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - j));
                this.zzl.zzc(str, "timeout");
                this.zzo.zzc(str, "timeout");
                zzcdeVar.zzc(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzu("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime() - this.zzd));
            this.zze.zzd(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(final zzcde zzcdeVar) {
        this.zzi.execute(new Runnable(this, zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzdrk
            private final zzdro zza;
            private final zzcde zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzcdeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcde zzcdeVar2 = this.zzb;
                String zzd = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzd();
                if (!TextUtils.isEmpty(zzd)) {
                    zzcdeVar2.zzc(zzd);
                } else {
                    zzcdeVar2.zzd(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }
}
