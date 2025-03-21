package com.google.android.gms.internal.ads;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzcjz implements zzcnm {
    private static zzcjz zza;

    public static zzcjz zza(Context context, zzbre zzbreVar, int i) {
        zzcjz zzb = zzb(context, i);
        zzb.zzi().zza(zzbreVar);
        return zzb;
    }

    @Deprecated
    public static zzcjz zzb(Context context, int i) {
        synchronized (zzcjz.class) {
            zzcjz zzcjzVar = zza;
            return zzcjzVar != null ? zzcjzVar : zzc(new zzcct(ModuleDescriptor.MODULE_VERSION, i, true, false), context, new zzcky());
        }
    }

    @Deprecated
    public static synchronized zzcjz zzc(zzcct zzcctVar, Context context, zzcml zzcmlVar) {
        zzcjz zzcjzVar;
        synchronized (zzcjz.class) {
            if (zza == null) {
                zzclt zzcltVar = new zzclt(null);
                zzckb zzckbVar = new zzckb();
                zzckbVar.zza(zzcctVar);
                zzckbVar.zzb(context);
                zzcltVar.zza(new zzckc(zzckbVar, null));
                zzcltVar.zzb(new zzcmm(zzcmlVar));
                zza = zzcltVar.zzc();
                zzbfq.zza(context);
                com.google.android.gms.ads.internal.zzs.zzg().zze(context, zzcctVar);
                com.google.android.gms.ads.internal.zzs.zzi().zza(context);
                com.google.android.gms.ads.internal.zzs.zzc().zzc(context);
                com.google.android.gms.ads.internal.zzs.zzc().zzd(context);
                com.google.android.gms.ads.internal.zzs.zzc().zzn(context);
                com.google.android.gms.ads.internal.util.zzd.zza(context);
                com.google.android.gms.ads.internal.zzs.zzf().zza(context);
                com.google.android.gms.ads.internal.zzs.zzc();
                if (PlatformVersion.isAtLeastO() && !Arrays.asList(context.databaseList()).contains("AdMobOfflineBufferedPings.db")) {
                    ((NotificationManager) context.getSystemService("notification")).deleteNotificationChannel("offline_notification_channel");
                }
                com.google.android.gms.ads.internal.zzs.zzx().zza(context);
                zzcax.zzd(context);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue()) {
                    if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzap)).booleanValue()) {
                        zzavg zzavgVar = new zzavg(new zzavm(context));
                        zzdwo zzdwoVar = new zzdwo(new zzdwk(context), zza.zzg());
                        com.google.android.gms.ads.internal.zzs.zzc();
                        new zzdxg(context, zzcctVar, zzavgVar, zzdwoVar, UUID.randomUUID().toString(), zza.zzd()).zza(com.google.android.gms.ads.internal.zzs.zzg().zzl().zzB());
                    }
                }
            }
            zzcjzVar = zza;
        }
        return zzcjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final zzelv zzA(zzbxf zzbxfVar, int i) {
        return zzB(new zzenc(zzbxfVar, i));
    }

    protected abstract zzelv zzB(zzenc zzencVar);

    public abstract zzdqu zzC();

    public abstract zzexv zzd();

    public abstract Executor zze();

    public abstract ScheduledExecutorService zzf();

    public abstract zzflb zzg();

    public abstract zzcyt zzh();

    public abstract zzdnl zzi();

    public abstract zzcmv zzj();

    public abstract zzcrk zzk();

    public abstract zzepg zzl();

    public abstract zzcpq zzm();

    public abstract zzcqb zzn();

    public abstract zzenw zzo();

    public abstract zzdeq zzp();

    public abstract zzeqz zzq();

    public abstract zzdfm zzr();

    public abstract zzdmf zzs();

    public abstract zzesl zzt();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zze zzu();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzt zzv();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzb zzw();

    public abstract zzdxw zzx();

    public abstract zzeuc<zzdlt> zzy();

    public abstract zzdsf zzz();
}
