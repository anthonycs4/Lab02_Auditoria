package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzbax<T> {
    private static final zzbce zza;

    static {
        zzbce zzbccVar;
        zzbce zzbceVar = null;
        try {
            Object newInstance = zzbaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzccn.zzi("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzbce) {
                        zzbccVar = (zzbce) queryLocalInterface;
                    } else {
                        zzbccVar = new zzbcc(iBinder);
                    }
                    zzbceVar = zzbccVar;
                }
            }
        } catch (Exception unused) {
            zzccn.zzi("Failed to instantiate ClientApi class.");
        }
        zza = zzbceVar;
    }

    private final T zze() {
        zzbce zzbceVar = zza;
        if (zzbceVar == null) {
            zzccn.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzc(zzbceVar);
        } catch (RemoteException e) {
            zzccn.zzj("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T zzf() {
        try {
            return zzb();
        } catch (RemoteException e) {
            zzccn.zzj("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract T zza();

    protected abstract T zzb() throws RemoteException;

    protected abstract T zzc(zzbce zzbceVar) throws RemoteException;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zzd(android.content.Context r9, boolean r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L15
            com.google.android.gms.internal.ads.zzbay.zza()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r1 = com.google.android.gms.internal.ads.zzccg.zzn(r9, r1)
            if (r1 != 0) goto L15
            java.lang.String r10 = "Google Play Services is not available."
            com.google.android.gms.internal.ads.zzccn.zzd(r10)
            r10 = 1
        L15:
            java.lang.String r1 = "com.google.android.gms.ads.dynamite"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r9, r1)
            int r1 = com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(r9, r1)
            r3 = 0
            if (r2 <= r1) goto L24
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            r1 = r1 ^ r0
            r10 = r10 | r1
            com.google.android.gms.internal.ads.zzbfq.zza(r9)
            com.google.android.gms.internal.ads.zzbgs<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzbgz.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3a
        L38:
            r10 = 0
            goto L4d
        L3a:
            com.google.android.gms.internal.ads.zzbgs<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzbgz.zzb
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4b
            r10 = 1
            r3 = 1
            goto L4d
        L4b:
            r3 = r10
            goto L38
        L4d:
            if (r3 == 0) goto L5c
            java.lang.Object r9 = r8.zze()
            if (r9 != 0) goto La2
            if (r10 != 0) goto La2
            java.lang.Object r9 = r8.zzf()
            goto La2
        L5c:
            java.lang.Object r10 = r8.zzf()
            if (r10 != 0) goto L9a
            com.google.android.gms.internal.ads.zzbgs<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzbhj.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Long r1 = (java.lang.Long) r1
            int r1 = r1.intValue()
            java.util.Random r2 = com.google.android.gms.internal.ads.zzbay.zze()
            int r1 = r2.nextInt(r1)
            if (r1 != 0) goto L9a
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = "action"
            java.lang.String r2 = "dynamite_load"
            r6.putString(r1, r2)
            java.lang.String r1 = "is_missing"
            r6.putInt(r1, r0)
            com.google.android.gms.internal.ads.zzccg r2 = com.google.android.gms.internal.ads.zzbay.zza()
            com.google.android.gms.internal.ads.zzcct r0 = com.google.android.gms.internal.ads.zzbay.zzd()
            java.lang.String r4 = r0.zza
            r7 = 1
            java.lang.String r5 = "gmob-apps"
            r3 = r9
            r2.zze(r3, r4, r5, r6, r7)
        L9a:
            if (r10 != 0) goto La1
            java.lang.Object r9 = r8.zze()
            goto La2
        La1:
            r9 = r10
        La2:
            if (r9 != 0) goto La8
            java.lang.Object r9 = r8.zza()
        La8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbax.zzd(android.content.Context, boolean):java.lang.Object");
    }
}
