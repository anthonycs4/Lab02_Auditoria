package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbaq extends zzbax<zzbbu> {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzazx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbre zzd;
    final /* synthetic */ zzbaw zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbaq(zzbaw zzbawVar, Context context, zzazx zzazxVar, String str, zzbre zzbreVar) {
        this.zze = zzbawVar;
        this.zza = context;
        this.zzb = zzazxVar;
        this.zzc = str;
        this.zzd = zzbreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbu zza() {
        zzbaw.zzl(this.zza, "interstitial");
        return new zzbej();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbu zzb() throws RemoteException {
        zzazr zzazrVar;
        zzazrVar = this.zze.zza;
        return zzazrVar.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ zzbbu zzc(zzbce zzbceVar) throws RemoteException {
        return zzbceVar.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, ModuleDescriptor.MODULE_VERSION);
    }
}
