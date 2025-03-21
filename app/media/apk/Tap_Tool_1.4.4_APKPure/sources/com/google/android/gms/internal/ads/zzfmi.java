package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmi {
    private static final CopyOnWriteArrayList<zzfmh> zza = new CopyOnWriteArrayList<>();

    public static zzfmh zza(String str) throws GeneralSecurityException {
        Iterator<zzfmh> it = zza.iterator();
        while (it.hasNext()) {
            zzfmh next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
