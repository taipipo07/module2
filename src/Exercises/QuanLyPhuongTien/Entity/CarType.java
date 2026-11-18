package Exercises.QuanLyPhuongTien.Entity;

public enum CarType {
    DU_LICH("Du lịch"),
    KHACH("Khách");

    private final String name;

    CarType(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
}