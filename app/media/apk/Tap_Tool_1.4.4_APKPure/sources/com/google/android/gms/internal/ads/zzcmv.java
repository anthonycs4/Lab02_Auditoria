package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcmv extends zzbck {
    private final Context zza;
    private final zzcct zzb;
    private final zzdnl zzc;
    private final zzdyc<zzeub, zzdzx> zzd;
    private final zzeed zze;
    private final zzdro zzf;
    private final zzcaw zzg;
    private final zzdnq zzh;
    private final zzdsf zzi;
    private boolean zzj = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmv(Context context, zzcct zzcctVar, zzdnl zzdnlVar, zzdyc<zzeub, zzdzx> zzdycVar, zzeed zzeedVar, zzdro zzdroVar, zzcaw zzcawVar, zzdnq zzdnqVar, zzdsf zzdsfVar) {
        this.zza = context;
        this.zzb = zzcctVar;
        this.zzc = zzdnlVar;
        this.zzd = zzdycVar;
        this.zze = zzeedVar;
        this.zzf = zzdroVar;
        this.zzg = zzcawVar;
        this.zzh = zzdnqVar;
        this.zzi = zzdsfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzs.zzg().zzl().zzH()) {
            if (com.google.android.gms.ads.internal.zzs.zzm().zze(this.zza, com.google.android.gms.ads.internal.zzs.zzg().zzl().zzJ(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzs.zzg().zzl().zzI(false);
            com.google.android.gms.ads.internal.zzs.zzg().zzl().zzK(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzbqz> zzf = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzn().zzf();
        if (zzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.zze.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            for (zzbqz zzbqzVar : zzf.values()) {
                for (zzbqy zzbqyVar : zzbqzVar.zza) {
                    String str = zzbqyVar.zzk;
                    for (String str2 : zzbqyVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzdyd<zzeub, zzdzx> zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzeub zzeubVar = zza.zzb;
                        if (!zzeubVar.zzn() && zzeubVar.zzq()) {
                            zzeubVar.zzr(this.zza, zza.zzc, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            com.google.android.gms.ads.internal.util.zze.zzd(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (zzetp e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    com.google.android.gms.ads.internal.util.zze.zzj(sb.toString(), e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final synchronized void zze() {
        if (this.zzj) {
            com.google.android.gms.ads.internal.util.zze.zzi("Mobile ads is initialized already.");
            return;
        }
        zzbfq.zza(this.zza);
        com.google.android.gms.ads.internal.zzs.zzg().zze(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzs.zzi().zza(this.zza);
        this.zzj = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcl)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzgj)).booleanValue()) {
            zzccz.zza.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcms
                private final zzcmv zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzs.zzh().zza(f);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final synchronized void zzg(String str) {
        zzbfq.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzck)).booleanValue()) {
                com.google.android.gms.ads.internal.zzs.zzk().zza(this.zza, this.zzb, str, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final synchronized void zzh(boolean z) {
        com.google.android.gms.ads.internal.zzs.zzh().zzc(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzc(str);
        zzauVar.zzd(this.zzb.zza);
        zzauVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzj(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        Runnable runnable;
        zzbfq.zza(this.zza);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcn)).booleanValue()) {
            com.google.android.gms.ads.internal.zzs.zzc();
            str2 = com.google.android.gms.ads.internal.util.zzr.zzv(this.zza);
        } else {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        boolean z = true;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzck)).booleanValue() | ((Boolean) zzbba.zzc().zzb(zzbfq.zzaB)).booleanValue();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaB)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.zzcmt
                private final zzcmv zza;
                private final Runnable zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final zzcmv zzcmvVar = this.zza;
                    final Runnable runnable3 = this.zzb;
                    zzccz.zze.execute(new Runnable(zzcmvVar, runnable3) { // from class: com.google.android.gms.internal.ads.zzcmu
                        private final zzcmv zza;
                        private final Runnable zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzcmvVar;
                            this.zzb = runnable3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(this.zzb);
                        }
                    });
                }
            };
        } else {
            z = booleanValue;
            runnable = null;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzs.zzk().zza(this.zza, this.zzb, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzs.zzh().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzs.zzh().zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final String zzm() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzn(String str) {
        this.zze.zzc(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzo(zzbre zzbreVar) throws RemoteException {
        this.zzc.zza(zzbreVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzp(zzbnq zzbnqVar) throws RemoteException {
        this.zzf.zzb(zzbnqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final List<zzbnj> zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzr(zzbes zzbesVar) throws RemoteException {
        this.zzg.zzc(this.zza, zzbesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbcl
    public final void zzt(zzbcx zzbcxVar) throws RemoteException {
        this.zzi.zzk(zzbcxVar, zzdse.API);
    }
}
