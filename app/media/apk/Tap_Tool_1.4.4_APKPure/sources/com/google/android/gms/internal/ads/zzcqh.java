package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcqh extends zzcsn {
    private final zzcib zzc;
    private final int zzd;
    private final Context zze;
    private final zzcpp zzf;
    private final zzdez zzg;
    private boolean zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqh(zzcsm zzcsmVar, Context context, zzcib zzcibVar, int i, zzcpp zzcppVar, zzdez zzdezVar) {
        super(zzcsmVar);
        this.zzh = false;
        this.zzc = zzcibVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcppVar;
        this.zzg = zzdezVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsn
    public final void zzR() {
        super.zzR();
        zzcib zzcibVar = this.zzc;
        if (zzcibVar != null) {
            zzcibVar.destroy();
        }
    }

    public final void zza(zzatv zzatvVar) {
        zzcib zzcibVar = this.zzc;
        if (zzcibVar != null) {
            zzcibVar.zzax(zzatvVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(android.app.Activity r3, com.google.android.gms.internal.ads.zzaui r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            com.google.android.gms.internal.ads.zzbfi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbfq.zzar
            com.google.android.gms.internal.ads.zzbfo r1 = com.google.android.gms.internal.ads.zzbba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.google.android.gms.ads.internal.zzs.zzc()
            boolean r0 = com.google.android.gms.ads.internal.util.zzr.zzJ(r3)
            if (r0 == 0) goto L5d
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.zze.zzi(r5)
            r5 = 11
            r0 = 0
            com.google.android.gms.internal.ads.zzazm r5 = com.google.android.gms.internal.ads.zzeuf.zzd(r5, r0, r0)
            r4.zze(r5)
            com.google.android.gms.internal.ads.zzbfi<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzbfq.zzas
            com.google.android.gms.internal.ads.zzbfo r5 = com.google.android.gms.internal.ads.zzbba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7b
            com.google.android.gms.internal.ads.zzfbm r4 = new com.google.android.gms.internal.ads.zzfbm
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbw r5 = com.google.android.gms.ads.internal.zzs.zzq()
            android.os.Looper r5 = r5.zza()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzete r3 = r2.zza
            com.google.android.gms.internal.ads.zzetd r3 = r3.zzb
            com.google.android.gms.internal.ads.zzesv r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L5d:
            boolean r0 = r2.zzh
            if (r0 == 0) goto L66
            java.lang.String r0 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.zze.zzi(r0)
        L66:
            boolean r0 = r2.zzh
            if (r0 != 0) goto L7b
            com.google.android.gms.internal.ads.zzdez r0 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdey -> L73
            r0.zza(r5, r3)     // Catch: com.google.android.gms.internal.ads.zzdey -> L73
            r3 = 1
            r2.zzh = r3
            return
        L73:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzazm r3 = com.google.android.gms.internal.ads.zzeuf.zza(r3)
            r4.zze(r3)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqh.zzb(android.app.Activity, com.google.android.gms.internal.ads.zzaui, boolean):void");
    }

    public final int zzc() {
        return this.zzd;
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
