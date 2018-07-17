import annotations.Date;
import annotations.Version;

@Version(value = 2,
        creationDate = @Date(day = 1, month = 1, year = 2001), author = "Default1",
        previous = TestClass.class)
public class TestClass2 {
    public int val = 1;
}