package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfyb {
    private static final zzfxz<?> zza = new zzfya();
    private static final zzfxz<?> zzb;

    static {
        zzfxz<?> zzfxzVar;
        try {
            zzfxzVar = (zzfxz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfxzVar = null;
        }
        zzb = zzfxzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfxz<?> zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfxz<?> zzb() {
        zzfxz<?> zzfxzVar = zzb;
        if (zzfxzVar != null) {
            return zzfxzVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
