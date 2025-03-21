package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzein implements zzeld<zzeio> {
    private final Context zza;
    private final zzflb zzb;

    public zzein(Context context, zzflb zzflbVar) {
        this.zza = context;
        this.zzb = zzflbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final zzfla<zzeio> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeim
            private final zzein zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzf;
                String zzj;
                String str;
                com.google.android.gms.ads.internal.zzs.zzc();
                zzath zzb = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzb();
                Bundle bundle = null;
                if (zzb != null && (!com.google.android.gms.ads.internal.zzs.zzg().zzl().zzd() || !com.google.android.gms.ads.internal.zzs.zzg().zzl().zzh())) {
                    if (zzb.zzh()) {
                        zzb.zzf();
                    }
                    zzasx zze = zzb.zze();
                    if (zze != null) {
                        zzf = zze.zzb();
                        str = zze.zzc();
                        zzj = zze.zzd();
                        if (zzf != null) {
                            com.google.android.gms.ads.internal.zzs.zzg().zzl().zze(zzf);
                        }
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzs.zzg().zzl().zzi(zzj);
                        }
                    } else {
                        zzf = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzf();
                        zzj = com.google.android.gms.ads.internal.zzs.zzg().zzl().zzj();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzs.zzg().zzl().zzh()) {
                        if (zzj == null || TextUtils.isEmpty(zzj)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzj);
                        }
                    }
                    if (zzf != null && !com.google.android.gms.ads.internal.zzs.zzg().zzl().zzd()) {
                        bundle2.putString("fingerprint", zzf);
                        if (!zzf.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeio(bundle);
            }
        });
    }
}
