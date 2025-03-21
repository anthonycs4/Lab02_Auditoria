package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzepe implements zzefu<zzcqo> {
    private final Context zza;
    private final Executor zzb;
    private final zzcjz zzc;
    private final zzefe zzd;
    private final zzefi zze;
    private final ViewGroup zzf;
    private zzbgl zzg;
    private final zzcyt zzh;
    private final zzetj zzi;
    private zzfla<zzcqo> zzj;

    public zzepe(Context context, Executor executor, zzazx zzazxVar, zzcjz zzcjzVar, zzefe zzefeVar, zzefi zzefiVar, zzetj zzetjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjzVar;
        this.zzd = zzefeVar;
        this.zze = zzefiVar;
        this.zzi = zzetjVar;
        this.zzh = zzcjzVar.zzh();
        this.zzf = new FrameLayout(context);
        zzetjVar.zzc(zzazxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfla zzk(zzepe zzepeVar, zzfla zzflaVar) {
        zzepeVar.zzj = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zza(zzazs zzazsVar, String str, zzefs zzefsVar, zzeft<? super zzcqo> zzeftVar) throws RemoteException {
        zzcrl zza;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzepa
                private final zzepe zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            });
            return false;
        } else if (zzb()) {
            return false;
        } else {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzazsVar.zzf) {
                this.zzc.zzz().zzc(true);
            }
            zzetj zzetjVar = this.zzi;
            zzetjVar.zzf(str);
            zzetjVar.zza(zzazsVar);
            zzetk zzu = zzetjVar.zzu();
            if (zzbhg.zzc.zze().booleanValue() && this.zzi.zze().zzk) {
                zzefe zzefeVar = this.zzd;
                if (zzefeVar != null) {
                    zzefeVar.zzbM(zzeuf.zzd(7, null, null));
                }
                return false;
            }
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzft)).booleanValue()) {
                zzcrk zzk = this.zzc.zzk();
                zzcvs zzcvsVar = new zzcvs();
                zzcvsVar.zza(this.zza);
                zzcvsVar.zzb(zzu);
                zzk.zzj(zzcvsVar.zzd());
                zzdbg zzdbgVar = new zzdbg();
                zzdbgVar.zzl(this.zzd, this.zzb);
                zzdbgVar.zze(this.zzd, this.zzb);
                zzk.zzk(zzdbgVar.zzm());
                zzk.zze(new zzedp(this.zzg));
                zzk.zzb(new zzdfi(zzdhk.zza, null));
                zzk.zzd(new zzcsh(this.zzh));
                zzk.zzc(new zzcql(this.zzf));
                zza = zzk.zza();
            } else {
                zzcrk zzk2 = this.zzc.zzk();
                zzcvs zzcvsVar2 = new zzcvs();
                zzcvsVar2.zza(this.zza);
                zzcvsVar2.zzb(zzu);
                zzk2.zzj(zzcvsVar2.zzd());
                zzdbg zzdbgVar2 = new zzdbg();
                zzdbgVar2.zzl(this.zzd, this.zzb);
                zzdbgVar2.zzf(this.zzd, this.zzb);
                zzdbgVar2.zzf(this.zze, this.zzb);
                zzdbgVar2.zzg(this.zzd, this.zzb);
                zzdbgVar2.zza(this.zzd, this.zzb);
                zzdbgVar2.zzb(this.zzd, this.zzb);
                zzdbgVar2.zzc(this.zzd, this.zzb);
                zzdbgVar2.zze(this.zzd, this.zzb);
                zzdbgVar2.zzj(this.zzd, this.zzb);
                zzk2.zzk(zzdbgVar2.zzm());
                zzk2.zze(new zzedp(this.zzg));
                zzk2.zzb(new zzdfi(zzdhk.zza, null));
                zzk2.zzd(new zzcsh(this.zzh));
                zzk2.zzc(new zzcql(this.zzf));
                zza = zzk2.zza();
            }
            zzctq<zzcqo> zzb = zza.zzb();
            zzfla<zzcqo> zzc = zzb.zzc(zzb.zzb());
            this.zzj = zzc;
            zzfks.zzp(zzc, new zzepd(this, zzeftVar, zza), this.zzb);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zzb() {
        zzfla<zzcqo> zzflaVar = this.zzj;
        return (zzflaVar == null || zzflaVar.isDone()) ? false : true;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final void zzd(zzbgl zzbglVar) {
        this.zzg = zzbglVar;
    }

    public final void zze(zzbbe zzbbeVar) {
        this.zze.zza(zzbbeVar);
    }

    public final zzetj zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        ViewParent parent = this.zzf.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            com.google.android.gms.ads.internal.zzs.zzc();
            return com.google.android.gms.ads.internal.util.zzr.zzY(view, view.getContext());
        }
        return false;
    }

    public final void zzh(zzcyu zzcyuVar) {
        this.zzh.zzh(zzcyuVar, this.zzb);
    }

    public final void zzi() {
        this.zzh.zzd(60);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zzd.zzbM(zzeuf.zzd(6, null, null));
    }
}
