package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfon extends zzfme<zzfly, zzfse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfon(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final /* bridge */ /* synthetic */ zzfly zzb(zzfse zzfseVar) throws GeneralSecurityException {
        zzfse zzfseVar2 = zzfseVar;
        zzfsb zzc = zzfseVar2.zzc().zzc();
        zzfsk zza = zzc.zza();
        int zzc2 = zzfoy.zzc(zza.zza());
        byte[] zzz = zzfseVar2.zzd().zzz();
        return new zzfvh((ECPrivateKey) zzfvo.zzg.zza("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzz), zzfvm.zzd(zzc2))), zza.zzd().zzz(), zzfoy.zzb(zza.zzc()), zzfoy.zzd(zzc.zzd()), new zzfoz(zzc.zzc().zza()));
    }
}
