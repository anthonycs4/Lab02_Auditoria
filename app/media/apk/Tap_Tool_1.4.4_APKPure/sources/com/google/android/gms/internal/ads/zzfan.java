package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfan implements zzezs {
    private static final zzfan zza = new zzfan();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzj = new zzfaj();
    private static final Runnable zzk = new zzfak();
    private int zze;
    private long zzi;
    private final List<zzfam> zzd = new ArrayList();
    private final zzfag zzg = new zzfag();
    private final zzezu zzf = new zzezu();
    private final zzfah zzh = new zzfah(new zzfaq());

    zzfan() {
    }

    public static zzfan zzb() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzfan zzfanVar) {
        zzfanVar.zze = 0;
        zzfanVar.zzi = System.nanoTime();
        zzfanVar.zzg.zzd();
        long nanoTime = System.nanoTime();
        zzezt zza2 = zzfanVar.zzf.zza();
        if (zzfanVar.zzg.zzb().size() > 0) {
            Iterator<String> it = zzfanVar.zzg.zzb().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject zzb2 = zzfab.zzb(0, 0, 0, 0);
                View zzh = zzfanVar.zzg.zzh(next);
                zzezt zzb3 = zzfanVar.zzf.zzb();
                String zzc2 = zzfanVar.zzg.zzc(next);
                if (zzc2 != null) {
                    JSONObject zza3 = zzb3.zza(zzh);
                    zzfab.zzd(zza3, next);
                    zzfab.zze(zza3, zzc2);
                    zzfab.zzg(zzb2, zza3);
                }
                zzfab.zzh(zzb2);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                zzfanVar.zzh.zzb(zzb2, hashSet, nanoTime);
            }
        }
        if (zzfanVar.zzg.zza().size() > 0) {
            JSONObject zzb4 = zzfab.zzb(0, 0, 0, 0);
            zzfanVar.zzk(null, zza2, zzb4, 1);
            zzfab.zzh(zzb4);
            zzfanVar.zzh.zza(zzb4, zzfanVar.zzg.zza(), nanoTime);
        } else {
            zzfanVar.zzh.zzc();
        }
        zzfanVar.zzg.zze();
        long nanoTime2 = System.nanoTime() - zzfanVar.zzi;
        if (zzfanVar.zzd.size() > 0) {
            for (zzfam zzfamVar : zzfanVar.zzd) {
                int i = zzfanVar.zze;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfamVar.zzb();
                if (zzfamVar instanceof zzfal) {
                    int i2 = zzfanVar.zze;
                    ((zzfal) zzfamVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzezt zzeztVar, JSONObject jSONObject, int i) {
        zzeztVar.zzb(view, jSONObject, this, i == 1);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzk);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezs
    public final void zza(View view, zzezt zzeztVar, JSONObject jSONObject) {
        int zzj2;
        if (zzfae.zzb(view) != null || (zzj2 = this.zzg.zzj(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzeztVar.zza(view);
        zzfab.zzg(jSONObject, zza2);
        String zzg = this.zzg.zzg(view);
        if (zzg == null) {
            zzfaf zzi = this.zzg.zzi(view);
            if (zzi != null) {
                zzfab.zzf(zza2, zzi);
            }
            zzk(view, zzeztVar, zza2, zzj2);
        } else {
            zzfab.zzd(zza2, zzg);
            this.zzg.zzf();
        }
        this.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzj);
            zzc.postDelayed(zzk, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfai(this));
    }

    public final void zze() {
        zzl();
    }
}
