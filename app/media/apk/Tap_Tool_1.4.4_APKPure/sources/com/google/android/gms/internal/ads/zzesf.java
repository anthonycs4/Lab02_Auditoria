package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesf implements zzefu<zzdmb> {
    private final Context zza;
    private final Executor zzb;
    private final zzcjz zzc;
    private final zzerw zzd;
    private final zzeqj<zzdmg, zzdmb> zze;
    private final zzetf zzf;
    private final zzetj zzg;
    private zzfla<zzdmb> zzh;

    public zzesf(Context context, Executor executor, zzcjz zzcjzVar, zzeqj<zzdmg, zzdmb> zzeqjVar, zzerw zzerwVar, zzetj zzetjVar, zzetf zzetfVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjzVar;
        this.zze = zzeqjVar;
        this.zzd = zzerwVar;
        this.zzg = zzetjVar;
        this.zzf = zzetfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj */
    public final zzdmf zzh(zzeqh zzeqhVar) {
        zzese zzeseVar = (zzese) zzeqhVar;
        zzdmf zzs = this.zzc.zzs();
        zzcvs zzcvsVar = new zzcvs();
        zzcvsVar.zza(this.zza);
        zzcvsVar.zzb(zzeseVar.zza);
        String str = zzeseVar.zzb;
        zzcvsVar.zze(this.zzf);
        zzs.zzb(zzcvsVar.zzd());
        zzs.zzc(new zzdbg().zzm());
        return zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zza(zzazs zzazsVar, String str, zzefs zzefsVar, zzeft<? super zzdmb> zzeftVar) throws RemoteException {
        zzbyc zzbycVar = new zzbyc(zzazsVar, str);
        if (zzbycVar.zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzerz
                private final zzesf zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        } else {
            zzfla<zzdmb> zzflaVar = this.zzh;
            if (zzflaVar == null || zzflaVar.isDone()) {
                zzeua.zzb(this.zza, zzbycVar.zza.zzf);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfU)).booleanValue() && zzbycVar.zza.zzf) {
                    this.zzc.zzz().zzc(true);
                }
                zzetj zzetjVar = this.zzg;
                zzetjVar.zzf(zzbycVar.zzb);
                zzetjVar.zzc(zzazx.zzc());
                zzetjVar.zza(zzbycVar.zza);
                zzetk zzu = zzetjVar.zzu();
                zzese zzeseVar = new zzese(null);
                zzeseVar.zza = zzu;
                zzeseVar.zzb = null;
                zzfla<zzdmb> zzb = this.zze.zzb(new zzeqk(zzeseVar, null), new zzeqi(this) { // from class: com.google.android.gms.internal.ads.zzesa
                    private final zzesf zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzeqi
                    public final zzcvp zza(zzeqh zzeqhVar) {
                        return this.zza.zzh(zzeqhVar);
                    }
                });
                this.zzh = zzb;
                zzfks.zzp(zzb, new zzesd(this, zzeftVar, zzeseVar), this.zzb);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzefu
    public final boolean zzb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zzd.zzbM(zzeuf.zzd(6, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i) {
        this.zzg.zzi().zza(i);
    }
}
