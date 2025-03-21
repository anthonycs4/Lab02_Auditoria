package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzetk {
    public final zzbey zza;
    public final zzbnv zzb;
    public final zzefe zzc;
    public final zzazs zzd;
    public final zzazx zze;
    public final String zzf;
    public final ArrayList<String> zzg;
    public final ArrayList<String> zzh;
    public final zzbhy zzi;
    public final zzbad zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzbcb zzn;
    public final zzeta zzo;
    public final boolean zzp;
    public final zzbcf zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzetk(zzetj zzetjVar, zzeti zzetiVar) {
        zzbey zzbeyVar;
        zzbhy zzbhyVar;
        this.zze = zzetj.zzw(zzetjVar);
        this.zzf = zzetj.zzx(zzetjVar);
        this.zzq = zzetj.zzO(zzetjVar);
        int i = zzetj.zzJ(zzetjVar).zza;
        long j = zzetj.zzJ(zzetjVar).zzb;
        Bundle bundle = zzetj.zzJ(zzetjVar).zzc;
        int i2 = zzetj.zzJ(zzetjVar).zzd;
        List<String> list = zzetj.zzJ(zzetjVar).zze;
        boolean z = zzetj.zzJ(zzetjVar).zzf;
        int i3 = zzetj.zzJ(zzetjVar).zzg;
        boolean z2 = true;
        if (!zzetj.zzJ(zzetjVar).zzh && !zzetj.zzK(zzetjVar)) {
            z2 = false;
        }
        this.zzd = new zzazs(i, j, bundle, i2, list, z, i3, z2, zzetj.zzJ(zzetjVar).zzi, zzetj.zzJ(zzetjVar).zzj, zzetj.zzJ(zzetjVar).zzk, zzetj.zzJ(zzetjVar).zzl, zzetj.zzJ(zzetjVar).zzm, zzetj.zzJ(zzetjVar).zzn, zzetj.zzJ(zzetjVar).zzo, zzetj.zzJ(zzetjVar).zzp, zzetj.zzJ(zzetjVar).zzq, zzetj.zzJ(zzetjVar).zzr, zzetj.zzJ(zzetjVar).zzs, zzetj.zzJ(zzetjVar).zzt, zzetj.zzJ(zzetjVar).zzu, zzetj.zzJ(zzetjVar).zzv, com.google.android.gms.ads.internal.util.zzr.zza(zzetj.zzJ(zzetjVar).zzw), zzetj.zzJ(zzetjVar).zzx);
        if (zzetj.zzL(zzetjVar) != null) {
            zzbeyVar = zzetj.zzL(zzetjVar);
        } else {
            zzbeyVar = zzetj.zzM(zzetjVar) != null ? zzetj.zzM(zzetjVar).zzf : null;
        }
        this.zza = zzbeyVar;
        this.zzg = zzetj.zzy(zzetjVar);
        this.zzh = zzetj.zzz(zzetjVar);
        if (zzetj.zzy(zzetjVar) == null) {
            zzbhyVar = null;
        } else {
            zzbhyVar = zzetj.zzM(zzetjVar) == null ? new zzbhy(new NativeAdOptions.Builder().build()) : zzetj.zzM(zzetjVar);
        }
        this.zzi = zzbhyVar;
        this.zzj = zzetj.zzA(zzetjVar);
        this.zzk = zzetj.zzB(zzetjVar);
        this.zzl = zzetj.zzC(zzetjVar);
        this.zzm = zzetj.zzD(zzetjVar);
        this.zzn = zzetj.zzE(zzetjVar);
        this.zzb = zzetj.zzF(zzetjVar);
        this.zzo = new zzeta(zzetj.zzG(zzetjVar), null);
        this.zzp = zzetj.zzH(zzetjVar);
        this.zzc = zzetj.zzI(zzetjVar);
    }

    public final zzbjx zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzc();
        }
        return this.zzl.zza();
    }
}
