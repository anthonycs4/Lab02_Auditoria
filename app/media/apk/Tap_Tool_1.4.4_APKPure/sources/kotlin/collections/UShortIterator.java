package kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.markers.KMappedMarker;
/* compiled from: UIterators.kt */
@Deprecated(level = DeprecationLevel.ERROR, message = "This class is not going to be stabilized and is to be removed soon.")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\t"}, d2 = {"Lkotlin/collections/UShortIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lkotlin/UShort;", "()V", "next", "next-Mh2AYeg", "()S", "nextUShort", "nextUShort-Mh2AYeg", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class UShortIterator implements Iterator<UShort>, KMappedMarker {
    /* renamed from: nextUShort-Mh2AYeg */
    public abstract short mo367nextUShortMh2AYeg();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UShort next() {
        return UShort.m294boximpl(m484nextMh2AYeg());
    }

    /* renamed from: next-Mh2AYeg  reason: not valid java name */
    public final short m484nextMh2AYeg() {
        return mo367nextUShortMh2AYeg();
    }
}
