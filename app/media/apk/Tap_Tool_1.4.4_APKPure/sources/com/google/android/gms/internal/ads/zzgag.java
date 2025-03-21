package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzgag extends zzfxc {
    final zzgai zza;
    zzfxe zzb = zzb();
    final /* synthetic */ zzgaj zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgag(zzgaj zzgajVar) {
        this.zzc = zzgajVar;
        this.zza = new zzgai(zzgajVar, null);
    }

    private final zzfxe zzb() {
        if (this.zza.hasNext()) {
            return this.zza.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxe
    public final byte zza() {
        zzfxe zzfxeVar = this.zzb;
        if (zzfxeVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzfxeVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
