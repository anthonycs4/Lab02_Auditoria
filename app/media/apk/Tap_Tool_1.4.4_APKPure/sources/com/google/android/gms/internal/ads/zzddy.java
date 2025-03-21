package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzddy {
    private final zzdez zza;
    private final zzcib zzb;

    public zzddy(zzdez zzdezVar, zzcib zzcibVar) {
        this.zza = zzdezVar;
        this.zzb = zzcibVar;
    }

    public static final zzdcx<zzdcp> zzh(zzdfe zzdfeVar) {
        return new zzdcx<>(zzdfeVar, zzccz.zzf);
    }

    public final zzdez zza() {
        return this.zza;
    }

    public final zzcib zzb() {
        return this.zzb;
    }

    public final View zzc() {
        zzcib zzcibVar = this.zzb;
        if (zzcibVar != null) {
            return zzcibVar.zzG();
        }
        return null;
    }

    public final View zzd() {
        zzcib zzcibVar = this.zzb;
        if (zzcibVar == null) {
            return null;
        }
        return zzcibVar.zzG();
    }

    public Set<zzdcx<zzcwh>> zze(zzcvh zzcvhVar) {
        return Collections.singleton(new zzdcx(zzcvhVar, zzccz.zzf));
    }

    public Set<zzdcx<zzdcp>> zzf(zzcvh zzcvhVar) {
        return Collections.singleton(new zzdcx(zzcvhVar, zzccz.zzf));
    }

    public final zzdcx<zzdak> zzg(Executor executor) {
        final zzcib zzcibVar = this.zzb;
        return new zzdcx<>(new zzdak(zzcibVar) { // from class: com.google.android.gms.internal.ads.zzddx
            private final zzcib zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcibVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdak
            public final void zza() {
                zzcib zzcibVar2 = this.zza;
                if (zzcibVar2.zzN() != null) {
                    zzcibVar2.zzN().zzb();
                }
            }
        }, executor);
    }
}
