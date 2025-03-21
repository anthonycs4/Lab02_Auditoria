package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmo<P> {
    private final ConcurrentMap<zzfmn, List<zzfmm<P>>> zza = new ConcurrentHashMap();
    private zzfmm<P> zzb;
    private final Class<P> zzc;

    private zzfmo(Class<P> cls) {
        this.zzc = cls;
    }

    public static <P> zzfmo<P> zzb(Class<P> cls) {
        return new zzfmo<>(cls);
    }

    public final zzfmm<P> zza() {
        return this.zzb;
    }

    public final void zzc(zzfmm<P> zzfmmVar) {
        if (zzfmmVar.zzb() != zzfte.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzfmm<P>> list = this.zza.get(new zzfmn(zzfmmVar.zzd(), null));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (!list.isEmpty()) {
            this.zzb = zzfmmVar;
            return;
        }
        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
    }

    public final zzfmm<P> zzd(P p, zzfto zzftoVar) throws GeneralSecurityException {
        byte[] array;
        if (zzftoVar.zzd() != zzfte.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzfui zzfuiVar = zzfui.UNKNOWN_PREFIX;
        int ordinal = zzftoVar.zzf().ordinal();
        if (ordinal == 1) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzftoVar.zze()).array();
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = zzflw.zza;
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzftoVar.zze()).array();
        }
        zzfmm<P> zzfmmVar = new zzfmm<>(p, array, zzftoVar.zzd(), zzftoVar.zzf(), zzftoVar.zze());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzfmmVar);
        zzfmn zzfmnVar = new zzfmn(zzfmmVar.zzd(), null);
        List<zzfmm<P>> put = this.zza.put(zzfmnVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzfmmVar);
            this.zza.put(zzfmnVar, Collections.unmodifiableList(arrayList2));
        }
        return zzfmmVar;
    }

    public final Class<P> zze() {
        return this.zzc;
    }
}
