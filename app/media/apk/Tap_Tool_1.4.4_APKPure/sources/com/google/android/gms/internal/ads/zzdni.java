package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdni {
    private final Map<String, zzdnh> zza = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzeub zzeubVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdnh(str, zzeubVar.zzz(), zzeubVar.zzA()));
        } catch (zzetp unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzb(String str, zzbtl zzbtlVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdnh(str, zzbtlVar.zzf(), zzbtlVar.zzg()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdnh zzc(String str) {
        return this.zza.get(str);
    }

    @Nullable
    public final zzdnh zzd(List<String> list) {
        for (String str : list) {
            zzdnh zzc = zzc(str);
            if (zzc != null) {
                return zzc;
            }
        }
        return null;
    }
}
