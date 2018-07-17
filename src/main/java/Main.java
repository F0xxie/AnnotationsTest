import java.lang.*;

public class Main {
    public static void main(String[] args) {
        TestClass2 testclass = new TestClass2();
        getVersion(testclass);
    }

    public static void getVersion(Object object) {
        Class newclass = object.getClass();
        while (newclass != Void.class) {
            Version version = (Version) newclass.getAnnotation(Version.class);
            System.out.println(String.format("%s: Version %s from %s.%s.%s by %s",
                    newclass.getSimpleName(),
                    version.value(),
                    version.creationDate().day(),
                    version.creationDate().month(),
                    version.creationDate().year(),
                    version.author()));
                    //version.previous()));
            newclass = version.previous();
        }
    }
}