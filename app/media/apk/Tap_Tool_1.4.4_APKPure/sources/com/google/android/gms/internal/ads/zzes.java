package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzes implements zzfda {
    final /* synthetic */ zzfax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzes(zzeu zzeuVar, zzfax zzfaxVar) {
        this.zza = zzfaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfda
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
