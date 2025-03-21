package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdqj implements zzcyy, zzazi, zzcwh, zzcwz, zzcxa, zzcxt, zzcwk, zzajc, zzexm {
    private final List<Object> zza;
    private final zzdpy zzb;
    private long zzc;

    public zzdqj(zzdpy zzdpyVar, zzcjz zzcjzVar) {
        this.zzb = zzdpyVar;
        this.zza = Collections.singletonList(zzcjzVar);
    }

    private final void zzi(Class<?> cls, String str, Object... objArr) {
        zzdpy zzdpyVar = this.zzb;
        List<Object> list = this.zza;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzdpyVar.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        zzi(zzazi.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, String str2) {
        zzi(zzajc.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzb(Context context) {
        zzi(zzcxa.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbA(Context context) {
        zzi(zzcxa.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(zzazm zzazmVar) {
        zzi(zzcwk.class, "onAdFailedToLoad", Integer.valueOf(zzazmVar.zza), zzazmVar.zzb, zzazmVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzbN() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime - j);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(zzcxt.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbO(zzexf zzexfVar, String str) {
        zzi(zzexe.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbP(zzexf zzexfVar, String str) {
        zzi(zzexe.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbQ(zzexf zzexfVar, String str, Throwable th) {
        zzi(zzexe.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzexm
    public final void zzbR(zzexf zzexfVar, String str) {
        zzi(zzexe.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final void zzbx(Context context) {
        zzi(zzcxa.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        zzi(zzcwz.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
        zzi(zzcwh.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
        zzi(zzcwh.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
        zzi(zzcwh.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    @ParametersAreNonnullByDefault
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
        zzi(zzcwh.class, "onRewarded", zzbxvVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
        zzi(zzcwh.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
        zzi(zzcwh.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
        this.zzc = com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime();
        zzi(zzcyy.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
    }
}
