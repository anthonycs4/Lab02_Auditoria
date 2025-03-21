package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzu;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
class zzfmc<PrimitiveT, KeyProtoT extends zzfzu> implements zzfma<PrimitiveT> {
    private final zzfmf<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzfmc(zzfmf<KeyProtoT> zzfmfVar, Class<PrimitiveT> cls) {
        if (!zzfmfVar.zzg().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzfmfVar.toString(), cls.getName()));
        }
        this.zza = zzfmfVar;
        this.zzb = cls;
    }

    private final PrimitiveT zzg(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.zzb)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zza.zze(keyprotot);
        return (PrimitiveT) this.zza.zzf(keyprotot, (Class<PrimitiveT>) this.zzb);
    }

    private final zzfmb<?, KeyProtoT> zzh() {
        return new zzfmb<>(this.zza.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final PrimitiveT zza(zzfxj zzfxjVar) throws GeneralSecurityException {
        try {
            return zzg(this.zza.zzd(zzfxjVar));
        } catch (zzfyy e) {
            String valueOf = String.valueOf(this.zza.zza().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfma
    public final PrimitiveT zzb(zzfzu zzfzuVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zza.zza().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.zza.zza().isInstance(zzfzuVar)) {
            return zzg(zzfzuVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final zzfzu zzc(zzfxj zzfxjVar) throws GeneralSecurityException {
        try {
            return zzh().zza(zzfxjVar);
        } catch (zzfyy e) {
            String valueOf = String.valueOf(this.zza.zzi().zza().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final String zzd() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final Class<PrimitiveT> zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfma
    public final zzftc zzf(zzfxj zzfxjVar) throws GeneralSecurityException {
        try {
            KeyProtoT zza = zzh().zza(zzfxjVar);
            zzfsz zze = zzftc.zze();
            zze.zza(this.zza.zzb());
            zze.zzb(zza.zzan());
            zze.zzc(this.zza.zzc());
            return zze.zzah();
        } catch (zzfyy e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
