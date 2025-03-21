package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzenj implements zzgdq<zzelg<JSONObject>> {
    public static zzelg<JSONObject> zza(zzcbp zzcbpVar, Object obj, zzely zzelyVar, zzemw zzemwVar, zzgdk<zzels> zzgdkVar, zzgdk<zzemb> zzgdkVar2, zzgdk<zzemh> zzgdkVar3, zzgdk<zzeml> zzgdkVar4, zzgdk<zzems> zzgdkVar5, zzgdk<zzemz> zzgdkVar6, zzgdk<zzenl> zzgdkVar7, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzemp) obj);
        hashSet.add(zzelyVar);
        hashSet.add(zzemwVar);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdT)).booleanValue()) {
            hashSet.add(zzgdkVar.zzb());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdU)).booleanValue()) {
            hashSet.add(zzgdkVar2.zzb());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdV)).booleanValue()) {
            hashSet.add(zzgdkVar3.zzb());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzdW)).booleanValue()) {
            hashSet.add(zzgdkVar4.zzb());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzea)).booleanValue()) {
            hashSet.add(zzgdkVar6.zzb());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzeb)).booleanValue()) {
            hashSet.add(zzgdkVar7.zzb());
        }
        return new zzelg<>(executor, hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
