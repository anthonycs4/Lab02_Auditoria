package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcve implements zzgdq<zzfei<zzess, com.google.android.gms.ads.internal.util.zzau>> {
    private final zzgeb<Context> zza;
    private final zzgeb<zzcct> zzb;
    private final zzgeb<zzetk> zzc;

    public zzcve(zzgeb<Context> zzgebVar, zzgeb<zzcct> zzgebVar2, zzgeb<zzetk> zzgebVar3) {
        this.zza = zzgebVar;
        this.zzb = zzgebVar2;
        this.zzc = zzgebVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context zzb = this.zza.zzb();
        final zzcct zza = ((zzckn) this.zzb).zza();
        final zzetk zza2 = ((zzcvy) this.zzc).zza();
        return new zzfei(zzb, zza, zza2) { // from class: com.google.android.gms.internal.ads.zzcvd
            private final Context zza;
            private final zzcct zzb;
            private final zzetk zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzb;
                this.zzb = zza;
                this.zzc = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzfei
            public final Object apply(Object obj) {
                Context context = this.zza;
                zzcct zzcctVar = this.zzb;
                zzetk zzetkVar = this.zzc;
                zzess zzessVar = (zzess) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zze(zzessVar.zzA);
                zzauVar.zzf(zzessVar.zzB.toString());
                zzauVar.zzd(zzcctVar.zza);
                zzauVar.zzc(zzetkVar.zzf);
                return zzauVar;
            }
        };
    }
}
