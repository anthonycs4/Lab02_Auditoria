package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbgw {
    public static final zzbgs<Boolean> zza = zzbgt.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbgs<Boolean> zzb = zzbgt.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbgs<String> zzc = new zzbgt("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbgs<Long> zzd = new zzbgt("gads:consent:gmscore:time_out", Long.valueOf((long) WorkRequest.MIN_BACKOFF_MILLIS), 2);
    public static final zzbgs<Boolean> zze = zzbgt.zzf("gads:consent:gmscore:enabled", true);
}
