package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbav extends zzbax<zzbyo> {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbre zzc;
    final /* synthetic */ zzbaw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbav(zzbaw zzbawVar, Context context, String str, zzbre zzbreVar) {
        this.zzd = zzbawVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    protected final /* bridge */ /* synthetic */ zzbyo zza() {
        zzbaw.zzl(this.zza, "rewarded");
        return new zzbep();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbyo zzb() throws RemoteException {
        return zzbza.zza(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbyo zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }
}
