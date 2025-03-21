package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzevj {
    private final HashMap<zzeuz, zzevi<? extends zzcsn>> zza = new HashMap<>();

    public final <AdT extends zzcsn> zzevi<AdT> zza(zzeuz zzeuzVar, Context context, zzeur zzeurVar, zzevp<AdT> zzevpVar) {
        zzevi<AdT> zzeviVar = (zzevi<AdT>) this.zza.get(zzeuzVar);
        if (zzeviVar == null) {
            zzeuw zzeuwVar = new zzeuw(zzevc.zza(zzeuzVar, context));
            zzevi<AdT> zzeviVar2 = new zzevi<>(zzeuwVar, new zzevr(zzeuwVar, zzeurVar, zzevpVar));
            this.zza.put(zzeuzVar, zzeviVar2);
            return zzeviVar2;
        }
        return zzeviVar;
    }
}
