package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmx {
    private static final Logger zza = Logger.getLogger(zzfmx.class.getName());
    private static final ConcurrentMap<String, zzfmw> zzb = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzfmv> zzc = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzflv<?>> zze = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzfmp<?, ?>> zzf = new ConcurrentHashMap();

    private zzfmx() {
    }

    @Deprecated
    public static zzflv<?> zza(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzflv<?> zzflvVar = zze.get(str.toLowerCase(Locale.US));
        if (zzflvVar == null) {
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        return zzflvVar;
    }

    public static synchronized <KeyProtoT extends zzfzu> void zzc(zzfmf<KeyProtoT> zzfmfVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfmx.class) {
            String zzb2 = zzfmfVar.zzb();
            zzo(zzb2, zzfmfVar.getClass(), true);
            ConcurrentMap<String, zzfmw> concurrentMap = zzb;
            if (!concurrentMap.containsKey(zzb2)) {
                concurrentMap.put(zzb2, new zzfmt(zzfmfVar));
                zzc.put(zzb2, new zzfmv(zzfmfVar));
            }
            zzd.put(zzb2, true);
        }
    }

    public static synchronized <KeyProtoT extends zzfzu, PublicKeyProtoT extends zzfzu> void zzd(zzfmr<KeyProtoT, PublicKeyProtoT> zzfmrVar, zzfmf<PublicKeyProtoT> zzfmfVar, boolean z) throws GeneralSecurityException {
        Class<?> zze2;
        synchronized (zzfmx.class) {
            zzo("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzfmrVar.getClass(), true);
            zzo("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzfmfVar.getClass(), false);
            ConcurrentMap<String, zzfmw> concurrentMap = zzb;
            if (concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (zze2 = concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze()) != null && !zze2.getName().equals(zzfmfVar.getClass().getName())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzfmrVar.getClass().getName(), zze2.getName(), zzfmfVar.getClass().getName()));
            }
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || concurrentMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zze() == null) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzfmu(zzfmrVar, zzfmfVar));
                zzc.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new zzfmv(zzfmrVar));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = zzd;
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", true);
            if (!concurrentMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                concurrentMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new zzfmt(zzfmfVar));
            }
            concurrentMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", false);
        }
    }

    public static synchronized <B, P> void zze(zzfmp<B, P> zzfmpVar) throws GeneralSecurityException {
        synchronized (zzfmx.class) {
            if (zzfmpVar != null) {
                Class<P> zzb2 = zzfmpVar.zzb();
                ConcurrentMap<Class<?>, zzfmp<?, ?>> concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzfmp<?, ?> zzfmpVar2 = concurrentMap.get(zzb2);
                    if (!zzfmpVar.getClass().getName().equals(zzfmpVar2.getClass().getName())) {
                        Logger logger = zza;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(zzb2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                        sb.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                        sb.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzfmpVar2.getClass().getName(), zzfmpVar.getClass().getName()));
                    }
                }
                concurrentMap.put(zzb2, zzfmpVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static zzfma<?> zzf(String str) throws GeneralSecurityException {
        return zzn(str).zzb();
    }

    public static synchronized zzftc zzg(zzfth zzfthVar) throws GeneralSecurityException {
        zzftc zzf2;
        synchronized (zzfmx.class) {
            zzfma<?> zzf3 = zzf(zzfthVar.zza());
            if (zzd.get(zzfthVar.zza()).booleanValue()) {
                zzf2 = zzf3.zzf(zzfthVar.zzc());
            } else {
                String valueOf = String.valueOf(zzfthVar.zza());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzf2;
    }

    public static synchronized zzfzu zzh(zzfth zzfthVar) throws GeneralSecurityException {
        zzfzu zzc2;
        synchronized (zzfmx.class) {
            zzfma<?> zzf2 = zzf(zzfthVar.zza());
            if (zzd.get(zzfthVar.zza()).booleanValue()) {
                zzc2 = zzf2.zzc(zzfthVar.zzc());
            } else {
                String valueOf = String.valueOf(zzfthVar.zza());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzc2;
    }

    public static <P> P zzi(String str, zzfzu zzfzuVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzp(str, cls).zzb(zzfzuVar);
    }

    public static <P> P zzj(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zzq(str, zzfxj.zzt(bArr), cls);
    }

    public static <P> P zzk(zzftc zzftcVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzq(zzftcVar.zza(), zzftcVar.zzc(), cls);
    }

    public static <B, P> P zzl(zzfmo<B> zzfmoVar, Class<P> cls) throws GeneralSecurityException {
        zzfmp<?, ?> zzfmpVar = zzf.get(cls);
        if (zzfmpVar == null) {
            String valueOf = String.valueOf(zzfmoVar.zze().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        } else if (!zzfmpVar.zzc().equals(zzfmoVar.zze())) {
            String valueOf2 = String.valueOf(zzfmpVar.zzc());
            String valueOf3 = String.valueOf(zzfmoVar.zze());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 44 + String.valueOf(valueOf3).length());
            sb.append("Wrong input primitive class, expected ");
            sb.append(valueOf2);
            sb.append(", got ");
            sb.append(valueOf3);
            throw new GeneralSecurityException(sb.toString());
        } else {
            return (P) zzfmpVar.zza(zzfmoVar);
        }
    }

    public static Class<?> zzm(Class<?> cls) {
        zzfmp<?, ?> zzfmpVar = zzf.get(cls);
        if (zzfmpVar == null) {
            return null;
        }
        return zzfmpVar.zzc();
    }

    private static synchronized zzfmw zzn(String str) throws GeneralSecurityException {
        zzfmw zzfmwVar;
        synchronized (zzfmx.class) {
            ConcurrentMap<String, zzfmw> concurrentMap = zzb;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzfmwVar = concurrentMap.get(str);
        }
        return zzfmwVar;
    }

    private static synchronized void zzo(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (zzfmx.class) {
            ConcurrentMap<String, zzfmw> concurrentMap = zzb;
            if (concurrentMap.containsKey(str)) {
                zzfmw zzfmwVar = concurrentMap.get(str);
                if (!zzfmwVar.zzc().equals(cls)) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzfmwVar.zzc().getName(), cls.getName()));
                } else if (!z || zzd.get(str).booleanValue()) {
                } else {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    private static <P> zzfma<P> zzp(String str, Class<P> cls) throws GeneralSecurityException {
        zzfmw zzn = zzn(str);
        if (zzn.zzd().contains(cls)) {
            return zzn.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzn.zzc());
        Set<Class<?>> zzd2 = zzn.zzd();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : zzd2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = String.valueOf(name).length();
        StringBuilder sb3 = new StringBuilder(length + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    private static <P> P zzq(String str, zzfxj zzfxjVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzp(str, cls).zza(zzfxjVar);
    }

    public static synchronized <P> void zzb(zzfma<P> zzfmaVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfmx.class) {
            if (zzfmaVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String zzd2 = zzfmaVar.zzd();
            zzo(zzd2, zzfmaVar.getClass(), z);
            zzb.putIfAbsent(zzd2, new zzfms(zzfmaVar));
            zzd.put(zzd2, Boolean.valueOf(z));
        }
    }
}
