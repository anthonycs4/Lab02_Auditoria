package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public enum zzfye {
    DOUBLE(0, 1, zzfza.DOUBLE),
    FLOAT(1, 1, zzfza.FLOAT),
    INT64(2, 1, zzfza.LONG),
    UINT64(3, 1, zzfza.LONG),
    INT32(4, 1, zzfza.INT),
    FIXED64(5, 1, zzfza.LONG),
    FIXED32(6, 1, zzfza.INT),
    BOOL(7, 1, zzfza.BOOLEAN),
    STRING(8, 1, zzfza.STRING),
    MESSAGE(9, 1, zzfza.MESSAGE),
    BYTES(10, 1, zzfza.BYTE_STRING),
    UINT32(11, 1, zzfza.INT),
    ENUM(12, 1, zzfza.ENUM),
    SFIXED32(13, 1, zzfza.INT),
    SFIXED64(14, 1, zzfza.LONG),
    SINT32(15, 1, zzfza.INT),
    SINT64(16, 1, zzfza.LONG),
    GROUP(17, 1, zzfza.MESSAGE),
    DOUBLE_LIST(18, 2, zzfza.DOUBLE),
    FLOAT_LIST(19, 2, zzfza.FLOAT),
    INT64_LIST(20, 2, zzfza.LONG),
    UINT64_LIST(21, 2, zzfza.LONG),
    INT32_LIST(22, 2, zzfza.INT),
    FIXED64_LIST(23, 2, zzfza.LONG),
    FIXED32_LIST(24, 2, zzfza.INT),
    BOOL_LIST(25, 2, zzfza.BOOLEAN),
    STRING_LIST(26, 2, zzfza.STRING),
    MESSAGE_LIST(27, 2, zzfza.MESSAGE),
    BYTES_LIST(28, 2, zzfza.BYTE_STRING),
    UINT32_LIST(29, 2, zzfza.INT),
    ENUM_LIST(30, 2, zzfza.ENUM),
    SFIXED32_LIST(31, 2, zzfza.INT),
    SFIXED64_LIST(32, 2, zzfza.LONG),
    SINT32_LIST(33, 2, zzfza.INT),
    SINT64_LIST(34, 2, zzfza.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzfza.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzfza.FLOAT),
    INT64_LIST_PACKED(37, 3, zzfza.LONG),
    UINT64_LIST_PACKED(38, 3, zzfza.LONG),
    INT32_LIST_PACKED(39, 3, zzfza.INT),
    FIXED64_LIST_PACKED(40, 3, zzfza.LONG),
    FIXED32_LIST_PACKED(41, 3, zzfza.INT),
    BOOL_LIST_PACKED(42, 3, zzfza.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzfza.INT),
    ENUM_LIST_PACKED(44, 3, zzfza.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzfza.INT),
    SFIXED64_LIST_PACKED(46, 3, zzfza.LONG),
    SINT32_LIST_PACKED(47, 3, zzfza.INT),
    SINT64_LIST_PACKED(48, 3, zzfza.LONG),
    GROUP_LIST(49, 2, zzfza.MESSAGE),
    MAP(50, 4, zzfza.VOID);
    
    private static final zzfye[] zzac;
    private final zzfza zzZ;
    private final int zzaa;
    private final Class<?> zzab;

    static {
        zzfye[] values = values();
        zzac = new zzfye[values.length];
        for (zzfye zzfyeVar : values) {
            zzac[zzfyeVar.zzaa] = zzfyeVar;
        }
    }

    zzfye(int i, int i2, zzfza zzfzaVar) {
        this.zzaa = i;
        this.zzZ = zzfzaVar;
        zzfza zzfzaVar2 = zzfza.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzab = zzfzaVar.zza();
        } else if (i3 != 3) {
            this.zzab = null;
        } else {
            this.zzab = zzfzaVar.zza();
        }
        if (i2 == 1) {
            zzfzaVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzaa;
    }
}
