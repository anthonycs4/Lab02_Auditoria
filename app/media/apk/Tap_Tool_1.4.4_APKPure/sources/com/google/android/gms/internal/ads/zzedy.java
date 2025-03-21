package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedy {
    private final ConcurrentHashMap<String, zzbtl> zza = new ConcurrentHashMap<>();
    private final zzdnl zzb;

    public zzedy(zzdnl zzdnlVar) {
        this.zzb = zzdnlVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzc(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final zzbtl zzb(String str) {
        if (this.zza.containsKey(str)) {
            return this.zza.get(str);
        }
        return null;
    }
}
