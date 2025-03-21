package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzu;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfmf<KeyProtoT extends zzfzu> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzfme<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzfmf(Class<KeyProtoT> cls, zzfme<?, KeyProtoT>... zzfmeVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzfme<?, KeyProtoT> zzfmeVar = zzfmeVarArr[i];
            if (!hashMap.containsKey(zzfmeVar.zza())) {
                hashMap.put(zzfmeVar.zza(), zzfmeVar);
            } else {
                String valueOf = String.valueOf(zzfmeVar.zza().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
        }
        this.zzc = zzfmeVarArr[0].zza();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public final Class<KeyProtoT> zza() {
        return this.zza;
    }

    public abstract String zzb();

    public abstract zzftb zzc();

    public abstract KeyProtoT zzd(zzfxj zzfxjVar) throws zzfyy;

    public abstract void zze(KeyProtoT keyprotot) throws GeneralSecurityException;

    public final <P> P zzf(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzfme<?, KeyProtoT> zzfmeVar = this.zzb.get(cls);
        if (zzfmeVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (P) zzfmeVar.zzb(keyprotot);
    }

    public final Set<Class<?>> zzg() {
        return this.zzb.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> zzh() {
        return this.zzc;
    }

    public zzfmd<?, KeyProtoT> zzi() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
