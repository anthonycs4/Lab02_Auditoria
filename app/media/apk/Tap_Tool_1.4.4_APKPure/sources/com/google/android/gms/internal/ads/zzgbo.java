package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzgbo {
    DOUBLE(zzgbp.DOUBLE, 1),
    FLOAT(zzgbp.FLOAT, 5),
    INT64(zzgbp.LONG, 0),
    UINT64(zzgbp.LONG, 0),
    INT32(zzgbp.INT, 0),
    FIXED64(zzgbp.LONG, 1),
    FIXED32(zzgbp.INT, 5),
    BOOL(zzgbp.BOOLEAN, 0),
    STRING(zzgbp.STRING, 2),
    GROUP(zzgbp.MESSAGE, 3),
    MESSAGE(zzgbp.MESSAGE, 2),
    BYTES(zzgbp.BYTE_STRING, 2),
    UINT32(zzgbp.INT, 0),
    ENUM(zzgbp.ENUM, 0),
    SFIXED32(zzgbp.INT, 5),
    SFIXED64(zzgbp.LONG, 1),
    SINT32(zzgbp.INT, 0),
    SINT64(zzgbp.LONG, 0);
    
    private final zzgbp zzs;

    zzgbo(zzgbp zzgbpVar, int i) {
        this.zzs = zzgbpVar;
    }

    public final zzgbp zza() {
        return this.zzs;
    }
}
