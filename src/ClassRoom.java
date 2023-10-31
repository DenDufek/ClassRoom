public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupils = new Pupil[]{pupil1, pupil2, pupil3, pupil4};
    }

    public void studyInClass() {
        for (Pupil pupil : pupils) {
            pupil.study();
        }
    }

    public void readInClass() {
        for (Pupil pupil : pupils) {
            pupil.read();
        }
    }

    public void writeInClass() {
        for (Pupil pupil : pupils) {
            pupil.write();
        }
    }

    public void relaxInClass() {
        for (Pupil pupil : pupils) {
            pupil.relax();
        }
    }
}
