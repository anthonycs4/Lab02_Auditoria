package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfer {
    private static final Logger zza = Logger.getLogger(zzfer.class.getName());
    private static final zzfeq zzb = new zzfeq(null);

    private zzfer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(@NullableDecl String str) {
        return str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
    }
}
