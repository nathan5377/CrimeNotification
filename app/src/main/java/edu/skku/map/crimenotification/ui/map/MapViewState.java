package edu.skku.map.crimenotification.ui.map;


import edu.skku.map.crimenotification.base.ViewState;
import edu.skku.map.crimenotification.room.entity.CriminalEntity;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public abstract class MapViewState implements ViewState {
    private MapViewState() {
    }

    // $FF: synthetic method
    public MapViewState(DefaultConstructorMarker $constructor_marker) {
        this();
    }


    public static final class SetZoomLevel extends MapViewState {
        private final int zoomLevel;

        public final int getZoomLevel() {
            return this.zoomLevel;
        }

        public SetZoomLevel(int zoomLevel) {
            super((DefaultConstructorMarker) null);
            this.zoomLevel = zoomLevel;
        }

        public final int component1() {
            return this.zoomLevel;
        }

        @NotNull
        public final SetZoomLevel copy(int zoomLevel) {
            return new SetZoomLevel(zoomLevel);
        }

        // $FF: synthetic method
        public static SetZoomLevel copy$default(SetZoomLevel var0, int var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.zoomLevel;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "SetZoomLevel(zoomLevel=" + this.zoomLevel + ")";
        }

        public int hashCode() {
            return Integer.hashCode(this.zoomLevel);
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof SetZoomLevel) {
                    SetZoomLevel var2 = (SetZoomLevel) var1;
                    if (this.zoomLevel == var2.zoomLevel) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class RenewCurrentLocation extends MapViewState {
        @NotNull
        private final MapPoint mapPoint;

        @NotNull
        public final MapPoint getMapPoint() {
            return this.mapPoint;
        }

        public RenewCurrentLocation(@NotNull MapPoint mapPoint) {
            Intrinsics.checkNotNullParameter(mapPoint, "mapPoint");
            this.mapPoint = mapPoint;
        }

        @NotNull
        public final MapPoint component1() {
            return this.mapPoint;
        }

        @NotNull
        public final RenewCurrentLocation copy(@NotNull MapPoint mapPoint) {
            Intrinsics.checkNotNullParameter(mapPoint, "mapPoint");
            return new RenewCurrentLocation(mapPoint);
        }

        // $FF: synthetic method
        public static RenewCurrentLocation copy$default(RenewCurrentLocation var0, MapPoint var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.mapPoint;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "RenewCurrentLocation(mapPoint=" + this.mapPoint + ")";
        }

        public int hashCode() {
            MapPoint var10000 = this.mapPoint;
            return var10000 != null ? var10000.hashCode() : 0;
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof RenewCurrentLocation) {
                    RenewCurrentLocation var2 = (RenewCurrentLocation) var1;
                    if (Intrinsics.areEqual(this.mapPoint, var2.mapPoint)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class SetCurrentLocation extends MapViewState {
        @NotNull
        private final MapPoint mapPoint;

        @NotNull
        public final MapPoint getMapPoint() {
            return this.mapPoint;
        }

        public SetCurrentLocation(@NotNull MapPoint mapPoint) {
            Intrinsics.checkNotNullParameter(mapPoint, "mapPoint");
            this.mapPoint = mapPoint;
        }

        @NotNull
        public final MapPoint component1() {
            return this.mapPoint;
        }

        @NotNull
        public final SetCurrentLocation copy(@NotNull MapPoint mapPoint) {
            Intrinsics.checkNotNullParameter(mapPoint, "mapPoint");
            return new SetCurrentLocation(mapPoint);
        }

        // $FF: synthetic method
        public static SetCurrentLocation copy$default(SetCurrentLocation var0, MapPoint var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.mapPoint;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "SetCurrentLocation(mapPoint=" + this.mapPoint + ")";
        }

        public int hashCode() {
            MapPoint var10000 = this.mapPoint;
            return var10000 != null ? var10000.hashCode() : 0;
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof SetCurrentLocation) {
                    SetCurrentLocation var2 = (SetCurrentLocation) var1;
                    if (Intrinsics.areEqual(this.mapPoint, var2.mapPoint)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class GetCriminalItems extends MapViewState {
        @NotNull
        private final ArrayList<MapPOIItem> items;

        @NotNull
        public final ArrayList<MapPOIItem> getItems() {
            return this.items;
        }

        public GetCriminalItems(@NotNull ArrayList<MapPOIItem> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        @NotNull
        public final ArrayList<MapPOIItem> component1() {
            return this.items;
        }

        @NotNull
        public final GetCriminalItems copy(@NotNull ArrayList<MapPOIItem> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new GetCriminalItems(items);
        }

        // $FF: synthetic method
        public static GetCriminalItems copy$default(GetCriminalItems var0, ArrayList<MapPOIItem> var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.items;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "GetCriminalItems(items=" + Arrays.toString(new ArrayList[]{this.items}) + ")";
        }

        public int hashCode() {
            ArrayList<MapPOIItem> var10000 = this.items;
            return var10000 != null ? Arrays.hashCode(new ArrayList[]{var10000}) : 0;
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof GetCriminalItems) {
                    GetCriminalItems var2 = (GetCriminalItems) var1;
                    if (Intrinsics.areEqual(this.items, var2.items)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class GetSelectPOIItem extends MapViewState {
        @NotNull
        private final CriminalEntity item;
        @NotNull
        private final String distance;

        @NotNull
        public final CriminalEntity getItem() {
            return this.item;
        }

        @NotNull
        public final String getDistance() {
            return this.distance;
        }

        public GetSelectPOIItem(@NotNull CriminalEntity item, @NotNull String distance) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(distance, "distance");
            this.item = item;
            this.distance = distance;
        }

        @NotNull
        public final CriminalEntity component1() {
            return this.item;
        }

        @NotNull
        public final String component2() {
            return this.distance;
        }

        @NotNull
        public final GetSelectPOIItem copy(@NotNull CriminalEntity item, @NotNull String distance) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(distance, "distance");
            return new GetSelectPOIItem(item, distance);
        }

        // $FF: synthetic method
        public static GetSelectPOIItem copy$default(GetSelectPOIItem var0, CriminalEntity var1, String var2, int var3, Object var4) {
            if ((var3 & 1) != 0) {
                var1 = var0.item;
            }

            if ((var3 & 2) != 0) {
                var2 = var0.distance;
            }

            return var0.copy(var1, var2);
        }

        @NotNull
        public String toString() {
            return "GetSelectPOIItem(item=" + this.item + ", distance=" + this.distance + ")";
        }

        public int hashCode() {
            CriminalEntity var10000 = this.item;
            int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
            String var10001 = this.distance;
            return var1 + (var10001 != null ? var10001.hashCode() : 0);
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof GetSelectPOIItem) {
                    GetSelectPOIItem var2 = (GetSelectPOIItem) var1;
                    if (Intrinsics.areEqual(this.item, var2.item) && Intrinsics.areEqual(this.distance, var2.distance)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class Error extends MapViewState {
        @NotNull
        private final String errorMessage;

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public Error(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        @NotNull
        public final String component1() {
            return this.errorMessage;
        }

        @NotNull
        public final Error copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new Error(errorMessage);
        }

        // $FF: synthetic method
        public static Error copy$default(Error var0, String var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.errorMessage;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ")";
        }

        public int hashCode() {
            String var10000 = this.errorMessage;
            return var10000 != null ? var10000.hashCode() : 0;
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof Error) {
                    Error var2 = (Error) var1;
                    if (Intrinsics.areEqual(this.errorMessage, var2.errorMessage)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class AroundCriminals extends MapViewState {
        @NotNull
        private final List list;

        @NotNull
        public final List getList() {
            return this.list;
        }

        public AroundCriminals(@NotNull List list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @NotNull
        public final List component1() {
            return this.list;
        }

        @NotNull
        public final AroundCriminals copy(@NotNull List list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new AroundCriminals(list);
        }

        // $FF: synthetic method
        public static AroundCriminals copy$default(AroundCriminals var0, List var1, int var2, Object var3) {
            if ((var2 & 1) != 0) {
                var1 = var0.list;
            }

            return var0.copy(var1);
        }

        @NotNull
        public String toString() {
            return "AroundCriminals(list=" + this.list + ")";
        }

        public int hashCode() {
            List var10000 = this.list;
            return var10000 != null ? var10000.hashCode() : 0;
        }

        public boolean equals(@Nullable Object var1) {
            if (this != var1) {
                if (var1 instanceof AroundCriminals) {
                    AroundCriminals var2 = (AroundCriminals) var1;
                    if (Intrinsics.areEqual(this.list, var2.list)) {
                        return true;
                    }
                }

                return false;
            } else {
                return true;
            }
        }
    }

    public static final class ShowProgress extends MapViewState {
        @NotNull
        public static final ShowProgress INSTANCE;

        private ShowProgress() {
            super((DefaultConstructorMarker) null);
        }

        static {
            ShowProgress var0 = new ShowProgress();
            INSTANCE = var0;
        }
    }

    public static final class ShowUserPopupMenu extends MapViewState {
        @NotNull
        public static final ShowUserPopupMenu INSTANCE;

        private ShowUserPopupMenu() {
            super((DefaultConstructorMarker) null);
        }

        static {
            ShowUserPopupMenu var0 = new ShowUserPopupMenu();
            INSTANCE = var0;
        }
    }

    public static final class WithdrawUser extends MapViewState {
        @NotNull
        public static final WithdrawUser INSTANCE;

        private WithdrawUser() {
            super((DefaultConstructorMarker) null);
        }

        static {
            WithdrawUser var0 = new WithdrawUser();
            INSTANCE = var0;
        }
    }

    public static final class LogoutUser extends MapViewState {
        @NotNull
        public static final LogoutUser INSTANCE;

        private LogoutUser() {
            super((DefaultConstructorMarker) null);
        }

        static {
            LogoutUser var0 = new LogoutUser();
            INSTANCE = var0;
        }
    }

    public static final class HideProgress extends MapViewState {
        @NotNull
        public static final HideProgress INSTANCE;

        private HideProgress() {
            super((DefaultConstructorMarker) null);
        }

        static {
            HideProgress var0 = new HideProgress();
            INSTANCE = var0;
        }
    }

    public static final class CallPolice extends MapViewState {
        @NotNull
        public static final CallPolice INSTANCE;

        private CallPolice() {
            super((DefaultConstructorMarker) null);
        }

        static {
            CallPolice var0 = new CallPolice();
            INSTANCE = var0;
        }
    }

    public static final class RouteAroundCriminalList extends MapViewState {
        @NotNull
        public static final RouteAroundCriminalList INSTANCE;

        private RouteAroundCriminalList() {
            super((DefaultConstructorMarker) null);
        }

        static {
            RouteAroundCriminalList var0 = new RouteAroundCriminalList();
            INSTANCE = var0;
        }
    }
}
