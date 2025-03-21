package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbfi<T> {
    private final int zza;
    private final String zzb;
    private final T zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzbfi(int i, String str, Object obj, zzbfd zzbfdVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        zzbba.zzb().zza(this);
    }

    public static zzbfi<Boolean> zzg(int i, String str, Boolean bool) {
        return new zzbfd(i, str, bool);
    }

    public static zzbfi<Integer> zzh(int i, String str, int i2) {
        return new zzbfe(1, str, Integer.valueOf(i2));
    }

    public static zzbfi<Long> zzi(int i, String str, long j) {
        return new zzbff(1, str, Long.valueOf(j));
    }

    public static zzbfi<Float> zzj(int i, String str, float f) {
        return new zzbfg(1, str, Float.valueOf(f));
    }

    public static zzbfi<String> zzk(int i, String str, String str2) {
        return new zzbfh(1, str, str2);
    }

    public static zzbfi<String> zzl(int i, String str) {
        zzbfi<String> zzk = zzk(1, "gads:sdk_core_constants:experiment_id", null);
        zzbba.zzb().zzb(zzk);
        return zzk;
    }

    public abstract T zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, T t);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T zzc(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final T zzf() {
        return this.zzc;
    }

    public final int zzm() {
        return this.zza;
    }
}
