package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzekk implements zzeld<zzekl> {
    final String zza;
    private final zzflb zzb;
    private final ScheduledExecutorService zzc;
    private final zzeed zzd;
    private final Context zze;
    private final zzetk zzf;
    private final zzedy zzg;

    public zzekk(zzflb zzflbVar, ScheduledExecutorService scheduledExecutorService, String str, zzeed zzeedVar, Context context, zzetk zzetkVar, zzedy zzedyVar) {
        this.zzb = zzflbVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeedVar;
        this.zze = context;
        this.zzf = zzetkVar;
        this.zzg = zzedyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzekl> zza() {
        return zzfks.zze(new zzfjy(this) { // from class: com.google.android.gms.internal.ads.zzekg
            private final zzekk zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfjy
            public final zzfla zza() {
                return this.zza.zzc();
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfla zzb(String str, List list, Bundle bundle) throws Exception {
        zzcde zzcdeVar = new zzcde();
        this.zzg.zza(str);
        zzbtl zzb = this.zzg.zzb(str);
        Objects.requireNonNull(zzb);
        zzb.zze(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, new zzeeg(str, zzb, zzcdeVar));
        return zzcdeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ zzfla zzc() {
        Map<String, List<Bundle>> zzb = this.zzd.zzb(this.zza, this.zzf.zzf);
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : zzb.entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            Bundle bundle = this.zzf.zzd.zzm;
            final Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
            arrayList.add(zzfks.zzf((zzfkj) zzfks.zzh(zzfkj.zzw(zzfks.zze(new zzfjy(this, key, value, bundle2) { // from class: com.google.android.gms.internal.ads.zzekh
                private final zzekk zza;
                private final String zzb;
                private final List zzc;
                private final Bundle zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = key;
                    this.zzc = value;
                    this.zzd = bundle2;
                }

                @Override // com.google.android.gms.internal.ads.zzfjy
                public final zzfla zza() {
                    return this.zza.zzb(this.zzb, this.zzc, this.zzd);
                }
            }, this.zzb)), ((Long) zzbba.zzc().zzb(zzbfq.zzaX)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Throwable.class, new zzfei(key) { // from class: com.google.android.gms.internal.ads.zzeki
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = key;
                }

                @Override // com.google.android.gms.internal.ads.zzfei
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(this.zza);
                    com.google.android.gms.ads.internal.util.zze.zzf(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.zzb));
        }
        return zzfks.zzo(arrayList).zza(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.zzekj
            private final List zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfla> list = this.zza;
                JSONArray jSONArray = new JSONArray();
                for (zzfla zzflaVar : list) {
                    if (((JSONObject) zzflaVar.get()) != null) {
                        jSONArray.put(zzflaVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzekl(jSONArray.toString());
            }
        }, this.zzb);
    }
}
