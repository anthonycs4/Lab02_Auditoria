package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdgu extends zzcsn {
    private final Executor zzc;
    private final zzdgz zzd;
    private final zzdhh zze;
    private final zzdhy zzf;
    private final zzdhe zzg;
    private final zzdhk zzh;
    private final zzgdk<zzdkz> zzi;
    private final zzgdk<zzdkx> zzj;
    private final zzgdk<zzdle> zzk;
    private final zzgdk<zzdkv> zzl;
    private final zzgdk<zzdlc> zzm;
    private zzdit zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private final zzcae zzr;
    private final zzfb zzs;
    private final zzcct zzt;
    private final Context zzu;
    private final zzdgw zzv;
    private final zzefh zzw;
    private final Map<String, Boolean> zzx;
    private final List<zzasj> zzy;
    private final zzask zzz;

    public zzdgu(zzcsm zzcsmVar, Executor executor, zzdgz zzdgzVar, zzdhh zzdhhVar, zzdhy zzdhyVar, zzdhe zzdheVar, zzdhk zzdhkVar, zzgdk<zzdkz> zzgdkVar, zzgdk<zzdkx> zzgdkVar2, zzgdk<zzdle> zzgdkVar3, zzgdk<zzdkv> zzgdkVar4, zzgdk<zzdlc> zzgdkVar5, zzcae zzcaeVar, zzfb zzfbVar, zzcct zzcctVar, Context context, zzdgw zzdgwVar, zzefh zzefhVar, zzask zzaskVar) {
        super(zzcsmVar);
        this.zzc = executor;
        this.zzd = zzdgzVar;
        this.zze = zzdhhVar;
        this.zzf = zzdhyVar;
        this.zzg = zzdheVar;
        this.zzh = zzdhkVar;
        this.zzi = zzgdkVar;
        this.zzj = zzgdkVar2;
        this.zzk = zzgdkVar3;
        this.zzl = zzgdkVar4;
        this.zzm = zzgdkVar5;
        this.zzr = zzcaeVar;
        this.zzs = zzfbVar;
        this.zzt = zzcctVar;
        this.zzu = context;
        this.zzv = zzdgwVar;
        this.zzw = zzefhVar;
        this.zzx = new HashMap();
        this.zzy = new ArrayList();
        this.zzz = zzaskVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO */
    public final synchronized void zzJ(zzdit zzditVar) {
        Iterator<String> keys;
        View view;
        zzex zzb;
        if (this.zzo) {
            return;
        }
        this.zzn = zzditVar;
        this.zzf.zza(zzditVar);
        this.zze.zza(zzditVar.zzbI(), zzditVar.zzk(), zzditVar.zzl(), zzditVar, zzditVar);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbE)).booleanValue() && (zzb = this.zzs.zzb()) != null) {
            zzb.zzh(zzditVar.zzbI());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbf)).booleanValue()) {
            zzess zzessVar = this.zzb;
            if (zzessVar.zzaf && (keys = zzessVar.zzae.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference<View> weakReference = this.zzn.zzj().get(next);
                    this.zzx.put(next, false);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        zzasj zzasjVar = new zzasj(this.zzu, view);
                        this.zzy.add(zzasjVar);
                        zzasjVar.zza(new zzdgt(this, next));
                    }
                }
            }
        }
        if (zzditVar.zzh() != null) {
            zzditVar.zzh().zza(this.zzr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzP */
    public final void zzI(zzdit zzditVar) {
        this.zze.zzb(zzditVar.zzbI(), zzditVar.zzj());
        if (zzditVar.zzbE() != null) {
            zzditVar.zzbE().setClickable(false);
            zzditVar.zzbE().removeAllViews();
        }
        if (zzditVar.zzh() != null) {
            zzditVar.zzh().zzb(this.zzr);
        }
        this.zzn = null;
    }

    public static boolean zzz(View view) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzgx)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        long zzA = com.google.android.gms.ads.internal.util.zzr.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzA >= ((Integer) zzbba.zzc().zzb(zzbfq.zzgy)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzA() {
        return this.zzg.zzc();
    }

    public final void zzB(String str, boolean z) {
        String str2;
        IObjectWrapper zze;
        zzbvj zzbvjVar;
        zzbvk zzbvkVar;
        if (this.zzg.zzd()) {
            zzcib zzT = this.zzd.zzT();
            zzcib zzR = this.zzd.zzR();
            if (zzT == null && zzR == null) {
                return;
            }
            if (zzT != null) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzT = zzR;
            }
            String str3 = str2;
            if (!com.google.android.gms.ads.internal.zzs.zzr().zza(this.zzu)) {
                com.google.android.gms.ads.internal.util.zze.zzi("Failed to initialize omid in InternalNativeAd");
                return;
            }
            zzcct zzcctVar = this.zzt;
            int i = zzcctVar.zzb;
            int i2 = zzcctVar.zzc;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdo)).booleanValue()) {
                if (zzR != null) {
                    zzbvjVar = zzbvj.VIDEO;
                    zzbvkVar = zzbvk.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbvjVar = zzbvj.NATIVE_DISPLAY;
                    if (this.zzd.zzv() == 3) {
                        zzbvkVar = zzbvk.UNSPECIFIED;
                    } else {
                        zzbvkVar = zzbvk.ONE_PIXEL;
                    }
                }
                zze = com.google.android.gms.ads.internal.zzs.zzr().zzg(sb2, zzT.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str3, str, zzbvkVar, zzbvjVar, this.zzb.zzag);
            } else {
                zze = com.google.android.gms.ads.internal.zzs.zzr().zze(sb2, zzT.zzG(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "javascript", str3, str);
            }
            if (zze == null) {
                com.google.android.gms.ads.internal.util.zze.zzi("Failed to create omid session in InternalNativeAd");
                return;
            }
            this.zzd.zzp(zze);
            zzT.zzak(zze);
            if (zzR != null) {
                com.google.android.gms.ads.internal.zzs.zzr().zzj(zze, zzR.zzH());
                this.zzq = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzs.zzr().zzh(zze);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdq)).booleanValue()) {
                    zzT.zze("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    public final boolean zzC() {
        return this.zzg.zzd();
    }

    public final void zzD(View view) {
        IObjectWrapper zzU = this.zzd.zzU();
        zzcib zzT = this.zzd.zzT();
        if (!this.zzg.zzd() || zzU == null || zzT == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzr().zzj(zzU, view);
    }

    public final void zzE(View view) {
        IObjectWrapper zzU = this.zzd.zzU();
        if (!this.zzg.zzd() || zzU == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzr().zzk(zzU, view);
    }

    public final zzdgw zzF() {
        return this.zzv;
    }

    public final synchronized void zzG(zzbdd zzbddVar) {
        this.zzw.zza(zzbddVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(boolean z) {
        this.zze.zzf(this.zzn.zzbI(), this.zzn.zzj(), this.zzn.zzk(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK() {
        this.zze.zzw();
        this.zzd.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzcsn
    public final void zzQ() {
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdgn
            private final zzdgu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
        if (this.zzd.zzv() != 7) {
            Executor executor = this.zzc;
            zzdhh zzdhhVar = this.zze;
            zzdhhVar.getClass();
            executor.execute(zzdgo.zza(zzdhhVar));
        }
        super.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcsn
    public final synchronized void zzR() {
        this.zzo = true;
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdgp
            private final zzdgu zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK();
            }
        });
        super.zzR();
    }

    public final synchronized void zza(String str) {
        this.zze.zzd(str);
    }

    public final synchronized void zzb() {
        if (this.zzp) {
            return;
        }
        this.zze.zzm();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zze.zze(bundle);
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzp) {
            return true;
        }
        boolean zzv = this.zze.zzv(bundle);
        this.zzp = zzv;
        return zzv;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zze.zzk(bundle);
    }

    public final synchronized void zzg(final zzdit zzditVar) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbe)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, zzditVar) { // from class: com.google.android.gms.internal.ads.zzdgq
                private final zzdgu zza;
                private final zzdit zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzditVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(this.zzb);
                }
            });
        } else {
            zzJ(zzditVar);
        }
    }

    public final synchronized void zzh(final zzdit zzditVar) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbe)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, zzditVar) { // from class: com.google.android.gms.internal.ads.zzdgr
                private final zzdgu zza;
                private final zzdit zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzditVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzI(this.zzb);
                }
            });
        } else {
            zzI(zzditVar);
        }
    }

    public final synchronized void zzj(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzf.zzb(this.zzn);
        this.zze.zzc(view, view2, map, map2, z);
        if (this.zzq) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcd)).booleanValue() && this.zzd.zzR() != null) {
                this.zzd.zzR().zze("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zze.zzj(view, motionEvent, view2);
    }

    public final synchronized void zzp(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzp) {
            return;
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbf)).booleanValue() && this.zzb.zzaf) {
            for (String str : this.zzx.keySet()) {
                if (!this.zzx.get(str).booleanValue()) {
                    return;
                }
            }
        }
        if (z) {
            this.zzf.zzc(this.zzn);
            this.zze.zzt(view, map, map2);
            this.zzp = true;
            return;
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzci)).booleanValue() && map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null && zzz(view2)) {
                    this.zzf.zzc(this.zzn);
                    this.zze.zzt(view, map, map2);
                    this.zzp = true;
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzq(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.zze.zzl(view, map, map2);
    }

    public final synchronized void zzr(View view) {
        this.zze.zzn(view);
    }

    public final synchronized void zzs(zzbka zzbkaVar) {
        this.zze.zzo(zzbkaVar);
    }

    public final synchronized void zzt() {
        this.zze.zzp();
    }

    public final synchronized void zzu(zzbct zzbctVar) {
        this.zze.zzq(zzbctVar);
    }

    public final synchronized void zzv(zzbcp zzbcpVar) {
        this.zze.zzr(zzbcpVar);
    }

    public final synchronized void zzw() {
        this.zze.zzg();
    }

    public final synchronized void zzx() {
        zzdit zzditVar = this.zzn;
        if (zzditVar == null) {
            com.google.android.gms.ads.internal.util.zze.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzditVar instanceof zzdhs;
        this.zzc.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzdgs
            private final zzdgu zza;
            private final boolean zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzH(this.zzb);
            }
        });
    }

    public final synchronized boolean zzy() {
        return this.zze.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzN() {
        try {
            int zzv = this.zzd.zzv();
            if (zzv == 1) {
                if (this.zzh.zza() != null) {
                    zzB("Google", true);
                    this.zzh.zza().zze(this.zzi.zzb());
                }
            } else if (zzv == 2) {
                if (this.zzh.zzb() != null) {
                    zzB("Google", true);
                    this.zzh.zzb().zze(this.zzj.zzb());
                }
            } else if (zzv == 3) {
                if (this.zzh.zzf(this.zzd.zzQ()) != null) {
                    if (this.zzd.zzR() != null) {
                        zzB("Google", true);
                    }
                    this.zzh.zzf(this.zzd.zzQ()).zze(this.zzm.zzb());
                }
            } else if (zzv == 6) {
                if (this.zzh.zzc() != null) {
                    zzB("Google", true);
                    this.zzh.zzc().zze(this.zzk.zzb());
                }
            } else if (zzv != 7) {
                com.google.android.gms.ads.internal.util.zze.zzf("Wrong native template id!");
            } else if (this.zzh.zze() != null) {
                this.zzh.zze().zze(this.zzl.zzb());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}
