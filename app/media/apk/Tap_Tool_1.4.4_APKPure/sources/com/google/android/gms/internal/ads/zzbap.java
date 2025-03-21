package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbap extends zzbax<zzbbu> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzazx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbaw zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbap(zzbaw zzbawVar, Context context, zzazx zzazxVar, String str) {
        this.zzd = zzbawVar;
        this.zza = context;
        this.zzb = zzazxVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbu zza() {
        zzbaw.zzl(this.zza, "search");
        return new zzbej();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbu zzb() throws RemoteException {
        zzazr zzazrVar;
        zzazrVar = this.zzd.zza;
        return zzazrVar.zza(this.zza, this.zzb, this.zzc, null, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbu zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzi(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }
}
