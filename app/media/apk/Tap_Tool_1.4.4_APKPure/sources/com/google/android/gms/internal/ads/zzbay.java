package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Random;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbay {
    private static final zzbay zza = new zzbay();
    private final zzccg zzb;
    private final zzbaw zzc;
    private final String zzd;
    private final zzcct zze;
    private final Random zzf;

    protected zzbay() {
        zzccg zzccgVar = new zzccg();
        zzbaw zzbawVar = new zzbaw(new zzazr(), new zzazq(), new zzbed(), new zzbkf(), new zzbza(), new zzbvl(), new zzbkg());
        String zzf = zzccg.zzf();
        zzcct zzcctVar = new zzcct(0, (int) ModuleDescriptor.MODULE_VERSION, true, false, false);
        Random random = new Random();
        this.zzb = zzccgVar;
        this.zzc = zzbawVar;
        this.zzd = zzf;
        this.zze = zzcctVar;
        this.zzf = random;
    }

    public static zzccg zza() {
        return zza.zzb;
    }

    public static zzbaw zzb() {
        return zza.zzc;
    }

    public static String zzc() {
        return zza.zzd;
    }

    public static zzcct zzd() {
        return zza.zze;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
