package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzcqv {
    private final zzcsl zza;
    private final View zzb;
    private final zzest zzc;
    private final zzcib zzd;

    public zzcqv(View view, zzcib zzcibVar, zzcsl zzcslVar, zzest zzestVar) {
        this.zzb = view;
        this.zzd = zzcibVar;
        this.zza = zzcslVar;
        this.zzc = zzestVar;
    }

    public static final zzdcx<zzcxt> zzf(final Context context, final zzcct zzcctVar, final zzess zzessVar, final zzetk zzetkVar) {
        return new zzdcx<>(new zzcxt(context, zzcctVar, zzessVar, zzetkVar) { // from class: com.google.android.gms.internal.ads.zzcqt
            private final Context zza;
            private final zzcct zzb;
            private final zzess zzc;
            private final zzetk zzd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = context;
                this.zzb = zzcctVar;
                this.zzc = zzessVar;
                this.zzd = zzetkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcxt
            public final void zzbN() {
                com.google.android.gms.ads.internal.zzs.zzm().zzg(this.zza, this.zzb.zza, this.zzc.zzB.toString(), this.zzd.zzf);
            }
        }, zzccz.zzf);
    }

    public static final Set<zzdcx<zzcxt>> zzg(zzcsf zzcsfVar) {
        return Collections.singleton(new zzdcx(zzcsfVar, zzccz.zzf));
    }

    public static final zzdcx<zzcxt> zzh(zzcsd zzcsdVar) {
        return new zzdcx<>(zzcsdVar, zzccz.zze);
    }

    public final zzcib zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcsl zzc() {
        return this.zza;
    }

    public final zzest zzd() {
        return this.zzc;
    }

    public zzcxr zze(Set<zzdcx<zzcxt>> set) {
        return new zzcxr(set);
    }
}
