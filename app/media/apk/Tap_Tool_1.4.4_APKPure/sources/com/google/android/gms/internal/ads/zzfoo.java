package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfoo extends zzfmd<zzfry, zzfse> {
    final /* synthetic */ zzfop zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoo(zzfop zzfopVar, Class cls) {
        super(cls);
        this.zza = zzfopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ void zzb(zzfry zzfryVar) throws GeneralSecurityException {
        zzfoy.zza(zzfryVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfry zzc(zzfxj zzfxjVar) throws zzfyy {
        return zzfry.zzc(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final /* bridge */ /* synthetic */ zzfse zzd(zzfry zzfryVar) throws GeneralSecurityException {
        zzfry zzfryVar2 = zzfryVar;
        KeyPair zzc = zzfvm.zzc(zzfvm.zzd(zzfoy.zzc(zzfryVar2.zza().zza().zza())));
        ECPoint w = ((ECPublicKey) zzc.getPublic()).getW();
        zzfsg zzg = zzfsh.zzg();
        zzg.zza(0);
        zzg.zzb(zzfryVar2.zza());
        zzg.zzc(zzfxj.zzt(w.getAffineX().toByteArray()));
        zzg.zzd(zzfxj.zzt(w.getAffineY().toByteArray()));
        zzfsd zzf = zzfse.zzf();
        zzf.zza(0);
        zzf.zzb(zzg.zzah());
        zzf.zzc(zzfxj.zzt(((ECPrivateKey) zzc.getPrivate()).getS().toByteArray()));
        return zzf.zzah();
    }
}
