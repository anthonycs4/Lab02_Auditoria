package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads-base@@20.2.0 */
/* loaded from: classes.dex */
public final class zzhs {
    private static final ClassLoader zza = zzhs.class.getClassLoader();

    private zzhs() {
    }

    public static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void zzb(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> T zzc(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zze(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    public static void zzf(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static ArrayList zzg(Parcel parcel) {
        return parcel.readArrayList(zza);
    }
}
