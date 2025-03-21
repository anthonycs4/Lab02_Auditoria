package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class zzcgs implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference<zzceu> zzc;

    public zzcgs(zzceu zzceuVar) {
        Context context = zzceuVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzs.zzc().zze(context, zzceuVar.zzt().zza);
        this.zzc = new WeakReference<>(zzceuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzcgs zzcgsVar, String str, Map map) {
        zzceu zzceuVar = zzcgsVar.zzc.get();
        if (zzceuVar != null) {
            zzceuVar.zze("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zza(String str);

    public boolean zzb(String str, String[] strArr) {
        return zza(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzc(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzd(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zze(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzf(int i) {
    }

    public abstract void zzg();

    public final void zzh(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        zzccg.zza.post(new zzcgn(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public final void zzi(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzccg.zza.post(new zzcgo(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(String str, String str2, int i) {
        zzccg.zza.post(new zzcgp(this, str, str2, i));
    }

    public final void zzm(String str, String str2, long j) {
        zzccg.zza.post(new zzcgq(this, str, str2, j));
    }

    public final void zzn(String str, String str2, String str3, String str4) {
        zzccg.zza.post(new zzcgr(this, str, str2, str3, str4));
    }
}
