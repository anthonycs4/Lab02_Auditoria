package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzegp implements zzelc<Bundle> {
    public final zzazx zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzegp(zzazx zzazxVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzazxVar, "the adSize must not be null");
        this.zza = zzazxVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzd(Bundle bundle) {
        String str;
        Bundle bundle2 = bundle;
        zzetw.zzb(bundle2, "smart_w", "full", this.zza.zze == -1);
        zzetw.zzb(bundle2, "smart_h", "auto", this.zza.zzb == -2);
        zzetw.zzd(bundle2, "ene", true, this.zza.zzj);
        zzetw.zzb(bundle2, "rafmt", "102", this.zza.zzm);
        zzetw.zzb(bundle2, "rafmt", "103", this.zza.zzn);
        zzetw.zzb(bundle2, "rafmt", "105", this.zza.zzo);
        zzetw.zzd(bundle2, "inline_adaptive_slot", true, this.zzi);
        zzetw.zzd(bundle2, "interscroller_slot", true, this.zza.zzo);
        zzetw.zze(bundle2, "format", this.zzb);
        zzetw.zzb(bundle2, "fluid", "height", this.zzc);
        zzetw.zzb(bundle2, "sz", this.zzd, !TextUtils.isEmpty(str));
        bundle2.putFloat("u_sd", this.zze);
        bundle2.putInt("sw", this.zzf);
        bundle2.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzetw.zzb(bundle2, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzazx[] zzazxVarArr = this.zza.zzg;
        if (zzazxVarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.zza.zzb);
            bundle3.putInt("width", this.zza.zze);
            bundle3.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle3);
        } else {
            for (zzazx zzazxVar : zzazxVarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", zzazxVar.zzi);
                bundle4.putInt("height", zzazxVar.zzb);
                bundle4.putInt("width", zzazxVar.zze);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
