package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbhj {
    public static final zzbgs<Long> zza = zzbgs.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbgs<Boolean> zzb = zzbgs.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbgs<String> zzc = zzbgs.zzd("gads:public_beta:traffic_multiplier", "1.0");
    public static final zzbgs<String> zzd = zzbgs.zzd("gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzbgs<Boolean> zze = zzbgs.zza("gads:sdk_crash_report_enabled", false);
    public static final zzbgs<Boolean> zzf = zzbgs.zza("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbgs<Double> zzg = zzbgs.zzc("gads:trapped_exception_sample_rate", 0.01d);
}
