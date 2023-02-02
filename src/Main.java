import Decorator.RDWDataFilter;
import Factory.Vehicle;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {

    public void main(String[] args) {
        List<RDWData> data = new List<RDWData>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<RDWData> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] a) {
                return null;
            }

            @Override
            public boolean add(RDWData rdwData) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends RDWData> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NotNull Collection<? extends RDWData> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public RDWData get(int index) {
                return null;
            }

            @Override
            public RDWData set(int index, RDWData element) {
                return null;
            }

            @Override
            public void add(int index, RDWData element) {

            }

            @Override
            public RDWData remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator<RDWData> listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator<RDWData> listIterator(int index) {
                return null;
            }

            @NotNull
            @Override
            public List<RDWData> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        var license = LicenseInformation.licenseFormatter("k6-43-pp");
        data = LicenseInformation.getLicensePlateData(license);

        System.out.println(data);
        System.out.println(data.get(0));

        // factory
        Vehicle vehicle = Factory.VehicleFactory.getVehicle(data.get(0).getVoertuigsoort());
        assert vehicle != null;
        vehicle.setData(data.toString());

        // Decorator
        RDWDataFilter filter = new RDWDataFilter(data);
        List<RDWData> filteredData = filter.filter(rdwData -> rdwData.getCilinderinhoud() > 1600);

    }
}