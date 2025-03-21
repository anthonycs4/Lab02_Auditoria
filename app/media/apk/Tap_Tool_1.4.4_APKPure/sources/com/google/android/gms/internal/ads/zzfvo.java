package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfvw;
import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfvo<T_WRAPPER extends zzfvw<T_ENGINE>, T_ENGINE> {
    public static final zzfvo<zzfvp, Cipher> zza;
    public static final zzfvo<zzfvt, Mac> zzb;
    public static final zzfvo<zzfvv, Signature> zzc;
    public static final zzfvo<zzfvu, MessageDigest> zzd;
    public static final zzfvo<zzfvq, KeyAgreement> zze;
    public static final zzfvo<zzfvs, KeyPairGenerator> zzf;
    public static final zzfvo<zzfvr, KeyFactory> zzg;
    private static final Logger zzh = Logger.getLogger(zzfvo.class.getName());
    private static final List<Provider> zzi;
    private static final boolean zzj;
    private final T_WRAPPER zzk;

    static {
        if (zzfwg.zza()) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            zzi = arrayList;
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
        zza = new zzfvo<>(new zzfvp());
        zzb = new zzfvo<>(new zzfvt());
        zzc = new zzfvo<>(new zzfvv());
        zzd = new zzfvo<>(new zzfvu());
        zze = new zzfvo<>(new zzfvq());
        zzf = new zzfvo<>(new zzfvs());
        zzg = new zzfvo<>(new zzfvr());
    }

    public zzfvo(T_WRAPPER t_wrapper) {
        this.zzk = t_wrapper;
    }

    public final T_ENGINE zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : zzi) {
            try {
                return (T_ENGINE) this.zzk.zza(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (zzj) {
            return (T_ENGINE) this.zzk.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
