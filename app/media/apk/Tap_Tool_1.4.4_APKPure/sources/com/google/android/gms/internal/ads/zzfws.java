package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwt;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfws<MessageType extends zzfwt<MessageType, BuilderType>, BuilderType extends zzfws<MessageType, BuilderType>> implements zzfzt {
    @Override // 
    /* renamed from: zzab */
    public abstract BuilderType clone();

    protected abstract BuilderType zzac(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfzt
    public final /* bridge */ /* synthetic */ zzfzt zzad(zzfzu zzfzuVar) {
        if (!zzbe().getClass().isInstance(zzfzuVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zzac((zzfwt) zzfzuVar);
    }
}
