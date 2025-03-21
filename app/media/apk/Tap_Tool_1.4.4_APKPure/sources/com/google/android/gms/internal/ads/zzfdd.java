package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdd {
    private static final HashMap<String, Class<?>> zza = new HashMap<>();
    private final Context zzb;
    private final zzfde zzc;
    private final zzfbb zzd;
    private final zzfax zze;
    private zzfcs zzf;
    private final Object zzg = new Object();

    public zzfdd(Context context, zzfde zzfdeVar, zzfbb zzfbbVar, zzfax zzfaxVar) {
        this.zzb = context;
        this.zzc = zzfdeVar;
        this.zzd = zzfbbVar;
        this.zze = zzfaxVar;
    }

    private final synchronized Class<?> zzd(zzfct zzfctVar) throws zzfdc {
        String zza2 = zzfctVar.zza().zza();
        HashMap<String, Class<?>> hashMap = zza;
        Class<?> cls = hashMap.get(zza2);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfctVar.zzb())) {
                try {
                    File zzc = zzfctVar.zzc();
                    if (!zzc.exists()) {
                        zzc.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(zzfctVar.zzb().getAbsolutePath(), zzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zza2, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new zzfdc(2008, e);
                }
            }
            throw new zzfdc(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new zzfdc(2026, e2);
        }
    }

    public final boolean zza(zzfct zzfctVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfcs zzfcsVar = new zzfcs(zzd(zzfctVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfctVar.zzd(), null, new Bundle(), 2), zzfctVar, this.zzc, this.zzd);
                if (!zzfcsVar.zzf()) {
                    throw new zzfdc(4000, "init failed");
                }
                int zzh = zzfcsVar.zzh();
                if (zzh == 0) {
                    synchronized (this.zzg) {
                        zzfcs zzfcsVar2 = this.zzf;
                        if (zzfcsVar2 != null) {
                            try {
                                zzfcsVar2.zzg();
                            } catch (zzfdc e) {
                                this.zzd.zzd(e.zza(), -1L, e);
                            }
                        }
                        this.zzf = zzfcsVar;
                    }
                    this.zzd.zzc(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(zzh);
                throw new zzfdc(4001, sb.toString());
            } catch (Exception e2) {
                throw new zzfdc(2004, e2);
            }
        } catch (zzfdc e3) {
            this.zzd.zzd(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzd(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }

    public final zzfbe zzb() {
        zzfcs zzfcsVar;
        synchronized (this.zzg) {
            zzfcsVar = this.zzf;
        }
        return zzfcsVar;
    }

    public final zzfct zzc() {
        synchronized (this.zzg) {
            zzfcs zzfcsVar = this.zzf;
            if (zzfcsVar != null) {
                return zzfcsVar.zze();
            }
            return null;
        }
    }
}
