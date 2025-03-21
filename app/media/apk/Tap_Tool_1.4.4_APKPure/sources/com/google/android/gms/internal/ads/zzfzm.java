package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfzm implements zzgal {
    private static final zzfzs zzb = new zzfzk();
    private final zzfzs zza;

    public zzfzm() {
        zzfzs zzfzsVar;
        zzfzs[] zzfzsVarArr = new zzfzs[2];
        zzfzsVarArr[0] = zzfyh.zza();
        try {
            zzfzsVar = (zzfzs) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfzsVar = zzb;
        }
        zzfzsVarArr[1] = zzfzsVar;
        zzfzl zzfzlVar = new zzfzl(zzfzsVarArr);
        zzfyw.zzb(zzfzlVar, "messageInfoFactory");
        this.zza = zzfzlVar;
    }

    private static boolean zzb(zzfzr zzfzrVar) {
        return zzfzrVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final <T> zzgak<T> zza(Class<T> cls) {
        zzgam.zza(cls);
        zzfzr zzc = this.zza.zzc(cls);
        if (!zzc.zza()) {
            if (zzfym.class.isAssignableFrom(cls)) {
                if (zzb(zzc)) {
                    return zzfzx.zzl(cls, zzc, zzgaa.zzb(), zzfzi.zze(), zzgam.zzC(), zzfyb.zza(), zzfzq.zzb());
                }
                return zzfzx.zzl(cls, zzc, zzgaa.zzb(), zzfzi.zze(), zzgam.zzC(), null, zzfzq.zzb());
            } else if (zzb(zzc)) {
                return zzfzx.zzl(cls, zzc, zzgaa.zza(), zzfzi.zzd(), zzgam.zzA(), zzfyb.zzb(), zzfzq.zza());
            } else {
                return zzfzx.zzl(cls, zzc, zzgaa.zza(), zzfzi.zzd(), zzgam.zzB(), null, zzfzq.zza());
            }
        } else if (zzfym.class.isAssignableFrom(cls)) {
            return zzfzy.zzg(zzgam.zzC(), zzfyb.zza(), zzc.zzb());
        } else {
            return zzfzy.zzg(zzgam.zzA(), zzfyb.zzb(), zzc.zzb());
        }
    }
}
