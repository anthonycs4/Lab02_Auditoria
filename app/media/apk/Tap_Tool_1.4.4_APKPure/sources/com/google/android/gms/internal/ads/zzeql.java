package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeql {
    public static zzeqj<zzcpr, zzcpx> zza(Context context, zzeur zzeurVar, zzevj zzevjVar) {
        return zzc(context, zzeurVar, zzevjVar);
    }

    public static zzeqj<zzcqc, zzcqh> zzb(Context context, zzeur zzeurVar, zzevj zzevjVar) {
        return zzc(context, zzeurVar, zzevjVar);
    }

    private static <AppOpenAdRequestComponent extends zzcvq<AppOpenAd>, AppOpenAd extends zzcsn> zzeqj<AppOpenAdRequestComponent, AppOpenAd> zzc(Context context, zzeur zzeurVar, zzevj zzevjVar) {
        if (((Integer) zzbba.zzc().zzb(zzbfq.zzeM)).intValue() > 0) {
            zzevi zza = zzevjVar.zza(zzeuz.AppOpen, context, zzeurVar, new zzepo(new zzepk()));
            return new zzepq(new zzeqa(new zzepz()), new zzepw(zza.zza, zzccz.zza), zza.zzb, zzccz.zza);
        }
        return new zzepz();
    }
}
