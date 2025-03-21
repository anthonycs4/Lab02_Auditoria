package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcpw;
import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcvp;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzeod<AppOpenAd extends zzcsn, AppOpenRequestComponent extends zzcpw<AppOpenAd>, AppOpenRequestComponentBuilder extends zzcvp<AppOpenRequestComponent>> implements zzefu<AppOpenAd> {
    protected final zzcjz zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzeoq zzd;
    private final zzeqj<AppOpenRequestComponent, AppOpenAd> zze;
    private final ViewGroup zzf;
    private final zzetj zzg;
    @Nullable
    private zzfla<AppOpenAd> zzh;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzeod(Context context, Executor executor, zzcjz zzcjzVar, zzeqj<AppOpenRequestComponent, AppOpenAd> zzeqjVar, zzeoq zzeoqVar, zzetj zzetjVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcjzVar;
        this.zze = zzeqjVar;
        this.zzd = zzeoqVar;
        this.zzg = zzetjVar;
        this.zzf = new FrameLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfla zzf(zzeod zzeodVar, zzfla zzflaVar) {
        zzeodVar.zzh = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl */
    public final synchronized AppOpenRequestComponentBuilder zzk(zzeqh zzeqhVar) {
        zzeoc zzeocVar = (zzeoc) zzeqhVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfu)).booleanValue()) {
            zzcql zzcqlVar = new zzcql(this.zzf);
            zzcvs zzcvsVar = new zzcvs();
            zzcvsVar.zza(this.zzb);
            zzcvsVar.zzb(zzeocVar.zza);
            return zzc(zzcqlVar, zzcvsVar.zzd(), new zzdbg().zzm());
        }
        zzeoq zzf = zzeoq.zzf(this.zzd);
        zzdbg zzdbgVar = new zzdbg();
        zzdbgVar.zzc(zzf, this.zzc);
        zzdbgVar.zzh(zzf, this.zzc);
        zzdbgVar.zzi(zzf, this.zzc);
        zzdbgVar.zzj(zzf, this.zzc);
        zzdbgVar.zzk(zzf);
        zzcql zzcqlVar2 = new zzcql(this.zzf);
        zzcvs zzcvsVar2 = new zzcvs();
        zzcvsVar2.zza(this.zzb);
        zzcvsVar2.zzb(zzeocVar.zza);
        return zzc(zzcqlVar2, zzcvsVar2.zzd(), zzdbgVar.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final synchronized boolean zza(zzazs zzazsVar, String str, zzefs zzefsVar, zzeft<? super AppOpenAd> zzeftVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeny
                private final zzeod zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze();
                }
            });
            return false;
        } else if (this.zzh != null) {
            return false;
        } else {
            zzeua.zzb(this.zzb, zzazsVar.zzf);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzazsVar.zzf) {
                this.zza.zzz().zzc(true);
            }
            zzetj zzetjVar = this.zzg;
            zzetjVar.zzf(str);
            zzetjVar.zzc(zzazx.zzd());
            zzetjVar.zza(zzazsVar);
            zzetk zzu = zzetjVar.zzu();
            zzeoc zzeocVar = new zzeoc(null);
            zzeocVar.zza = zzu;
            zzfla<AppOpenAd> zzb = this.zze.zzb(new zzeqk(zzeocVar, null), new zzeqi(this) { // from class: com.google.android.gms.internal.ads.zzenz
                private final zzeod zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.internal.ads.zzeqi
                public final zzcvp zza(zzeqh zzeqhVar) {
                    return this.zza.zzk(zzeqhVar);
                }
            });
            this.zzh = zzb;
            zzfks.zzp(zzb, new zzeob(this, zzeftVar, zzeocVar), this.zzc);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zzb() {
        zzfla<AppOpenAd> zzflaVar = this.zzh;
        return (zzflaVar == null || zzflaVar.isDone()) ? false : true;
    }

    protected abstract AppOpenRequestComponentBuilder zzc(zzcql zzcqlVar, zzcvt zzcvtVar, zzdbh zzdbhVar);

    public final void zzd(zzbad zzbadVar) {
        this.zzg.zzo(zzbadVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzd.zzbM(zzeuf.zzd(6, null, null));
    }
}
