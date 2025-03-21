package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbfn implements zzbhp {
    final /* synthetic */ zzbfo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfn(zzbfo zzbfoVar) {
        this.zza = zzbfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zze;
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final Long zzb(String str, long j) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Long.valueOf(sharedPreferences2.getLong(str, j));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final Double zzc(String str, double d) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zze;
        return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final String zzd(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zze;
        return sharedPreferences.getString(str, str2);
    }
}
