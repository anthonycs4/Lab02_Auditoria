package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwo {
    private final zzdwk zza;
    private final zzflb zzb;

    public zzdwo(zzdwk zzdwkVar, zzflb zzflbVar) {
        this.zza = zzdwkVar;
        this.zzb = zzflbVar;
    }

    public final void zza(zzewp<SQLiteDatabase, Void> zzewpVar) {
        zzfks.zzp(this.zzb.zzb(zzdwm.zza(this.zza)), new zzdwn(this, zzewpVar), this.zzb);
    }
}
