package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbo implements Parcelable.Creator<zzcbn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcbn createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        zzazx zzazxVar = null;
        zzazs zzazsVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                zzazxVar = (zzazx) SafeParcelReader.createParcelable(parcel, readHeader, zzazx.CREATOR);
            } else if (fieldId == 4) {
                zzazsVar = (zzazs) SafeParcelReader.createParcelable(parcel, readHeader, zzazs.CREATOR);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzcbn(str, str2, zzazxVar, zzazsVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcbn[] newArray(int i) {
        return new zzcbn[i];
    }
}
