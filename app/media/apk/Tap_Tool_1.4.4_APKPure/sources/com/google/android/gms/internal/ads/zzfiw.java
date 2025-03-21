package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfiw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return true == z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfii) {
            collection = ((zzfii) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzb(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
