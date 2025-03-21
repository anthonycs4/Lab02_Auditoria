package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfzl implements zzfzs {
    private final zzfzs[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzl(zzfzs... zzfzsVarArr) {
        this.zza = zzfzsVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final boolean zzb(Class<?> cls) {
        zzfzs[] zzfzsVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzfzsVarArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final zzfzr zzc(Class<?> cls) {
        zzfzs[] zzfzsVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzfzs zzfzsVar = zzfzsVarArr[i];
            if (zzfzsVar.zzb(cls)) {
                return zzfzsVar.zzc(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
