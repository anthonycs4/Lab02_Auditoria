package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbot implements zzbol, zzboi {
    private final zzcib zza;

    public zzbot(Context context, zzcct zzcctVar, zzfb zzfbVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcim {
        com.google.android.gms.ads.internal.zzs.zzd();
        zzcib zza = zzcin.zza(context, zzcjr.zzb(), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false, null, null, zzcctVar, null, null, null, zzavg.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzbay.zza();
        if (zzccg.zzp()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzr.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zza(final String str) {
        zzs(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbom
            private final zzbot zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzb(String str, String str2) {
        zzboh.zzb(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzc(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable(this, format) { // from class: com.google.android.gms.internal.ads.zzbon
            private final zzbot zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = format;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzd(String str, JSONObject jSONObject) {
        zzboh.zzc(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zze(String str, Map map) {
        zzboh.zzd(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzf(final String str) {
        zzs(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbop
            private final zzbot zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzg(final String str) {
        zzs(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzboo
            private final zzbot zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzh(zzbok zzbokVar) {
        this.zza.zzR().zzx(zzbor.zza(zzbokVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zzi() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final boolean zzj() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final zzbps zzk() {
        return new zzbps(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzl(String str, zzblp<? super zzbpr> zzblpVar) {
        this.zza.zzab(str, new zzbos(this, zzblpVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzm(String str, final zzblp<? super zzbpr> zzblpVar) {
        this.zza.zzad(str, new Predicate(zzblpVar) { // from class: com.google.android.gms.internal.ads.zzboq
            private final zzblp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzblpVar;
            }

            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzblp zzblpVar2;
                zzblp zzblpVar3 = this.zza;
                zzblp zzblpVar4 = (zzblp) obj;
                if (zzblpVar4 instanceof zzbos) {
                    zzblpVar2 = ((zzbos) zzblpVar4).zzb;
                    return zzblpVar2.equals(zzblpVar3);
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(String str, JSONObject jSONObject) {
        zzboh.zza(this, str, jSONObject);
    }
}
