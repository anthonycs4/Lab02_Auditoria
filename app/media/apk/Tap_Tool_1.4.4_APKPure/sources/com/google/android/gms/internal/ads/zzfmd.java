package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfzu;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfmd<KeyFormatProtoT extends zzfzu, KeyT> {
    private final Class<KeyFormatProtoT> zza;

    public zzfmd(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public final Class<KeyFormatProtoT> zza() {
        return this.zza;
    }

    public abstract void zzb(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT zzc(zzfxj zzfxjVar) throws zzfyy;

    public abstract KeyT zzd(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
