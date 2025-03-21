package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcle extends zzelv {
    final /* synthetic */ zzcmk zza;
    private final zzenc zzb;
    private final zzgeb<Integer> zzc;
    private final zzgeb<zzels> zzd;
    private final zzgeb<String> zze;
    private final zzgeb<zzemb> zzf;
    private final zzgeb<zzemh> zzg;
    private final zzgeb<zzeml> zzh;
    private final zzgeb<zzems> zzi;
    private final zzgeb<zzemz> zzj;
    private final zzgeb<zzenl> zzk;
    private final zzgeb<String> zzl;
    private final zzgeb<zzdow> zzm;
    private final zzgeb<zzdow> zzn;
    private final zzgeb<zzdow> zzo;
    private final zzgeb<zzdow> zzp;
    private final zzgeb<Map<zzexf, zzdow>> zzq;
    private final zzgeb<Set<zzdcx<zzexm>>> zzr;
    private final zzgeb<Set<zzdcx<zzexm>>> zzs;
    private final zzgeb zzt;
    private final zzgeb<zzexl> zzu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcle(zzcmk zzcmkVar, zzenc zzencVar, zzckz zzckzVar) {
        zzcnk zzcnkVar;
        zzgeb zzgebVar;
        zzgeb zzgebVar2;
        zzckq zzckqVar;
        zzgeb zzgebVar3;
        zzcnk zzcnkVar2;
        zzgeb zzgebVar4;
        zzgeb zzgebVar5;
        zzgeb zzgebVar6;
        zzcne zzcneVar;
        zzgeb zzgebVar7;
        zzcng zzcngVar;
        zzcni zzcniVar;
        zzgeb zzgebVar8;
        zzgeb zzgebVar9;
        zzgeb zzgebVar10;
        zzgeb zzgebVar11;
        this.zza = zzcmkVar;
        this.zzb = zzencVar;
        zzene zzeneVar = new zzene(zzencVar);
        this.zzc = zzeneVar;
        zzcnkVar = zzcnj.zza;
        zzgebVar = zzcmkVar.zzg;
        zzgebVar2 = zzcmkVar.zzm;
        this.zzd = new zzelu(zzcnkVar, zzgebVar, zzgebVar2, zzewh.zza(), zzeneVar);
        zzend zzendVar = new zzend(zzencVar);
        this.zze = zzendVar;
        zzckqVar = zzckp.zza;
        zzgebVar3 = zzcmkVar.zzg;
        this.zzf = new zzemd(zzckqVar, zzgebVar3, zzendVar, zzewh.zza());
        zzcnkVar2 = zzcnj.zza;
        zzgebVar4 = zzcmkVar.zzg;
        zzgebVar5 = zzcmkVar.zzX;
        zzgebVar6 = zzcmkVar.zzm;
        this.zzg = new zzemj(zzcnkVar2, zzeneVar, zzgebVar4, zzgebVar5, zzgebVar6, zzewh.zza());
        zzcneVar = zzcnd.zza;
        zzewh zza = zzewh.zza();
        zzgebVar7 = zzcmkVar.zzg;
        this.zzh = new zzemn(zzcneVar, zza, zzgebVar7);
        zzcngVar = zzcnf.zza;
        this.zzi = new zzemu(zzcngVar, zzewh.zza(), zzendVar);
        zzcniVar = zzcnh.zza;
        zzgebVar8 = zzcmkVar.zzm;
        zzgebVar9 = zzcmkVar.zzg;
        this.zzj = new zzenb(zzcniVar, zzgebVar8, zzgebVar9);
        this.zzk = new zzenn(zzewh.zza());
        zzenf zzenfVar = new zzenf(zzencVar);
        this.zzl = zzenfVar;
        zzgeb<zzdow> zza2 = zzgdp.zza(zzdop.zza());
        this.zzm = zza2;
        zzgeb<zzdow> zza3 = zzgdp.zza(zzdon.zza());
        this.zzn = zza3;
        zzgeb<zzdow> zza4 = zzgdp.zza(zzdor.zza());
        this.zzo = zza4;
        zzgeb<zzdow> zza5 = zzgdp.zza(zzdot.zza());
        this.zzp = zza5;
        zzgdt zzc = zzgdu.zzc(4);
        zzc.zza(zzexf.GMS_SIGNALS, zza2);
        zzc.zza(zzexf.BUILD_URL, zza3);
        zzc.zza(zzexf.HTTP, zza4);
        zzc.zza(zzexf.PRE_PROCESS, zza5);
        zzgdu zzb = zzc.zzb();
        this.zzq = zzb;
        zzgebVar10 = zzcmkVar.zzg;
        zzgeb<Set<zzdcx<zzexm>>> zza6 = zzgdp.zza(new zzdou(zzenfVar, zzgebVar10, zzewh.zza(), zzb));
        this.zzr = zza6;
        zzgdy zza7 = zzgdz.zza(0, 1);
        zza7.zzb(zza6);
        zzgdz zzc2 = zza7.zzc();
        this.zzs = zzc2;
        zzexo zzexoVar = new zzexo(zzc2);
        this.zzt = zzexoVar;
        zzewh zza8 = zzewh.zza();
        zzgebVar11 = zzcmkVar.zzm;
        this.zzu = zzgdp.zza(new zzexn(zza8, zzgebVar11, zzexoVar));
    }

    private final zzemw zzd() {
        zzbfc zzbfcVar = new zzbfc();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        List<String> zzd = this.zzb.zzd();
        zzgdw.zzb(zzd);
        return new zzemw(zzbfcVar, zzflbVar, zzd, null);
    }

    private final zzely zze() {
        zzcbr zzcbrVar = new zzcbr();
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        String zzb = this.zzb.zzb();
        zzgdw.zzb(zzb);
        return new zzely(zzcbrVar, zzflbVar, zzb, this.zzb.zzc(), this.zzb.zzf(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzelv
    public final zzelg<JSONObject> zza() {
        zzgeb zzgebVar;
        zzgeb zzgebVar2;
        zzckc zzckcVar;
        zzgeb zzgebVar3;
        zzckc zzckcVar2;
        zzgeb zzgebVar4;
        zzgeb zzgebVar5;
        zzgeb zzgebVar6;
        zzckc zzckcVar3;
        zzckc zzckcVar4;
        zzckc zzckcVar5;
        zzgeb zzgebVar7;
        zzgeb zzgebVar8;
        zzgeb zzgebVar9;
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        zzcbp zzcbpVar = new zzcbp();
        zzflb zzflbVar2 = zzccz.zza;
        zzgdw.zzb(zzflbVar2);
        String zza = this.zzb.zza();
        zzgdw.zzb(zza);
        zzems zzemsVar = new zzems(zzcbpVar, zzflbVar2, zza, null);
        zzgebVar = this.zza.zzm;
        zzejw zzejwVar = new zzejw(zzemsVar, 0L, (ScheduledExecutorService) zzgebVar.zzb());
        zzbvq zzbvqVar = new zzbvq();
        zzgebVar2 = this.zza.zzm;
        zzckcVar = this.zza.zza;
        Context zza2 = zzckcVar.zza();
        zzgdw.zzb(zza2);
        zzemz zzemzVar = new zzemz(zzbvqVar, (ScheduledExecutorService) zzgebVar2.zzb(), zza2, null);
        zzgebVar3 = this.zza.zzm;
        zzejw zzejwVar2 = new zzejw(zzemzVar, ((Long) zzbba.zzc().zzb(zzbfq.zzcp)).longValue(), (ScheduledExecutorService) zzgebVar3.zzb());
        zzcbr zzcbrVar = new zzcbr();
        zzckcVar2 = this.zza.zza;
        Context zza3 = zzckcVar2.zza();
        zzgdw.zzb(zza3);
        zzgebVar4 = this.zza.zzm;
        zzflb zzflbVar3 = zzccz.zza;
        zzgdw.zzb(zzflbVar3);
        zzels zzelsVar = new zzels(zzcbrVar, zza3, (ScheduledExecutorService) zzgebVar4.zzb(), zzflbVar3, this.zzb.zzf(), null);
        zzgebVar5 = this.zza.zzm;
        zzejw zzejwVar3 = new zzejw(zzelsVar, 0L, (ScheduledExecutorService) zzgebVar5.zzb());
        zzflb zzflbVar4 = zzccz.zza;
        zzgdw.zzb(zzflbVar4);
        zzenl zzenlVar = new zzenl(zzflbVar4);
        zzgebVar6 = this.zza.zzm;
        zzejw zzejwVar4 = new zzejw(zzenlVar, 0L, (ScheduledExecutorService) zzgebVar6.zzb());
        zzeld<? extends zzelc<JSONObject>> zza4 = zzeni.zza();
        zzckcVar3 = this.zza.zza;
        Context zza5 = zzckcVar3.zza();
        zzgdw.zzb(zza5);
        String zza6 = this.zzb.zza();
        zzgdw.zzb(zza6);
        zzflb zzflbVar5 = zzccz.zza;
        zzgdw.zzb(zzflbVar5);
        zzemb zzembVar = new zzemb(null, zza5, zza6, zzflbVar5);
        zzauv zzauvVar = new zzauv();
        zzflb zzflbVar6 = zzccz.zza;
        zzgdw.zzb(zzflbVar6);
        zzckcVar4 = this.zza.zza;
        Context zza7 = zzckcVar4.zza();
        zzgdw.zzb(zza7);
        zzcbr zzcbrVar2 = new zzcbr();
        int zzf = this.zzb.zzf();
        zzckcVar5 = this.zza.zza;
        Context zza8 = zzckcVar5.zza();
        zzgdw.zzb(zza8);
        zzgebVar7 = this.zza.zzX;
        zzcby zzcbyVar = (zzcby) zzgebVar7.zzb();
        zzgebVar8 = this.zza.zzm;
        zzflb zzflbVar7 = zzccz.zza;
        zzgdw.zzb(zzflbVar7);
        zzgebVar9 = this.zza.zzau;
        return new zzelg<>(zzflbVar, zzfhj.zzi(zzejwVar, zzejwVar2, zzejwVar3, zzejwVar4, zza4, zzembVar, new zzeml(zzauvVar, zzflbVar6, zza7, null), zzd(), zze(), new zzemh(zzcbrVar2, zzf, zza8, zzcbyVar, (ScheduledExecutorService) zzgebVar8.zzb(), zzflbVar7, null), (zzeld) zzgebVar9.zzb()));
    }

    @Override // com.google.android.gms.internal.ads.zzelv
    public final zzelg<JSONObject> zzb() {
        zzgeb zzgebVar;
        zzgeb zzgebVar2;
        zzcbp zzcbpVar = new zzcbp();
        zzgebVar = this.zza.zzau;
        Object zzb = zzgebVar.zzb();
        zzely zze = zze();
        zzemw zzd = zzd();
        zzgdk zzc = zzgdp.zzc(this.zzd);
        zzgdk zzc2 = zzgdp.zzc(this.zzf);
        zzgdk zzc3 = zzgdp.zzc(this.zzg);
        zzgdk zzc4 = zzgdp.zzc(this.zzh);
        zzgdk zzc5 = zzgdp.zzc(this.zzi);
        zzgdk zzc6 = zzgdp.zzc(this.zzj);
        zzgdk zzc7 = zzgdp.zzc(this.zzk);
        zzflb zzflbVar = zzccz.zza;
        zzgdw.zzb(zzflbVar);
        zzgebVar2 = this.zza.zzm;
        return zzenj.zza(zzcbpVar, zzb, zze, zzd, zzc, zzc2, zzc3, zzc4, zzc5, zzc6, zzc7, zzflbVar, (ScheduledExecutorService) zzgebVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzelv
    public final zzexl zzc() {
        return this.zzu.zzb();
    }
}
