import annotations.Date;
import annotations.Version;

@Version(value = 1,
        creationDate = @Date(day = 15, month = 1, year = 2001), author = "Default1")
public class TestClass {
    public int val = 1;
}