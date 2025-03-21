package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzcde;
import com.google.android.gms.internal.ads.zzfla;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbp {
    private static com.google.android.gms.internal.ads.zzaf zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbl<Void> zza = new zzbi();

    public zzbp(Context context) {
        com.google.android.gms.internal.ads.zzaf zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbfq.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzbba.zzc().zzb(zzbfq.zzcG)).booleanValue()) {
                        zza2 = zzaz.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = com.google.android.gms.internal.ads.zzbj.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfla<com.google.android.gms.internal.ads.zzy> zza(String str) {
        zzcde zzcdeVar = new zzcde();
        zzb.zzb(new zzbo(str, null, zzcdeVar));
        return zzcdeVar;
    }

    public final zzfla<String> zzb(int i, String str, Map<String, String> map, byte[] bArr) {
        zzbm zzbmVar = new zzbm(null);
        zzbj zzbjVar = new zzbj(this, str, zzbmVar);
        zzccm zzccmVar = new zzccm(null);
        zzbk zzbkVar = new zzbk(this, i, str, zzbmVar, zzbjVar, bArr, map, zzccmVar);
        if (zzccm.zzj()) {
            try {
                zzccmVar.zzb(str, "GET", zzbkVar.zzm(), zzbkVar.zzn());
            } catch (com.google.android.gms.internal.ads.zzk e) {
                zze.zzi(e.getMessage());
            }
        }
        zzb.zzb(zzbkVar);
        return zzbmVar;
    }
}
