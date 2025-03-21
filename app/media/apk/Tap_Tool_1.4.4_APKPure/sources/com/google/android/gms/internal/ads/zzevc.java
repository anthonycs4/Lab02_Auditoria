package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzevc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzevc> CREATOR = new zzevd();
    @Nullable
    public final Context zza;
    public final zzeuz zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzeuz[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzevc(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzeuz[] values = zzeuz.values();
        this.zzh = values;
        int[] zza = zzeva.zza();
        this.zzl = zza;
        int[] zza2 = zzevb.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    public static zzevc zza(zzeuz zzeuzVar, Context context) {
        if (zzeuzVar == zzeuz.Rewarded) {
            return new zzevc(context, zzeuzVar, ((Integer) zzbba.zzc().zzb(zzbfq.zzey)).intValue(), ((Integer) zzbba.zzc().zzb(zzbfq.zzeE)).intValue(), ((Integer) zzbba.zzc().zzb(zzbfq.zzeG)).intValue(), (String) zzbba.zzc().zzb(zzbfq.zzeI), (String) zzbba.zzc().zzb(zzbfq.zzeA), (String) zzbba.zzc().zzb(zzbfq.zzeC));
        } else if (zzeuzVar == zzeuz.Interstitial) {
            return new zzevc(context, zzeuzVar, ((Integer) zzbba.zzc().zzb(zzbfq.zzez)).intValue(), ((Integer) zzbba.zzc().zzb(zzbfq.zzeF)).intValue(), ((Integer) zzbba.zzc().zzb(zzbfq.zzeH)).intValue(), (String) zzbba.zzc().zzb(zzbfq.zzeJ), (String) zzbba.zzc().zzb(zzbfq.zzeB), (String) zzbba.zzc().zzb(zzbfq.zzeD));
        } else if (zzeuzVar == zzeuz.AppOpen) {
            return new zzevc(context, zzeuzVar, ((Integer) zzbba.zzc().zzb(zzbfq.zzeM)).intValue(), ((Integer) zzbba.zzc().zzb(zzbfq.zzeO)).intValue(), ((Integer) zzbba.zzc().zzb(zzbfq.zzeP)).intValue(), (String) zzbba.zzc().zzb(zzbfq.zzeK), (String) zzbba.zzc().zzb(zzbfq.zzeL), (String) zzbba.zzc().zzb(zzbfq.zzeN));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzevc(@Nullable Context context, zzeuz zzeuzVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzeuz.values();
        this.zzl = zzeva.zza();
        this.zzm = zzevb.zza();
        this.zza = context;
        this.zzi = zzeuzVar.ordinal();
        this.zzb = zzeuzVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
