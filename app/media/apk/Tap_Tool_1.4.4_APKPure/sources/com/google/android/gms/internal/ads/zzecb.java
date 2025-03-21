package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzecb extends zzedd {
    private final zzddj zza;

    public zzecb(zzcwf zzcwfVar, zzcwx zzcwxVar, zzcxm zzcxmVar, zzcxr zzcxrVar, zzcws zzcwsVar, zzdar zzdarVar, zzddr zzddrVar, zzcyk zzcykVar, zzddj zzddjVar, zzdan zzdanVar) {
        super(zzcwfVar, zzcwxVar, zzcxmVar, zzcxrVar, zzdarVar, zzcykVar, zzddrVar, zzdanVar, zzcwsVar);
        this.zza = zzddjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedd, com.google.android.gms.internal.ads.zzbrk
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzedd, com.google.android.gms.internal.ads.zzbrk
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedd, com.google.android.gms.internal.ads.zzbrk
    public final void zzp(zzbyh zzbyhVar) {
        this.zza.zzb(zzbyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedd, com.google.android.gms.internal.ads.zzbrk
    public final void zzr(zzbyl zzbylVar) throws RemoteException {
        this.zza.zzb(new zzbyh(zzbylVar.zze(), zzbylVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzedd, com.google.android.gms.internal.ads.zzbrk
    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }
}
