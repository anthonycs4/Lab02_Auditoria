package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfgx<E> extends zzffd<E> {
    private final zzfgz<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgx(zzfgz<E> zzfgzVar, int i) {
        super(zzfgzVar.size(), i);
        this.zza = zzfgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffd
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
