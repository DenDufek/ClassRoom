public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new ExcelentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new BadPupil();
        Pupil pupil4 = new Pupil(); // Базовий учень

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);

        System.out.println("Навчання в класі:");
        classRoom.studyInClass();

        System.out.println("\nЧитання в класі:");
        classRoom.readInClass();

        System.out.println("\nПисання в класі:");
        classRoom.writeInClass();

        System.out.println("\nВідпочинок в класі:");
        classRoom.relaxInClass();
    }
}
