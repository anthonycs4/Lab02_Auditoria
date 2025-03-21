package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebo {
    private final Clock zza;
    private final zzebp zzb;
    private final List<String> zzc = Collections.synchronizedList(new ArrayList());
    private final boolean zzd = ((Boolean) zzbba.zzc().zzb(zzbfq.zzeU)).booleanValue();
    private final zzdyf zze;

    public zzebo(Clock clock, zzebp zzebpVar, zzdyf zzdyfVar) {
        this.zza = clock;
        this.zzb = zzebpVar;
        this.zze = zzdyfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzebo zzeboVar, String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        zzeboVar.zzc.add(sb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> zzfla<T> zza(zzesv zzesvVar, zzess zzessVar, zzfla<T> zzflaVar) {
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzessVar.zzv;
        if (str != null) {
            zzfks.zzp(zzflaVar, new zzebn(this, elapsedRealtime, str, zzessVar, zzesvVar), zzccz.zzf);
        }
        return zzflaVar;
    }

    public final String zzb() {
        return TextUtils.join("_", this.zzc);
    }
}
