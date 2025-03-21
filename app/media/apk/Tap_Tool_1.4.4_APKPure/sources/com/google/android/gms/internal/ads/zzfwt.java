package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfwt<MessageType extends zzfwt<MessageType, BuilderType>, BuilderType extends zzfws<MessageType, BuilderType>> implements zzfzu {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void zzar(Iterable<T> iterable, List<? super T> list) {
        zzfyw.zza(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (T t : iterable) {
            if (t != 0) {
                list.add(t);
            } else {
                int size2 = list.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Element at index ");
                sb.append(size2 - size);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(sb2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    public final zzfxj zzan() {
        try {
            int zzaw = zzaw();
            zzfxj zzfxjVar = zzfxj.zzb;
            byte[] bArr = new byte[zzaw];
            zzfxt zzt = zzfxt.zzt(bArr);
            zzav(zzt);
            zzt.zzC();
            return new zzfxg(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzu
    public final byte[] zzao() {
        try {
            byte[] bArr = new byte[zzaw()];
            zzfxt zzt = zzfxt.zzt(bArr);
            zzav(zzt);
            zzt.zzC();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzap() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzaq(int i) {
        throw null;
    }
}
