package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzccg;
import java.io.File;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaz extends com.google.android.gms.internal.ads.zzar {
    private final Context zzc;

    private zzaz(Context context, com.google.android.gms.internal.ads.zzaq zzaqVar) {
        super(zzaqVar);
        this.zzc = context;
    }

    public static com.google.android.gms.internal.ads.zzaf zzb(Context context) {
        com.google.android.gms.internal.ads.zzaf zzafVar = new com.google.android.gms.internal.ads.zzaf(new com.google.android.gms.internal.ads.zzay(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaz(context, new com.google.android.gms.internal.ads.zzbd(null, null)), 4);
        zzafVar.zza();
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzar, com.google.android.gms.internal.ads.zzv
    public final com.google.android.gms.internal.ads.zzy zza(com.google.android.gms.internal.ads.zzac<?> zzacVar) throws com.google.android.gms.internal.ads.zzal {
        if (zzacVar.zza() == 0) {
            if (Pattern.matches((String) zzbba.zzc().zzb(zzbfq.zzcH), zzacVar.zzh())) {
                zzbay.zza();
                if (zzccg.zzn(this.zzc, 13400000)) {
                    com.google.android.gms.internal.ads.zzy zza = new zzbni(this.zzc).zza(zzacVar);
                    if (zza != null) {
                        String valueOf = String.valueOf(zzacVar.zzh());
                        zze.zza(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zza;
                    }
                    String valueOf2 = String.valueOf(zzacVar.zzh());
                    zze.zza(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zza(zzacVar);
    }
}
